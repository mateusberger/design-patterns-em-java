package designpatterns.criacionais.builder.robo;

public interface MecanismoDeDeslocamento extends ModeloDeParte {

    @Override
    default String getModelo(){
        return "Mecanismo de deslocamento padrão";
    }

}
