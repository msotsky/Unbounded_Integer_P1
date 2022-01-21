public class UnboundedInteger<T extends Integer> {

//_____________________________________ Node class
    private static class Node<T> 
    {
		private T data;
		private Node<T> next;
        
		public Node(T data){
			this.data = data;
			this.next = null;
		}
		
		public Node (T data, Node<T> next){
			this.data = data;
			this.next = next;
		}
		
		public T getData(){
			return this.data;
		}
		
		public void setData(T data){
			this.data = data;
		}
		
		public Node<T> getNext(){
			return this.next;
		}
		
		public void setNext(Node<T> node){
			this.next = node; 
		}

    }
    //_______________________________________________End of Node class
	private int size;
    private Node<T> head;

	public UnboundedInteger(){ //Constructor for unbounded integer (same as LL)
		size = 0;
		head = null;
    }
    public static UnboundedInteger<Integer> assignValue(String num)
	{
        //creates UnboundedInteger in LL form from a string
		int i = 0;
		UnboundedInteger<Integer> myList = new UnboundedInteger<>();
		if (num.charAt(0) == '-')
			i++;
		for(; i != num.length(); i++)
			myList.addFirst(Character.getNumericValue(num.charAt(i)));
		if (num.charAt(0) == '-')
			myList.addFirst(-1);
		else
			myList.addFirst(1);
		return myList;
    }
    public void addFirst(T item) {
		head = new Node<T>(item,head);
		size++;
	}
	
    public String toString() { 
	    T obj;
	    String result = "[  ";
	    Node<T> current = head;

	    while (current != null) {
	      obj = current.data;
	      result = result + obj.toString() + "  ";
	      current = current.next;
	    }
	    result = result + "]";
	    return result;
      }

    //extra useful LL methods
    public int getsize(){
		return size;
	}

	public boolean isEmpty(){
		return head ==null;
	}

	public T remove(){
		if (isEmpty()) {
			return null;
		}
		else{
			T element = head.getData();
			head = head.getNext();
			return element;
		}
    }
}