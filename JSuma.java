
package jsuma;

/**
 *
 * @author byron
 */
import java.util.Scanner;
public class JSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,suma,contador;
        Scanner captura =new Scanner(System.in );
        contador =0;
        num1=0;
        suma=0;
        do {            
            System.out.println("Favor ingresar un numero");
            num1 = captura.nextInt();
            suma= suma +num1;
            contador=contador +1;
        }while (contador < 10); 
        System.out.println("El resultado de la suma es: "+ suma);
    }
    
}
