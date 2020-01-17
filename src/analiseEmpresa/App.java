package analiseEmpresa;

public class App {
    private static String Funcionario;

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(
                "Gustavo",
                "234.786.898/09",
                100000.00,
                0
        );
        Gerente gerente = new Gerente(
                "Mc Menor da Zs",
                "523282078-80",
                1000000.00,
                1
        );
        System.out.println(gerente.bonificacao(gerente.salario));
        System.out.println(funcionario.bonificacao(funcionario.salario));

        gerente.analise();
        System.out.println("Menor da Zs" + "gerencia "+ Funcionario);


    }
};

