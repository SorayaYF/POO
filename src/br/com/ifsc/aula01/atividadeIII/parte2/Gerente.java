package br.com.ifsc.aula01.atividadeIII.parte2;

public class Gerente extends Funcionario {

    private double bonus;
    private String departamentoGerenciado;
    private int subordinados;
    private int tempoExperiencia;
    private String nivelHierarquico;

    public Gerente(String nome, int idade, String endereco, String cpf, String telefone,
                   double salario, String cargo, String matricula, String setor, String dataAdmissao,
                   double bonus, String departamentoGerenciado, int subordinados, int tempoExperiencia, String nivelHierarquico) {
        super(nome, idade, endereco, cpf, telefone, salario, cargo, matricula, setor, dataAdmissao);
        this.bonus = bonus;
        this.departamentoGerenciado = departamentoGerenciado;
        this.subordinados = subordinados;
        this.tempoExperiencia = tempoExperiencia;
        this.nivelHierarquico = nivelHierarquico;
    }

    public void gerenciarEquipe() {
        System.out.println(getNome() + " está gerenciando " + subordinados + " subordinados no departamento de " + departamentoGerenciado + ".");
    }

    public void aprovarProjeto() {
        System.out.println(getNome() + " aprovou um projeto.");
    }

    public void darFeedback() {
        System.out.println(getNome() + " está dando feedback aos subordinados.");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getDepartamentoGerenciado() {
        return departamentoGerenciado;
    }

    public void setDepartamentoGerenciado(String departamentoGerenciado) {
        this.departamentoGerenciado = departamentoGerenciado;
    }

    public int getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(int subordinados) {
        this.subordinados = subordinados;
    }

    public int getTempoExperiencia() {
        return tempoExperiencia;
    }

    public void setTempoExperiencia(int tempoExperiencia) {
        this.tempoExperiencia = tempoExperiencia;
    }

    public String getNivelHierarquico() {
        return nivelHierarquico;
    }

    public void setNivelHierarquico(String nivelHierarquico) {
        this.nivelHierarquico = nivelHierarquico;
    }
}

