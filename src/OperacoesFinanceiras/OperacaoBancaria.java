package OperacoesFinanceiras;

public abstract class OperacaoBancaria implements AcaoBancaria {
    private double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }


    @Override
    public void executar() {
        System.out.println(this.valor);
    }

    public double getValor() {
        return valor;
    }
}
