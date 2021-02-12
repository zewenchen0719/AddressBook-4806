package myapplication.AddressBook;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@RepositoryRestResource
public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {

    List<AddressBook> findAll();
    AddressBook findById(long id);
}