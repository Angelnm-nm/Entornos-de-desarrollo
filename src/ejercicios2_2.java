public class ejercicios2_2 {
    public static void main(String[] args) {
     int C = 50;
        System.out.println("C es" +C + (C >=0? "positivo" : "negativo"));
        System.out.println("es" + (C% 2==0? "par":"impar"));
        System.out.println((C% 5==0? "es multiplo de 5":" no es multiplo de 5"));
        System.out.println((C% 10==0? "es multiplo de 10":" no es multiplo de 10"));
        System.out.println((C >=100? "es menor q 100":" no es menor que 100"));



    }
}
