package questao13;

import java.time.LocalDate;
import java.util.Calendar;

public class Movimentacao {

    private double valor;
    private Conta conta;
    private LocalDate date;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
