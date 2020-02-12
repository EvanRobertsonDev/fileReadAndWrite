/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package italy2;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Properties;

/**
 *
 * @author evrob0095
 */
public class readFile {
    
    public static boolean getData(String fileName, String property) {
        
        //Make array
        String[] arr = new String[100];
        //create return bool
        boolean config = false;
        //new file reader
        FileReader prop = null;
        try {
            prop = new FileReader("config.properties");
        } catch(FileNotFoundException e){
            System.err.println(e);
        }
        BufferedReader buffer = new BufferedReader(prop);
        
        //Loop to check each line for true or false if it contains the term searched
        for (int i = 0; i < 100; i++) {
            try {
                arr[i] = buffer.readLine();
                if (arr[i].contains(property)) {
                    if (arr[i].contains("true")) {
                        config = true;
                        break;
                    }
                    else if (arr[i].contains("false")) {
                        config = false;
                        break;
                    }
                    else {
                        System.err.println("There was an issue readng the file.\n Terminating instance");
                        i = 100;
                    }
                }
                else {
                    
                }
            } catch (IOException e) {
                System.err.println(e);
            }
        }
        //return
        if(config == true) {
             return(true);   
        }
        else {
            return(false);
        }
        
       
    }   
    
}
