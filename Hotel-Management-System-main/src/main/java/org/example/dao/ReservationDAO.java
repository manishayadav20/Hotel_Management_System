package org.example.dao;

import org.example.config.Hibernate;
import org.example.model.Reservation;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class ReservationDAO {
    public void saveReservation(Reservation reservation) {
        Session session = Hibernate.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(reservation);
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

    public Reservation getReservationById(Long reservationId) {
        Session session = Hibernate.getSession();
        Reservation reservation = null;
        try {
            reservation = session.get(Reservation.class, reservationId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return reservation;
    }

    public List<Reservation> getAllReservations() {
        Session session = Hibernate.getSession();
        List<Reservation> reservations = null;
        try {
            reservations = session.createQuery("FROM Reservation", Reservation.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return reservations;
    }

    // We can Implement other CRUD operations if needed (updateReservation, deleteReservation)
}
