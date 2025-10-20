import java.util.*;

public class MRUCache<K> {
    private final int capacidade;
    private final List<K> memoria;
    private final Deque<K> pilha;

    public MRUCache(int capacidade) {
        this.capacidade = capacidade;
        this.memoria = new ArrayList<>(capacidade);
        this.pilha = new ArrayDeque<>();
    }

    public void acessar(K key) {
        if (memoria.contains(key)) {
            pilha.remove(key);
            pilha.addLast(key);
        } else {
            if (memoria.size() == capacidade) {
                K remover = pilha.removeLast();
                int indice = memoria.indexOf(remover);
                memoria.set(indice, key);
            } else {
                memoria.add(key);
            }
            pilha.addLast(key);
        }
    }

    public void exibirMemoria(){
        int i = 1;
        for (K m : memoria){
            System.out.print("Q"+i+": "+m+"   ");
            i++;
        }
        System.out.println();
    }

}


