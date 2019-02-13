/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinigar;

import java.util.Scanner;

/**
 *
 * @author Salman
 */
public class Vinigar {

    /**
     * @param args the command line arguments
     */
    
    int i = 0;
    
    private char cipher(char st, String key){
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
        
        Vinigar v1 = new Vinigar();
        v1.i=0;
        Scanner sc = new Scanner (System.in);
         System.out.println("Enter String: ");
        String str = sc.nextLine();
        

         System.out.println("Enter the key: ");
        String key = sc.nextLine();
        char arr[] = new char[str.length()];
        int j = 0;
        System.out.print("Encrypted Text:");
        for(j=0;j<str.length();j++){
            char a = str.charAt(j);
            char ans = v1.cipher(a, key);
            arr[j]=ans;
            System.out.print(ans);
           
        }
        
        System.out.println(" ");
       
       // System.out.println(str+" "+key);
//        for(j=0;j<10;j++){
//            System.out.println(v1.keygen("math"));
//        }
        // TODO code application logic here
    }
    
}
