package org.csu.coder.lee.controller;

import org.csu.coder.lee.domain.Book;
import org.csu.coder.lee.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lixiang on 2017 09 24 23:24.
 */
@Controller
@RequestMapping("/")
public class BookController {

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(value="/{reader}", method=RequestMethod.GET)
    public String readersBooks(
            @PathVariable("reader") String reader,
            Model model) {
        List<Book> readingList =
                bookRepository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }

    @RequestMapping(value="/{reader}", method=RequestMethod.POST)
    public String addToReadingList(
            @PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        bookRepository.save(book);
        return "redirect:/{reader}";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Object getBook(String reader) {
        List<Book> readingList = bookRepository.findByReader(reader);
        return readingList;
    }
}
