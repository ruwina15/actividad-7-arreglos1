import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[20];

        System.out.println("Ingresa 20 números enteros:");
        for (int i = 0; i < 20; i++)
        {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            if (teclado.hasNextInt())
            {
                num[i] = teclado.nextInt();
            }
            else
            {
                System.out.println("Ingresa un número válido. Intentalo de nuevo.");
                teclado.next(); // Descartara la entrada no válida
                i--; // Volver a intentar
            }
        }//fin del for1

        System.out.println("Número | Cuadrado | Cubo");
        for (int i = 0; i < 20; i++)
        {
            //Calcular el cuadrado y el cubo
            int cuadrado = num[i] * num[i];
            int cubo = num[i] * num[i] * num[i];
            System.out.println(num[i] + "        | " + cuadrado + "         | " + cubo);
        }//fin del for2
        teclado.close();
    }
}
