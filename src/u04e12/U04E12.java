
package u04e12;

import java.util.Scanner;
public class U04E12 {

    public static void main(String[] args) {
        char vocal;
        String mensaje1 = "La letra ";
        String mensaje2 = " es una vocal";
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese la letra: ");
        vocal = entrada.next().charAt(0);
        switch (vocal){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print(mensaje1+vocal+mensaje2);
                break;
            default:
                System.out.print(mensaje1+vocal+" no"+mensaje2);
        }
    }
}