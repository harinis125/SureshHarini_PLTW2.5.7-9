// Harini Suresh
/*
 * Activity 2.5.9
 * 
 * A runner for the MediaLibrary program
 */
import java.util.Scanner;

public class MediaLibRunnerFinal
{
  public static void main(String[] args)
  {
    MediaLib myLib1 = new MediaLib();
    myLib1.addBook(new Book("1984", "Orwell"));
    System.out.println("Library1:\n" + myLib1);
    System.out.println("Last Modified: " +  myLib1.getDate());

     // wait a bit to get a new date
    System.out.println("\n Wait a second or two so Library 2 has a different time.");
    System.out.print("Press <ENTER> to continue... \n");
    Scanner s = new Scanner(System.in);
    String temp = s.nextLine();

    MediaLib myLib2 = new MediaLib();
    myLib2.addSong(new Song("In Your Eyes"));
    System.out.println("Library2:\n" + myLib2);
    System.out.println("Last Modified: " +  myLib2.getDate());

  }
}
