import java.util.*;

public class FIFOCache<K> {
    private final int capacidade;
    private final List<K> memoria;
    private int maisAntigo;

    public FIFOCache(int capacidade) {
        this.capacidade = capacidade;
        this.memoria = new ArrayList<>(capacidade);
        this.maisAntigo = 0;
    }

    public void acessar(K key) {

        if (memoria.contains(key)) return;

        if (memoria.size() == capacidade) {
            memoria.remove(maisAntigo);
            memoria.add(maisAntigo, key);
            maisAntigo = (++maisAntigo) % capacidade;
        } else {
            memoria.add(key);
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


