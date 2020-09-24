package exercise.Optional.BinarySearchTree;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();

    public int getSize();

    public boolean search(E e);

    public void postorder();

    public void preorder();
}
