import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner operacao = new Scanner(System.in);
        Scanner quantidade = new Scanner(System.in);
        Scanner bancoEmissor = new Scanner(System.in);
        Scanner dataPagamento = new Scanner(System.in);

        operacao.useLocale(Locale.US);
        quantidade.useLocale(Locale.US);
        int op;
        float qtde;

        Clientes cliente = new Clientes(0001, "Aquino", "48909873X", "30987654320" );
        Contas conta = new Contas(001, cliente, 500.00);
        Poupanca poupanca = new Poupanca(conta.getNumConta(), cliente, conta.getSaldo(), 0.03);
        Corrente corrente = new Corrente(conta.getNumConta(), cliente, conta.getSaldo());
        Cheque cheque = new Cheque();

        System.out.println("Qual conta deseja movimentar?");
        System.out.println("1 - Poupança");
        System.out.println("2 - Corrente");
        op=operacao.nextInt();
        if(op==1){
            System.out.println("Escolha uma operacao: ");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            System.out.println("3 - Recolher juros");
            System.out.println("4 - Consultar Saldo");
            op=operacao.nextInt();
            if(op==1){
                System.out.println("Entre com o valor do saque: ");
                qtde=quantidade.nextFloat();
                poupanca.sacar(qtde);
            }else if(op==2){
                System.out.println("Entre com o valor do depósito: ");
                qtde=quantidade.nextFloat();
                poupanca.depositar(qtde);
            }else if(op==3){
                poupanca.recolherJuros();
            }else if(op==4){
                poupanca.consultarSaldo();
            }else{
                System.out.println("Opção inválida");
            }
        }else if(op==2){
            System.out.println("Escolha uma operacao: ");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            System.out.println("3 - Depositar Cheque");
            System.out.println("4 - Consultar saldo");
            op=operacao.nextInt();
            if(op==1){
                System.out.println("Entre com o valor do saque: ");
                qtde=quantidade.nextFloat();
                corrente.sacar(qtde);
            }else if(op==2){
                System.out.println("Entre com o valor do depósito: ");
                qtde=quantidade.nextFloat();
                corrente.depositar(qtde);
            }else if(op==3){
                int bc;
                String data;
                String pagamento;
                System.out.println("Entre com o valor do cheque");
                qtde=quantidade.nextFloat();
                cheque.setValor(qtde);
                System.out.println("Entre com o banco emissor");
                bc=bancoEmissor.nextInt();
                cheque.setBanco(bc);
                System.out.println("Entre com a data para pagamento");
                data=dataPagamento.nextLine();
                cheque.setDataPagamento(data);
                corrente.depositarCheques(cheque);
            } else if(op==4){
                corrente.consultarSaldo();
            }else{
                System.out.println("Opção inválida");
            }
        }else{
            System.out.println("Opção inválida!");
        }
    }
}
