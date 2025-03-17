package Dicionarios.Votos;

import java.util.HashMap;
import java.util.Map;


public class Votos {
    public static void main(String[] args) {
        String[] dados = {
                "Alex Blue,15",
                "Maria Green,22",
                "Bob Brown,21",
                "Alex Blue,30",
                "Bob Brown,15",
                "Maria Green,27",
                "Maria Green,22",
                "Bob Brown,25",
                "Alex Blue,31"
        };

        HashMap<String, Integer> votos = new HashMap<>();

        for (String dado : dados){
            String[] dadoFormatted = dado.split(",");
            votos.put(dadoFormatted[0], votos.getOrDefault(dadoFormatted[0],0) + Integer.parseInt(dadoFormatted[1]));
        }
        for (Map.Entry<String, Integer> entry : votos.entrySet()){
            System.out.println("Votante: " + entry.getKey() + " Votos: " + entry.getValue());
        }
    }
}
