package HashClass;
/**
 * to perform the operations of hash map
 * @author Shravya P
 * @param <K>key of the hash map
 * @param <V>value of the hash map
 */
public class MyHashMap<K,V> {
	MyLinkedList<K> myLinkedList;
	
	public MyHashMap() {
		this.myLinkedList=new MyLinkedList<>();
	}
	public V get(K key)
	{
		MyMapNode<K, V> myMapNode=(MyMapNode<K,V>) this.myLinkedList.search(key);
		return (myMapNode==null)?null:myMapNode.getValue();
	}
	public void add(K key,V value)
	{
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>) this.myLinkedList.search(key);
		if(myMapNode==null)
		{
			myMapNode=new MyMapNode<>(key,value);
			this.myLinkedList.append(myMapNode);
		}
		else
		{
			myMapNode.setValue(value);
		}
	}
	@Override
	public String toString() {
		return "MyHashNodes{" + myLinkedList.printMyNodes() + '}';
	}
	
	

}
