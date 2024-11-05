package org.example.dao;

import org.example.config.Hibernate;
import org.example.model.Invoice;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class InvoiceDAO {
    public void saveInvoice(Invoice invoice) {
        Session session = Hibernate.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(invoice);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Invoice getInvoiceById(Long id) {
        Session session = Hibernate.getSession();
        Invoice invoice = null;
        try {
            invoice = session.get(Invoice.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return invoice;
    }

    public List<Invoice> getAllInvoices() {
        Session session = Hibernate.getSession();
        List<Invoice> invoices = null;
        try {
            invoices = session.createQuery("FROM Invoice", Invoice.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return invoices;
    }

    public void updateInvoice(Invoice invoice) {
        Session session = Hibernate.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(invoice);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deleteInvoice(Long id) {
        Session session = Hibernate.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Invoice invoice = session.get(Invoice.class, id);
            if (invoice != null) {
                session.delete(invoice);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
