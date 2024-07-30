package br.com.desafio.dio.dominio;

public class ContaPoupanca extends Conta {
    private double taxaDeJuros;

    public ContaPoupanca(String numero, Cliente cliente, double taxaDeJuros) {
        super(numero, cliente);
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        gerarExtrato(valor, "Depósito");
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            gerarExtrato(valor, "Saque");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void aplicarJuros() {
        double juros = getSaldo() * taxaDeJuros;
        setSaldo(getSaldo() + juros);
        System.out.println("Juros aplicados: " + juros);
        gerarExtrato(juros, "Aplicação de Juros");
    }
}
