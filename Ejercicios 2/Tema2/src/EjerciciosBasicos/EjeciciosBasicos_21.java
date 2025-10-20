package EjerciciosBasicos;

import java.util.Scanner;

public class EjeciciosBasicos_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pon la cantidad de numeros para hacer la media");
        int cantidad= sc.nextInt();
        double suma = 0;
        for (int i=0; i< cantidad; i++) {
            System.out.println("escribe el numero");
            double numeros = sc.nextDouble();
            suma= suma +numeros;
        }
        System.out.println("la media es" + suma / cantidad);
        sc.close();
    }
}
