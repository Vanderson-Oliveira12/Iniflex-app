import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Locale;

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

    public String getFuncao() {
        return funcao;
    }

    public void darAumento(BigDecimal taxaAumento) {
        BigDecimal aumento = salario.multiply(taxaAumento);
        this.salario = salario.add(aumento);
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        var regraFormatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var regraFormatoSalario = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        var dataFormatada = getDataNascimento().format(regraFormatoData);
        var salarioFormatado = regraFormatoSalario.format(getSalario());

        sb.append("---------------------------").append("\n");
        sb.append("Dados do funcionário \n");
        sb.append("Nome: ").append(getNome()).append("\n");
        sb.append("Data Nascimento: ").append(dataFormatada).append("\n");
        sb.append("Função: ").append(getFuncao()).append("\n");
        sb.append("Salário: ").append(salarioFormatado).append("\n");
        sb.append("---------------------------").append("\n");

        return sb.toString();
    }

}
