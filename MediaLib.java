// Harini Suresh
/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  public static String owner = "PLTW";
  private static int numEntries;
  private static int numBookEntries;
  private static int numMovieEntries;
  private static int numSongEntries;

  private String date = LastModified.getDateTime();

  public void addBook(Book b)
  {
    if (book == null && b != null) {
      book = b;
      numEntries ++;
      numBookEntries ++;
      date = LastModified.getDateTime();
    }
    else {
      System.out.println("Sorry, you can't add " + b);
    }
  }

  public void changeBook(Book b) {
    book = b;
    date = LastModified.getDateTime();
  }

  public void addMovie(Movie m)
  {
    if (movie == null && m != null) {
      movie = m;
      numEntries ++;
      numMovieEntries ++;
      date = LastModified.getDateTime();
    }
    else {
      System.out.println("Sorry, you can't add " + m);
    }
  }

  public void changeMovie(Movie m) {
    movie = m;
    date = LastModified.getDateTime();
  }

  public void addSong(Song s)
  {
    if (song == null && s != null) {
      song = s;
      numEntries ++;
      numSongEntries ++;
      date = LastModified.getDateTime();
    }
    else {
      System.out.println("Sorry, you can't add " + s);
    }
  }

  public void changeSong(Song s) {
    song = s;
    date = LastModified.getDateTime();
  }


  
  public String toString() 
  {
  StringBuilder mediaInfo = new StringBuilder();

    if (book != null) {
      mediaInfo.append(book.toString()).append("\n");
    }
    if (movie != null) {
      mediaInfo.append(movie.toString()).append("\n");
    }
    if (song != null) {
      mediaInfo.append(song.toString()).append("\n");
    }
    return mediaInfo.toString();
  }

  // public void testBook(Book tester) { 
  //   tester.setTitle("test");
  //   System.out.println(tester);
  // }

  public String getDate() {
    return date;
  }
  
  /*** Static Methods ****/
  public static String getOwner() {
    return owner;
  }

  public static void changeOwner(String o) {
    owner = o;
  }

  public static int getNumEntries() {
    return numEntries;
  }

  public static int getNumBookEntries() {
    return numBookEntries;
  }

  public static int getNumMovieEntries() {
    return numMovieEntries;
  }

  public static int getNumSongEntries() {
    return numSongEntries;
  }
  
}
