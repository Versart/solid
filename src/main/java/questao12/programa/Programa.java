package questao12.programa;


import questao12.model.InvestimentoConservador;

public class Programa {
    public static void main(String[] args) {
        RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
        realizadorDeInvestimentos.setInvestimentoService(new InvestimentoConservador());
        System.out.println(realizadorDeInvestimentos.investimento(200d));
    }
}
