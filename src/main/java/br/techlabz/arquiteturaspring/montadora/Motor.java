package br.techlabz.arquiteturaspring.montadora;

public class Motor {
    private String modelo;
    private int cilindros;
    private int cavalos;
    private double litragem;
    private TipoMotor tipo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public double getLitragem() {
        return litragem;
    }

    public void setLitragem(double litragem) {
        this.litragem = litragem;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cilindros=" + cilindros +
                ", cavalos=" + cavalos +
                ", litragem=" + litragem +
                ", tipo=" + tipo +
                '}';
    }
}
