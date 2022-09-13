package io.saga.springplushibernate.services;

import io.saga.springplushibernate.models.Item;
import io.saga.springplushibernate.models.Person;
import io.saga.springplushibernate.repositories.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Sagadat Kuandykov
 */
@Service
@Transactional(readOnly = true)
public class ItemService {

    private final ItemsRepository itemsRepository;

    @Autowired
    public ItemService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public List<Item> findByItemName(String itemName){

        return itemsRepository.findByItemName(itemName);
    }
    public List<Item> findByOwner(Person owner){
        return itemsRepository.findByOwner(owner);
    }
}
