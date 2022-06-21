public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Cliente_1");

        ContaCorrente corrente = new ContaCorrente(cliente1);
        ContaPoupanca poupanca = new ContaPoupanca(cliente1);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println("Depositando R$ 100,00 na conta corrente.\n");
        corrente.depositar(100);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

//        System.out.println("Transferindo R$ 55,00 da conta corrente para a poupança.\n");
//        corrente.transferir(55, poupanca);
//
//        corrente.imprimirExtrato();
//        poupanca.imprimirExtrato();
//
//        System.out.println("Saque de R$ 60,00 na conta corrente.\n");
//        corrente.sacar(60);
//
//        corrente.imprimirExtrato();
//        poupanca.imprimirExtrato();
    }
}
