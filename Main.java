void main() {
    PilhaSimples ps = new PilhaSimples(3);
    ps.desempilhar();
    ps.empilhar(1);
    ps.empilhar(2);
    ps.empilhar(3);
    ps.empilhar(4);
    ps.exibirPilha();
    ps.desempilhar();
    ps.exibirPilha();

    System.out.print("\n");

    PilhaDinamica pd = new PilhaDinamica();
    pd.desempilhar();
    pd.empilhar(1);
    pd.empilhar(2);
    pd.empilhar(3);
    pd.exibirPilha();
    pd.desempilhar();
    pd.exibirPilha();
}
