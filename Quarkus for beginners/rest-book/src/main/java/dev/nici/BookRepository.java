package dev.nici;

import java.util.List;
import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.PathParam;
import org.jboss.logging.Logger;

@ApplicationScoped
public class BookRepository {
    @Inject
    Logger logger;
    public List<Book> getAllBooks() {
        logger.info("Repository: getAllBooks");

        return List.of(
                new Book(1, "testRepo", "Nici", 2024, "Horror"),
                new Book(2, "Buchibuch", "Nici", 2024, "Kinderbuch"),
                new Book(3, "Bibel", "Nici", 2024, "Liebesroman")
        );
    }

    public Optional<Book> getBook(@PathParam("id") int id){
        logger.info("Repository: getBook");
        return getAllBooks().stream().filter(book -> book.id == id).findFirst();
    }
}
