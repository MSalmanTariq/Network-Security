/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rail.fence.cipher;

import java.util.Scanner;

/**
 *
 * @author Salman
 */
public class RailFenceCipher {

    boolean sFlag = false;
    int operation = 0;
    int i = -1;
    int key = 0;

    public int geti() {
        if (sFlag == false) {
            operation = 1;
            sFlag = true;
        }

        if (operation == 1) {
            i++;
            if (i == key) {
                i = i - 2;
                operation = 2;
            }
            return i;
        }
        if (operation == 2) {
            i--;
            if (i == -1) {

                i = i + 2;
                operation = 1;
            }

            return i;
        }
        return i;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x = 0;

        RailFenceCipher r1 = new RailFenceCipher();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the plain text");
        String input = in.nextLine();
        char[] chInput = input.toCharArray();
        System.out.println("Enter the key");
        r1.key = in.nextInt();

        char[][] array = new char[r1.key][input.length()];

        for (x = 0; x < input.length(); x++) {
            int tempI = r1.geti();
            
            array[tempI][x] = chInput[x];

        }

        int a = 0;
        int b = 0;
        int y = -1;
        char[] arrayCipher = new char[input.length()];
        for (a = 0; a < r1.key; a++) {

            for (b = 0; b < input.length(); b++) {

                if (array[a][b] != 0) {
                    y++;
                  
                    arrayCipher[y] = array[a][b];
                }
            }
        }
        System.out.println("Encrypted Text:");
        System.out.print(arrayCipher);

        // TODO code application logic here
    }

}
