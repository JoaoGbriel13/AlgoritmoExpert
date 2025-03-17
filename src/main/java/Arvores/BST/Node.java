package Arvores.BST;

class Node<K>{
    private K value;
    private Node<K> left;
    private Node<K> right;
    private Node<K> parent;

    public Node(K value, Node<K> parent) {
        this.value = value;
        this.parent = parent;
        this.left = null;
        this.right = null;
    }
    public boolean isSentinel(){
        return this.value == null;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }

    public Node<K> getLeft() {
        return left;
    }

    public void setLeft(Node<K> left) {
        this.left = left;
    }

    public Node<K> getRight() {
        return right;
    }

    public void setRight(Node<K> right) {
        this.right = right;
    }

    public Node<K> getParent() {
        return parent;
    }

    public void setParent(Node<K> parent) {
        this.parent = parent;
    }
}
