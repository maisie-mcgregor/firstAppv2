/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapp;

/**
 *
 * @author 1505669
 */
public class FirstApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        // TODO code application logic here
        
         String encryptedValue="";
         String input="Becky Esplin";
        // a few changes here
        
        // another few changes
        
        System.out.print("First App");
        encryptedValue=encrypt(input, encryptedValue);
        System.out.println("\n"+encryptedValue);
    }
    
    public static String encrypt(String input, String encryptedValue){
    for(int i=0;i<input.length(); i++)
    {
        char c = input.charAt(i);
        if(c >= 'a' && c <='m')
        {
            c+=13;
        }
        else if(c >= 'A' && c <='M')
                {
                    c+=13;
                }
    else if(c >= 'n' && c <='z')
                {
                    c-=13;
                }
        else if(c >= 'N' && c <='Z')
                {
                    c-=13;
                }
        encryptedValue = encryptedValue+c;
    }
        
    return encryptedValue;
    }
    
}
