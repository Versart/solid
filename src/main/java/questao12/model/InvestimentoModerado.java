package questao12.model;

import java.util.Random;

public class InvestimentoModerado implements Investimento {

    @Override
    public Double investir(Double valorInvestido) {
        Random random = new Random();
        double chances = random.nextDouble();
        if(chances > 0.5){
            double valorRecebido = valorInvestido * 0.025;
            double imposto = valorRecebido * 0.25;
            return valorRecebido-= imposto;
        }
        else{
            double valorRecebido = valorInvestido * 0.007;
            double imposto = valorRecebido * 0.25;
            return valorRecebido-= imposto;
        }
    }
}
