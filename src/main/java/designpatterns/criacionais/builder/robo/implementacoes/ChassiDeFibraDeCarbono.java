package designpatterns.criacionais.builder.robo.implementacoes;

import designpatterns.criacionais.builder.robo.Chassi;

public class ChassiDeFibraDeCarbono implements Chassi {

    @Override
    public String getModelo() {
        return "Chassi de fibra de carbono.";
    }
}
