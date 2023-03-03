import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publishYear;

    public Book (String name, Author author, int publishYear){
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && name.equals(book.name) && author.getFirstName().equals(book.author.getFirstName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publishYear, author);
    }

    @Override
    public String toString() {
        return "Книга: " + name + "; " + author.toString() + "; год издания: " + publishYear;
    }
}
