package Arvores.BST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BinaryTree<K extends Comparable<K>> {
    private int size;
    private Node<K> root;

    public BinaryTree() {
        this.size = 0;
        this.root = new Node<>(null, null);
    }

    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    private Node<K> findKeyLocation(Node<K> node, K key){
        if (node == null || node.isSentinel()){
            return node;
        }

        int cmp = key.compareTo(node.getValue());

        if (cmp == 0) {
            return node;
        } else if (cmp < 0) {
            return findKeyLocation(node.getLeft(), key);
        } else {
            return findKeyLocation(node.getRight(), key);
        }
    }
    public void add(K key){
        if (key == null){
            throw new IllegalArgumentException("Key cant be null");
        }
        if (isEmpty()){
            this.root = new Node<>(key, null);
            this.root.setLeft(new Node<>(null, root));
            this.root.setRight(new Node<>(null, root));
            this.size++;
            return;
        }
        var node = findKeyLocation(this.root, key);
        if (node.isSentinel()){
            var parent = node.getParent();
            var newNode = new Node<>(key, parent);
            newNode.setLeft(new Node<>(null, newNode));
            newNode.setRight(new Node<>(null, newNode));

            if (node == parent.getLeft()){
                parent.setLeft(newNode);
            }
            else if (node == parent.getRight()){
                parent.setRight(newNode);
            }
            this.size++;
        }
    }
    public void addAll(Collection<K> collection){
        for (K col : collection){
            add(col);
        }
    }
    public boolean remove(K key){
        if (key == null){
            throw new IllegalArgumentException("Key cant be null");
        }
        var nodeToRemove = this.findKeyLocation(root, key);

        if (nodeToRemove.isSentinel()){
            return false;
        }
        if (!nodeToRemove.getLeft().isSentinel() && !nodeToRemove.getRight().isSentinel()){
            var sucessor = findMin(nodeToRemove.getRight());
            nodeToRemove.setValue(sucessor.getValue());
            nodeToRemove = sucessor;
        }

        var child = nodeToRemove.isSentinel() ? nodeToRemove.getRight() : nodeToRemove.getLeft();
        child.setParent(nodeToRemove.getParent());
        if (nodeToRemove.getParent() == null){
            this.root = child;
        } else if (nodeToRemove == nodeToRemove.getParent().getLeft()) {
            nodeToRemove.getParent().setLeft(child);
        }else {
            nodeToRemove.getParent().setRight(child);
        }
        return true;
    }
    public List<K> keys(){
        List<K> keys = new ArrayList<>();
        this.collectKeys(this.root, keys);
        return keys;
    }

    private void collectKeys(Node<K> node, List<K> keys) {
        if (!node.isSentinel()){
            this.collectKeys(node.getLeft(), keys);
            keys.add(node.getValue());
            this.collectKeys(node.getRight(), keys);
        }
    }
    private Node<K> findMin(Node<K> node){
        while (!node.getLeft().isSentinel()){
            node = node.getLeft();
        }
        return node;
    }
    public boolean contains(K key){
        var node = findKeyLocation(this.root, key);
        return node.getValue() == key;
    }
    @Override
    public String toString() {
        return keys().toString();
    }

    public String toStringFormat() {
        StringBuilder sb = new StringBuilder();
        toStringFormat(root, 0, sb);
        return sb.toString();
    }

    private void toStringFormat(Node<K> node, int depth, StringBuilder sb) {
        if (!node.isSentinel()) {
            toStringFormat(node.getRight(), depth + 1, sb);
            String space = (depth > 0) ? "  ".repeat(depth - 1) + "--" : "";
            String parent = (depth > 0) ? node.getParent().getValue().toString() : "";
            sb.append(space).append("(").append(node.getValue()).append(")").append(parent).append("\n");
            toStringFormat(node.getLeft(), depth + 1, sb);
        }
    }
}
