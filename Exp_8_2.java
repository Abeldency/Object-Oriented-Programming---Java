import java.util.Scanner;


class EvenThread extends Thread { private int[] numbers;

public EvenThread(int[] numbers) { this.numbers = numbers;
}


public void run() { try {
for (int num : numbers) { if (num % 2 == 0) {
System.out.println("Even: " + num);

Thread.sleep(2000);
}
}
} catch (InterruptedException e) { System.out.println("Even thread interrupted.");
}
}
}


class OddThread extends Thread { private int[] numbers;

public OddThread(int[] numbers) { this.numbers = numbers;
}


public void run() { try {
for (int num : numbers) { if (num % 2 != 0) {
System.out.println("Odd: " + num); Thread.sleep(2000);
}
}

} catch (InterruptedException e) { System.out.println("Odd thread interrupted.");
}
}
}


public class Exp_8_2 {
public static void main(String[] args) { Scanner scanner = new Scanner(System.in); int[] numbers = new int[10];

System.out.println("Enter 10 numbers:"); for (int i = 0; i < 10; i++) {
System.out.print("Enter number " + (i + 1) + ": "); numbers[i] = scanner.nextInt();
}


Thread t1 = new EvenThread(numbers); Thread t2 = new OddThread(numbers);

t1.start();
t2.start(); scanner.close();
}

}
