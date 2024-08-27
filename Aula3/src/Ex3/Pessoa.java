package Ex3;

public class Pessoa {

    public String Nome;
    public int Idade;
    public double Altura;

    public Pessoa(String nome, int idade, double altura) {
        Nome = nome;
        Idade = idade;
        Altura = altura;
    }

    public Pessoa() {
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + Nome + '\'' +
                ", Idade=" + Idade +
                ", Altura=" + Altura +
                '}';
    }

    public void apresentacao(){

        System.out.printf("Me chamo %s, tenho %.2f e %d de idade.", Nome, Altura, Idade);

    }
}
