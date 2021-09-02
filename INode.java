package HashClass;
/**
 * Interface for defining a node 
 * @author Shravya P
 * @param <K> key of integer type
 */
public interface INode<K>{
	K getKey();
	void setKey(K key);
	INode<K> getNext();
	void setNext(INode<K> next);

}