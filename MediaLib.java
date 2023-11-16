public class MediaLib
{
  private Book book;
  public static String owner = "PLTW";
  private static int numEntries;

  public void addBook(Book b)
  {
  book = b;
  numEntries += 1;
  }


  /*
  public void testBook(Book tester)
  {
  tester.setTitle("Animal Farm");
  // show state chagne with one of the following
  System.out.println(" in test: " + tester);
  System.out.println(" in test: " + tester.getTitle());
  }
  */

  public String toString()  
  {
  String info = "";
  if (book != null)
    info += "Book: " + book + "\n";

  return info;
  }

  public static String getOwner() {
    return owner;
  }

  /*
  public static void changeOwner(String newOwner) {
    owner = newOwner;
}
  */

  public static int getNumEntries() {
    return numEntries;
  }
}
