import java.util.Date;

public class Emprestimo {
    // atributos
    private boolean situacao;
    private Date dataEmprestimo, dataDevolucao;

    // getters e setters
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


    public static void main(String[] args) {
        // Exemplo de uso
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.realizarEmprestimo();
    }
}
