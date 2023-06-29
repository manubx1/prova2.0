/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package prova2;

/**
 *
 * @author Aluno
 */
public enum EstadoCivil {
    SOLTEIRO ("Solteiro (a)"),
    CASADO("Casado (a)"),
    DIVOCIADO("Divorciado (a)"),
    SEPARADO("Separado (a)"),
    VIUVO("Viuvo (a)");
    
    private String nome;

    private EstadoCivil(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
