/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author guilh
 */
public class AsciiElement {
    
    private char character;
    private int numericValue;
    
    AsciiElement(int number)
    {
        setNumericValue(number);
        setCharacter((char) this.numericValue);
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getNumericValue() {
        return numericValue;
    }

    public void setNumericValue(int numericValue) {
        this.numericValue = numericValue;
    }
}
