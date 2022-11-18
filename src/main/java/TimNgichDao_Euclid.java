
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hien PC
 */
public class TimNgichDao_Euclid {

    public static int modInverse(int a, int p) // a^-1 mod p
    {
        int u, v;
        int x1 = 1, x2 = 0;
        u = a;
        v = p;
        while (u != 1) {
            int q = v / u;
            int r = v - q * u;
            int x = x2 - q * x1;
            v = u;
            u = r;
            x2 = x1;
            x1 = x;
        }
        int modulo = x1 % p;
        if (modulo < 0) {
            modulo += p;
        }
        return (modulo);
    }

    public static void main(String[] args) {
        int  p;
        int[] a = new int[7]; // 233 113 211 173 251 79 181
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        for(int i = 0; i < 7; i ++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap p: ");
        p = sc.nextInt();
        
        for(int i = 0; i < 7; i ++) {
            System.out.print(" " + modInverse(a[i], p));
        }
        // 89 145 91 37 51 175 157
        
    }
}
