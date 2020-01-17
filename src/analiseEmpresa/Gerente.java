package analiseEmpresa;

public class Gerente extends Funcionario {
        int numeroFuncionariosGerenciados;


    public Gerente(String nome, String cpf, double salario, int cargo) {
        super(nome, cpf, salario, cargo);
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    public double bonificacao (double salario){
        salario = salario *0.5;
        return salario;
    }

   public void analise(){
        System.out.println("ola Mc Menor da Zs");
   }
}
