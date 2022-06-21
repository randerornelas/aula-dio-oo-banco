public abstract class Conta {

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    private final Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if(valor > this.saldo) {
            System.out.println("**Saldo insuficiente.**");
        } else {
            this.saldo -= valor;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        if(valor > this.saldo) {
            System.out.println("**Saldo insuficiente.**");
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    public void imprimirInfosExtrato() {
        System.out.printf("Cliente: %s %n", this.cliente.getNome());
        System.out.printf("Agencia: %d %n", this.getAgencia());
        System.out.printf("Conta: %d %n", this.getNumero());
        System.out.printf("Saldo: %.2f %n %n", this.getSaldo());
    }
}
