public class Contas {
    private int numConta;
    private Clientes clientes;
    private double saldo;

    public Contas(){

    }

    public Contas(int numConta, Clientes clientes, double saldo) {
        this.numConta = numConta;
        this.clientes = clientes;
        this.saldo = saldo;
    }

    public void depositar(double qtdeDinheiro){
        if(qtdeDinheiro>0){
            this.saldo+=qtdeDinheiro;
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double qtdeDinheiro){
        if(qtdeDinheiro<=this.saldo){
            this.saldo-=qtdeDinheiro;
            setSaldo(this.saldo);
            System.out.println("Saque realizado com sucesso");
            System.out.println("Novo saldo: "+ getSaldo());
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é: "+this.saldo);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
