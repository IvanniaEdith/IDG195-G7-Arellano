/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

/**
 *
 * @author ivann
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Nprimo (6));
    }
    public static boolean Nprimo (int primo){
        if(primo<2){
          return false;  
        }
        for(int i=2; i<primo; i++){
            if(primo % i == 0){
                return false;
            }
        }
        return true;
    }
    
    
}
