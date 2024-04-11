import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public boolean removerConta(int numeroDaConta) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumeroDaConta() == numeroDaConta) {
                contas.remove(i);
                return true;
            }
        }
        return false;
    }

    public void mostrarContas() {
        for (ContaBancaria conta : contas) {
            conta.mostrarDados();
        }
    }
}
