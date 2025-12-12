
import java.util.HashMap;
import java.util.Map;

public class GenericExempleMap {
    public static void main(String[] args) {

        Map mapSemGenerics = new HashMap();
        mapSemGenerics.put(1, 1);
        mapSemGenerics.put(2, "Chines");

        Map<Integer, String> mapGenerics = new HashMap<>();
        mapGenerics.put(5, "Chines");
        mapGenerics.put(55, "Julia");

        for (Map.Entry<Integer, String> entry : mapGenerics.entrySet()) {
            Integer chave = entry.getKey();
            String value = entry.getValue();

            System.out.println("Chave: " + chave + ", Value: " + value);
        }

        for (Object obj : mapSemGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            Integer chave = (Integer) entry.getKey();
            Object value = entry.getValue();
            System.out.println("Chave: " + chave + ", Value: " + value);

        }

    }
}
