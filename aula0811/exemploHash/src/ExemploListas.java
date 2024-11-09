import java.util.ArrayList;
import java.util.List;

public class ExemploListas {
    public static void main(String[] args) {
        //lista diversa
        List lista = new ArrayList();
        lista.add("A");
        lista.add(123);
        lista.add(System.currentTimeMillis());
        lista.add("Jonas");
        lista.add(12.89);
        lista.add("Jonas");
        //tamanho da lista
        System.out.println("Tamanho: " + lista.size());
        //varrer a lista, mostrando os dados
        for(Object item: lista) {
            System.out.println(item);
        }
        //remover jonas
        while(lista.contains("Jonas")) lista.remove("Jonas");
        //tem Jonas na lista
        if(lista.contains("Jonas")){
            System.out.println("Tem Jonas");
        }else{
            System.out.println("Nao tem Jonas");
        }
        //tamanho da lista depois remover o jonas
        System.out.println("Tamanho: " + lista.size());
        //varrer a lista, mostrando os dados
        for(Object item: lista) {
            System.out.println(item);
        }

    }
}
