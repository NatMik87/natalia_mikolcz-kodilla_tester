public class Book {
    private String author;
    private  String title;

    public Book (String author , String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        return new Book(author, title);
    }

    public static void main(String[] args) {
        Book romans = Book.of("R.Smith", "Love");
        Book criminal = Book.of("K.Bobson", "Scare");
        Book sifi = Book.of("R.NNowak", "Alien");

        System.out.println(romans.author +" " + romans.title);
    }
}
