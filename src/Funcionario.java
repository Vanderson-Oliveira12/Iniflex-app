import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {

    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Dados do funcionário \n");
        sb.append("Nome: ").append(getNome()).append("\n");
        sb.append("Data Nascimento: ").append(getDataNascimento()).append("\n");
        sb.append("Função: ").append(getFuncao()).append("\n");
        sb.append("Salário: ").append(getSalario());

        return sb.toString();
    }
}
