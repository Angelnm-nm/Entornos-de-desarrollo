package ut2_ejerciciosBasicos_1;

import java.util.Scanner;

public class EjerciciosBasicos_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int cont = 0;
        int numero = 0;
        while (cont < 5)
            numero = sc.nextInt();
        {
            if (numero == 0) {
                cont++;
            } else {
                suma += numero;
            }
            System.out.println("Suma: " + suma);
        }
    }
}