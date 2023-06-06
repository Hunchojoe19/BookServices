package huncho.com.BookApp.controller;

import huncho.com.BookApp.entity.Book;
import huncho.com.BookApp.repository.BookRepository;
import huncho.com.BookApp.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/book")
public class BookController {

    @Autowired
    BookServices bookServices;

    @PostMapping("/add_book")
    public Book addBook (@RequestBody Book book){
        return bookServices.saveBook(book);
    }

    @GetMapping("/get_book/{id}")
    public Optional <Book> getBook (@PathVariable long id){
        return bookServices.findBookById(id);
    }
}
