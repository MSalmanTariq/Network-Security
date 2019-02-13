/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinigardecipher;

import java.util.Scanner;

/**
 *
 * @author Salman
 */
public class VinigarDecipher {
 int i = 0;
     private char decipher(char st, String key){
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
      private char keygen(String key){
        String key1 = key;
        int len = key1.length();
        if(i==len){
          i=0;
            
        }
        char c = key1.charAt(i);
            i++;
            return c;
    }
    public static void main(String[] args) {
        
         VinigarDecipher v1 = new VinigarDecipher();
        v1.i=0;
        Scanner sc = new Scanner (System.in);
         System.out.println("Enter String: ");
        String str = sc.nextLine();
        

         System.out.println("Enter the key: ");
        String key = sc.nextLine();
        char arr[] = new char[str.length()];
        int j = 0;
          System.out.print("Decrypted Text:");
        for(j=0;j<str.length();j++){
            char a = str.charAt(j);
            char ans = v1.decipher(a, key);
            arr[j]=ans;
            System.out.print(ans);
           
        }
          System.out.println(" ");
    }
    
}
