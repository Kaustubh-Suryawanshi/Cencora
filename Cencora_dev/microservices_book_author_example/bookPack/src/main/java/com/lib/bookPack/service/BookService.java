package com.lib.bookPack.service;


import com.lib.bookPack.entity.Book;
import com.lib.bookPack.repository.BookRepo;
import com.lib.bookPack.response.BookResponse;
import org.apache.catalina.LifecycleState;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;

    @Autowired
    private ModelMapper modelMapper;

    public BookResponse findBooksById(int id){
        List<Book> books= bookRepo.findBooksByAuthorId(id);
        BookResponse bookResponse= modelMapper.map(books,BookResponse.class);
        return bookResponse;
    }
}
