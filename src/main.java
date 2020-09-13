
import java.util.Scanner;

class Empleado{
//Bloque de declarativas 
    
//Declaración de variables o constantes 
    private String nombre;
    private int numero_de_empleado;
    
//Bloque de instrucciones
    void asignar(int a, String b){
        nombre = b;
        numero_de_empleado = a;
    }    
    void ver_datos(){
        System.out.println("\n Nombre del empleado "+nombre+" y su numero de empleado es "+numero_de_empleado+"\n");
    }
}

public class main {

    public static void main(String[] args) {
    //Bloque de declarativas 
    
    //Declaración de variables o constantes 
        String nombre;
        int numero_de_empleado = 0;
    //Declaración de objetos 
        Scanner teclado = new Scanner(System.in);
        Empleado empleado = new Empleado() ;
    //Bloque de instrucciones 
        System.out.println("Introduce Datos. Numero de empleado cero salir");
        do {
            
            System.out.println("Ingrese  Nombre del empleado");
            nombre=teclado.nextLine( );
            
            System.out.println("Ingrese Numero del empleado");
            numero_de_empleado=teclado.nextInt( );
            
            empleado.asignar(numero_de_empleado, nombre);
            
            empleado.ver_datos();
            
        } while (numero_de_empleado!=0);
        
    }
    
}
