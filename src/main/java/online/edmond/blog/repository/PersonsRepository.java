package online.edmond.blog.repository;

import online.edmond.blog.model.Persons;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonsRepository extends JpaRepository<Persons, Long> {
}
