
public class secondproject {

	
	private static int[] numbers = {2,10,30,15,30,15,2};
	
	public static void main(String[] args) {

		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] == 30 || numbers[i] == 15)
					System.out.println(numbers[i]);
			else
					System.out.println("not equal to 30 or 15");
		}
		
		
	}

}
