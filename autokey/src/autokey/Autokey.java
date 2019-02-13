/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autokey;

import java.util.Scanner;

/**
 *
 * @author Salman
 */
public class Autokey {

    int i = 0;
    String str;
    int j = 0;
   
    
    
    private char cipher(char st, String key , String input){
        if(st==' '){
            return ' ';
        }
        else{
            char key1 = keygen(key,input);
            int k = (int)key1;
            k= k-96;
            char c = st;
            int a = (int)c;
            a=a-96;
            int num = (a+k);
            if(num<=26){
                num=num+96;
                char b = (char)num;
                return b;
            }
            else{
                int num2 = num%26;
               // System.out.println(num2);
                num2=num2+96;
                char b = (char)num2;
                return b;
            }
        }
        
    }
   
    private char keygen(String key, String input){
       
        if(i<key.length()){
        String key1 = key;
        
        
        char c = key1.charAt(i);
            i++;
            return c;
    }
    
    else{
         String input1 = removeSpaces(input)  ; 
         
        
        
        char c = input1.charAt(j);
            j++;
            return c;   
}
    }
    
    private String removeSpaces(String input) {

        return input.replaceAll(" ", "");

    }

    
    public static void main(String[] args) {
        System.out.println("Auto key Cipher [Encryption]");
        Autokey v1 = new Autokey();
        v1.i=0;
        v1.j=0;
        Scanner sc = new Scanner (System.in);
         System.out.println("Enter String: ");
         v1.str = sc.nextLine();
        

         System.out.println("Enter the key: ");
        String key = sc.nextLine();
        char arr[] = new char[v1.str.length()];
        int y = 0;
        System.out.print("Encrypted String:");
        for(y=0;y<v1.str.length();y++){
            char a = v1.str.charAt(y);
            char ans = v1.cipher(a, key, v1.str);
            arr[y]=ans;
            System.out.print(ans);
           
        }
        v1.i=0;
        v1.j=0;
        System.out.println(" ");
        
         
      
    }
    
}
