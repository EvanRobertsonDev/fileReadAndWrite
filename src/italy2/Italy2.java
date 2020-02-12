/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package italy2;
/**
 *
 * @author evrob0095
 */
public class Italy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean data = readFile.getData("config.properties", "doHax");
        if (data == true) {
            System.out.println("Is True");
        }
        else {
            System.out.println("Is False");
        }
        
    }
    
}
