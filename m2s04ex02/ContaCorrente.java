public class ContaCorrente extends ContaBancaria implements Imprimivel {
    private double taxaDeOperacao;

    public ContaCorrente(int numeroDaConta, int agencia, String nomeDoTitular, double saldo, double taxaDeOperacao) {
        super(numeroDaConta, agencia, nomeDoTitular, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public boolean sacar(double valor) {
        if (super.sacar(valor + taxaDeOperacao)) {
            super.depositar(taxaDeOperacao);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("Tipo de Conta: Corrente");
        System.out.println("Número da Conta: " + getNumeroDaConta());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Nome do Titular: " + getNomeDoTitular());
        System.out.println("Saldo: " + getSaldo());
    }
}