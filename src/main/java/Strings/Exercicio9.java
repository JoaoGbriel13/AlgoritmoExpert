package Strings;

import java.util.ArrayList;
import java.util.List;

public class Exercicio9 {
    public static void main(String[] args) {
        List<String> listaVideos = List.of(
                "4668c219-296d-40de-a073-99b85026e977,01-01 Visão geral do capítulo.mp4,222",
                "81be4133-f81a-443a-96f3-0c30d7460ab8,01-02 Algoritmos e Lógica de Programação.mp4,396",
                "b82f4f7b-f8f1-43e2-974d-3821e6a59e45,01-03 Estruturas de dados é sobre o quê.mp4,567",
                "ccde5219-f2df-4a11-b981-e0cdfa3c6224,01-04 Precisa saber OO antes de ED.mp4,215",
                "e77cf174-9547-4d7f-8372-ef23f193938f,01-05 Esse curso também é para outras linguagens.mp4,219",
                "254ef676-7bc5-478d-8250-0ce2616c9731,01-06 Vamos falar sobre objetos e funções.mp4,94",
                "e030627b-a8e0-4bde-bda8-edc78503fc2c,02-01 Visão geral do capítulo.mp4,389",
                "c4be1d39-6c97-4721-afd5-3b63ca0abf0a,02-02 Aviso sobre os exercícios.mp4,107",
                "6364ff0f-bc34-4166-8b35-2f0d9cf1b062,02-03 Literais e expressões em Javascript PARTE 1.mp4,545",
                "e7245f74-0135-4af0-9b79-bf4927438cfc,02-04 Literais e expressões em Javascript PARTE 2.mp4,567",
                "a7fc8b41-ce2f-4751-a6a7-39d4db32fbe0,02-05 Imutabilidade de strings em Javascript.mp4,310",
                "a8071e3d-97fe-4cc8-b377-2a69f50844a6,02-06 Funções de string em Javascript PARTE 1.mp4,748",
                "b8624056-07ad-4caa-8deb-1db75e04a8f6,02-07 Funções de string em Javascript PARTE 2.mp4,797",
                "215a5a6a-4171-4f98-b803-4d02811da5ae,02-08 Funções de string em Javascript PARTE 3.mp4,374",
                "32029cca-af8a-4b20-971a-08ccf350d2f4,02-09 Expressões regulares.mp4,486"
        );
        List<String> jsonFormatted = new ArrayList<>();
        for (String aula : listaVideos) {
            AulaInfo aulaInfo = new AulaInfo(aula);
            jsonFormatted.add(aulaInfo.formatAndReturnAsJson());
        }
        System.out.println("[");
        System.out.println(String.join(",\n",jsonFormatted));
        System.out.println("]");
    }

    static class AulaInfo {
        String id;
        String title;
        int duration;

        public AulaInfo(String csv) {
            String[] information = csv.split(",");
            String regex = "[0-9]{2}-[0-9]{2}";
            this.id = information[0];
            this.title = information[1].replaceAll(regex, "").replace(".mp4", "").trim();
            this.duration = Integer.parseInt(information[2]);
        }

        public String formatAndReturnAsJson() {
            return String.format("  { \n    \"id\": \"%s\",\n    \"title\": \"%s\",\n    \"duration\": %d\n  }",
                    this.id, this.title, this.duration);
        }
    }
}
