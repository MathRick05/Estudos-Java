package Ex7;

import java.util.Scanner;

public class Aluno {
    public String Nome;
    public int Matricula;
    public String Curso;

    public Aluno(String nome, int matricula, String curso) {
        Nome = nome;
        Matricula = matricula;
        Curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Nome='" + Nome + '\'' +
                ", Matricula='" + Matricula + '\'' +
                ", Curso='" + Curso + '\'' +
                '}';
    }

    public void media(){

        Scanner scanner = new Scanner(System.in);
        double [] notas = new double[3];
        double media = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.printf("Digite sua nota %2.f:", i);
            notas[i] = scanner.nextInt();
        }

        for(int i = 0; i < notas.length; i++){

            media += notas[i];

        }

        media = media / 3;

        System.out.println(media);

    }
}
