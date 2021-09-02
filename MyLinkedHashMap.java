package HashClass;
import java.util.ArrayList;
/**
 * to perform the operations of hash table
 * @author Shravya P
 * @param <K>key of the hash map
 * @param <V>value of the hash map
 */
public class MyLinkedHashMap<K,V> {
	private final int numBuckets;
	ArrayList<MyLinkedList<K>> myBucketArray;
	MyLinkedList<K>  myLinkedList;
	public MyLinkedHashMap()
	{
		this.numBuckets=10;
		this.myBucketArray=new ArrayList<>(numBuckets);
		for(int i=0;i<numBuckets;i++)
		{
			this.myBucketArray.add(null);
		}
	}
	/**
	 * to get the index of the key
	 * @param key key whose index you want
	 * @return index
	 */
	private int getBucketIndex(K key)
	{
		int hashCode=Math.abs(key.hashCode());
		int index=hashCode%numBuckets;
		return index;
	}
	public V get(K key)
	{
		int index=this.getBucketIndex(key);
		myLinkedList=this.myBucketArray.get(index);
		if(myLinkedList==null) return null;
		@SuppressWarnings("unchecked")
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>) myLinkedList.search(key);
		return (myMapNode==null)?null:myMapNode.getValue();	
	}
	public void add(K key,V value)
	{
		
		int index=this.getBucketIndex(key);
		 myLinkedList=this.myBucketArray.get(index);
		if(myLinkedList==null)
		{
			myLinkedList=new MyLinkedList<>();
			this.myBucketArray.set(index, myLinkedList);
		}
		@SuppressWarnings("unchecked")
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>) myLinkedList.search(key);
		if(myMapNode==null)
		{
			myMapNode=new MyMapNode<>(key,value);
			myLinkedList.append( myMapNode);
		}
		else
		{
			myMapNode.setValue(value);
		}
	}
	@Override
	public String toString()
	{
		return "MyLinkedHashMap{" + myLinkedList.printMyNodes() + '}';
	}

}
