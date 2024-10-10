/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadejemplo;

/**
 *
 * @author 9567
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimir(1);
        
        
    }
    public static void imprimir(int x){
        if(x>0){
            imprimir(--x);
            
        }
        System.out.println(x);
    }
}
    