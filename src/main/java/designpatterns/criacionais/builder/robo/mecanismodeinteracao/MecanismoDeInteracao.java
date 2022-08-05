package designpatterns.criacionais.builder.robo.mecanismodeinteracao;

import designpatterns.criacionais.builder.robo.ModeloDeParte;

public interface MecanismoDeInteracao extends ModeloDeParte {

    @Override
    default String getModelo(){
        return "Mecanismo de interação padrão";
    }

}
