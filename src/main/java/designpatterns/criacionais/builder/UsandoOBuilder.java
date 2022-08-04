package designpatterns.criacionais.builder;

import designpatterns.criacionais.builder.robo.Robo;
import designpatterns.criacionais.builder.robobuilder.implementacao.RoboBuilder;

public class UsandoOBuilder {

    public static void main(String[] args) {

        Robo megazord = new RoboBuilder()
                .novoRobo()
                .definirNome("Mega-Zord")
                .definirCor("Multi-Colorido")
                .definirChassi(null)
                .definirMecanismoDeDeslocamento(null)
                .definirMecanismoDeInteracao(null)
                .definirMecanismoDeVisao(null)
                .construirRobo();


    }
}
