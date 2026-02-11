public class Song
{
    private String title;
    private int rating;

    public Song(String title)
    {
        this.title = title;
        rating = 0;
    }

    public int adjustRating(int r)
    {
        if (rating + r >= 0 && rating + r <= 10)
        {
            rating += r;
        }
        return rating;
    }

    public String toString()
    {
        return "title: " + title + ", rating: " + rating;
    }
}
