package huncho.com.BookApp.services;

import huncho.com.BookApp.entity.Book;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface BookServices {
    public Optional<Book> findBookById(long id);
    public Book saveBook (Book book);
}
