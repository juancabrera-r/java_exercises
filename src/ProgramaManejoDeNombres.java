import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static String getName(){
        System.out.println("Introduce un nombre: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

    public static String modifyName(String name){

        int len = name.length();

        char first_letter = name.toUpperCase().charAt(1);
        String lastTwoLetters = name.substring(len - 2);
                
        return (first_letter + "." + lastTwoLetters);
    }    

    public static void main(String[] args) {
        
        String[] name = new String[3];

        for (int i=0; i< name.length; i++){            
            name[i] = getName();
        }

        for (int i=0; i<name.length; i++){            
            System.out.print(modifyName(name[i]) + (i< name.length -1? "_": ""));
        }
        
    }

}
