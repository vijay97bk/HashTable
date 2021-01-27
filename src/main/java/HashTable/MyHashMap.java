package HashTable;

//UC1 

public class MyHashMap <K,V>{
	//Linked List Declaration
		MyLinkedList<K> myLinkedList;

		//Constructor
		public MyHashMap() {
			this.myLinkedList = new MyLinkedList<>();
		}

		//Method to get Key and Value
		public V get(K key) {
			MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
			return (myMapNode == null) ? null : myMapNode.getValue();
		}

		//Add method to add the frequency of words using key and value pair
		public void add(K key, V value) {
			MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
			if (myMapNode == null) {
				myMapNode = new MyMapNode<>(key, value);
				this.myLinkedList.append(myMapNode);
			} else {
				myMapNode.setValue(value);
			}
		}

		//To String method to print the frequency of words
		@Override
		public String toString() {
			return "MyHashMapNodes{" + myLinkedList + '}';
		}

	}
