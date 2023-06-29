/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package prova2;

/**
 *
 * @author Aluno
 */
public enum Bonificacao {
    GERENTE (0.15),
    DIRETOR (0.25);
    
    private double valor;

    //contrutor
    private Bonificacao(double valor) {
        this.valor = valor;
    }
    //getter 
    public double getValor() {
        return valor;
    }
  
    
}
