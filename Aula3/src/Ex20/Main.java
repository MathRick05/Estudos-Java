package Ex20;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-99", 100);
        empresa.contratarFuncionario();
        empresa.demitirFuncionario();

        System.out.println();
    }
}

