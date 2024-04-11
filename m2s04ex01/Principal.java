public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(25939, 0421, "Rodrigo Antunes", 2000);

        conta.imprimirDados();

        conta.depositar(500);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        conta.sacar(200);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        conta.sacar(3500);
        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
