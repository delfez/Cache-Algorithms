//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MRUCache cacheMRU = new MRUCache(8);
        LRUCache cacheLRU = new LRUCache(8);
        FIFOCache cacheFIFO = new FIFOCache(8);

        MRUCache cacheMRU2 = new MRUCache(8);
        LRUCache cacheLRU2 = new LRUCache(8);
        FIFOCache cacheFIFO2 = new FIFOCache(8);

        MRUCache cacheMRU3 = new MRUCache(8);
        LRUCache cacheLRU3 = new LRUCache(8);
        FIFOCache cacheFIFO3 = new FIFOCache(8);


        int[] teste1 = {4,3,25,8,19,6,25,8,16,35,45,22,8,3,16,25,7};
        int[] teste2 =  {4,5,7,9,46,45,14,4,64,7,65,2,1,6,8,45,14,11};
        int[] teste3 = { 4,6,7,8,1,6,10,15,16,4,2,1,4,6,12,15,16,11 };

        System.out.println("Teste 1 com Cache MRU:");
        for (int p : teste1){
            System.out.println("Acessando página "+p+":");
            cacheMRU.acessar(p);
            cacheMRU.exibirMemoria();
            System.out.println();
        }

        System.out.println("Teste 1 com Cache LRU:");
        for (int p : teste1){
            System.out.println("Acessando página "+p+":");
            cacheLRU.acessar(p);
            cacheLRU.exibirMemoria();
            System.out.println();
        }

        System.out.println("Teste 1 Cache FIFO:");
        for (int p : teste1){
            System.out.println("Acessando página "+p+":");
            cacheFIFO.acessar(p);
            cacheFIFO.exibirMemoria();
            System.out.println();
        }

        System.out.println("Teste 2 com Cache MRU:");
        for (int p : teste2){
            System.out.println("Acessando página "+p+":");
            cacheMRU2.acessar(p);
            cacheMRU2.exibirMemoria();
            System.out.println();
        }

        System.out.println("Teste 2 com Cache LRU:");
        for (int p : teste2){
            System.out.println("Acessando página "+p+":");
            cacheLRU2.acessar(p);
            cacheLRU2.exibirMemoria();
            System.out.println();
        }

        System.out.println("Teste 2 Cache FIFO:");
        for (int p : teste2){
            System.out.println("Acessando página "+p+":");
            cacheFIFO2.acessar(p);
            cacheFIFO2.exibirMemoria();
            System.out.println();
        }

        System.out.println("Teste 3 com Cache MRU:");
        for (int p : teste3){
            System.out.println("Acessando página "+p+":");
            cacheMRU3.acessar(p);
            cacheMRU3.exibirMemoria();
            System.out.println();
        }

        System.out.println("Teste 3 com Cache LRU:");
        for (int p : teste3){
            System.out.println("Acessando página "+p+":");
            System.out.println();
            cacheLRU3.acessar(p);
            cacheLRU3.exibirMemoria();
            System.out.println();
        }

        System.out.println("Teste 3 Cache FIFO:");
        for (int p : teste3){
            System.out.println("Acessando página "+p+":");
            cacheFIFO3.acessar(p);
            cacheFIFO3.exibirMemoria();
            System.out.println();
        }

    }

}

