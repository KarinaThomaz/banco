import java.util.Scanner;

public class Corrente extends Contas {

    public Corrente(){

    }

    public Corrente(int numConta, Clientes clientes, double saldo) {
        super(numConta, clientes, saldo);
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
        double saldoConta=getSaldo();
        if(qtdeDinheiro<=saldoConta){
            saldoConta-=qtdeDinheiro;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Novo saldo: "+saldoConta);
        }else{
            double chequeEspecial=0;
            Scanner operacao = new Scanner(System.in);
            int opCE;
            System.out.println("Saldo insuficiente!");
            System.out.println("Gostaria de utilizar o cheque especial?");
            System.out.println("Limite do seu cheque especial: R$1.000,00");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            opCE=operacao.nextInt();
            if(opCE==1){
                float limite=1000;
                limite-=qtdeDinheiro-getSaldo();

                setSaldo(0);
                System.out.println("Saldo realizado com sucesso!");
                System.out.println("Novo saldo: "+getSaldo());
                System.out.println("Saldo do limite: "+limite);
            }else if(opCE==2){
                System.out.println("Não realizamos o saque!");
            }else{
                System.out.println("Opção inválida!");
            }
        }
    }

    public void depositarCheques(float valor, int bancoEmissor, String dataPagamento){
        super.depositar(valor);
        //System.out.println();
    }
}
