/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class AsciiTable {
    
    private final int minLimit = 33;
    private final int maxLimit = 126;
    
    private ArrayList<AsciiElement> elements;
    
    AsciiTable()
    {
        this.elements = new ArrayList<AsciiElement>();
        init();
    }

    public int getMinLimit() {
        return minLimit;
    }

    public int getMaxLimit() {
        return maxLimit;
    }
    
    public void init()
    {
        for(int i = minLimit; i<maxLimit; i++)
        {
            elements.add(new AsciiElement(i));
        }
    }
    
    public void printTable()
    {
        //for(int i = minLimit; i<maxLimit; i++)
        //{
        //    System.out.println("N: "+ Integer.toString(elements.get(i).getNumericValue()) +" - " + elements.get(i).getCharacter());
        //}
        
        for(AsciiElement element: elements)
        {
            System.out.println("N: "+ Integer.toString(element.getNumericValue()) +" - " + element.getCharacter());
        }
    }
    
    public ArrayList<AsciiElement> getElements()
    {
        return this.elements;
    }
    
    public char findCharByDecimal(int decimal)
    {
        for(AsciiElement element: elements)
        {
            if(element.getNumericValue() == decimal)
            {
                return element.getCharacter();
            }
        }
        
        return 0;
    }
    
    public int findDecimalByChar(char character)
    {
        for(AsciiElement element: elements)
        {
            if(element.getCharacter()== character)
            {
                return element.getNumericValue();
            }
        }
        
        return 999;
    }
}
