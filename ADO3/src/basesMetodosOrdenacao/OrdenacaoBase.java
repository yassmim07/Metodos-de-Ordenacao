package basesMetodosOrdenacao;

public abstract class OrdenacaoBase implements Ordenacao {
    protected int comparacoes = 0;
    protected int trocas = 0;

    public int getComparacoes() { return comparacoes; }
    public int getTrocas() { return trocas; }
}

