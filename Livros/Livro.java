package Livros;

import java.util.ArrayList;

public class Livro {
    // atributos
    private String isbn;
    private String titulo;
    private int anoPublicacao;
    private int qtdDisponivel;

    // metodos getters e setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    // arrayList que armazena os livros
    public static ArrayList<Livro> listaLivros = new ArrayList<>();

    // Métodos
    public static void cadastrarLivro(String isbn, String titulo, int anoPublicacao, int qtdDisponivel) {
        // Lógica para cadastrar o livro
        Livro newLivro = new Livro();

        newLivro.setIsbn(isbn);
        newLivro.setTitulo(titulo);
        newLivro.setAnoPublicacao(anoPublicacao);
        newLivro.setQtdDisponivel(qtdDisponivel);
        System.out.println("Livro " + newLivro.getTitulo() + " cadastrado!");
        listaLivros.add(newLivro);
    }

    public static void consultarLivro(String titulo, String isbn) {
        // Lógica para consultar informações do livro
        for (Livro livros : listaLivros) {
            if (titulo.equals(livros.getTitulo()) && isbn.equals(livros.getIsbn())) {
                // retorna os dados do usuário
                System.out.println(
                        "Informações do livro - ISBN: " + livros.getIsbn() + ", Título: " + livros.getTitulo() +
                                ", Ano de Publicação: " + livros.getAnoPublicacao() + ", Quantidade Disponível: "
                                + livros.getQtdDisponivel());
            } else {
                System.out.println("Dados incorretos ou inexistente.");
            }
        }
    }

    public static void consultarLivrosExemplares() {
        // Lógica para consultar informações do livro
        for (Livro livros : listaLivros) {
            // retorna os dados do usuário
            System.out.println("Informações do livro - ISBN: " + livros.getIsbn() + "\nTítulo: " + livros.getTitulo() +
                    "\nAno de Publicação: " + livros.getAnoPublicacao() + "\nQuantidade Disponível: "
                    + livros.getQtdDisponivel());
        }
    }
}
