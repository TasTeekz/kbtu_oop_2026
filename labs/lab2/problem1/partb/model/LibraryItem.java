package labs.lab2.problem1.partb.model;

public abstract class LibraryItem {

    private String title, author;
    private int publicationYear;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }

    public abstract void displayInfo();

    @Override
    public String toString() {
        return "Title: " + title +
                ", Author: " + author +
                ", Year: " + publicationYear;
    }
}
