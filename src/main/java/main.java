import DAO.FuncionarioJpaDAO;
import Entity.Funcionario;

public class main {

    public static void main(String[] args) {

        Funcionario funcionarioTaina = new Funcionario();
        funcionarioTaina.setCargo("Professora");
        funcionarioTaina.setCpf("123.123.123");
        funcionarioTaina.setMatricula(123);
        funcionarioTaina.setNome("Taina");

        Funcionario funcionarioEdith = new Funcionario();
        funcionarioTaina.setCargo("aluna");
        funcionarioTaina.setCpf("123.123.456");
        funcionarioTaina.setMatricula(456);
        funcionarioTaina.setNome("Edith");

        FuncionarioJpaDAO.getInstance().merge(funcionarioTaina);
        FuncionarioJpaDAO.getInstance().merge(funcionarioEdith);

    }
}
