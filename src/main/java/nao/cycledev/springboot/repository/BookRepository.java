package nao.cycledev.springboot.repository;

import nao.cycledev.springboot.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {

    List<Book> findByReader(String reader);

}
