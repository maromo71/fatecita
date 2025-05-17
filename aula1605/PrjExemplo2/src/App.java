import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List lista = new ArrayList(); //Lista de qq coisa
        lista.add(111);
        lista.add(10.5);
        lista.add("Maria");
        lista.add("Jose");
        lista.add(System.currentTimeMillis());
        lista.add("Maria");
        System.out.println("Total: " + lista.size());

        System.out.println(lista.contains("Jose"));
        while(lista.contains("Maria")) lista.remove("Maria");
        for(Object obj : lista){
            System.out.println(obj);
        }
    }
}
