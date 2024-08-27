package Ex6;

import static java.lang.System.exit;

public class Computador {

    public String core;
    public int RAM;
    public int HD;

    public Computador(String core, int RAM, int HD) {
        this.core = core;
        this.RAM = RAM;
        this.HD = HD;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "core='" + core + '\'' +
                ", RAM=" + RAM +
                ", HD=" + HD +
                '}';
    }

    public void Ligar(){

        System.out.println("Ligando...");

    }

    public void Desligar(){

        System.out.println("Desligando...");

    }
}
