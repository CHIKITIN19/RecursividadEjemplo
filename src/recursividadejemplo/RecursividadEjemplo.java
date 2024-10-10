/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadejemplo;

/**
 *
 * @author 9567
 */
public class RecursividadEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamada recursiva multiple y anidada
        System.out.println(sumar(sumar(5,sumar(3,6)), sumar(7,2)));
    }
    
    public static int sumar(int a, int b){
        return a+b;
    }
}
