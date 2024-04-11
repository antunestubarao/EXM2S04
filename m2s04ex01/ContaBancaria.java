
public class ContaBancaria {
    private int numeroDaConta;
    private int agencia;
    private String nomeDoTitular;
    private double saldo;

    public ContaBancaria(int numeroDaConta, int agencia, String nomeDoTitular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

    // Getters
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para depositar na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido. Insira um valor positivo.");
        }
    }

    // Método para sacar da conta
    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Valor de saque inválido. Insira um valor positivo.");
        }
    }

    public void imprimirDados() {
        System.out.println("Número da conta: " + this.numeroDaConta);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Nome do titular: " + this.nomeDoTitular);
        System.out.println("Saldo: R$" + this.saldo);
    }
}