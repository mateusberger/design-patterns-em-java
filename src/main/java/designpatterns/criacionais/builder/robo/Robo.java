package designpatterns.criacionais.builder.robo;

public class Robo {

    private Chassi chassi;
    private MecanismoDeVisao mecanismoDeVisao;
    private MecanismoDeInteracao mecanismoDeInteracao;
    private MecanismoDeDeslocamento mecanismoDeDeslocamento;

    private String nome;
    private String cor;

    public Robo(
            String nome, String cor, Chassi chassi,
            MecanismoDeInteracao mecanismoDeInteracao,
            MecanismoDeDeslocamento mecanismoDeDeslocamento,
            MecanismoDeVisao mecanismoDeVisao
    ) {
        this.chassi = chassi;
        this.mecanismoDeVisao = mecanismoDeVisao;
        this.mecanismoDeInteracao = mecanismoDeInteracao;
        this.mecanismoDeDeslocamento = mecanismoDeDeslocamento;
        this.nome = nome;
        this.cor = cor;
    }

    public Robo() {
    }

    public void setMecanismoDeVisao(MecanismoDeVisao mecanismoDeVisao) {
        this.mecanismoDeVisao = mecanismoDeVisao;
    }

    public void setMecanismoDeInteracao(MecanismoDeInteracao mecanismoDeInteracao) {
        this.mecanismoDeInteracao = mecanismoDeInteracao;
    }

    public void setMecanismoDeDeslocamento(MecanismoDeDeslocamento mecanismoDeDeslocamento) {
        this.mecanismoDeDeslocamento = mecanismoDeDeslocamento;
    }

    public void setChassi(Chassi chassi) {
        this.chassi = chassi;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
