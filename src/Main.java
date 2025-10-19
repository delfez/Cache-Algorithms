//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MRUCache<Integer, String> cache = new MRUCache<>(3);
        cache.inserir(1, "A");
        cache.inserir(2, "B");
        cache.inserir(3, "C");
        cache.acessar(2);
        cache.inserir(4, "D");
        System.out.println(cache.getMapa());
    }
}

