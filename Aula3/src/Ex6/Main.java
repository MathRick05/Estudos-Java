package Ex6;

import Ex5.Cachorro;

public class Main {
    public static void main(String[] args) {

        Computador pc = new Computador("R7", 8, 1000);

        System.out.println(pc);

        pc.Ligar();
        pc.Desligar();
    }
}
