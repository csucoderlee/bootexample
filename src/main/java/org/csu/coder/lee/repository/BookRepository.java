package org.csu.coder.lee.repository;

import org.csu.coder.lee.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by lixiang on 2017 09 24 23:20.
 */
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);
}
