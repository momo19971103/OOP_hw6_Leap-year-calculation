package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        int CLY=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("�п�J�褸�~");
        CLY = scanner.nextInt();
        if(CLY%4!=0)
            System.out.print("�|�~:���O");
        else if(CLY%100!=0)
            System.out.print("�|�~:�O");
        else if(CLY%400!=0)
            System.out.print("�|�~:���O");
        else
            System.out.print("�|�~:�O");
    }

}
