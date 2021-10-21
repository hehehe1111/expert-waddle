import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> implements StackInterface<T> {

	private T[] stack; // Array of stack entries
	private int topIndex; // Index of top entry
	private boolean integrityOK = false;
	private static final int DEFAULT_CAPACITY = 50;
	private static final int MAX_CAPACITY = 10000;
	
	public ArrayStack()
	{
		
	this(DEFAULT_CAPACITY);
	} 
	public ArrayStack(int initialCapacity)
	{
	integrityOK = false;
	checkCapacity(initialCapacity);
	// The cast is safe because the new array contains null entries
	@SuppressWarnings("unchecked")
	T[] tempStack = (T[])new Object[initialCapacity];
	stack = tempStack;
	topIndex = -1;
	integrityOK = true;
	}
	
	private void checkCapacity(int Capacity) {
		if(Capacity > MAX_CAPACITY) {
			throw new IllegalStateException("no");
		}
		
	}
	@Override
	public void push(T newEntry) 
		{
			checkIntegrity();
			ensureCapacity();
			stack[topIndex + 1] = newEntry;
			topIndex++;

	}

	private void checkIntegrity() {
		if(!integrityOK)throw new SecurityException();
		
	}
	private void ensureCapacity() {
		if (topIndex >= stack.length - 1) // If array is full, double its size
		{
		int newLength = 2 * stack.length;
		checkCapacity(newLength);
		stack = Arrays.copyOf(stack, newLength);
		} 
		
	}
	@Override
	public T pop() {
		checkIntegrity();
		if (isEmpty())
		throw new EmptyStackException();
		else
		{
		T top = stack[topIndex];
		stack[topIndex] = null;
		topIndex--;
		return top;
		} // end if
	}

	@Override
	public T peek() {
		checkIntegrity();
		if (isEmpty())
		throw new EmptyStackException();
		else
		return stack[topIndex];
	}

	@Override
	public boolean isEmpty() {
		
      return topIndex < 0;
	}

	@Override
	public void clear() {
		checkIntegrity();
		while(topIndex > -1) {
			stack[topIndex]= null;
			topIndex--;
		}
	}

}
