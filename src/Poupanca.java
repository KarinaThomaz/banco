public class Poupanca extends Contas {
    private double juros;

    public Poupanca(){

    }

    public Poupanca(int numConta, Clientes clientes, double saldo, double juros) {
        super(numConta, clientes, saldo);
        this.juros = juros;
    }

    public void recolherJuros(){
        double saldoConta = getSaldo();
        saldoConta+=(getSaldo()*this.juros*2);
        setSaldo(saldoConta);
        System.out.println("Meses de recolhimento: 2");
        System.out.println("Novo saldo: "+getSaldo());
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
