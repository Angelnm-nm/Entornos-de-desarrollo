import java.util.Scanner;

public class Ejercicios2_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe un numero");
        int numero = sc.nextInt();
        for (int i = numero ; i < numero + 100; ++i) {
            numero += i ;
            System.out.println("summons" + i);}
        }
    }
