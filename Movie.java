/*
 * Activity 2.5.7
 * 
 * A Movie class for the MediaLibrary program
 */
public class Movie
{
  private String title;
  private double duration;
  private int rating;

  /*** Constructor ****/
  public Movie(String t, double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }

   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }

  public int getRating() {
    return rating;
  }

  public String toString() 
  {
    String info = "\"" + title + "\", with duration of " + duration;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Movie m) {
    if(this.title.equals(m.title) && (this.duration == m.duration)) {
      return true;
    } 
    return false;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double d) {
    duration = d;
  }

  public int adjustRating(int r) {
    rating += r;
    if (rating > 10 || rating < 0) {
      rating -= r;
  }
    return rating;
}
}
