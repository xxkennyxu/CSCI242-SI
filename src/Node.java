
public class Node {

	private Node rightChild;
	private Node leftChild;
	private int value;
	public Node( int value, Node c1, Node c2){
		this.rightChild = c1;
		this.leftChild = c2;
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	public void setRight(Node r){
		this.rightChild = r;
	}
	public void setLeft(Node l){
		this.leftChild = l;
	}
	
	public Node getRight() {
		return this.rightChild;
	}
	
	public Node getLeft() {
		return this.leftChild;
	}
}
