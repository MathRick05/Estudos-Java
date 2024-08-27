package Ex18;

public class Bicicleta {
    public String marca;
    public String modelo;
    public int tamanhoRoda;

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("Você está pedalando a bicicleta " + marca + " modelo " + modelo + ".");
    }

    public void frear() {
        System.out.println("Você freou a bicicleta " + marca + " modelo " + modelo + ".");
    }
}
