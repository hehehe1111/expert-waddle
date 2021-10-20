public static void main(String[] args) {
		StackInterface<String> stringStack = new LinkedStack<>();
		StackInterface<Integer> integerStack = new ArrayStack<>();

		stringStack.push("A");
		stringStack.push("B");
		stringStack.push("C");
		
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		
		
		System.out.println(stringStack.pop());
		System.out.println(integerStack.pop());
		
	}

}
