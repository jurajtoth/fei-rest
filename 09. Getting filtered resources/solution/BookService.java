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
    
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getBooks(@RequestParam(value = "author", required = false) String author) {
        List<Book> allBooks = bookDatabase.getAllBooks();
        // if there is an author param in request
        if(author != null) {
            List<Book> booksToReturn = new ArrayList<>();
            for(Book book : allBooks) {
                if(book.getAuthor().equals(author)) {
                    booksToReturn.add(book);
                }
            }
            return booksToReturn;
        } else {
            return allBooks;
        }
    }
    
    @RequestMapping(value = "/books/{isbn}", method = RequestMethod.GET)
    public Book getSingleBook(@PathVariable("isbn") String isbn) {
        Book book = bookDatabase.getBook(isbn);
        if(book == null) {
            throw new NotFound404Exception("Requested book not found");
        }
        return book;
    }
    
    @RequestMapping(value = "/books/{isbn}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable("isbn") String isbn) {
        bookDatabase.removeBook(isbn);
    }
    
    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public void addBook(@RequestBody Book newBook) {
        boolean isBookInDatabase = bookDatabase.getBook(newBook.getIsbn()) != null;
        if(isBookInDatabase == true) {
            throw new Forbidden403Exception();
        } else {
            bookDatabase.addBook(newBook);
        }
    }
    
    @RequestMapping(value = "/books/{isbn}", method = RequestMethod.PUT)
    public void updateBook(@RequestBody Book updateBook, @PathVariable("isbn") String isbn) {
        Book bookToUpdate = bookDatabase.getBook(isbn);
        if(bookToUpdate == null) {
            throw new Forbidden403Exception();
        } else {
            bookToUpdate.setAuthor(updateBook.getAuthor());
            bookToUpdate.setIsbn(updateBook.getIsbn());
            bookToUpdate.setNumberOfPages(updateBook.getNumberOfPages());
            bookToUpdate.setTitle(updateBook.getTitle());
        }
    }
    
}
