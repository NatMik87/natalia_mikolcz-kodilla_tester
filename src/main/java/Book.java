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
        Book romans = new Book("R.Smith", "Love");
        Book criminal = new Book("K.Bobson", "Scare");
        Book sifi = new Book("R.NNowak", "Alien");

        System.out.println(romans.author +" " + romans.title);
    }
}
