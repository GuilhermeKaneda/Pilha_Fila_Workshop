public class Fila {
    /*Por que criamos Object[] e não int[] (array)? O Object engloba todos os tipos de dados, ou seja,
    podemos armazenar qualquer tipo de dado nessa array*/
    private Object[] elementos;
    private int tamanho, capacidade, inicio, fim;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = -1;
    }

    public Object adicionar(Object elemento) {
        if(tamanho == capacidade)
            //Mostra um aviso
            throw new IllegalStateException("A fila está cheia");
        fim = fim + 1;
        elementos[fim] = elemento;
        tamanho++;
        return elemento;
    }

    public Object remover() {
        if(tamanho == 0)
            throw new IllegalStateException("A fila está vazia");
        Object removido = elementos[inicio];
        inicio++;
        tamanho--;
        return removido;
    }

    public Object primeiro() {
        if(tamanho == 0)
            throw new IllegalStateException("A fila está vazia");
        return elementos[inicio];
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }
}
