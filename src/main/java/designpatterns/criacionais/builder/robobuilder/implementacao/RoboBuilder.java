package designpatterns.criacionais.builder.robobuilder.implementacao;

import designpatterns.criacionais.builder.robo.*;
import designpatterns.criacionais.builder.robobuilder.RoboBuilderInterface;

public class RoboBuilder implements RoboBuilderInterface {

    private Robo robo = null;

    public RoboBuilderInterface novoRobo() {
        robo = new Robo();
        return this;
    }

    @Override
    public RoboBuilderInterface definirNome(String nome) {
        validarConstrucaoIniciada();
        robo.setNome(nome);
        return this;
    }

    @Override
    public RoboBuilderInterface definirCor(String cor) {
        validarConstrucaoIniciada();
        robo.setCor(cor);
        return this;
    }

    @Override
    public RoboBuilderInterface definirMecanismoDeDeslocamento(MecanismoDeDeslocamento mecanismoDeDeslocamento) {
        validarConstrucaoIniciada();
        construirRobo().setMecanismoDeDeslocamento(mecanismoDeDeslocamento);
        return this;
    }

    @Override
    public RoboBuilderInterface definirMecanismoDeInteracao(MecanismoDeInteracao mecanismoDeInteracao) {
        validarConstrucaoIniciada();
        robo.setMecanismoDeInteracao(mecanismoDeInteracao);
        return this;
    }

    @Override
    public RoboBuilderInterface definirMecanismoDeVisao(MecanismoDeVisao mecanismoDeVisao) {
        validarConstrucaoIniciada();
        robo.setMecanismoDeVisao(mecanismoDeVisao);
        return this;
    }

    @Override
    public RoboBuilderInterface definirChassi(Chassi chassi) {
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
