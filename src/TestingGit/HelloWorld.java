package TestingGit;

public class HelloWorld {
	/*
	 * This is testing the Git Project
	 */
	/*
	 * Second Edit to push
	 */
	/*
	 * This edit
	 */
	
	public HelloWorld(){
		
	}
	public static void main(String[] args){
		int counter = 0;
		for(int i = 0; i<101;i++){
			for(int j = -99; j<101;j++){
				if(i == j*j){
					counter++;
					System.out.println(i + ":"+ j );
				}
			}	
		}
		//System.out.println(counter);
	}
	
}
