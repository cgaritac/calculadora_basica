package calculadorav3;
import java.util.Scanner;
public class Menu {
    public void opciones () {
        
        String opcion = "0";
       
        while (!opcion.equals("5")){
        Scanner datos = new Scanner (System.in);
        System.out.println("----Menu----");
        System.out.println("            ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Escriba un número de las cuatro opciones.");
        System.out.println("            ");
        
        opcion = datos.next();
            if (opcion.equals("1") || opcion.equals ("2") || opcion.equals ("3") || opcion.equals ("4")){
                if (opcion.equals("1")){
                Operaciones total = new Operaciones();
                total.Sumar();
                }
                if (opcion.equals("2")){
                    Operaciones total = new Operaciones();
                    total.Restar();
                }
                if (opcion.equals("3")){
                    Operaciones total = new Operaciones();
                    total.Multiplicar();
                }
                if (opcion.equals("4")){
                    Operaciones total = new Operaciones();
                    total.Dividir();
                }  
            }
            else {
                if (opcion.equals ("5")){
                    
                }
                else {
                    System.out.println("Opción no válida");
                    System.out.println("Escriba un número de las cinco opciones.");
                }
 
            }
        }
    System.exit(0);
    }
}
