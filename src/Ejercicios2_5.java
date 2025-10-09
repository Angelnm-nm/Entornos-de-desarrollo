import java.util.Scanner;

public class Ejercicios2_5 {
    public static void main(String[] args) {
        
        Scanner Scaner = new Scanner(System.in);
        System.out.println("introduce tu numero de telefono, porfavor");
        int numero  = Integer.parseInt(Scaner.nextLine());
        System.out.println("tu telefono es" + numero);
    }
}
