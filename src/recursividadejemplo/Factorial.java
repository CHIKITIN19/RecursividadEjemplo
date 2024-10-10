/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadejemplo;

/**
 *
 * @author 9567
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int x){
        if (x==1) {
            return 1;
        }else{
            return x * fact(x-1);
        }
    }
}
