import java.util.EmptyStackException;

public class LinkedStack<T> implements StackInterface<T> {

	private Node topNode;// References the first node in the chain
	
	public LinkedStack() {
		topNode = null;
	}
	@Override
	public void push(T newEntry) {
		Node newNode = new Node(newEntry, topNode);
		topNode = newNode;

	}

	@Override
	public T pop() {
		T top = peek(); // Might throw EmptyStackException
		// Assertion: topNode != null
		topNode = topNode.getNext();
		return top;
	}

	@Override
	public T peek() {
		if (isEmpty())
			throw new EmptyStackException();
			else
			return topNode.getData();
	}

	@Override
	public boolean isEmpty() {
		return topNode == null;
	}

	@Override
	public void clear() {
		topNode = null;

	}

	private class Node{
		private T data;
		private Node next;
		
		private Node (T dataPortion) {
			this(dataPortion,null);
		}
		private Node(T dataPortion, Node nextPortion) {
			data = dataPortion;
			next = nextPortion;
			
		}
		private T getData() {
			return data;
		}
		private void setData(T data) {
			this.data = data;
		}
		private Node getNext() {
			return next;
		}
		private void setNext(Node next) {
			this.next = next;
		}
		
	}
}
