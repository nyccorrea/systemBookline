package Livros;

public class Livro {
    private String isbn;
    private String titulo;
    private int anoPublicacao;
    private int qtdDisponivel;
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
    // Métodos
    public void cadastrarLivro(String isbn, String titulo, int anoPublicacao, int qtdDisponivel) {
        // Lógica para cadastrar o livro
        setIsbn(isbn);
        setTitulo(titulo);
        setAnoPublicacao(anoPublicacao);
        setQtdDisponivel(qtdDisponivel);
        System.out.println("Livro "+getTitulo()+" cadastrado!");

    }

    public void consultarLivro() {
        // Lógica para consultar informações do livro

                System.out.println("Informações do livro - ISBN: " + getIsbn() + ", Título: " + getTitulo() +
                        ", Ano de Publicação: " + getAnoPublicacao() + ", Quantidade Disponível: " + getQtdDisponivel());

    }
    public void editarLivro() {
        // Lógica para editar informações do livro
        System.out.println("Livro editado: " + titulo);
    }

    public void excluirLivro() {
        // Lógica para excluir o livro
        System.out.println("Livro excluído: " + titulo);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
    }
}
