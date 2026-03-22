public class PilhaDinamica {
    NoPilha inicio;

    public PilhaDinamica() {
        this.inicio = new NoPilha(null);
    }

    public boolean estaVazio(){
        return this.inicio.getConteudo()==null;
    }

    public void exibirPilha(){
        if (!estaVazio()){
            NoPilha aux = this.inicio;
            do{
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }while (aux!=null);
        } else System.out.println("A pilha está vazia!");
    }

    public void empilhar(Integer elemento){
        if (this.inicio.getConteudo()==null) this.inicio.setConteudo(elemento);
        else empilharPrivado(elemento, inicio);
    }

    private void empilharPrivado(Integer elemento, NoPilha no){
        if (no.getProx()==null){
            no.setProx(new NoPilha(elemento));
        } else empilharPrivado(elemento, no.getProx());
    }

    public void desempilhar(){
        if (!estaVazio()){
            desempilharPrivado(inicio);
        } else System.out.println("A pilha está vazia!");
    }

    private void desempilharPrivado(NoPilha no){
        if(no.getProx().getProx()==null){
            no.setProx(null);
        } else desempilharPrivado(no.getProx());
    }
}
