import java.util.Scanner;

public class ordenarNumero {

    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        boolean condition = false;
        int number = 0;

        while (!condition){
            System.out.println("Introduce un número entero: ");

            try{
                number = scanner.nextInt();
                condition = true;

            } catch(Exception e){
                System.out.println("Número no válido, debe ser un entero.");
                scanner.next();
            }

        }       
        
        return number;
    }

    public static void main(String[] args) {
        byte iteration = 2;
        int[] numbers = new int[iteration];

        while (iteration!=0){
            iteration --;
            numbers[iteration] = getNumber();
        }

        System.out.println(numbers[0] > numbers[1] ? numbers[0] + " > " + numbers[1]: numbers[1] + " > " + numbers[0]);
        
    }
}
