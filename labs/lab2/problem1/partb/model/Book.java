package lab2.problem1.partb.model;

public class Book extends LibraryItem {

    private int numberOfPages;

    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.numberOfPages = pages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInfo() {
        System.out.println("book information:");
        System.out.println(toString());
        System.out.println("pages: " + numberOfPages);
    }

    @Override
    public String toString() {
        return super.toString() + ", pages: " + numberOfPages;
    }
}
