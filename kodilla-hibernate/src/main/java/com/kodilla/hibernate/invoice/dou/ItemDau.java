package com.kodilla.hibernate.invoice.dou;

import com.kodilla.hibernate.invoice.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ItemDau extends CrudRepository<Item, Integer> {
}
