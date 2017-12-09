package bullhornproject.demo;

import org.springframework.data.repository.CrudRepository;

public interface ContentRepository extends CrudRepository<Message, Long> {
}
