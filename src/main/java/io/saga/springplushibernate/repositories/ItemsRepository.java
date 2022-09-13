package io.saga.springplushibernate.repositories;

import io.saga.springplushibernate.models.Item;
import io.saga.springplushibernate.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Sagadat Kuandykov
 */

@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {
    List<Item> findByItemName(String itemName);

    List<Item> findByOwner(Person owner);
}
