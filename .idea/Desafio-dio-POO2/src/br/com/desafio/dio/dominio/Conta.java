package br.com.desafio.dio.dominio;

public abstract class Conta {
    private String numero;
    private double saldo;
    private Cliente cliente;

    public Conta(String numero, Cliente cliente) {
        this.numero = numero;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void gerarExtrato(double valorTransacao, String tipoTransacao) {
        System.out.println("Extrato da Conta: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Tipo de Transação: " + tipoTransacao);
        System.out.println("Valor da Transação: " + valorTransacao);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("===================================");
    }
}
