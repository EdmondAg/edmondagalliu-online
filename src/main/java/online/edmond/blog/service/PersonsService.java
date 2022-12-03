package online.edmond.blog.service;

import online.edmond.blog.model.Persons;

public interface PersonsService {
    Iterable<Persons> listAllPersons();
}
