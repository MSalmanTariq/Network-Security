/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdes.cipher;

import java.util.Scanner;

/**
 *
 * @author Salman
 */
public class SdesCipher {

    public char[] p10(char[] input) {

        char[] output = new char[11];
        output[0] = input[2];
        output[1] = input[4];
        output[2] = input[1];
        output[3] = input[6];
        output[4] = input[3];
        output[5] = input[9];
        output[6] = input[0];
        output[7] = input[8];
        output[8] = input[7];
        output[9] = input[5];

        return output;
    }

    public char[] p8(char[] input) {

        char[] output = new char[9];
        output[0] = input[5];
        output[1] = input[2];
        output[2] = input[6];
        output[3] = input[3];
        output[4] = input[7];
        output[5] = input[4];
        output[6] = input[9];
        output[7] = input[8];
        return output;
    }

    public char[] p4(char[] input) {
        char[] output = new char[5];
        output[0] = input[1];
        output[1] = input[3];
        output[2] = input[2];
        output[3] = input[0];

        return output;
    }

    public char[] ip(char[] input) {
        char[] output = new char[9];
        output[0] = input[1];
        output[1] = input[5];
        output[2] = input[2];
        output[3] = input[0];
        output[4] = input[3];
        output[5] = input[7];
        output[6] = input[4];
        output[7] = input[6];
        return output;
    }

    public char[] ip_inverse(char[] input) {
        char[] output = new char[9];
        output[0] = input[3];
        output[1] = input[0];
        output[2] = input[2];
        output[3] = input[4];
        output[4] = input[6];
        output[5] = input[1];
        output[6] = input[7];
        output[7] = input[5];

        return output;
    }

    public char[] ep(char[] input) {
        char[] output = new char[9];
        output[0] = input[3];
        output[1] = input[0];
        output[2] = input[1];
        output[3] = input[2];
        output[4] = input[1];
        output[5] = input[2];
        output[6] = input[3];
        output[7] = input[0];

        return output;
    }

    public char[] s0(int num1, int num2) {
        String[][] array = new String[5][5];
        array[0][0] = "01";
        array[0][1] = "00";
        array[0][2] = "11";
        array[0][3] = "10";
        array[1][0] = "11";
        array[1][1] = "10";
        array[1][2] = "01";
        array[1][3] = "00";
        array[2][0] = "00";
        array[2][1] = "10";
        array[2][2] = "01";
        array[2][3] = "11";
        array[3][0] = "11";
        array[3][1] = "01";
        array[3][2] = "11";
        array[3][3] = "10";

        String outputStr = array[num1][num2];
        char[] output = outputStr.toCharArray();
        return output;
    }

    public char[] s1(int num1, int num2) {
        String[][] array = new String[5][5];

        array[0][0] = "00";
        array[0][1] = "01";
        array[0][2] = "10";
        array[0][3] = "11";
        array[1][0] = "10";
        array[1][1] = "00";
        array[1][2] = "01";
        array[1][3] = "11";
        array[2][0] = "11";
        array[2][1] = "00";
        array[2][2] = "01";
        array[2][3] = "00";
        array[3][0] = "10";
        array[3][1] = "01";
        array[3][2] = "00";
        array[3][3] = "11";

        String outputStr = array[num1][num2];
        char[] output = outputStr.toCharArray();
        return output;
    }

    public int checkRowCol(char x, char y) {
        char[] demo = new char[2];
        demo[0] = x;
        demo[1] = y;
        String outputStr = String.valueOf(demo);

        if (outputStr.equals("00")) {

            return 0;
        } else if (outputStr.equals("01")) {
            return 1;
        } else if (outputStr.equals("10")) {
            return 2;
        } else if (outputStr.equals("11")) {
            return 3;
        }
        return 999; // 999 means error
    }

    public char[] leftShift(char[] input) {
        char[] output = new char[6];
        output[0] = input[1];
        output[1] = input[2];
        output[2] = input[3];
        output[3] = input[4];
        output[4] = input[0];

        return output;

    }

    public char[] combineBits_10(char[] left, char[] right) {
        char[] output = new char[11];
        output[0] = left[0];
        output[1] = left[1];
        output[2] = left[2];
        output[3] = left[3];
        output[4] = left[4];
        output[5] = right[0];
        output[6] = right[1];
        output[7] = right[2];
        output[8] = right[3];
        output[9] = right[4];

        return output;

    }

    public char[] combineBits_8(char[] left, char[] right) {
        char[] output = new char[9];
        output[0] = left[0];
        output[1] = left[1];
        output[2] = left[2];
        output[3] = left[3];

        output[4] = right[0];
        output[5] = right[1];
        output[6] = right[2];
        output[7] = right[3];

        return output;

    }

    public char[] combineBits_4(char[] left, char[] right) {
        char[] output = new char[5];
        output[0] = left[0];
        output[1] = left[1];
        output[2] = right[0];
        output[3] = right[1];

        return output;

    }

    public char[] seperateLeft_10b(char[] input) {
        char[] output = new char[6];
        output[0] = input[0];
        output[1] = input[1];
        output[2] = input[2];
        output[3] = input[3];
        output[4] = input[4];

        return output;

    }

    public char[] seperateRight_10b(char[] input) {
        char[] output = new char[6];
        output[0] = input[5];
        output[1] = input[6];
        output[2] = input[7];
        output[3] = input[8];
        output[4] = input[9];

        return output;
    }

    public char[] seperateLeft_8b(char[] input) {
        char[] output = new char[5];
        output[0] = input[0];
        output[1] = input[1];
        output[2] = input[2];
        output[3] = input[3];

        return output;
    }

    public char[] seperateRight_8b(char[] input) {
        char[] output = new char[5];
        output[0] = input[4];
        output[1] = input[5];
        output[2] = input[6];
        output[3] = input[7];

        return output;
    }

    public char[] xor(char[] a, char[] b, int bits) {
        char[] output = new char[bits];
        for (int k = 0; k < bits; k++) {
            if (a[k] == b[k]) {
                output[k] = '0';
            } else {
                output[k] = '1';
            }
        }
        return output;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("S-DES Cipher [Encryption]");
        SdesCipher s1 = new SdesCipher();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the plain text");
        String plainTextStr = in.nextLine();
        char[] plainText = plainTextStr.toCharArray();
        System.out.println("Enter the key");
        String keyStr = in.nextLine();
        char[] key = keyStr.toCharArray();

        //for key 1 (k1)
        //key ==>> p10
        char[] p10 = s1.p10(key);

        //p10 ==>> [5 bits][5 bits]
        char[] left1 = s1.seperateLeft_10b(p10);
        char[] right1 = s1.seperateRight_10b(p10);

        // [5 bits][5 bits] ==>> [5 bits (LS)][5 bits (LS)]
        char[] left1_shift = s1.leftShift(left1);
        char[] right1_shift = s1.leftShift(right1);

        // [5 bits (LS)][5 bits (LS)] ==>> [10 bits] to p8 table
        char[] left1_right1 = s1.combineBits_10(left1_shift, right1_shift);

        //[10 bits] ==>> p8 
        char[] p8_k1 = s1.p8(left1_right1); //key 1 (k1)

        //print k1
        System.out.print("Key1 (K1) ==>>  ");
        for (int i = 0; i < p8_k1.length; i++) {
            System.out.print(p8_k1[i]);
        }
        System.out.println(" ");

        //for key 2 (k2)
        //[10 bits] = [5 bits][5 bits]
        char[] left2 = s1.seperateLeft_10b(left1_right1);
        char[] right2 = s1.seperateRight_10b(left1_right1);

        //[5 bits][5 bits] ==>> [5 bits (LS)][5 bits (LS)]
        char[] left1_shift_1 = s1.leftShift(left2);
        char[] right1_shift_1 = s1.leftShift(right2);

        //[5 bits (LS)][5 bits (LS)] ==>> [5 bits (LS)][5 bits (LS)]
        char[] left1_shift_2 = s1.leftShift(left1_shift_1);
        char[] right1_shift_2 = s1.leftShift(right1_shift_1);

        //[5 bits (LS)][5 bits (LS)] ==>> [10 bits] to p8 table
        char[] left2_right2 = s1.combineBits_10(left1_shift_2, right1_shift_2);

        //[10 bits] ==>> p8 
        char[] p8_k2 = s1.p8(left2_right2); //key 2 (k2)

        //print k2
        System.out.print("Key2 (K2) ==>>  ");
        for (int i = 0; i < p8_k2.length; i++) {
            System.out.print(p8_k2[i]);
        }
        System.out.println(" ");

        //for plainText
        //P.T ==>> IP
        char[] ip = s1.ip(plainText);

        //I.P ==> [4 bits] [4 bits]
        char[] ipLeft = s1.seperateLeft_8b(ip);
        char[] ipRight = s1.seperateRight_8b(ip);

        //I.P Right 4 bits ==>> E.P
        char[] EP1 = s1.ep(ipRight);

        //E.P xor Key1 (K1)
        char[] EP1_k1_xor = s1.xor(EP1, p8_k1, 8);

        //[4 bits for s0] [4 bits for s1]
        char[] xor1_left = s1.seperateLeft_8b(EP1_k1_xor);
        char[] xor1_right = s1.seperateRight_8b(EP1_k1_xor);

        //retriving value of s0 and s1 from function
        int s0_row_k1 = s1.checkRowCol(xor1_left[0], xor1_left[3]);
        int s0_col_k1 = s1.checkRowCol(xor1_left[1], xor1_left[2]);

        int s1_row_k1 = s1.checkRowCol(xor1_right[0], xor1_right[3]);
        int s1_col_k1 = s1.checkRowCol(xor1_right[1], xor1_right[2]);

        char[] s0_k1 = s1.s0(s0_row_k1, s0_col_k1);
        char[] sone_k1 = s1.s1(s1_row_k1, s1_col_k1);

        //combing 2 bits of s0 with 2 bits of s1
        char[] s0_s1_k1 = s1.combineBits_4(s0_k1, sone_k1);

        //so&s1 ==> p4
        char[] p4_1 = s1.p4(s0_s1_k1);

        //left 4 bits of futher process and right 4 bits for ip-inverse
        char[] ans1 = s1.xor(p4_1, ipLeft, 4);

        //left 4 bits ==>> E.P
        char[] EP2 = s1.ep(ans1);

        //E.P xor Key1 (K1)
        char[] EP2_k2_xor = s1.xor(EP2, p8_k2, 8);

        //[4 bits for s0] [4 bits for s1]
        char[] xor2_left = s1.seperateLeft_8b(EP2_k2_xor);
        char[] xor2_right = s1.seperateRight_8b(EP2_k2_xor);

        //retriving value of s0 and s1 from function
        int s0_row_k2 = s1.checkRowCol(xor2_left[0], xor2_left[3]);
        int s0_col_k2 = s1.checkRowCol(xor2_left[1], xor2_left[2]);

        int s1_row_k2 = s1.checkRowCol(xor2_right[0], xor2_right[3]);
        int s1_col_k2 = s1.checkRowCol(xor2_right[1], xor2_right[2]);

        char[] s0_k2 = s1.s0(s0_row_k2, s0_col_k2);
        char[] sone_k2 = s1.s1(s1_row_k2, s1_col_k2);

        //combing 2 bits of s0 with 2 bits of s1
        char[] s0_s1_k2 = s1.combineBits_4(s0_k2, sone_k2);

        //so&s1 ==> p4
        char[] p4_2 = s1.p4(s0_s1_k2);

        //left 4 bits of Cipher text
        char[] ans2 = s1.xor(p4_2, ipRight, 4);

        //combing left and right bits for ip-inverse
        char[] ans3 = s1.combineBits_8(ans2, ans1);

        char[] cipherText = s1.ip_inverse(ans3);

        System.out.print("Encrypted Text ==>>   ");
        for (int i = 0; i < cipherText.length; i++) {
            System.out.print(cipherText[i]);
        }
        System.out.println(" ");

    }

}
