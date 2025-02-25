package Sets.Alunos;

import java.util.HashSet;
import java.util.Set;

public class Alunos {
    public static void main(String[] args) {
        int[][] data = {
                {15, 21, 80, 42},
                {21, 80, 47},
                {12, 21, 47, 35}
        };
        Sistema controle = new Sistema();
        for (int[] row: data){
            for (int num : row){
                controle.insertAlunos(num);
            }
        }
        System.out.println(controle.getAlunos().size());
    }
    static class Sistema{
        private Set<Integer> alunos;

        public Sistema() {
            this.alunos = new HashSet<>();
        }
        public void insertAlunos(int codigo){
            this.alunos.add(codigo);
        }

        public Set<Integer> getAlunos() {
            return alunos;
        }
    }
}
