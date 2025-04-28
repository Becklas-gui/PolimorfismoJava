public class Empresa {
    public static void main(String[] args) {
        Funcionario v = new Vendedor(2000, 500);
        Funcionario f = new Freelancer(20, 150);

        System.out.println("Salario do vendedor: " + obterSalarioDoFuncionario(v));
        System.out.println("Salario do freelancer: " + obterSalarioDoFuncionario(f));
    }

    public static double obterSalarioDoFuncionario(Funcionario funcionario) {
        return funcionario.calcularSalarioFinal();
    }
}