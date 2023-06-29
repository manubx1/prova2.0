/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package prova2;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SP("São Paulo", "SP"),
    RJ("Rio de Janeiro", "RJ");
    
    private String nome;
    private String sigla;

    //contrutor
    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    //getter 
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
