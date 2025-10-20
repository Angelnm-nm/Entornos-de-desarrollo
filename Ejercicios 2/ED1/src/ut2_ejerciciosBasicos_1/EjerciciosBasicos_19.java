package ut2_ejerciciosBasicos_1;

import java.util.Scanner;

public class EjerciciosBasicos_19 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int numero = Sc.nextInt();
        int i = 1;
        while(i < numero){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        } Sc.close();
    }
}
