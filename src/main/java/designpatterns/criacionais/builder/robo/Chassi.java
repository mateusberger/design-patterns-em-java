package designpatterns.criacionais.builder.robo;

public interface Chassi extends ModeloDeParte {

    @Override
    default String getModelo(){
        return "Chassi genérico";
    }



}
