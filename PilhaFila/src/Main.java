public class Main {
    public static void main(String[] args) {
        //Testando fila
        Fila fila = new Fila(5);

        System.out.println("Adicionando " + fila.adicionar("Abelha"));
        System.out.println("Adicionando " + fila.adicionar("Bernardo"));
        System.out.println("Adicionando " + fila.adicionar("Casa"));
        System.out.println("Adicionando " + fila.adicionar("Dagrão"));
        System.out.println("Adicionando " + fila.adicionar("Enzo"));

        System.out.println("A fila está vazia? " + fila.isEmpty());
        System.out.println("Primeiro elemento da fila: " + fila.primeiro());
        System.out.println("Tamanho da fila: " + fila.tamanho());

        while(!fila.isEmpty())
            System.out.println("Removendo da fila: " + fila.remover());

        System.out.println("A fila está vazia? " + fila.isEmpty());

        //Testando pilha
        Pilha pilha = new Pilha(5);

        System.out.println("\n\n\nAdicionando " + pilha.empilhar("Fábio"));
        System.out.println("Adicionando " + pilha.empilhar("Geraldo"));
        System.out.println("Adicionando " + pilha.empilhar("Helicoptero"));
        System.out.println("Adicionando " + pilha.empilhar("Pajé"));

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
        System.out.println("Topo da pilha: " + pilha.topo());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());

        while(!pilha.isEmpty())
            System.out.println("Removendo da pilha: " + pilha.desempilhar());

        System.out.println("A pilha está vazia? " + pilha.isEmpty());

    }
}