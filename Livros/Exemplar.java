package Livros;

public class Exemplar {
    //atributos
    private int codExemplar;
    private boolean situacaoExemplar;

    public int getCodExemplar() {
        return codExemplar;
    }
    public void setCodExemplar(int codExemplar) {
        this.codExemplar = codExemplar;
    }
    public boolean getSituacaoExemplar() {
        return situacaoExemplar;
    }
    public void setSituacaoExemplar(boolean situacaoExemplar) {
        this.situacaoExemplar = situacaoExemplar;
    }

    
    public static void main(String[] args) {
        System.out.println("##################################################");
        System.out.println("                      Catálogo                    ");
        System.out.println("##################################################");
        Livro.consultarLivrosExemplares();
        System.out.println("##################################################");
    }
}
