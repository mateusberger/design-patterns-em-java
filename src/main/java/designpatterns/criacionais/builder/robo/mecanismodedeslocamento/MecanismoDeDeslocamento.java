package designpatterns.criacionais.builder.robo.mecanismodedeslocamento;

import designpatterns.criacionais.builder.robo.ModeloDeParte;

public interface MecanismoDeDeslocamento extends ModeloDeParte {

    @Override
    default String getModelo(){
        return "Mecanismo de deslocamento padrão";
    }

}
