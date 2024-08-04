import java.util.Scanner;

public class nombreMasLargo {
    public static String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String name = scanner.nextLine();
        return name;
    }
    
    public static void main(String[] args) {
        
        String name1 = getName();
        String name2 = getName();
        String name3 = getName();

        String[] nameS1 = name1.split(" ");
        String[] nameS2 = name2.split(" ");
        String[] nameS3 = name3.split(" ");

        String[] nameCondition1 = nameS1[0].length() > nameS2[0].length() ? nameS1: nameS2;
        String[] nameCondition2 = nameCondition1[0].length() > nameS3[0].length() ? nameCondition1: nameS3; 
        System.out.println(nameCondition2[0] + " " + nameCondition2[1] + " tiene le nombre más largo");
    }
}
