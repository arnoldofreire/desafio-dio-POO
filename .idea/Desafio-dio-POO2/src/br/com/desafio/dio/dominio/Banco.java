package br.com.desafio.dio.dominio;

public class Banco {
    public void processarTransacao(Transacao transacao) {
        transacao.executar();
    }

    public static void main(String[] args) {
        // Criar clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

        // Criar contas
        ContaCorrente contaCorrente = new ContaCorrente("12345", cliente1, 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("67890", cliente2, 0.01);

        // Criar transações para ContaCorrente
        Transacao depositoCorrente = new Deposito(contaCorrente, 200.0);
        Transacao saqueCorrente = new Saque(contaCorrente, 100.0);

        // Criar transações para ContaPoupanca
        Transacao depositoPoupanca = new Deposito(contaPoupanca, 300.0);
        Transacao saquePoupanca = new Saque(contaPoupanca, 50.0);

        // Processar transações
        Banco banco = new Banco();
        banco.processarTransacao(depositoCorrente);
        banco.processarTransacao(saqueCorrente);
        banco.processarTransacao(depositoPoupanca);
        banco.processarTransacao(saquePoupanca);

        // Aplicar juros na conta poupança
        contaPoupanca.aplicarJuros();

        // Exibir saldos finais
        System.out.println("Saldo final da Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo final da Conta Poupança: " + contaPoupanca.getSaldo());
    }
}
