package br.com.ifsc.aula01.atividadeIII.parte2;

public class Funcionario extends Pessoa {

    private double salario;
    private String cargo;
    private String matricula;
    private String setor;
    private String dataAdmissao;

    public Funcionario(String nome, int idade, String endereco, String cpf, String telefone,
                       double salario, String cargo, String matricula, String setor, String dataAdmissao) {
        super(nome, idade, endereco, cpf, telefone);
        this.salario = salario;
        this.cargo = cargo;
        this.matricula = matricula;
        this.setor = setor;
        this.dataAdmissao = dataAdmissao;
    }

    public void trabalhar() {
        System.out.println(getNome() + " está trabalhando como " + cargo + ".");
    }

    public void receberSalario() {
        System.out.println(getNome() + " recebeu o salário de R$ " + salario + ".");
    }

    public void baterPonto() {
        System.out.println(getNome() + " bateu o ponto.");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}

