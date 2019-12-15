package pl.projekt.springwithgit.repo;

import org.springframework.data.repository.CrudRepository;
import pl.projekt.springwithgit.Domain.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
