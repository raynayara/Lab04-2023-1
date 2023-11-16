package list;

import linked.ListaLigada;
import linked.No;

public class PilhaOne implements Pilha {
    private No noTopo;


    @Override
    public boolean isEmpty() {
        if (noTopo == null){
            return true;
        }
        return false;
    }

    @Override
    public void push(int item) {
        No no1 = new No(item);
        if (noTopo == null){
            noTopo = no1;
        }else{
            no1.proximo = noTopo;
            noTopo = no1;
        }

    }    

    @Override
    public int pop() {
        if (noTopo == null){
            throw new IllegalStateException("A lista está vazia.");
        }else{
            int aux = noTopo.getInfo();
            noTopo = noTopo.getProximo();
            return aux;
        }
    }
    
}
