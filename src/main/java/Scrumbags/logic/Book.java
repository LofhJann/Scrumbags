package Scrumbags.logic;


public class Book {
    String name;
    String author;
    String isbn;
    int pages;
    int year;
    
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.isbn = "---";
        this.pages = -1;
        this.year = -1;
    }
    
    public Book(String name, String author, String isbn, int pages, int year) {
        this.name = name;
        this.author = author;
        this.isbn = "---";
        this.pages = -1;
        this.year = -1;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "\nNimi: "+getName()+"\nKirjailija: "+getAuthor()+"\nISBN: "+getIsbn()+"\nSivumäärä: "+getPages()+"\n";
    }
    
    
}
