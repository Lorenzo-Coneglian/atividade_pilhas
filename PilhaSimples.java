public class PilhaSimples {
    Integer[] stack;

    public PilhaSimples(int tamanho) {
        this.stack = new Integer[tamanho];
    }

    public boolean estaCheia(){
        return this.stack[this.stack.length-1]!=null;
    }

    public boolean estaVazia(){
        return this.stack[0]==null;
    }

    public void exibirPilha(){
        if (!estaVazia()){
            for (int i=0; i<this.stack.length; i++){
                if (this.stack[i]!=null){
                    System.out.println(this.stack[i]);
                }
            }
        } else System.out.println("A pilha está vazia!");
    }

    public void desempilhar(){
        if(!estaVazia()){
            for(int i = this.stack.length-1; i>=0; i--){
                if (this.stack[i]!=null){
                    this.stack[i] = null;
                    return;
                }
            }
        } else System.out.println("A pilha está vazia!");
    }

    public void empilhar(int elemento){
        if(!estaCheia()){
            for (int i=0; i<this.stack.length; i++){
                if (this.stack[i] == null){
                    this.stack[i] = elemento;
                    return;
                }
            }
        } else System.out.println("A pilha está cheia!");
    }
}
