package Listas.LinkedList;

public class Exercicio1 {
    public static void main(String[] args) {
        int n1 = 8;
        int n2 = 10;
        int n3 = 15;
        int n4 = 11;

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addElementAtEnd(n1);
        linkedList.addElementAtEnd(n2);
        linkedList.addElementAtEnd(n3);
        linkedList.addElementAtEnd(n4);

        System.out.println("Antiga Lista:");
        linkedList.getLinkedList();

        System.out.print("Tamanho da lista antes de limpar: ");
        System.out.println(linkedList.getSize());
        linkedList.clearList();
        System.out.print("Tamanho da lista pós limpeza: ");
        System.out.println(linkedList.getSize());

        linkedList.addElementAtEnd(1);
        linkedList.addElementAtEnd(4);
        linkedList.addElementAtEnd(8);
        linkedList.addElementAtStart(45);
        System.out.println("_____________________________\nNova lista: ");
        linkedList.getLinkedList();

        var searchedNode = linkedList.getNodeAtIndex(0);
        System.out.println("-------------------------\nValor buscado: " + searchedNode.getValue());

        linkedList.addAtAnyIndex(5, 1);
        System.out.println("------------------\nLista adicionando a qualquer index:");
        linkedList.getLinkedList();

        System.out.println("----------------------\nTestando se elemento esta na Linked List: " + linkedList.elementExists(8));
        System.out.println("Testando se elemento esta na Linked List: " + linkedList.elementExists(57));
        System.out.println("Tamanho da Lista: " + linkedList.getSize());
        System.out.println("ELemento removido: " + linkedList.removeAtIndex(4));
        System.out.println("Elemento removido pelo valor: " + linkedList.removeIfContains(45));
        linkedList.getLinkedList();
    }
}
