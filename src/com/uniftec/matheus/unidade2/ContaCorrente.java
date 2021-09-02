package com.uniftec.matheus.unidade2;

public class ContaCorrente {

    private String numeroConta, nomeCLiente;
    private Float saldoConta;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCLiente() {
        return nomeCLiente;
    }

    public void setNomeCLiente(String nomeCLiente) {
        this.nomeCLiente = nomeCLiente;
    }

    public Float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void deposito(float valorDeposito) {

        saldoConta = saldoConta + valorDeposito;

    }

    public Float consultaSaldo() {
        return getSaldoConta();
    }

    public void saque(float valorSaque) {

        if (valorSaque > saldoConta) {
            System.out.println("Saque não permitido, excede o saldo em conta.");
        } else {
            saldoConta = saldoConta - valorSaque;
        }
    }
}


