package HashClass;
/**
 * 
 * @author Shravya P
 *
 * @param <K>key of the hash map
 * @param <V>value of the hash map
 */
public class MyMapNode<K,V> implements INode<K> {
	K key;
	V value;
	MyMapNode<K,V> next;
	public MyMapNode(K key,V value)
	{
		this.key=key;
		this.value=value;
		next=null;
	}
	@Override
	public K getKey()
	{
		return key;
	}
	@Override
	public void setKey(K key)
	{
		this.key=key;
	}
	@Override
	public INode<K> getNext()
	{
		return next;
	}
	@Override
	public void setNext(INode<K> next)
	{
		this.next=(MyMapNode<K,V>)next;
	}
	
	public V getValue()
	{
		return this.value;
	}
	public void setValue(V value)
	{
		this.value=value;
	}
	public String toString() {
		StringBuilder myNodeString = new StringBuilder();
		myNodeString.append("MyMapNode{" + "key=").append(this.key).append("value= ").append(this.value).append('}');
		if(next != null) {
			myNodeString.append("->").append(next);
		}
		return myNodeString.toString();
	}	

}
