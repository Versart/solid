package questao12.model;

import java.util.Random;

public class InvestimentoArrojado implements Investimento {
    @Override
    public Double investir(Double valorInvestido) {
        Random random = new Random();
        double chances = random.nextDouble();
        if(chances < 0.20){
            double valorRecebido = valorInvestido * 0.05;
            double imposto = valorRecebido * 0.25;
            return valorRecebido-= imposto;
        }
        else if(chances < 0.30){
            double valorRecebido = valorInvestido * 0.03;
            double imposto = valorRecebido * 0.25;
            return valorRecebido-= imposto;
        }
        else{
            double valorRecebido = valorInvestido * 0.006;
            double imposto = valorRecebido * 0.25;
            return valorRecebido-= imposto;
        }

    }
}
