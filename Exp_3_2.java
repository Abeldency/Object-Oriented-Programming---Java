import java.util.Scanner; 
public class Exp_3_2 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a paragraph: "); 
		String input = sc.nextLine();
		String vowels = "aeiouAEIOU";
		StringBuilder vowelList = new StringBuilder(); 
		StringBuilder consonantList = new StringBuilder(); 
		int vowelCount = 0, consonantCount = 0;
	
		for (int i = 0; i < input.length(); i++) { 
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				if (vowels.indexOf(ch) != -1) { 
					vowelList.append(ch).append(", "); 
					vowelCount++;
				} else {
					consonantList.append(ch).append(", "); consonantCount++;
					}
			}
	
		}
	
		System.out.println("Vowels are: " + vowelList.toString() + "Total = " + vowelCount); 
		System.out.println("Consonants are: " + consonantList.toString() + "Total = " + consonantCount); 
		sc.close();
	}
}
