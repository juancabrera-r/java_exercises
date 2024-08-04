import java.util.Scanner;

public class depositoEstado {
    
    public static void printText(String textOut){
        System.out.println(textOut);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 0;
        boolean condition = false;

        while (!condition){
            System.out.println("Introduce nivel del depósito");
            try{
                capacity = scanner.nextInt();
                if (capacity >= 1 && capacity <= 100){
                    condition = true;                    
                } else{
                    System.out.println("Valor fuera de rango");
                    throw new Exception();                    
                }
            } catch (Exception e){
                System.out.println("Valor no válido");
                scanner.next();
            }    
        }

        if (capacity >= 60 && capacity < 70){
            printText("Deposito casi lleno");
        } else if(capacity >= 40 && capacity < 60){
            printText("Deposito 3/4");
        } else if(capacity >= 35 && capacity < 40){
            printText("Medio depósito");
        } else if(capacity >= 20 && capacity < 35){
            printText("Suficiente");
        } else if(capacity >= 1 && capacity < 20){
            printText("Insuficiente");
        } else {
            printText("Depósito lleno");
        }

        scanner.close();

    }
}
