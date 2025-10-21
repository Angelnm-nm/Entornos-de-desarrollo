package Avanzados;

import java.util.Scanner;

public class Avanzado_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número n: ");
        int n = sc.nextInt();

        // Bucle externo: controla las filas
        for (int i = 1; i <= n; i++) {
            // Bucle interno: imprime los números de 1 hasta i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        sc.close();
    }
}

