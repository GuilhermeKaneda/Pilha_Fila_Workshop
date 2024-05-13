public class Pilha {
    /*Por que criamos Object[] e não int[] (array)? O Object engloba todos os tipos de dados, ou seja,
    podemos armazenar qualquer tipo de dado nessa array*/
    private Object[] elementos;
    private int capacidade, topo;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.topo = -1;
    }

    public Object empilhar(Object elemento) {
        if((topo + 1) == capacidade)
            //Mostra um aviso
            throw new IllegalStateException("A pilha está cheia");
        topo++;
        elementos[topo] = elemento;
        return elemento;
    }

    public Object desempilhar() {
        if((topo + 1) == 0)
            throw new IllegalStateException("A pilha está vazia");
        Object removido = elementos[topo];
        topo--;
        return removido;
    }

    public Object topo() {
        if((topo + 1) == 0)
            throw new IllegalStateException("A pilha está vazia");
        return elementos[topo];
    }

    public int tamanho() {
        return topo + 1;
    }

    public boolean isEmpty() {
        return (topo + 1) == 0;
    }

    public boolean isFull() {
        return (topo + 1) == capacidade;
    }
}
