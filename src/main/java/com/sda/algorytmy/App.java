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


        for(int i =2; i <= n; i++){
            System.out.println(a1+(i-1)*d);

        }
    }
}
