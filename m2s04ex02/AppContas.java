public class AppContas {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca(25939, 421, "Rodrigo Antunes", 2000, 0.05);

        contaPoupanca.mostrarDados();

        System.out.println("Saldo antes dos juros: " + contaPoupanca.getSaldo());

        contaPoupanca.adicionarJuros();

        System.out.println("Saldo após os juros: " + contaPoupanca.getSaldo());

        System.out.println();

        ContaCorrente contaCorrente = new ContaCorrente(85236, 321, "John Snow", 3000, 10);

        contaCorrente.mostrarDados();

        System.out.println("Saldo antes do saque: " + contaCorrente.getSaldo());

        boolean saqueRealizado = contaCorrente.sacar(500);
        System.out.println("Saque realizado: " + saqueRealizado);
        System.out.println("Saldo após o saque: " + contaCorrente.getSaldo());

        saqueRealizado = contaCorrente.sacar(2500);
        System.out.println("Saque realizado: " + saqueRealizado);
        System.out.println("Saldo após o saque: " + contaCorrente.getSaldo());

        System.out.println();

        Banco banco = new Banco();

        ContaCorrente contaCorrente1 = new ContaCorrente(36070, 221, "Danerys Targuerian", 2000, 0.05);
        ContaCorrente contaCorrente2 = new ContaCorrente(85236, 321, "John Snow", 3000, 10);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(96347, 421, "Sansa Stark", 1000, 0.05);

        banco.adicionarConta(contaCorrente1);
        banco.adicionarConta(contaCorrente2);
        banco.adicionarConta(contaPoupanca1);

        System.out.println();

        System.out.println("Contas no banco:");
        banco.mostrarContas();

        System.out.println();

        System.out.println("Removendo conta 85236");
        banco.removerConta(85236);

        System.out.println();

        System.out.println("Contas no banco após remoção:");
        banco.mostrarContas();
    }

}