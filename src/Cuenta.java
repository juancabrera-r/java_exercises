import java.util.Scanner;

public class Cuenta{
    private String titular;
    private String numeroCuenta;
    private Double cantidad;

    //Crea un constructor
    public Cuenta(String titular, String numeroCuenta, Double cantidad){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.cantidad = cantidad;
    }

    //Método
    public static Cuenta compararCuentas(Cuenta cuenta1, Cuenta cuenta2){
        if (cuenta1.cantidad > cuenta2.cantidad){
            return cuenta1;            
        } else if(cuenta1.cantidad < cuenta2.cantidad){
            return cuenta2;
        } else{
            return null;
        }
    }

    //Método principal
    public static void main(String[] args){
        
        //Se crean dos objetos de la clase Cuenta.
        Cuenta cuenta1 = new Cuenta("Juan", "IS218034820982", 5020.43);
        Cuenta cuenta2 = new Cuenta("Jose", "IS2181243820982", 500.43);

        //Llama al método compararCuentas de la clase Cuenta.
        Cuenta cuentamayor = Cuenta.compararCuentas(cuenta1, cuenta2);

        if (cuentamayor != null){
            System.out.println("La cuenta con mayor cantidad pertenece a: " + cuentamayor.titular);
        } else {
            System.out.println("Ambas cuentas tienen la misma cantidad");
        }

    }
}