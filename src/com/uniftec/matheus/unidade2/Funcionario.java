package com.uniftec.matheus.unidade2;

import java.util.Date;

public class Funcionario {

    private String nome;
    private String departamento;
    private Float salario;
    private String dataAdmissao;
    private String rg;

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public Float getSalario() {
        return salario;
    }



    public String getRg() {
        return rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }


    public void setRg(String rg) {
        this.rg = rg;
    }

    public float recebeAumento(Float aumento) {

        salario=salario+aumento;
        return salario;

    }

    public float calculaGanhoAnual() {

        return salario*12;

    }

}
