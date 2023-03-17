package questao12.model;



public class InvestimentoConservador implements Investimento {
    @Override
    public Double investir(Double valorInvestido) {
        double valorRecebido;
        double imposto;
        valorRecebido = (valorInvestido * 0.008);
        imposto = valorRecebido * 0.25;
        valorRecebido-= imposto;
        return valorRecebido;
    }
}
