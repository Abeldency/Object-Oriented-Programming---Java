import java.util.Scanner; 
public class Exp_3{
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a word or phrase: "); 
        String input = sc.nextLine();
        String lowerInput = input.toLowerCase(); 
        if (hasUniqueCharacters(lowerInput)) {
            System.out.println("Output: PERFECT");
        } else {
            System.out.println("Output: NOT PERFECT");
            char repeatedChar = findFirstRepeatedChar(lowerInput);
            System.out.println("[Reason: \"" + input + "\" has '" + repeatedChar + "' as repeating character]");
        }
        sc.close();
    }
    public static boolean hasUniqueCharacters(String str) { 
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            if (charSet[ch]) return false; 
            charSet[ch] = true;
        }
        return true;
    }


    public static char findFirstRepeatedChar(String str) { 
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < str.length(); i++) { char ch = str.charAt(i);
        if (ch == ' ') continue;
        if (charSet[ch]) return ch; 
        charSet[ch] = true;
        }
        return ' ';
    }
}
