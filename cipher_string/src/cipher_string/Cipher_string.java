/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher_string;


import java.util.Scanner;

/**
 *
 * @author Salman
 */
public class Cipher_string {
    Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cipher_string c1 = new  Cipher_string();
       c1.menu();
      //  System.out.println(" ");
    //  c1.decipher();
//       int num = (5-5)%26;
//        System.out.println(num);
      
//        System.out.print(ch);
        // TODO code application logic here
    }
    
 //   int key =20;
    public void cipher(){
        System.out.println("Enter Key:");
        int key=in.nextInt();
         String strcipher;
         String anscipher;
         in.nextLine();
          System.out.println("Enter String:");
         strcipher= in.nextLine();
         
         
         
       char[]  ch = new char [strcipher.length()] ;
      
        
        int i;
        for(i=0;i<strcipher.length();i++){
           
            char c = strcipher.charAt(i);
            int a = (int)c;
            if(a==32){
                
            char b = (char)a;
            ch[i]=b;
           // System.out.print(b);
            }
            else{
            a=a-96;
            int num = (a+key)%26;
            num=num+96;
            char b = (char)num;
            ch[i]=b;
              //  System.out.print(b);
             
            }
        }
        anscipher = String.valueOf(ch);
         System.out.println("\nCIPHERED STRING: "+anscipher+"\n\n");
         menu();
        // System.out.println(ch);
        
    }
    public void decipher(){
         System.out.println("Enter Key:");
        int key=in.nextInt();
         String strdecipher;
        // String ansdecipher;
         in.nextLine();
          System.out.println("Enter String:");
         strdecipher= in.nextLine();
                 
       char[]  ch = new char [1000] ;
     
        
        int i;
        System.out.print("\nDECIPHERED STRING: ");
        for(i=0;i<strdecipher.length();i++){
           char c = strdecipher.charAt(i);
            int a = (int)c;
            if(a==32){
            char b = (char)a;
            System.out.print(b);
            }
            else{
            a=a-96;
            int num = (a-key)%26;
            if(num<=0){
                num = num + 26;
                
            }
            
            num=num+96;
            
            char b = (char)num;
             System.out.print(b);
             
            
        }
        }
        System.out.println(" ");
        System.out.println(" ");
        menu();
    }
    
    public void menu(){
        System.out.println("Select the option:\nPress 1 for CIPHER\nPress 2 DECIPHER\nPress 3 for EXIT");
        int j=in.nextInt();
        switch(j){
            case 1:                
                cipher();
                
                break;
                
            case 2:
                decipher();
               
                break;
            
            case 3:
                exit();
                break;
                
        }
        
    }
    
    public void exit(){
        System.exit(0);
    }
    
}
