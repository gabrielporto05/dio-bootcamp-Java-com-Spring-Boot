
import java.util.HashSet;
import java.util.Set;

public class GenericExempleSet {
    public static void main(String[] args) {

        Set setSemGenerics = new HashSet();
        setSemGenerics.add("Chines");
        setSemGenerics.add(5);

        Set<String> setGenerics = new HashSet<>();
        setGenerics.add("Chines");
        setGenerics.add("Porto");

        for (String elemento : setGenerics) {
            System.out.println(elemento);
        }

        System.out.println("----------------");

        for (Object elemento : setSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }

    }
}
