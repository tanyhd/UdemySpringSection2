package udemy.spring5.section2.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.spring5.section2.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
