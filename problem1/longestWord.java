import java.util.*;
//By Richard Cowans 
public class longestWord{
	public static void main(String args[]){
		//print to console
		System.out.println("Enter a string to find the longest word");
		//take in string
		Scanner x = new Scanner(System.in);
		String go = x.nextLine();
		//run method and then print word
		String boom = checker(go);
		System.out.println(boom);
	}

	static String checker(String word){
		//intializing Data
		int j = 0;
		int i = 0;
		int sum_main=0;
		int current_sum=0;
		int index=0;
		//splitting string by spaces
		String[] fun = word.split(" ");
		//going through array of split strings
		for (i = 0;i < fun.length; i++){
			current_sum = 0;
			//going through characters of a string at index i
			for (j = 0; j < fun[i].length(); j++){
				//setting char variable
				char set = fun[i].charAt(j);
				//checking and incrementing if possible
				if(  set <= 'Z'  && set >= 'A' || set <= 'z' && set >= 'a')
					current_sum++;					
			//checking to see if bigger
			if (current_sum > sum_main){
				sum_main = current_sum;
				index = i;
				}
			}
		}
		//returning
		return fun[index];	
	}
}
