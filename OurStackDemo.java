
public class OurStackDemo {

	public static void main(String[] args) {
		StackInterface<String> stringStack = new OurStack<>();
		stringStack.push("jim");
		stringStack.push("beam");
		stringStack.push("jack");
		stringStack.push("daniels");
		stringStack.push("Jameson");
		
		String top = stringStack.peek();
		System.out.println(top);
		top = stringStack.pop();
		System.out.println(top);
		top = stringStack.pop();
		System.out.println(top);

	}

}
