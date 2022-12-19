package seanx63.graphQLExample;

import java.util.Arrays;
import java.util.List;

public class Book {
	private String id;
    private String name;
    private int pageCount;
    private String authorId;

    public Book(String id, String name, int pageCount, String authorId) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.authorId = authorId;
    }

    private static List<Book> books = Arrays.asList(
            new Book("book-1", "The Peregrine", 208, "author-1"),
            new Book("book-2", "The Brothers Karamazov", 824, "author-2"),
            new Book("book-3", "Crash", 224, "author-3")
    );

    public static Book getById(String id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }
}
