/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca implements Contratacao{
    
    private final double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "\n Diretor" + 
                "\n Premio: " + (PREMIO *100) + "%" +
                "\n Salario Final: " + Util.formatarMonetario(SalarioFinal())+
                super.toString();
                
    }

    @Override
    public double SalarioFinal() {
        return super.salario +  super.salario * PREMIO + super.salario * Bonificacao.DIRETOR.getValor();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionario abaixo: " + funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionario abaixo: " + funcionario);
    }
    
    
}
