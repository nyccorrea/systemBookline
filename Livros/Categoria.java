package Livros;

public class Categoria {
    private String nomeCategoria;
    private String descricao;
    
    //construtor
    public Categoria(String nomeCategoria, String descricao){
        this.nomeCategoria = nomeCategoria;
        this.descricao = descricao;
    }

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
}
