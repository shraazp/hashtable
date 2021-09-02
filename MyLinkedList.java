package HashClass;

/**
 * class contains different operations for linked list
 * @author Shravya P
 * @version 16.0
 * @param <K> the data type of the elements of linked list
 */
public class MyLinkedList<K>  {
	public INode<K> head;
	public INode<K> tail;
	public MyLinkedList() {
		this.head = null;
		this.tail = null;	
	}
	/**
	 * this methods adds a new element to the linked list
	 * @param newNode the value of the  of new node
	 * @return nothing
	 */
	public void add(INode<K> newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			
			INode<K>tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
			sort();
		}
	}
	/**
	 * Method to sort the linked list
	 * @return nothing
	 */
	public void sort() {
		INode<K>current = this.head;
		INode<K>index=null;
		K temp;
	    if(this.head == null) {
	    	System.out.println("List is empty");
	    }
	    else
	    {
	        while(current != null)
	        {
	        	index = current.getNext();
	            while(index != null) {
	                    if((int)current.getKey()>(int)index.getKey()){
	                        temp = current.getKey();
	                        current.setKey(index.getKey());
	                        index.setKey(temp);
	                    }
	                    index = index.getNext();
	                }
	              current = current.getNext();
	          }
	     }
		
	}
	/**
	 * this method to append a new element to the linked list
	 * @param newNode the value of the  of new node
	 */
	public void append(INode<K> newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	/**
	 * this method helps to insert a new node after the required node
	 * @param myNode node after which new node should be inserted
	 * @param newNode new node created
	 * @return nothing
	 */
	public void insert(INode<K> myNode,INode<K> newNode) {
		INode<K> tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	/**
	 * method o delete the first element of the linked list
	 * @return new head
	 */
	public INode<K> pop(){
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	/**
	 * this method  is used to delete element from the last of linked list
	 * @return the element deleted
	 */
	public INode<K> popLast() {
		INode<K> curNode = head;
		INode<K> prevNode = null;
		while(curNode != null && curNode.getNext() != null) {
			prevNode = curNode;
			curNode = curNode.getNext();
		}
		prevNode.setNext(null);
		return curNode;
	}
	/**
	 * this method searches for an element in linked list
	 * @param Key the element which has to be started
	 * @return the node if element is present
	 */
	public INode<K> search(K Key) {
		INode<K> tempNode = head;
		while(tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(Key)){
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	/**
	 * this method deletes specified node
	 * first it searches for node then deletes it
	 * @param Key element which you want to delete
	 * @return head
	 */
	public INode<K> deleteSpecified(K Key) {
		
		if(head == null || head.getNext() == null) {
			return null;
		}
		INode<K> curNode = head;
		INode<K> prevNode = null;
		
		while(curNode != null && curNode.getKey() != Key) {
			prevNode = curNode;
			curNode = curNode.getNext();
		}
		prevNode.setNext(curNode.getNext());
		return head;
	}
	/**
	 * to count the number of elements
	 * @param head the head of linked list is sent
	 * @return number of nodes
	 */
	public int countNode(INode<K> head) {
		INode<K> tempNode = head;
		if(tempNode == null)
			return 0;
		if(tempNode.getNext() == null)
			return 1;
		int count = 0;
		while(tempNode != null && tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
			count++;
		}
		return count+1;
	
	}
	/**
	 * method to print the nodes of linked list
	 * @return entire linked list
	 */
	public String printMyNodes() {
		return "My Nodes: "+head;
	}
	
	
	
	
}
