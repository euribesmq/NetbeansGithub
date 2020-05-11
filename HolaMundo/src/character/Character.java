/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;
import java.util.Scanner;


/**
 *
 * @author EUMQ6J
 */
public class Character {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char letra1;
        char letra2;
        boolean resultado;
        //
        Scanner tec=new Scanner(System.in);
        //
        System.out.println("Introduzca la primera letra ");
        letra1=tec.nextLine().charAt(0);
         //
        System.out.println("Introduzca la segunda letra ");
        letra2=tec.nextLine().charAt(0);
          //
        System.out.println("¿Es la misma letra? ");
        resultado=(letra1==letra2);
        System.out.println(resultado);
        
    }
    
}
