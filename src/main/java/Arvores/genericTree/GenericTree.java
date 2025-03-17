package Arvores.genericTree;

import javax.management.AttributeNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class GenericTree<T> {
    private Node<T> root;
    private int size;

    public GenericTree() {
        this.root = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public Position<T> root(){
        return this.root;
    }
    public boolean isExternal(Position<T> position){
        Node<T> node = validate(position);
        return node.getChildren().isEmpty();
    }
    public boolean isRoot(Position<T> position){
        Node<T> node = validate(position);
        return this.root == node;
    }
    public Position<T> parent(Position<T> position){
        Node<T> node = validate(position);
        return node.getParent();
    }
    public List<T> elements(){
        List<T> elements = new ArrayList<>();
        collectElements(elements, root);
        return elements;
    }

    private void collectElements(List<T> list, Node<T> node){
        list.add(node.element());
        for (Node<T> child : node.getChildren()){
            collectElements(list, child);
        }
    }

    public Position<T> find(T node){
        return this.findRecursive(this.root, node);
    }

    private Position<T> findRecursive(Node<T> node, T target) {
        if (node == null){
            return null;
        }
        if (node.element() == target){
            return node;
        }
        for (Node<T> child : node.getChildren()){
            var found = this.findRecursive(child, target);
            if (found != null){
                return found;
            }
        }
        return null;
    }

    public Position<T> add(T element, Position<T> parent){
        if (!isEmpty() && parent == null){
            throw new IllegalArgumentException("Parent position cant be null in a non empty tree");
        }
        Node<T> parentNode = parent == null ? null : validate(parent);
        Node<T> newNode = new Node<>(element, parentNode);
        if (parent == null){
            this.root = newNode;
        }else {
            parentNode.addChild(newNode);
        }
        size++;
        return newNode;
    }
    public List<Position<T>> children(Position<T> position){
        Node<T> node = validate(position);
        return new ArrayList<>(node.getChildren());
    }
    private Node<T> validate(Position<T> position){
        if (!(position instanceof Node<T>)){
            throw new IllegalArgumentException("Invalide position type");
        }
        Node<T> node = (Node<T>) position;
        if (node.getParent() == node){
            throw new IllegalArgumentException("Position is no longer in the tree");
        }
        return node;
    }
    public void replace(Position<T> position, T newElement){
        var node = validate(position);
        node.setElement(newElement);
    }
    public void remove(Position<T> position){
        var node = validate(position);
        if (node == root){
            this.root = null;
        }else {
            var parent = node.getParent();
            if (parent != null) {
                parent.removeChild(node);
            }
        }
        this.size -= this.subTreeSize(node);
        this.markAsRemoved(node);
    }
    private void markAsRemoved(Node<T> node){
        node.setParent(node);
        for (var child : node.getChildren()){
            markAsRemoved(child);
        }
    }
    private int subTreeSize(Node<T> node){
        int childrenSize = 1;
        for (var child : node.getChildren()){
            childrenSize+= subTreeSize(child);
        }
        return childrenSize;
    }
}