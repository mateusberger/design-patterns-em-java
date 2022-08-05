package designpatterns.criacionais.builder.robo.mecanismodevisao;

import designpatterns.criacionais.builder.robo.ModeloDeParte;

public interface MecanismoDeVisao extends ModeloDeParte {

    @Override
    default String getModelo(){
        return "Mecanismo de visão padrão";
    }

}
