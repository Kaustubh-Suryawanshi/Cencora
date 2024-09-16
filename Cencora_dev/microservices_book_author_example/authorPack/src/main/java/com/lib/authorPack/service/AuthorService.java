package com.lib.authorPack.service;

import com.lib.authorPack.entity.Author;
import com.lib.authorPack.repository.AuthorRepo;
import com.lib.authorPack.response.AuthorResponse;
import com.lib.authorPack.response.BookResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepo  authorRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private WebClient webClient;

    public  AuthorResponse getBooksByAuthId(int authId) {
        BookResponse bookResponse;
        Author author=authorRepo.findById(authId).get() ;
        AuthorResponse authorResponse=modelMapper.map(author,AuthorResponse.class);
        bookResponse=webClient.get().uri("/book/"+authId).retrieve().bodyToMono(BookResponse.class).block();
        authorResponse.setBookResponse(bookResponse);
        return authorResponse;
    }
}
