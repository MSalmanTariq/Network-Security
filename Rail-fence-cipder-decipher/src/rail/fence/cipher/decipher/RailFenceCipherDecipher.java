/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rail.fence.cipher.decipher;

import java.util.Scanner;

/**
 *
 * @author Salman
 */
public class RailFenceCipherDecipher {

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

    public static void main(String[] args) {
        // TODO code application logic here
        int x = 0;

        RailFenceCipherDecipher r1 = new RailFenceCipherDecipher();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the text to cipher");
        String input = in.nextLine();
        char[] chInput = input.toCharArray();
        System.out.println("Enter the key");
        r1.key = in.nextInt();

        char[][] array = new char[r1.key][input.length()];

        for (x = 0; x < input.length(); x++) {
            int tempI = r1.geti();
            array[tempI][x] = '%';

        }

        int a = 0;
        int b = 0;
        int y = -1;
        char[] arrayCipher = new char[input.length()];
        for (a = 0; a < r1.key; a++) {

            for (b = 0; b < input.length(); b++) {

                if (array[a][b] == '%') {
                    y++;
                    array[a][b] = chInput[y];
                }
            }
        }

//         System.out.println(arrayCipher);
        r1.sFlag = false;
        r1.operation = 0;
        r1.i = -1;
        char[] chOutput = new char[input.length()];
        for (x = 0; x < input.length(); x++) {

            int tempI = r1.geti();
//             System.out.println(array[tempI][x]);
            chOutput[x] = array[tempI][x];

        }
         System.out.println("Decrypted Text:");
        System.out.print(chOutput);

    }

}
