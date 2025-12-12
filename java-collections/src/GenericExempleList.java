
import java.util.ArrayList;
import java.util.List;

public class GenericExempleList {
    public static void main(String[] args) {

        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Chines");
        listaSemGenerics.add(5);

        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Chines");
        listaGenerics.add("Porto");

        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        System.out.println("----------------");

        for (Object elemento : listaSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }

    }
}
