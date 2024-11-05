package org.example.dao;

import org.example.config.Hibernate;
import org.example.model.Guest;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class GuestDAO {
    public void saveGuest(Guest guest) {
        Session session = Hibernate.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(guest);
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

    public Guest getGuestById(Long id) {
        Session session = Hibernate.getSession();
        Guest guest = null;
        try {
            guest = session.get(Guest.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return guest;
    }

    public List<Guest> getAllGuests() {
        Session session = Hibernate.getSession();
        List<Guest> guests = null;
        try {
            guests = session.createQuery("FROM Guest", Guest.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return guests;
    }

    public void updateGuest(Guest guest) {
        Session session = Hibernate.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(guest);
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

    public void deleteGuest(Long id) {
        Session session = Hibernate.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Guest guest = session.get(Guest.class, id);
            if (guest != null) {
                session.delete(guest);
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
