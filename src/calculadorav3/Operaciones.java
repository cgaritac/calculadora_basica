package calculadorav3;
import java.util.Scanner;
public class Operaciones {
    public void Sumar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int numero1 = Integer.parseInt(sc.next());
        System.out.println("Escriba un número: ");
        int numero2 = Integer.parseInt(sc.next());
        int resultado;
        resultado = numero1 + numero2;
        System.out.println("El resultado es: "+resultado);
        Menu regresar = new Menu();
        regresar.opciones();
    }
    public void Restar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int numero1 = Integer.parseInt(sc.next());
        System.out.println("Escriba un número: ");
        int numero2 = Integer.parseInt(sc.next());
        int resultado;
        resultado = numero1 - numero2;
        System.out.println("El resultado es: "+resultado);
        Menu regresar = new Menu();
        regresar.opciones();
    }    
        
    public void Multiplicar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int numero1 = Integer.parseInt(sc.next());
        System.out.println("Escriba un número: ");
        int numero2 = Integer.parseInt(sc.next());
        int resultado;
        resultado = numero1 * numero2;
        System.out.println("El resultado es: "+resultado);
        Menu regresar = new Menu();
        regresar.opciones();
    }    
        
    public void Dividir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int numero1 = Integer.parseInt(sc.next());
        System.out.println("Escriba un número: ");
        int numero2 = Integer.parseInt(sc.next());
        int resultado;
        resultado = numero1 / numero2;
        System.out.println("El resultado es: "+resultado);
        Menu regresar = new Menu();
        regresar.opciones();
    }
}
