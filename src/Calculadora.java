import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crear un objeto Scanner para leer la entrada del usuario
        int i = 6;  // Número de entradas que se solicitarán al usuario
        int result = 0;  // Variable para almacenar el resultado acumulado

        while (i != 0) {
            System.out.print("Escribe un número entero: ");  // Solicitar al usuario que ingrese un número
            int number = scanner.nextInt();  // Leer el número ingresado
            result += number;  // Sumar el número al resultado acumulado
            System.out.println("Resultado acumulado: " + result);  // Mostrar el resultado acumulado
            i -= 1;  // Decrementar el contador
        }
        scanner.close();  // Cerrar el scanner para liberar recursos
    }        
}
