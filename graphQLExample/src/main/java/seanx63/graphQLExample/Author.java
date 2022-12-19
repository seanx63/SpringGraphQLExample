package seanx63.graphQLExample;

import java.util.Arrays;
import java.util.List;

public class Author {
	private String id;
    private String firstName;
    private String lastName;

    public Author(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private static List<Author> authors = Arrays.asList(
            new Author("author-1", "J. A.", "Baker"),
            new Author("author-2", "Fyodor", "Dostoevsky"),
            new Author("author-3", "J. G.", "Ballard")
    );

    public static Author getById(String id) {
        return authors.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }
}
