package br.com.ifsc.aula07;

public class Funcionario {

    private String nome;

    private String sexo;

    private String cargo;

    private float salarioBase;

    private float horasExtras;

    private int numeroFilhos;

    private float salario;

    public Funcionario(String nome, String sexo, String cargo, float salarioBase, float horasExtras, int numeroFilhos) {
        this.nome = nome;
        this.sexo = sexo;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.numeroFilhos = numeroFilhos;
        calcularSalario();
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public float getHorasExtras() {
        return horasExtras;
    }

    public int getNumeroFilhos() {
        return numeroFilhos;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salarioBase=" + salarioBase +
                ", horasExtras=" + horasExtras +
                ", numeroFilhos=" + numeroFilhos +
                ", salario=" + salario +
                '}';
    }

    private void calcularSalario() {
        float valorHoraExtra = (salarioBase / 220) * 1.20f;
        salario = salarioBase + (horasExtras * valorHoraExtra) + (numeroFilhos * 18.5f);
    }

}