package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double s = 0, m, n;
        int a = 1, b = 1;
        final int c = 2;
        System.out.println("Print a,m");
        Scanner m_scaner=new Scanner(System.in);
        m = m_scaner.nextDouble();
        Scanner n_scaner=new Scanner(System.in);
        n = n_scaner.nextDouble();
        n_scaner.close();
        m_scaner.close();
        for (double i = a; i <= n; i++) {
            for (double j = b; j <= m; j++) {
                s = (i / j) / (i - c);
                }
            }
        if (n >= c) {
            System.out.println("'i' cannot equal 'c' (a/0)");
    } else{
            System.out.println(s);
        }
    }
}
