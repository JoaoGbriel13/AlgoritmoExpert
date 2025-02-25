package Sets.Visitantes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] data = {
                "ana ,2024-07-04T21:42:40.353283800Z, https://blog.com/login",
                "bob, 2024-07-04T21:42:44.571283800Z, https://blog.com/news",
                "maria, 2024-07-04T21:42:46.394283800Z, https://blog.com/shop",
                "ana, 2024-07-04T21:42:50.026283800Z, https://blog.com/news"
        };
        Visitantes visitantes = new Visitantes();
        System.out.println("Tamanho original: " + data.length);
        for (String d : data){
            visitantes.insertData(d);
        };
        System.out.println("Visitantes unicos:" + visitantes.getUniqueVisitors().size());

        // Testando problema lendo arquivo JSON
        String path = "C:\\Users\\joaog\\IdeaProjects\\AlgoritmoExpert\\src\\main\\java\\Sets\\Problema\\visitantes-input.json";
        ObjectMapper objectMapper = new ObjectMapper();
        List<String> visitantesJSON = objectMapper.readValue(new File(path), new TypeReference<>() {
        });
        System.out.println("Tamanho original: " + visitantesJSON.size());

        Visitantes visitantes2 = new Visitantes();
        for (String row : visitantesJSON){
            visitantes2.insertData(row);
        }
        System.out.println("Visitantes unicos: " + visitantes2.getUniqueVisitors().size());
    }
}
