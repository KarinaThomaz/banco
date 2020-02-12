public class Poupanca extends Contas {
    private double juros;

    public Poupanca(){

    }

    public Poupanca(int numConta, Clientes clientes, double saldo, double juros) {
        super(numConta, clientes, saldo);
        this.juros = juros;
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    @Override
    public void depositar(float qtdeDinheiro) {
        super.depositar(qtdeDinheiro);
    }

    @Override
    public void sacar(float qtdeDinheiro) {
        super.sacar(qtdeDinheiro);
    }

    public void recolherJuros(){
        double saldoConta = getSaldo();
        saldoConta+=(saldoConta*juros*2);
        System.out.println("Meses de recolhimento: 2");
        System.out.println("Valor recolhido: "+saldoConta);
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
