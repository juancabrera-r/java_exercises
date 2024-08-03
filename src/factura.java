import java.util.Scanner;

public class factura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el nombre de la facutra: ");
        String nombreFactura = scanner.nextLine();
        
        System.out.println("Introduce el primer precio: ");
        double precio1 = scanner.nextDouble();

        System.out.println("Introduce el segundo precio: ");
        double precio2 = scanner.nextDouble();

        double total = (precio1 + precio2);
        double totalTax = total*1.19;

        System.out.printf("La factura %s tiene un total bruto de %.2f con un impuesto de %.2f y el monto después de impuesto es de %.2f",
         nombreFactura, total, total*0.19, totalTax);

        scanner.close();
    }
}
