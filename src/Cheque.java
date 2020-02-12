public class Cheque {
    private double valor;
    private int banco;
    private String dataPagamento;

    public Cheque(){

    }

    public Cheque(double valor, int banco, String dataPagamento) {
        this.valor = valor;
        this.banco = banco;
        this.dataPagamento = dataPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
