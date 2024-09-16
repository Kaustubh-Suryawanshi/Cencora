package com.lib.authorPack.controller;

import com.lib.authorPack.response.AuthorResponse;
import com.lib.authorPack.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @GetMapping("/author/{auth_id}")
    public ResponseEntity<AuthorResponse> getBookDetails(@PathVariable("auth_id") int auth_id){
        AuthorResponse authorResponse=authorService.getBooksByAuthId(auth_id);
        return ResponseEntity.status(HttpStatus.CREATED).body(authorResponse);
    }
}
