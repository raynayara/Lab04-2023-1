package linked;
import javax.swing.text.html.parser.Element;
import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;
    int tamanho = 0;
    

    public ListaLigada() {
        cabeca = null;

    }

    @Override
    public boolean buscaElemento(int info) {
        No local = cabeca;
        No aux = local;

        if (local == null){
            return false;

        }else if (local.getInfo() == info) {
            return true;

        } else {
            while (aux.getProximo() != null) {
                if (aux.getProximo().getInfo() == info) {
                    return true;
                } else {
                    aux = aux.getProximo();
                }
            }
            return false;      
    }
    }

    @Override
    public int buscaIndice(int info) {
        No aux = cabeca;
        int indice = 0;

        if (aux == null) {
            return -1; 
        } else{

            while( info != aux.getInfo() ){
                
                if (aux.getProximo() != null){
                    aux = aux.getProximo();
                }else{
                    return -1;
                }
                indice++;
            }
            return indice;
        }
    }

    @Override
    public int minimo() {
        No no1 = cabeca;
        int min = no1.getInfo();

        if (cabeca == null) {
            cabeca = null;
        }
        while (no1 != null) {
            if (no1.getInfo() < min) {
                min = no1.getInfo();
            }
            no1 = no1.getProximo();
        }

        return min;
    }

    @Override
    public int maximo() {
        No maxi = cabeca;
        int max = maxi.getInfo();

        if (cabeca == null) {
            cabeca = null;
        }
        while (maxi != null) {
            if (maxi.getInfo() > max) {
                max = maxi.getInfo();
            }
            maxi = maxi.getProximo();
        }
        return max;
    }

    @Override
    public int predecessor(int info) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
    }

    @Override
    public int sucessor(int info) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int info) {
        No no = new No(info); //criando o nó
        no.setInfo(info); //o nó ta recebendo o valor do atributo do metodo
        no.setProximo(cabeca); //aponta o novo nó para a antiga cabeça
        cabeca = no; //a cabeça agr vai ser o novo nó
        tamanho++;
    }

    @Override
    public void insereElementoPosicao(int info, int buscaIndice) {
        No no1 = new No(info);
        
        if(buscaIndice == 0){
            no1.setProximo(this.cabeca);
            this.cabeca = no1;
        }
        No no2 = this.cabeca;
        for (int i = 0; i <= buscaIndice - 1 && no2 != null; i++){
            no2 = no2.getProximo();
        }
        no2 = no1;
    }


    @Override
    public void insereInicio(int info) {
        No no1 = new No(info); //criação do primeiro nó

        if (cabeca == null){
            cabeca = new No(info);
            tamanho++;
            

        }else {
            no1.setProximo(this.cabeca);
            this.cabeca = no1;
            

        }
    }

    @Override
    public void insereFim(int info) {
        No no1 = new No(info);
        No cauda = cabeca;
        
        if (cabeca == null) {
            cabeca = new No(info);
            tamanho++;

        } else {
            while (cauda.getProximo() != null) {
                cauda = cauda.getProximo();
            }

            cauda.setProximo(no1);
        }

    }

     @Override
    public void remove(int info) {
        No clear = cabeca;

        if (cabeca == null) {
            return;

        } else if (cabeca.getInfo() == info) {
            cabeca = cabeca.getProximo();

        } else {
            while (clear.getProximo() != null) {
                if (clear.getProximo().getInfo() == info) {
                    clear.setProximo(clear.getProximo().getProximo());
                } else {
                    clear = clear.getProximo();
                }
            }

            if (clear.getProximo() != null) {
                clear.setProximo(clear.getProximo().getProximo());
            }
        }

    }

    @Override
    public void removeIndice(int indice) {
        No clearInd = cabeca;
        int contador = 0;

        if (cabeca == null) {
            cabeca = null;
        }
        while (clearInd != null) {
            if (contador == indice) {
                remove(indice);
            }
            clearInd = clearInd.getProximo();
            contador++;
        }
    }

    @Override
    public void removeInicio() {

        if (cabeca == null) {
            cabeca = null;
        } else {
            cabeca = cabeca.getProximo();
        }
    }

     @Override
    public void removeFim() {
        No no1 = cabeca;

        if (cabeca == null) {
            cabeca = null;

        } else if (cabeca.getProximo() == null) {
            cabeca = null;
        } else {

            while (no1.getProximo().getProximo() != null) {
                no1 = no1.getProximo();
            }

            no1.setProximo(null);
        }

    }

}
