package linked;

public class No {
    //informações do nó (valor e o ponteiro do próximo)
    private int info; //o nó vai receber apenas números inteiros 
    public No proximo; // ponteiro do próximo nó

    public No(int info) {
        this.info = info;
        this.proximo = null;
    }
    //pega o valor
    public int getInfo() {
        return info;
    }
    //guarda os dados do atributo da classe nó dentro da variavel valor
    public void setInfo(int info){
        this.info = info;
    }
    //Ler o valor do proximo nó
    public No getProximo() {
        return proximo;
    }
    //guarda os dados do proximo nó
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}