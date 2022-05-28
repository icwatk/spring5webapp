package guru.springframework.spring5webapp.domain;

import java.util.Set;

public class Book {

    private String title;
    private String isbn;
    private Set<Author> authorSet;

    public Book(String title, String isbn, Set<Author> authorSet) {
        this.title = title;
        this.isbn = isbn;
        this.authorSet = authorSet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthorSet() {
        return authorSet;
    }

    public void setAuthorSet(Set<Author> authorSet) {
        this.authorSet = authorSet;
    }
}
