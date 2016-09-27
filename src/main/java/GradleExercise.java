public class GradleExercise {

	public static void main(String[] args){
		if(args[2] != (int)args[2]){
			System.out.println("Second argument must be a 32-bit int.");
			System.exit(2);		
		}
		if(args[1].equals("triangle"){
			System.out.println(triangle(args[2]));
		}
		else if(args[1].equals("lazy"){
			System.out.println(lazy(args[2]));			
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