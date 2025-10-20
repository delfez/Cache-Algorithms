import java.util.*;

public class FIFOCache {
    private final int capacidade; //capacidade do mapa
    private final List<Integer> memoria; //lista que guarda a chave tipo K
    private int maisAntigo; //guarda indice do elemento mais antigo

    public FIFOCache(int capacidade) {
        this.capacidade = capacidade;
        this.memoria = new ArrayList<>(capacidade);
        this.maisAntigo = 0;
    }

    public void acessar(Integer key) {

        if (memoria.contains(key)) return; //se a pagina estiver na memoria nada precisa ser feito

        //caso 2: pagina nao esta na memoria e ela esta cheia
        if (memoria.size() == capacidade) {
            memoria.remove(maisAntigo);//remove o elemento mais antigo da lista
            memoria.add(maisAntigo, key);
            maisAntigo = (++maisAntigo) % capacidade;
        } else {
            memoria.add(key);
        }
    }

    public void exibirMemoria(){
        int i = 1;
        for (Integer m : memoria){
            System.out.print("Q"+i+": "+m+"   ");
            i++;
        }
        System.out.println();
    }

}


