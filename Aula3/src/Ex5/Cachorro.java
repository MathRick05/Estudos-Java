package Ex5;

public class Cachorro {

    public String nome;
    public String raca;
    public int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                '}';
    }

    public void Latir(){
        System.out.println("Au Au");
    }

    public void Correr(){
        System.out.println("Correndo...");
    }
}
