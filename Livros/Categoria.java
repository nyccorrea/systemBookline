package Livros;

public class Categoria {
    private String nomeCategoria;
    private String descricao;

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Métodos
    public void cadastrarCategoria(String nomeCategoria, String descricao) {
        // Lógica para cadastrar a categoria
        setNomeCategoria(nomeCategoria);
        setDescricao(descricao);
        System.out.println("Categoria "+getNomeCategoria()+" cadastrada!");
    }

    public void consultarCategoria() {
        // Lógica para consultar informações da categoria

        System.out.println("Informações da categoria - Nome: " + getNomeCategoria() + ", Descrição: " + getDescricao());
    }

    public void editarCategoria() {
        // Lógica para editar informações da categoria
        System.out.println("Categoria editada: " + nomeCategoria);
    }
}
