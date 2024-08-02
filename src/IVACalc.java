/*Calcular el IVA (19%) */

import java.util.Scanner;

public class IVACalc{

    //Método
    public static double calc(double total){
        double IVA_RATE = 0.19;
        return  total*(1 + IVA_RATE);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el total de la compra: ");
        double total = scanner.nextDouble();

        total = IVACalc.calc(total);
        System.out.printf("El precio total con el IVA es del: %.2f euros", total);

        scanner.close();
    }
}