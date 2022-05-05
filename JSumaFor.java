package jsumafor;

/**
 *
 * @author byron
 */
import java.util.Scanner;
public class JSumaFor {

    public static void main(String[] args) {
        // TODO code application logic here
        int num1,suma;
        Scanner captura =new Scanner(System.in );
        suma=0;
        for (int contador=10;contador > 0;contador --)
        {
            System.out.println("Favor ingrese un numero");
            num1 = captura.nextInt();
            suma = suma + num1;
        }
        System.out.println("El resultado de la suma: "+ suma);
    }
    
}
