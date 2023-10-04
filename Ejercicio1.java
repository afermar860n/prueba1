import java.util.Scanner;

    public class Ejercicio1 {

        public static void main(String[] args) {

            Scanner entrada = Scanner(System.in);

            double a = entrada.nextDouble();
            double b = entrada.nextDouble();
            double c = entrada.nextDouble();

            entrada.close();

            System.out.print(a * b) + (c * (3 - a/(2 *a)));

            System.out.printnl((2 + (a * b) / 4)^ (c + 2))

        }
}
