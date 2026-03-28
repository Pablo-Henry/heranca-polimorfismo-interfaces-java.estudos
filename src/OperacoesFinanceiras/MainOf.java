package OperacoesFinanceiras;

public class MainOf {
    static void main(String[] args) {
        OperacaoBancaria deposito  = new Deposito(200.00);
        OperacaoBancaria saque  = new Saque(88.88);


        deposito.executar();
        saque.executar();

    }
}
