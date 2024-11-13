package br.com.ifsc.aula06;

public class LivroMain {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro 1", "Wilson", 1990);
        Livro livro2 = new Livro("Livro 2", "Ana", 2023);
        Livro livro3 = new Livro("Livro 3", "Jussara", 2000);
        Livro livro4 = new Livro("Livro 4", "Strudel", 1924);

        livro1.emprestar();
        livro2.emprestar();
        livro3.emprestar();
        livro4.emprestar();

        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(livro3);
        System.out.println(livro4);

        livro1.devolver();
        livro3.devolver();

        System.out.println(livro1.consultarStatus() + " e sua Idade é: " + livro1.consultaIdade());
        System.out.println(livro2.consultarStatus() + " e sua Idade é: " + livro2.consultaIdade());

    }
}
