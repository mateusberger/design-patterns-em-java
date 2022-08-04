package designpatterns.criacionais.builder.robo;

public interface MecanismoDeInteracao extends ModeloDeParte {

    @Override
    default String getModelo(){
        return "Mecanismo de interação padrão";
    }

}
