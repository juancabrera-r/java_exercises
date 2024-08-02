/*Toma las tres notas de un estudiante y calcule la nota final.
 * La primera y segunda nota vale el 30%.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Notas {
    
    public static double Cacl(Float nota1, Float nota2, Float nota3){
        double resultado;
        resultado = nota1*0.3 + nota2*0.3 + nota3*0.4;
        return resultado;
    }

    public static Float getFloat(){
        Scanner scanner = new Scanner(System.in);
        Float nota = null;
        boolean correcto = false;

        while (!correcto) {
            System.out.println("Introduce una nota: ");
            try{
                nota = scanner.nextFloat();
                correcto = true;
            }
            catch(InputMismatchException  e){
                System.out.println("Valor no correcto");
                scanner.next();
            }
        }           
        return nota;
    }

    public static void main(String[] args){

        Float nota1 = getFloat();
        Float nota2 = getFloat();
        Float nota3 = getFloat();

        double resultado = Notas.Cacl(nota1, nota2, nota3);
        System.out.println("La nota final es: " + resultado);
        

    }

}
