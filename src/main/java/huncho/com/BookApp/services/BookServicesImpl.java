package huncho.com.BookApp.services;

import huncho.com.BookApp.entity.Book;
import huncho.com.BookApp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServicesImpl implements BookServices{
    @Autowired
    BookRepository bookRepository;
    @Override
    public Optional<Book> findBookById(long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
