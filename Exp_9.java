import java.io.*; 
import java.util.*;

public class Exp_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n===== FILE MENU =====");
            System.out.println("1. Create a new file");
            System.out.println("2. Rename a file");
            System.out.println("3. Delete a file");
            System.out.println("4. Create a directory");
            System.out.println("5. Find absolute path of a file");
            System.out.println("6. Display all file names in a directory");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter file name to create: ");
                        String fname = sc.nextLine();
                        File f1 = new File(fname);
                        if (f1.createNewFile())
                            System.out.println("File created successfully!");
                        else
                            System.out.println("File already exists.");
                        break;

                    case 2:
                        System.out.print("Enter existing file name: ");
                        String oldName = sc.nextLine();
                        System.out.print("Enter new file name: ");
                        String newName = sc.nextLine();
                        File oldFile = new File(oldName);
                        File newFile = new File(newName);
                        if (oldFile.renameTo(newFile))
                            System.out.println("File renamed successfully!");
                        else
                            System.out.println("Rename operation failed.");
                        break;

                    case 3:
                        System.out.print("Enter file name to delete: ");
                        String delName = sc.nextLine();
                        File f3 = new File(delName);
                        if (f3.delete())
                            System.out.println("File deleted successfully!");
                        else
                            System.out.println("File not found or couldn't be deleted.");
                        break;

                    case 4:
                        System.out.print("Enter directory name to create: ");
                        String dirName = sc.nextLine();
                        File dir = new File(dirName);
                        if (dir.mkdir())
                            System.out.println("Directory created successfully!");
                        else
                            System.out.println("Directory already exists or failed to create.");
                        break;

                    case 5:
                        System.out.print("Enter file name: ");
                        String absName = sc.nextLine();
                        File absFile = new File(absName);
                        System.out.println("Absolute path: " + absFile.getAbsolutePath());
                        break;

                    case 6:
                        System.out.print("Enter directory name: ");
                        String listDir = sc.nextLine();
                        File folder = new File(listDir);
                        if (folder.isDirectory()) {
                            String[] files = folder.list();
                            System.out.println("Files in directory:");
                            for (String file : files) {
                                System.out.println(file);
                            }
                        } else {
                            System.out.println("Not a valid directory.");
                        }
                        break;

                    case 7:
                        System.out.println("Exiting program...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again!");
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
