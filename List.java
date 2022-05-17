//Implemente una clase Node donde T es un tipo genérico, esta clase debe contener al menos dos propiedades.

public class List<T, K> {
	private T data;
	private K key;
	Node<T> root;

	public List(T data, K key) {
		this.data = data;
		this.key = key;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}
}