package designpatterns.criacionais.builder;

import designpatterns.criacionais.builder.robo.Robo;
import designpatterns.criacionais.builder.robo.chassi.ChassiDePalitoDePicole;
import designpatterns.criacionais.builder.robo.mecanismodedeslocamento.RodasDeMadeira;
import designpatterns.criacionais.builder.robo.mecanismodeinteracao.BracosRoboticos;
import designpatterns.criacionais.builder.robo.mecanismodevisao.CabecaRobotica;
import designpatterns.criacionais.builder.robo.chassi.ChassiDeFibraDeCarbono;
import designpatterns.criacionais.builder.robo.mecanismodedeslocamento.PernasRoboticas;
import designpatterns.criacionais.builder.robo.mecanismodevisao.CockPitPanoramico;
import designpatterns.criacionais.builder.robobuilder.RoboBuilder;

public class UsandoOBuilder {

    public static void main(String[] args) {

        Robo megazord = new RoboBuilder()
                .novoRobo()
                .definirNome("Mega-Zord")
                .definirCor("Multi-Colorido")
                .definirChassi(new ChassiDeFibraDeCarbono())
                .definirMecanismoDeDeslocamento(new PernasRoboticas())
                .definirMecanismoDeInteracao(new BracosRoboticos())
                .definirMecanismoDeVisao(new CabecaRobotica())
                .construirRobo();

        System.out.println(megazord.toString());

        Robo roboImprovisado = new RoboBuilder()
                .novoRobo()
                .definirNome("Robo improvisado")
                .definirCor("Multi-Colorido")
                .definirChassi(new ChassiDePalitoDePicole())
                .definirMecanismoDeDeslocamento(new RodasDeMadeira())
                .definirMecanismoDeInteracao(new BracosRoboticos())
                .definirMecanismoDeVisao(new CockPitPanoramico())
                .construirRobo();

        System.out.println(roboImprovisado.toString());

    }
}
