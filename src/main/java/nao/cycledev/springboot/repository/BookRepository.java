package nao.cycledev.springboot.repository;

import nao.cycledev.springboot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);

}