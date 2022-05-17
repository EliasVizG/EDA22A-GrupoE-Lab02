//Implemente una clase Node donde T es un tipo genérico, esta clase debe contener al menos dos propiedades.

public class Node<T> {
	private T data;

	Node<T> nextNode;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}