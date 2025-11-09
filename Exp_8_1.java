import java.util.Scanner;

class WordThread implements Runnable { private String text;

public WordThread(String text) { this.text = text;
}


public void run() {
String[] words = text.split("\\s+");


try {
for (String word : words) { System.out.println("Word: " + word); Thread.sleep(2000);
}
} catch (InterruptedException e) { System.out.println("Word thread interrupted.");
}
}
}


class VowelThread implements Runnable { private String text;

public VowelThread(String text) { this.text = text;
}
public void run() { try {
for (char c : text.toCharArray()) {
char lowerC = Character.toLowerCase(c);
if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u') { System.out.println("Vowel: " + c);
Thread.sleep(2000);
}
}
} catch (InterruptedException e) { System.out.println("Vowel thread interrupted.");
}
}
}


public class Exp_8_1 {
public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
System.out.println("Enter a paragraph of text:"); String paragraph = scanner.nextLine();

Runnable wordTask = new WordThread(paragraph); Runnable vowelTask = new VowelThread(paragraph); Thread t1 = new Thread(wordTask);
Thread t2 = new Thread(vowelTask); t1.start();
t2.start(); scanner.close();
}
}
