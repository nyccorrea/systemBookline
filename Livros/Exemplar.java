package Livros;

import java.util.ArrayList;

public class Exemplar {
    //atributos
    private int codExemplar;
    private boolean situacaoExemplar;
/*    private ArrayList<Livro> exemplares;
    public void adicionarExemplar(Livro exemplar) {
        exemplares.add(exemplar);
    }
    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro exemplar : exemplares) {
            if (exemplar.getQtdDisponivel() > 0) {
                System.out.println("- Título: " + exemplar.getTitulo() +" ISBN: "+ exemplar.getIsbn());
            }
        }
    }
 */   //metodos getters e setters
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
        Livro.consultarLivro();
    }
}
