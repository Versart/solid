package questao11.model;

public class Chefe implements Remuneravel {

    private Double salarioBase;
    private Double bonus;

    @Override
    public double remuneracao() {
        return salarioBase + bonus;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
