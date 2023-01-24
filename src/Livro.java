public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.setPagAtual(0);
        this.setAberto(false);
        this.leitor = leitor;
    }


    public String detalhes() {
        return "Livro" +
                "titulo='" + titulo + '\'' +
                ",\n autor='" + autor + '\'' +
                ",\n totPaginas=" + totPaginas +
                ",\n pagAtual=" + pagAtual +
                ",\n aberto=" + aberto +
                ",\n leitor=" + leitor.getNome();
    }



    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);

    }

    @Override
    public void folhear(int pag) {
        if(pag > getTotPaginas())
            System.out.println("Não pode ultrapassar o livro");
        else
        this.setPagAtual(pag);

    }

    @Override
    public void avancaPag() {
        this.setPagAtual(getPagAtual()+1);

    }

    @Override
    public void voltaPag() {
        this.setPagAtual(getPagAtual()+1);

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
}
