import java.util.Scanner;

public class Corrente extends Contas {

    public Corrente(){

    }

    public Corrente(int numConta, Clientes clientes, double saldo) {
        super(numConta, clientes, saldo);
    }

    @Override
    public void sacar(double qtdeDinheiro) {
        double saldoConta=getSaldo();
        float limite=1000;
        if(qtdeDinheiro<=saldoConta){
            super.sacar(qtdeDinheiro);
        }else if (qtdeDinheiro<=limite+getSaldo()){
           // double chequeEspecial=0;
            Scanner operacao = new Scanner(System.in);
            int opCE;
            System.out.println("Saldo insuficiente!");
            System.out.println("Gostaria de utilizar o cheque especial?");
            System.out.println("Limite do seu cheque especial: R$1.000,00");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            opCE=operacao.nextInt();
            if(opCE==1){
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
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositarCheques(Cheque cheque){
        super.depositar(cheque.getValor());
        System.out.println(getSaldo());
    }
}
