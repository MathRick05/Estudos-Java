package Ex2;

public class Celular {
    public String Modelo;
    public String Marca;
    public int CpcddBtr;

    public Celular(){

    }

    public Celular(String Modelo, String Marca, int CpcddBtr){

        this.Modelo = Modelo;
        this.Marca = Marca;
        this.CpcddBtr = CpcddBtr;

    }

    @Override
    public String toString() {
        return "Celular{" +
                "Modelo='" + Modelo + '\'' +
                ", Marca='" + Marca + '\'' +
                ", CpcddBtr=" + CpcddBtr +
                '}';
    }

    public void Ligar(){

        System.out.println("Ligando...");

    }

    public void Desligar(){

        System.out.println("Desligando...");

    }

}
