package Livros;
import java.util.ArrayList;

public class Livro {
    // atributos
    private String isbn;
    private String titulo;
    private int anoPublicacao;
    private int qtdDisponivel;
    private Autor autor;
    private Categoria categoria;
    private Editora editora;

    //metodos getters e setters para composicao
    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Editora getEditora() {
        return this.editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

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

    // arrayList que armazena os livros
    public static ArrayList<Autor> listaAutores = new ArrayList<>();

    // arrayList que armazena os livros
    public static ArrayList<Categoria> listaCategorias = new ArrayList<>();

    // arrayList que armazena os livros
    public static ArrayList<Editora> listaEditoras = new ArrayList<>();

    // Métodos

    public static void cadastrarLivro(String isbn, String titulo, int anoPublicacao, int qtdDisponivel, String autor, String categoria, String descricao, String editora, String emailEditora) {
        //construtor livro
        Livro newLivro = new Livro();

        //construtor usando composicao
        Autor newAutor = new Autor(autor);
        Categoria newCategoria = new Categoria(categoria, descricao);
        Editora newEditora = new Editora(editora, emailEditora);

        //realiza o cadastro do livro
        newLivro.setIsbn(isbn);
        newLivro.setTitulo(titulo);
        newLivro.setAnoPublicacao(anoPublicacao);
        newLivro.setQtdDisponivel(qtdDisponivel);
        newAutor.setAutor(autor);
        newCategoria.setNomeCategoria(categoria);
        newCategoria.setDescricao(descricao);
        newEditora.setEditora(editora);
        newEditora.setEmail(emailEditora);

        System.out.println("Livro " + newLivro.getTitulo() + " cadastrado!");
        listaLivros.add(newLivro);
        listaAutores.add(newAutor);
        listaCategorias.add(newCategoria);
        listaEditoras.add(newEditora);

    }

    public static void consultarLivro(String titulo, String isbn) {
        //consultar as informações do livro
        for (Livro livros : listaLivros) {
            if (titulo.equals(livros.getTitulo()) && isbn.equals(livros.getIsbn())) {
                // retorna os dados do livro
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
            // retorna os dados do livro
            System.out.println("Informações do livro - ISBN: " + livros.getIsbn() + "\nTítulo: " + livros.getTitulo() +
                    "\nAno de Publicação: " + livros.getAnoPublicacao() + "\nQuantidade Disponível: "+ livros.getQtdDisponivel());
        }
        for (Autor autor : listaAutores) {
            // retorna os dados do autor
            System.out.println("Autor: " + autor.getAutor());
        }
        for (Categoria categoria : listaCategorias) {
            // retorna os dados do autor
            System.out.println("Categoria: " + categoria.getNomeCategoria());
        }   
        for (Editora editora : listaEditoras) {
            // retorna os dados da editora
            System.out.println("editora: " + editora.getEditora());
        }              
    }
    
    // método para realizar empréstimo
    
    public static int realizarEmprestimo(String titulo, String isbn) {
        //percorre a lista de livros
        int retorno = 0;
        for (Livro livros : listaLivros) {
            if(titulo.equals(livros.getTitulo()) && isbn.equals(livros.getIsbn())){
                if(livros.getQtdDisponivel() > 0){
                    livros.setQtdDisponivel(livros.qtdDisponivel - 1);
                    retorno += 1;
                }
            }
        }
        return retorno;
    }

    public static void main(String[] args) {
        System.out.println("##################################################");
        System.out.println("                      Catálogo                    ");
        System.out.println("##################################################");
        Livro.consultarLivrosExemplares();
        System.out.println("##################################################");
    }
}
