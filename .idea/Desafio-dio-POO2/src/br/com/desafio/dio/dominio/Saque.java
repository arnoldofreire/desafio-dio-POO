package br.com.desafio.dio.dominio;

public class Saque extends Transacao {
    public Saque(Conta conta, double valor) {
        super(conta, valor);
    }

    @Override
    public void executar() {
        getConta().sacar(getValor());
    }
}
