package br.com.ifsc.aula03.atividade04;

import br.com.ifsc.aula03.Util.OperacoesUtil;

public class Triangulo {
    float a;
    float b;
    float c;

    public Triangulo(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float calcularArea() {
        float p = (a + b + c) / 2.0f;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    //Exemplo de cálculos utilizando os métodos
    public float calcularAreaUsandoMetodos() {
        float p1 = OperacoesUtil.dividir(
                OperacoesUtil.somar(
                        OperacoesUtil.somar(a, b),
                        c),
                2.0f);

        return (float) Math.sqrt(
                OperacoesUtil.multiplicar(
                OperacoesUtil.multiplicar(
                        OperacoesUtil.multiplicar(p1,
                                OperacoesUtil.subtrair(p1, a)),
                        OperacoesUtil.multiplicar(p1,
                                OperacoesUtil.subtrair(p1, b))),
                OperacoesUtil.multiplicar(p1,
                        OperacoesUtil.subtrair(p1, c))));
    }

    public float calcularPerimetro() {
        return a + b + c;
    }

    //Exemplo de cálculos utilizando os métodos
    public float calcularPerimetrUsandoMetodos() {
        return OperacoesUtil.somar(a,
                OperacoesUtil.somar(b, c));
    }
}
