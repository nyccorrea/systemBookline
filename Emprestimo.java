import Livros.Exemplar;

import java.util.Date;

public class Emprestimo {
    //atributos
    private Exemplar codExemplar;
    private Usuario usuario;
    private boolean situacao;
    private Date dataEmprestimo, dataDevolucao;

    //getters e setters
    public boolean isSituacao() {
        return situacao;
    }
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public Date getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public void registrarEmprestimo(Usuario usuario, Exemplar exemplar) {
        this.usuario = usuario;
        this.codExemplar = exemplar;
        exemplar.setSituacaoExemplar(false);
        System.out.println("Empréstimo realizado por " + usuario.getNome() +
                " do exemplar com código " + exemplar.getCodExemplar());
    }
    public static void main(String[] args) {
        
    }
}
