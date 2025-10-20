import java.util.*;

public class MRUCache {
    private final int capacidade; //capacidade da memoria
    private final List<Integer> memoria; //lista que guarda a chave K
    private final Deque<Integer> pilha; //interface "double ended queue" de fila com duas pontas. Guarda valores do tipo K

    public MRUCache(int capacidade) {
        this.capacidade = capacidade;
        this.memoria = new ArrayList<>(capacidade);
        this.pilha = new ArrayDeque<>(); //implementação de array dequeue de tamanho flexivel
    }

    public void acessar(Integer key) {
        if (memoria.contains(key)) {
            // hit: só atualiza a pilha
            pilha.remove(key);
            pilha.addLast(key);
        } else {
            if (memoria.size() == capacidade) { //se a memoria estiver cheia
                Integer remover = pilha.removeLast(); // MRU
                int indice = memoria.indexOf(remover); // pega posição do item removido
                memoria.set(indice, key);          // substitui pelo novo
            } else {
                memoria.add(key); // ainda há espaço
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


