package questao02;
import java.text.NumberFormat;
import java.util.Scanner;

public class Rendimento {
    private double investimentoInicial;
    private double taxaRendimento;
    private int numParcela;

    public Rendimento(double investimentoInicial, double taxaRendimento, int numParcela) {
        this.investimentoInicial = investimentoInicial;
        this.taxaRendimento = taxaRendimento;
        this.numParcela = numParcela;
    }

    public void setInvestimentoInicial(double investimentoInicial) {
        this.investimentoInicial = investimentoInicial;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    public void setNumParcela(int numParcela) {
        this.numParcela = numParcela;
    }

    public double getInvestimentoInicial() {
        return investimentoInicial;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public int getNumParcela() {
        return numParcela;
    }


    public void calculaRendimento(){
        double rendimentoMes = getInvestimentoInicial();
        System.out.println("Investimento inicial: " + NumberFormat.getCurrencyInstance().format(getInvestimentoInicial()));
        System.out.println("Taxa de Juros: " + NumberFormat.getCurrencyInstance().format(getTaxaRendimento()/100));
        for(int i = 1; i<=getNumParcela(); i++){
            rendimentoMes=rendimentoMes*getTaxaRendimento()/100+rendimentoMes;
            System.out.println("Mês " + i + ": " + NumberFormat.getCurrencyInstance().format(rendimentoMes));
        }

    }

}
