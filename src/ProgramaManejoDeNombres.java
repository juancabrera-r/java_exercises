import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static String getName(){
        System.out.println("Introduce un nombre: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

    public static String modifyName(String name){

        char first_letter = name.toUpperCase().charAt(1);
        char[] nameA = name.toCharArray();

        int len = nameA.length;
        
        char last_letter1 = name.charAt(len-1);
        char last_letter2 = name.charAt(len-2);
        
        return (first_letter + "." + last_letter1 + last_letter2);
    }    

    public static void main(String[] args) {
        
        String[] name = new String[3];

        for (int i=0; i< name.length; i++){            
            name[i] = getName();
        }

        for (int i=0; i<name.length; i++){            
            System.out.println(modifyName(name[i]) + "_");
        }
        
    }

}
