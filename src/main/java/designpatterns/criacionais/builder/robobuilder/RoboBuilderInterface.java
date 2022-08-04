package designpatterns.criacionais.builder.robobuilder;

import designpatterns.criacionais.builder.robo.*;

public interface RoboBuilderInterface {

    RoboBuilderInterface criarRobo();

    RoboBuilderInterface definirNome(String nome);

    RoboBuilderInterface definirCor(String cor);

    RoboBuilderInterface definirMecanismoDeDeslocamento(MecanismoDeDeslocamento mecanismoDeDeslocamento);

    RoboBuilderInterface definirMecanismoDeInteracao(MecanismoDeInteracao mecanismoDeInteracao);

    RoboBuilderInterface definirMecanismoDeVisao(MecanismoDeVisao mecanismoDeVisao);

    RoboBuilderInterface definirChassi(Chassi chassi);

    Robo construirRobo();

}
