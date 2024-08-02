import java.util.Scanner;

public class VerificadorPassword{
    
    private static String CONTRASENA_CORRECTA = "holamundo";     
    private static int MAX_INTENTOS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        int intentos = 0;
        boolean contrasenaCorrecta = false;

        while (intentos < MAX_INTENTOS && !contrasenaCorrecta){
            System.out.println("Escribe una contraseña: ");
            String contrasena = scanner.nextLine();
            
            if (contrasena.equals(CONTRASENA_CORRECTA)){
                contrasenaCorrecta = true;
            } else {
                System.out.println("Contraseña incorrecta");
                intentos += 1;
                System.out.println("Intento número; " + intentos);
            }
        }
        
        if (contrasenaCorrecta){
            System.out.println("Contraseña correcta");
        }else{
            System.out.println("Se ha excedido el nº de intentos!");
        }
        scanner.close();
    }

}