package com.lib.authorPack.response;

public class AuthorResponse {
    private  int author_id;
    private String author_name;
    private BookResponse bookResponse;

    public BookResponse getBookResponse() {
        return bookResponse;
    }

    public void setBookResponse(BookResponse bookResponse) {
        this.bookResponse = bookResponse;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }
}
