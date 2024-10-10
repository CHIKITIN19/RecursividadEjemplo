/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadejemplo;

/**
 *
 * @author 9567
 */
public class CantidadNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("La cantidad de digitos es de " +ContarDigitos(10000));
    }
    public static int ContarDigitos(int x){
        //caso base cualquier numero menor que 10 va a tener 1 digito
        if (x<10) {
            return 1;
        }else{
            //llamada recursividad dividimos el numero entre 10
            //y llamamos la funcion y al resultado de esa dividicion se le agrega el +1
            return 1 + ContarDigitos(x/10);
        }
    }
}
