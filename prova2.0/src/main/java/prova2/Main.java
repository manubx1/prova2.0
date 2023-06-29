/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
      //DIRETOR
    Diretor diretor = new Diretor(Bonificacao.DIRETOR, "João", "00000000000-00", "0000000", new Endereco("Rua das Orquideas", "1", "Bloco 16", "40000-000", "Rio de Janeiro", UnidadeFederativa.RJ), Setor.RH, Genero.MASCULINO, 15000, EstadoCivil.CASADO, LocalDate.of(1985, Month.MARCH, 5));
    
    //GERENTE
    Gerente gerente = new Gerente(Bonificacao.GERENTE, "Luisa", "111111111-11", "1111111", new Endereco("Rua da maça", "2", " bloco 22", "400000-000", "Niteroi", UnidadeFederativa.RJ), Setor.RH, Genero.FEMININO, 8000, EstadoCivil.SOLTEIRO, LocalDate.of(2000, Month.MARCH, 8));
    
    //MOTOBOY
    Motoboy motoboy = new Motoboy("HFOF565", "Junior", "3333333333-33", "44444444", new Endereco("Rua da goiaba", "4", "Bloco 44", "000000-00", "Sao Paulo", UnidadeFederativa.SP), Setor.OPERACOES, Genero.MASCULINO, 2000, EstadoCivil.SOLTEIRO, LocalDate.of(2001, Month.MARCH, 7));

        System.out.println(gerente);
        System.out.println("");
        System.out.println(diretor);
        System.out.println("");
        diretor.demitir(motoboy);
                
    }
   

}
