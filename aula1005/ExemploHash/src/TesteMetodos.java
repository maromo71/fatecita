import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteMetodos {
    public static void main(String[] args) {
        //Principais metodos de manipulacao de collections
        List lista = new ArrayList();
        System.out.println("Tamanho: " + lista.size());
        lista.add("Joao");
        lista.add(14);
        lista.add(System.currentTimeMillis());
        lista.add("Maromo");
        lista.add(14);
        lista.add(23.89);
        System.out.println("Tamanho: " + lista.size());
        //percorrer a lista
        for(Object x : lista){
            System.out.println(x);
        }
        boolean tem = lista.contains("Joao");
        if(tem){
            lista.remove("Joao");
        }
        System.out.println();
        while(lista.contains(14)){
            lista.remove((Integer)14);
        }

        //percorrer a lista
        for(Object x : lista){
            System.out.println(x);
        }
        lista.clear();
        System.out.println("E agora: ");
        //percorrer a lista
        for(Object x : lista){
            System.out.println(x);
        }


    }

}
