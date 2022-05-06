/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Exercicio2 {

    public static void main(String[] args) {
         AsciiTable table = new AsciiTable();
         
         System.out.println("Table :");
         table.printTable();
         
         findCharDecimalMenu(table);
         findDecimalCharlMenu(table);
        
    }
    
    
    public static void findCharDecimalMenu(AsciiTable table)
    {
        //poderia fazer uma classe Menu() mas por falta de tempo...
        boolean stopFlag = false;
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        
        while(stopFlag == false)
        {
            try{
                System.out.println("insira um numero inteiro");
                input = scanner.nextInt();
                if(input > table.getMinLimit() && input < table.getMaxLimit())
                {
                    stopFlag = true;
                }
                else System.out.println("Fora do alcance!");
                
            }
            catch(Exception e)
            {
                System.out.println("Insira um valor INTEIRO!!!");
                scanner.nextLine().equals("");
            }
            
        }
        
        System.out.println("Pronto!");
        
        System.out.println("O caractere da tabela Ascii correspondente eh");
        System.out.println(table.findCharByDecimal(input));
        
    }
    
    public static void findDecimalCharlMenu(AsciiTable table)
    {
        //poderia fazer uma classe Menu() mas por falta de tempo...
        boolean stopFlag = false;
        Scanner scanner = new Scanner(System.in);
        char input = 0;
        
        while(stopFlag == false)
        {
            try{
                System.out.println("insira um caractere único");
                input = scanner.next().charAt(0);
                System.out.println("caractere capturado: "+input);
                stopFlag = true;
                
            }
            catch(Exception e)
            {
                System.out.println("Insira um CARACTERE ÚNICO!!!");
                scanner.nextLine().equals("");
            }
            
        }
        
        System.out.println("Pronto!");
        
        System.out.println("O caractere da tabela Ascii correspondente eh");
        System.out.println(table.findDecimalByChar(input));
        
    }
}
