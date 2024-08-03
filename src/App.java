import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        var numero = 15;
		var numero1 = 3f; //La f indica que es float
		var numero2= 3d; //Double
        var numero3 = 4L; //Long

        double num1 = 4.32;
        Double num2 = 4.32;

        int num3 = 2;
        Integer num4 = 4;

        try{
            int numeroD = Integer.parseInt(JOptionPane.showInputDialog("iNGRESE UN numero: ")); 
            JOptionPane.showMessageDialog( null, numeroD);

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog( null, "Errorrrr");
            main(args);
            System.exit(0);
        }
        
        
    }

}
