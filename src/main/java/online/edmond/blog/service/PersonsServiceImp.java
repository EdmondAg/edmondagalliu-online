package online.edmond.blog.service;

import online.edmond.blog.model.Persons;
import online.edmond.blog.repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonsServiceImp implements PersonsService {
    @Autowired
    private PersonsRepository personsRepository;
    @Override
    public Iterable<Persons> listAllPersons() {
        return personsRepository.findAll();
    }
}
