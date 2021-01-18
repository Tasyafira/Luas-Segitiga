/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodluassegitiga;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
class MethodSegitiga {
    int a, b, c;
    String d = "Program Menghitung Luas Segitiga";
    
    String JudulProgram(){
        return d;
    }
    
    void InputVariabel(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("----------------------------------");
        System.out.print("Masukkan alas segitiga   : ");
        a = input.nextInt();
        System.out.print("Masukkan tinggi segitiga : ");
        b = input.nextInt();
        c = a * b / 2;
    }
    
    void Output(){
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("----------------------------------");
        System.out.println("              HASIL               ");
        System.out.println("Alas Segitiga   : "+a);
        System.out.println("Tinggi Segitiga : "+b);
        System.out.println("Luas Segitiga   : "+c);
        System.out.println("----------------------------------");
    }
}
