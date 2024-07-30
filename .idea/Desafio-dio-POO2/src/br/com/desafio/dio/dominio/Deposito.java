package br.com.desafio.dio.dominio;

public class Deposito extends Transacao {
    public Deposito(Conta conta, double valor) {
        super(conta, valor);
    }

    @Override
    public void executar() {
        getConta().depositar(getValor());
    }
}
