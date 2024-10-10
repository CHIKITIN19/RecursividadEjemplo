/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadejemplo;

/**
 *
 * @author 9567
 */
public class subeBja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        subeBaja(2);
    }
    public static void subeBaja(int x){
        System.out.println(x);
        if (x==0) {
            return;
        }
        if (x%2==1) {
            subeBaja(x*2);
        }else{
            subeBaja(x/3);
        }
    }
}
