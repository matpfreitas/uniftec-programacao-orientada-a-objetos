package com.uniftec.matheus.unidade2;

public class ContaCorrenteEspecial extends ContaCorrente {

    private Float limite;

    public Float getLimite() {
        return limite;
    }

    public void setLimite(Float limite) {
        this.limite = limite;
    }

    public void saque(float valorSaque) {

        if (valorSaque > (getSaldoConta() + getLimite())) {
            System.out.println("Saque não permitido, excede o seu limite.");
        } else {
            float novoSaldo = getSaldoConta() - valorSaque;
            setSaldoConta(novoSaldo);
        }

    }

}
