public class GradleExercise {

	public static void main(String[] args){
		try
		{
			Integer.parseInt(args[1]);
		}
		catch (NumberFormatException ex)
		{
			System.out.println("Second argument must be a 32-bit int.");
			System.exit(2);
		}		
		if(args[0].equals("triangle")){
			System.out.println(triangle(Integer.parseInt(args[1])));
		}
		else if(args[0].equals("lazy")){
			System.out.println(lazy(Integer.parseInt(args[1])));			
		}
		else{
			System.out.println("First argument must be \"lazy\" or\"triangle\".");
			System.exit(1);
		}
	}
	
	public static int triangle(int n){
		int sum = 0;
		for(int i = n; i > 0; i--){
			sum += i;
		}
		return sum;
	}
	
	public static int lazy(int n){
		return (n * n + n + 2) / 2;		
	}

}