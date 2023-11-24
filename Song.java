// Harini Suresh
/*
 * Activity 2.5.7
 * 
 * A Song class for the MediaLibrary program
 */
public class Song
{
  private String title;
  private int rating;

  /*** Constructor ****/
  public Song(String t)
  {
    title = t;
    rating = 0;
  }

   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public int getRating() {
    return rating;
  }

  public String toString() 
  {
    String info = "" + title + "";
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Song s) {
    if(this.title.equals(s.title)) {
      return true;
    } 
    return false;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }
  

  public int adjustRating(int r) {
    rating += r;
    if (rating > 10 || rating < 0) {
      rating -= r;
  }
    return rating;
}
}
