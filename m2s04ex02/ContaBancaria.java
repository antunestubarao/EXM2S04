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

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarDados() {
        System.out.println("Tipo de Conta: Corrente");
        System.out.println("Número da Conta: " + getNumeroDaConta());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Nome do Titular: " + getNomeDoTitular());
        System.out.println("Saldo: " + getSaldo());
    }

}
