public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Panther panther = new Panther();

        tiger.sound();
        lion.sound();
        panther.sound();

        Library library = new Library();

        // Creating book instances
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "245");
        Book book3 = new Book("1984", "George Orwell", "5231");

        // Adding books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Displaying books in the library
        library.displayBooks();

        // Removing a book from the library
        library.removeBook(book2);

        // Displaying books in the library after removal
        library.displayBooks();


    }
}