public class NoPilha {
    Integer conteudo;
    NoPilha prox;

    public NoPilha(Integer conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
    }

    public Integer getConteudo() {
        return conteudo;
    }

    public void setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
    }

    public NoPilha getProx() {
        return prox;
    }

    public void setProx(NoPilha prox) {
        this.prox = prox;
    }
}
