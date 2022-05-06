/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2b;

/**
 *
 * @author guilh
 */
public class Tarefa {
    public String codigo;
    public int prioridade;
    public String titulo;
    public String descricao;
    
    public final int lowerPrioridade = 1;
    public final int upperPrioridade = 100;
    

    public Tarefa(String codigo, int prioridade, String titulo, String descricao) {
        this.codigo = codigo;
        setPrioridade(prioridade);
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        if(prioridade < lowerPrioridade)
        {
            this.prioridade = lowerPrioridade;
            
            System.out.println("Prioridade baixa de mais! arrumamos para você!");
        }
        else if (prioridade > upperPrioridade)
        {
            this.prioridade = upperPrioridade;
            System.out.println("Prioridade alta de mais! arrumamos para você!");
        }
        else
        {
            this.prioridade = prioridade;
        }
        
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
