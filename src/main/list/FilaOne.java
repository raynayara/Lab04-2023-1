package list;

import linked.No;

public class FilaOne implements Fila {
    private No frente;
    private No fim;

    public FilaOne() {
        this.frente = null;
        this.fim = null;
    }


    @Override
    public void enqueue(int item) {
        No no1 = new No(item);
        if (isEmpty()) {
            
            frente = no1;
            fim = no1;

        }else {
            
            fim.proximo = no1;
            fim = no1;
        }
            
    }
    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }

        int dequeuedItem = frente.getInfo();
        frente = frente.proximo;

        if (frente == null) {
            fim = null;
        }

        return dequeuedItem;
    }

    @Override
    public boolean isEmpty() {
        return frente == null;
    }

     @Override
    public int size() {
        int contador = 0;
        No current = frente;

        while (current != null) {
            contador++;
            current = current.proximo;
        }

        return contador;
    }

}