package pl.projekt.springwithgit.repo;

import org.springframework.data.repository.CrudRepository;
import pl.projekt.springwithgit.Domain.Address;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Long> {
    List<Address> findAllOrderByCity();
}
