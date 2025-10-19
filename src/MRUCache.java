import java.util.*;

public class MRUCache<K, V> {
    private final int capacidade; //capacidade do mapa
    private final Set<K> mapa; //mapa que guarda a chave tipo K e o valor tipo V
    private final Deque<K> pilha; //interface "double ended queue" de fila com duas pontas. Guarda valores do tipo K

    public MRUCache(int capacidade) {
        this.capacidade = capacidade;
        this.mapa = new HashSet<>();
        this.pilha = new ArrayDeque<>(); //implementação de array dequeue de tamanho flexivel
    }

    public Set<K> getMapa() {
        return mapa;
    }

    public void acessar(K key) {

        //caso 1: pagina esta na memoria
        if (mapa.contains(key)){
            pilha.remove(key);
            pilha.addLast(key);
            return;
        }

        //caso 2: pagina nao esta na memoria e ela esta cheia
        if (mapa.size() == capacidade){

            K remover = pilha.removeLast();
            mapa.remove(remover);

        }

        mapa.add(key);
        pilha.addLast(key);

    }


}


