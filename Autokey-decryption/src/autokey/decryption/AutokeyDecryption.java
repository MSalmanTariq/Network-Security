/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autokey.decryption;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Salman
 */
public class AutokeyDecryption {
 int i = 0;
    String str;
    int j = 0;
    ArrayList<Character> key=new ArrayList<Character>();
    private char decipher(char st, ArrayList key, String input){
        if(st==' '){
            return ' ';
        }
        else{
            char key1 = keygen(key);
           
            int k = (int)key1;
            k= k-96;
           
            char c = st;
            int a = (int)c;
            a=a-96;
            int num = (a-k)%26;
            
            if(num<=0){
                num=num+26;
//                char b = (char)num;
//                return b;
            }
            
                num=num+96;
               // System.out.println(num2);
                
                char b = (char)num;
                return b;
            
        }
        
    }
    
    private char keygen(ArrayList key){
       
       
        
        char output =(char) key.get(i);
      i++;
            return output ;   
}
   
     

    public static void main(String[] args) {
        System.out.println("Auto key Cipher [Decryption]");
        AutokeyDecryption v1 = new AutokeyDecryption();
         v1.i=0;
        v1.j=0;
        Scanner sc = new Scanner (System.in);
         System.out.println("Enter String: ");
         v1.str = sc.nextLine();
        

         System.out.println("Enter the key: ");
        String key1 = sc.nextLine();
         char[] keyArr = key1.toCharArray();
         int z;
         for(z=0;z<keyArr.length;z++){
             v1.key.add(keyArr[z]);
         }
       
        int y ;
        
         char[] arr = v1.str.toCharArray();
          System.out.print("Decrypted String:");
        for(y=0;y<arr.length;y++){
           
            char a = arr[y];
            char ans = v1.decipher(a, v1.key , v1.str);
            if(ans!=' '){
            v1.key.add(ans);
            }
//           
            System.out.print(ans);
           
        }
        
        System.out.println(" ");
//        System.out.println(v1.key);
    }
    
}
