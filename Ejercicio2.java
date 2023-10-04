import java.util.Scanner;
    public class Ejercicio2 {

        public static void main(String[] args) {

            System.out.println("Escribe los Grados");
            Scanner entrada = new Scanner(System.in);

            float grados = entrada.nextFloat();

            entrada.close();

            float F = (((9/5) * grados) + 32);
            float K = (grados + 273.15);

            System.out.println("F= ", F, "K= ", K);


        }
}
