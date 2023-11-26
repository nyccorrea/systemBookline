import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    // atributos
    private boolean situacao;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    
    // getters e setters
    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public static String consultarEmprestimo(){
        Emprestimo Emprestimo = new Emprestimo();
        Emprestimo.setSituacao(true);
        Emprestimo.setDataEmprestimo(LocalDate.now());
        Emprestimo.setDataDevolucao(Emprestimo.getDataEmprestimo().plus(7,ChronoUnit.DAYS));
        System.out.println("Situação do Emprestimo: " + (Emprestimo.isSituacao() ? "Aceito" : "Recusado"));
        System.out.println("Data do emprestimo " + Emprestimo.getDataEmprestimo() + " Data de devolução do Livro " 
        + Emprestimo.getDataDevolucao());
        return null; 
    }
}