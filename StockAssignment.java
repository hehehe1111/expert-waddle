//hemanta parajuli
//submitted to Prof vohra 
//oct 10 2021
//data Structures



import java.util.Scanner;

public class StockAssignment {

	public static void main(String[] args) {
		StackInterface<String> stocksStack = new OurStack<>();
		StackInterface<Double> priceStack = new OurStack<>();
		StackInterface<Double> numberStack = new OurStack<>();
		Scanner input = new Scanner(System.in);
		String shareName;
		double sellShareN;
		double sellShareP;
		double netWorth = 0;
		double sharePrice = 0;
		double shareNumber = 0;
		System.out.println("How many Transaction do you want to make?");
		int number = input.nextInt();
				
		
			
		
		
		for (int i = 0; i < number; i++) {
			input.nextLine();
			System.out.println("Enter the name of stock on Number "+(i+1) );
			shareName = input.nextLine();
			
			System.out.println("number");
			shareNumber = input.nextDouble();
			
			

			System.out.println("price");
			sharePrice = input.nextDouble();
			
	
			netWorth = netWorth + (shareNumber*sharePrice);
			//Adding/Pushing the data in the stack
			stocksStack.push(shareName);
			priceStack.push(sharePrice);
			numberStack.push(shareNumber);
			
		}
		
		System.out.println("What do you want to do with your stocks? Enter 's' for Selling 'p' for peeking");
		String Answer = input.next();
		
		 switch (Answer.toLowerCase()) {
         case "s":
         stocksStack.pop();
         System.out.println("How many Shares?");   
         sellShareN = input.nextDouble();
         System.out.println("At what Price?");
         sellShareP = input.nextDouble();
         netWorth = netWorth - (sellShareN*sellShareP);
         double profit= (priceStack.pop() * sellShareN)- (sellShareN*sellShareP);
         System.out.println("You made Profit of +"+ profit);
        		 break;
         
         case "p":
           System.out.println(stocksStack.peek()+" is the Stock on Top and You got "+numberStack.peek()+" of those stock at price "+priceStack.peek() );
           System.out.println("Your NetWorth is "+ netWorth);
             break;
		
		 }
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
	

}
