package designpatterns.criacionais.builder.robo;

public interface MecanismoDeVisao extends ModeloDeParte {

    @Override
    default String getModelo(){
        return "Mecanismo de visão padrão";
    }

}
