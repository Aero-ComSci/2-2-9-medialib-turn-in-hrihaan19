public class MediaLibRunner
{
    public static void main(String[] args)
    {
        MediaLib myLib1 = new MediaLib();
        MediaLib myLib2 = new MediaLib();

        myLib1.addBook("Harry Potter: The Goblet of Fire", "J.K. Rowling");
        myLib1.addMovie("Red Notice", 1.58);
        myLib1.addSong("One Kiss");

        myLib2.addBook("1953", "Ray Bradbury");
        myLib2.addMovie("Hustle", 1.58);
        myLib2.addSong("Yukon");

        System.out.println("Library 1:");
        System.out.println(myLib1);

        System.out.println("Library 2:");
        System.out.println(myLib2);

        System.out.println("Total entries: " + MediaLib.getNumEntries());
        System.out.println("Books: " + MediaLib.getNumBooks());
        System.out.println("Movies: " + MediaLib.getNumMovies());
        System.out.println("Songs: " + MediaLib.getNumSongs());
    }
}
