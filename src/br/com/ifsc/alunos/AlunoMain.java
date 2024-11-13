package br.com.ifsc.alunos;

import java.util.List;
import java.util.stream.IntStream;

import static br.com.ifsc.alunos.Aluno.capturarNome;
import static br.com.ifsc.alunos.Aluno.capturarNotas;

public class AlunoMain {

    public static void main(String[] args) {
        List<Aluno> estudantes = IntStream.rangeClosed(1, 2)
                .mapToObj(i -> new Aluno(capturarNome(i), capturarNotas(3, i)))
                .toList();

        estudantes.forEach(Aluno::exibirInformacoes);
    }
}