import java.util.*;

public class LRUCache {
    private final int capacidade;
    private final List<Integer> memoria;
    private final Deque<Integer> pilha;

    public LRUCache(int capacidade) {
        this.capacidade = capacidade;
        this.memoria = new ArrayList<>(capacidade);
        this.pilha = new ArrayDeque<>();
    }

    public void acessar(Integer key) {
        if (memoria.contains(key)) {
            pilha.remove(key);
            pilha.addLast(key);
        } else {
            if (memoria.size() == capacidade) {
                Integer remover = pilha.removeFirst();
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
        for (Integer m : memoria){
            System.out.print("Q"+i+": "+m+"   ");
            i++;
        }
        System.out.println();
    }

}


