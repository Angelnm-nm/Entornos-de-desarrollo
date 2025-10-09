import java.util.Scanner;

public class EjecicioAvanzado_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 2 caracteres");
        char a = sc.next().charAt(0);
        System.out.println("escribe otro caracrter");
        char b = sc.next().charAt(0);
        System.out.println("tus caracteres son" + a + "y" + b);
        System.out.println(a==b ?"son iguales":"no son iguales");
        sc.close();


    }
}
