package designpatterns.criacionais.builder.robobuilder;

import designpatterns.criacionais.builder.robo.*;
import designpatterns.criacionais.builder.robo.chassi.Chassi;
import designpatterns.criacionais.builder.robo.mecanismodedeslocamento.MecanismoDeDeslocamento;
import designpatterns.criacionais.builder.robo.mecanismodeinteracao.MecanismoDeInteracao;
import designpatterns.criacionais.builder.robo.mecanismodevisao.MecanismoDeVisao;

public class RoboBuilder implements RoboBuilderInterface {

    private Robo robo = null;

    @Override
    public RoboBuilder novoRobo() {
        robo = new Robo();
        return this;
    }

    @Override
    public RoboBuilder definirNome(String nome) {
        validarConstrucaoIniciada();
        robo.setNome(nome);
        return this;
    }

    @Override
    public RoboBuilder definirCor(String cor) {
        validarConstrucaoIniciada();
        robo.setCor(cor);
        return this;
    }

    @Override
    public RoboBuilder definirMecanismoDeDeslocamento(MecanismoDeDeslocamento mecanismoDeDeslocamento) {
        validarConstrucaoIniciada();
        construirRobo().setMecanismoDeDeslocamento(mecanismoDeDeslocamento);
        return this;
    }

    @Override
    public RoboBuilder definirMecanismoDeInteracao(MecanismoDeInteracao mecanismoDeInteracao) {
        validarConstrucaoIniciada();
        robo.setMecanismoDeInteracao(mecanismoDeInteracao);
        return this;
    }

    @Override
    public RoboBuilder definirMecanismoDeVisao(MecanismoDeVisao mecanismoDeVisao) {
        validarConstrucaoIniciada();
        robo.setMecanismoDeVisao(mecanismoDeVisao);
        return this;
    }

    @Override
    public RoboBuilder definirChassi(Chassi chassi) {
        validarConstrucaoIniciada();
        robo.setChassi(chassi);
        return this;
    }

    @Override
    public Robo construirRobo() {
        validarConstrucaoIniciada();
        return robo;
    }

    private void validarConstrucaoIniciada(){
        if (robo == null){
            throw new RuntimeException("Não foi iniciada a construção do robo.");
        }
    }
}
