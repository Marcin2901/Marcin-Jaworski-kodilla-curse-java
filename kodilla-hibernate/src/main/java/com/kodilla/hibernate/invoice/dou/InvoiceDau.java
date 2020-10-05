package com.kodilla.hibernate.invoice.dou;

import com.kodilla.hibernate.invoice.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface InvoiceDau extends CrudRepository<Invoice, Integer> {
}
