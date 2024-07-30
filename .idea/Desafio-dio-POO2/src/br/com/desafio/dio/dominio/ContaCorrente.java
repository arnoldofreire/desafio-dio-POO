package br.com.desafio.dio.dominio;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, Cliente cliente, double limite) {
        super(numero, cliente);
        this.limite = limite;
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        gerarExtrato(valor, "Depósito");
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() + limite >= valor) {
            setSaldo(getSaldo() - valor);
            gerarExtrato(valor, "Saque");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
