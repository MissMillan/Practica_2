/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

/**
 *
 * @author milla
 */
public class Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          /*1.- Introducir un número desde el teclado y decir si es positivo, 
          negativo o cero.*/
        int dato;
          java.util.Scanner entrada = new java.util.Scanner(System.in);//clase scanner poner scanner + el nombre que quieras
         System.out.print("Introduzca un dato INT por teclado: ");
        dato=entrada.nextInt();//la linea para crear objetos
        //entrada.nextLine();//OBLIGATORIO
        if(dato>0){
            System.out.println("El dato introducido es positivo "+dato);//printf hay que poner salto de linea
        }
        else{
              if(dato<0){
                    System.out.println("El dato introducido es negativo "+dato);
              }
              else{
                  System.out.println("El dato introducido es un cero "+dato);
              }
        }
    }
    
}
