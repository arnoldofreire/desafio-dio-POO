package br.com.desafio.dio.dominio;

public abstract class Transacao {
    private final Conta conta;
    private final double valor;

    public Transacao(Conta conta, double valor) {
        this.conta = conta;
        this.valor = valor;
    }

    public Conta getConta() {
        return conta;
    }

    public double getValor() {
        return valor;
    }

    public abstract void executar();
}
