package designpatterns.criacionais.builder.robo.chassi;

import designpatterns.criacionais.builder.robo.ModeloDeParte;

public interface Chassi extends ModeloDeParte {

    @Override
    default String getModelo(){
        return "Chassi genérico";
    }



}
