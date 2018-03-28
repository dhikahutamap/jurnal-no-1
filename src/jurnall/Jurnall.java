/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifiedsumfibonaci;

/**
 *
 * @author Praktikan
 */
public class Modifiedsumfibonaci {

    /**
     * @param args the command line arguments
     */
static int calculateSum(int n){
        if (n <= 0)
            return 0;
        
        int fibo []=new int [n+1];
        fibo [0] = 0; fibo[1] =1;
        
        int sum = fibo [0] + fibo[1];
        
        for (int i =2; i<=n; i++)
        {
            fibo [i] = fibo[i-1]+fibo[i-2];
            sum += fibo [i];
        }
        return sum;
    }


public static void main (String args[])
{
    int n = 4;
    System.out.println("input : "+n);
    System.out.println("output : "+ calculateSum(n));
}
}
