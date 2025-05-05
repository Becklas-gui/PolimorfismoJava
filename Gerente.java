public class Gerente extends Funcionario{
    private double salarioBase;
    private int bonus = 1000;
    
    public Gerente (double salarioBase, int bonus){
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalarioFinal(){
        return salarioBase + bonus;
    }
}
