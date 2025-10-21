package Avanzados;

import java.util.Scanner;

public class Avanzados_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de N: ");
        int N = sc.nextInt();

        int a = 0, b = 1; // primeros dos términos

        System.out.println("Los " + N + " primeros términos de la serie de Fibonacci son:");

        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        sc.close();
    }
}
