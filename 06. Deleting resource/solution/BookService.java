package sk.fei.ci.fei.rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sk.fei.ci.fei.rest.db.Book;
import sk.fei.ci.fei.rest.db.BookDatabase;
import sk.fei.ci.fei.rest.httpstatuses.Forbidden403Exception;
import sk.fei.ci.fei.rest.httpstatuses.NotFound404Exception;

@RestController
public class BookService {
    
    private final BookDatabase bookDatabase = new BookDatabase();
    
    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public List<Book> getBooks() {
        List<Book> allBooks = bookDatabase.getAllBooks();
        return allBooks;
    }
    
    @RequestMapping(value = "/book/{isbn}", method = RequestMethod.GET)
    public Book getSingleBook(@PathVariable("isbn") String isbn) {
        Book book = bookDatabase.getBook(isbn);
        if(book == null) {
            throw new NotFound404Exception("Requested book not found");
        }
        return book;
    }
    
    @RequestMapping(value = "/book/{isbn}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable("isbn") String isbn) {
        bookDatabase.removeBook(isbn);
    }
    
}
