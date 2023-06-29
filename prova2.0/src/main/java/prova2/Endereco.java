/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package prova2;

/**
 *
 * @author Aluno
 */
public class Endereco {
        protected String logradouro;
        protected String numero;
        protected String complemento;
        protected String cep;
        protected String cidade;
        protected UnidadeFederativa uf;

    //contrutor

    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    //getter e setter
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }

    //to String
    @Override
    public String toString() {
        return " \n Endereco  " + 
                "\n Logradouro: " + logradouro + 
                "\n Numero: " + numero + 
                "\n Complemento: " + complemento + 
                "\n CEP: " + cep + 
                "\n Cidade: " + cidade + 
                "\n UF: " + uf;
    }
        
        
    }
