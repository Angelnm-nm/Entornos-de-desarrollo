package ut2_ejerciciosBasicos_1;

import java.util.Scanner;

public class Ejercicosbasicos_1 {
    static void main(String[] args) {

    }
        {
        Scanner sc=new Scanner(System.in);
            System.out.println("introduce um numero");
            int numero=sc.nextInt();
            if (numero % 2 == 0)
            {
                System.out.println("es par"+ numero);

            }else{
                System.out.println("es impar"+ numero);
            }
            sc.close();

    }
}
