/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2b;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author guilh
 */
public class MuralTarefas {
    public ArrayList<Tarefa> tarefas;
    
    MuralTarefas()
    {
        this.tarefas = new ArrayList<Tarefa>();
    }
    
    public void addTarefa(String codigo, int prioridade, String titulo, String descricao)
    {
        Tarefa novaTarefa = new Tarefa(codigo, prioridade, titulo, descricao);
        this.tarefas.add(novaTarefa);
    }
    
    public void sortTarefas()
    {
        Iterator<Tarefa> iterator = tarefas.iterator();
        
        int max = Integer.MIN_VALUE;
        
        while(iterator.hasNext())
        {
            Tarefa ta = iterator.next();
            
            // travei nessa parte, professor acho que vou entregar até aqui mesmo
        }
    }
}
