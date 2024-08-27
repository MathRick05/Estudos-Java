package Ex12;

public class Filme {
    public String titulo;
    public String diretor;
    public int duracao; // Duração em minutos

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciar() {
        System.out.println("O filme " + titulo + " dirigido por " + diretor + " está começando.");
    }

    public void parar() {
        System.out.println("O filme " + titulo + " foi parado.");
    }
}

