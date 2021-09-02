package HashClass;
/**
 * test class to perform the operations of hash map
 * @author Shravya P
 *
 */
public class MyHashMapTest {

	public static void main(String[] args) {
		String sentence="To be or not to be";

		MyHashMap<String,Integer>myLinkedHashMap=new MyHashMap<>();
		String[] words=sentence.toLowerCase().split(" ");
		for(String word:words)
		{
			System.out.println(word);
			Integer value=myLinkedHashMap.get(word);
			if(value==null) value=1;
			else
				value=value+1;
			myLinkedHashMap.add(word,value);
		}
		System.out.println(myLinkedHashMap);
		int frequency=myLinkedHashMap.get("to");
		
		System.out.println("frequency of to is "+frequency);

	}

}
