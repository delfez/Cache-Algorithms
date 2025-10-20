import java.util.*;

public class LRUCache<K> {
    private final int capacidade; //capacidade do mapa
    private final List<K> memoria; //mapa que guarda a chave tipo K e o valor tipo V
    private final Deque<K> pilha; //interface "double ended queue" de fila com duas pontas. Guarda valores do tipo K

    public LRUCache(int capacidade) {
        this.capacidade = capacidade;
        this.memoria = new ArrayList<>(capacidade);
        this.pilha = new ArrayDeque<>(); //implementação de array dequeue de tamanho flexivel
    }

    public void acessar(K key) {
        if (memoria.contains(key)) {
            // hit: só atualiza a pilha
            pilha.remove(key);
            pilha.addLast(key);
        } else {
            if (memoria.size() == capacidade) { //se a memoria estiver cheia
                K remover = pilha.removeFirst(); // MRU
                int indice = memoria.indexOf(remover); // pega posição do item removido
                memoria.set(indice, key);          // substitui pelo novo
            } else {
                memoria.add(key); // ainda há espaço
            }
            pilha.addLast(key);  //sempre adiciona na ultima posicao da pilha
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


