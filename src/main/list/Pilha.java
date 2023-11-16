package list;

public interface Pilha{ 
    //função para verificar se a pilha está vazia. (true ou false)
    public boolean isEmpty();
     //operação de empurrar um elemento para o topo da pilha.
     public void push(int item);
     //operação de remover e retornar o elemento no topo da pilha.
     public int pop();
}