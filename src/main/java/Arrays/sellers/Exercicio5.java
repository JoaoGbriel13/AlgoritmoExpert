package Arrays.sellers;

import Arrays.sellers.utils.Sellers;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio5 {
    public static void main(String[] args) throws IOException {
        System.out.println(findMax());
    }

    public static Sellers findMax() throws IOException {
        String path = "C:\\Users\\joaog\\IdeaProjects\\AlgoritmoExpert\\src\\main\\java\\Arrays\\sellers\\utils\\sellers.json";
        double highestAmount = 0d;
        Sellers highestSeller = null;
        ObjectMapper mapper = new ObjectMapper();
        List<Sellers> sellersList = mapper.readValue(new File(path), new TypeReference<>() {
        });
        for (Sellers seller : sellersList){
            if (seller.getAmount() > highestAmount){
                highestAmount = seller.getAmount();
                highestSeller = seller;
            }
        }
        return highestSeller;
    }
}
