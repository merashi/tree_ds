package main;

public class Tree {
    protected static class Node {
        protected int data;
        protected Node leftchild;
        protected Node rightchild;

        public Node(int data){
            this.data = data;
            this.leftchild = null;
            this.rightchild = null;
        }
    }
    protected Node root;
    public Tree(){
                this.root = null;
    }
    protected Tree(Node root){
        this.root = root;
    }
    public Tree(int data, Tree leftTree, Tree rightTree){
        this.root = new Node(data);
        if(leftTree != null){
            this.root.leftchild = leftTree.root;
        }
        else {
            this.root.leftchild = null;
        }
        if(rightTree != null){
            this.root.rightchild = rightTree.root;
        }
        else {
            this.root.rightchild = null;
        }
    }
    public Tree getLeftSubtree() {
        if (root != null && root.leftchild != null) {
            return new Tree(root.leftchild);
        } else {
            return null;
        }
    }

    public Tree getRightSubtree() {
        if (root != null && root.rightchild != null) {
            return new Tree(root.rightchild);
        } else {
            return null;
        }
    }

    public boolean isLeaf(){
        return (root.leftchild == null && root.rightchild == null);
    }

    public boolean isLeaf(Node node){
        return (node.leftchild == null && node.rightchild == null);
    }

    private boolean isNullTree(){
        boolean response = false;
        if(this.root == null){
            response = true;
        }
        return response;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(root,1,sb);
        return sb.toString();
    }
    private void toString(Node node, int depth, StringBuilder stringBuilder){
        for (int i = 0; i < depth; i++) {
            stringBuilder.append(" - - ");
        }
        if(node == null){
            stringBuilder.append("null\n");
        }
        else{
            stringBuilder.append(node.toString());
            stringBuilder.append("\n");
            toString(node.leftchild, depth+1, stringBuilder);
        }
    }
}
