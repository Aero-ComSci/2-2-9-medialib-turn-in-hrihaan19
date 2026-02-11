public class Book
{
    private String title;
    private String author;
    private int rating;

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
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
        return "title: " + title + ", author: " + author + ", rating: " + rating;
    }
}
