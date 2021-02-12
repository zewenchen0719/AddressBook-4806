package myapplication.AddressBook;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long> {
    BuddyInfo findById(long id);
}