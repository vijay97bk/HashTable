package HashTable;

//UC1 

public class MyMapNode<K, V> implements INode<K> {
	K key;
	V value;
	MyMapNode<K, V> next;

	//Constructor
	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	//To get key
	@Override
	public K getKey() {
		return key;
	}

	//To set key
	@Override
	public void setKey(K key) {
		this.key = key;
	}

	//To get next
	@Override
	public INode<K> getNext() {
		return next;
	}
	
	//To get value
	public V getValue() {
		return this.value;
	}

	//To set Value
	public void setValue(V value) {
		this.value = value;
	}

	//To set next
	@Override
	public void setNext(INode<K> next) {
		this.next = (MyMapNode<K, V>) next;
	}	

	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{" + "K=").append(key).append("V=").append(value).append('}');
		if (next != null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}
}

