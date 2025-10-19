import java.util.*;

public class MRUCache<K, V> {
    private final int capacidade; //capacidade do mapa
    private final Map<K, V> mapa; //mapa que guarda a chave e o valor guardado
    private final Deque<K> maisRecente; //pilha que armazena o valor usado mais recentemente

    public MRUCache(int capacity) {
        this.capacidade = capacity;
        this.mapa = new HashMap<>();
        this.maisRecente = new ArrayDeque<>();
    }

    public Map<K, V> getMapa() {
        return mapa;
    }

    public void inserir(K key, V value) {
        if (mapa.containsKey(key)) {
            maisRecente.remove(key);
        } else if (mapa.size() == capacidade) {
            K mostRecent = maisRecente.removeLast();
            mapa.remove(mostRecent);
        }
        mapa.put(key, value);
        maisRecente.addLast(key);
    }

    public V acessar(K key) {
        if (!mapa.containsKey(key)) return null;
        maisRecente.remove(key);
        maisRecente.addLast(key);
        return mapa.get(key);
    }


}
