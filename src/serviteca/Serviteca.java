/*
 *En una serviteca se ha establecido una promoción de las llantas marca
“Pinchadas”, dicha promoción consiste en lo siguiente:
•Si se compran menos de cinco llantas el precio es de U$100 cada una,
de U$75 si se compran de cinco a 10 y de U$50 si se compran más de 10.
Obtener la cantidad de dinero que una persona tiene que pagar
por cada una de las llantas que compra
y la que tiene que pagar por el total de la compra.
 */
package serviteca;

import java.util.Scanner;

/**
 *josselyne ester chilito galindez. cod: 20201187434
 */
public class Serviteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("welcom a serviteca");
        System.out.println("");
        System.out.println("en el dia de hoy tenemos una gran promosicion en la marca de llantas pichadas");
        System.out.println("");
        System.out.println("por la cantidad de llanatas compradas");
        System.out.println("_____________________________________");
        System.out.println("si compra menos de 5 llantas el precio es de u$100");
        System.out.println("si compra de 5 a 10 llantas el precia es de u$75");
        System.out.println("si compra mas de 10 llantas el precio es de u$50");
        System.out.println("______________________________________");
        
        int numllantas,totalpagar ;
        System.out.println("ingrese el numero de llantas a comprar");
        numllantas=entrada.nextInt();
        
        if (numllantas<5){
            System.out.println("el valor de cada llanta tiene el valor de u$100"); 
            totalpagar=numllantas*100;
        }
        else {
            if ((numllantas>=5)&&(numllantas<=10)){
                System.out.println("el valor de cada llanta tiene el valor de u$75");
                totalpagar=numllantas*75;
            }
            else{
                System.out.println("el valor de cada llanta tiene el valor de u$50");
                totalpagar=numllantas*50;
            }
        }
        
        System.out.println("su valor a pagar es de "+totalpagar);
        
    }
    
}
