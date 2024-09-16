package com.lib.bookPack.controller;

import com.lib.bookPack.repository.BookRepo;
import com.lib.bookPack.response.BookResponse;
import com.lib.bookPack.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookController {

    @Autowired
    BookService bookService;

    @GetMapping("/book/{id}")
    public ResponseEntity<BookResponse> getCustomerDetails(@PathVariable("id") int id){
        BookResponse customerResponse=bookService.findBooksById(id);
//        return ResponseEntity.status(HttpStatus.OK).body(customerResponse);
        return ResponseEntity.status(HttpStatus.CREATED).body(customerResponse);
    }
}
