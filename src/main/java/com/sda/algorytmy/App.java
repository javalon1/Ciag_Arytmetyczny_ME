package com.sda.algorytmy;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyrazy ciagu ");
    int n = scanner.nextInt();
        System.out.println("Podaj pierwszy wyraz ");
    int a1 = scanner.nextInt();
        System.out.println("Podaj przyrost: ");
    int d = scanner.nextInt();
    int ciag = 0;

        for(int i =1; i <= n; i++){
            ciag = a1+(i-1)*d;
            System.out.println(ciag);

        }
    }
}
