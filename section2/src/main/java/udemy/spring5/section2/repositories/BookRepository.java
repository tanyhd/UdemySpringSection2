package udemy.spring5.section2.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.spring5.section2.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
