package designpatterns.criacionais.builder.robobuilder;

import designpatterns.criacionais.builder.robo.*;
import designpatterns.criacionais.builder.robo.chassi.Chassi;
import designpatterns.criacionais.builder.robo.mecanismodedeslocamento.MecanismoDeDeslocamento;
import designpatterns.criacionais.builder.robo.mecanismodeinteracao.MecanismoDeInteracao;
import designpatterns.criacionais.builder.robo.mecanismodevisao.MecanismoDeVisao;

public interface RoboBuilderInterface <G extends RoboBuilderInterface> {

    G novoRobo();

    G definirNome(String nome);

    G definirCor(String cor);

    G definirMecanismoDeDeslocamento(MecanismoDeDeslocamento mecanismoDeDeslocamento);

    G definirMecanismoDeInteracao(MecanismoDeInteracao mecanismoDeInteracao);

    G definirMecanismoDeVisao(MecanismoDeVisao mecanismoDeVisao);

    G definirChassi(Chassi chassi);

    Robo construirRobo();

}
