package Avanzados;

public class Avanzados_8 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
    }
}
