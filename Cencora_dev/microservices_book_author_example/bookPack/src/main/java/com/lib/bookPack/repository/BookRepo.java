package com.lib.bookPack.repository;

import com.lib.bookPack.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
    @Query(nativeQuery = true, value="select b.book_id,b.book_title,a.author_name from library.books b join library.authors a on b.author_id=a.author_id where b.author_id=:authorId;")
    List<Book> findBooksByAuthorId(@Param("authorId") int authorId);
}
