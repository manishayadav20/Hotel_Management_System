package org.example.dao;

import org.example.config.Hibernate;
import org.example.model.Room;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class RoomDAO {

    public void saveRoom(Room room) {
        Transaction transaction = null;
        try (Session session = Hibernate.getSession()) {
            transaction = session.beginTransaction();
            session.save(room);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Room getRoomById(Long id) {
        try (Session session = Hibernate.getSession()) {
            return session.get(Room.class, id);
        }
    }

    public List<Room> getAllRooms() {
        try (Session session = Hibernate.getSession()) {
            return session.createQuery("from Room", Room.class).list();
        }
    }

    public void updateRoom(Room room) {
        Transaction transaction = null;
        try (Session session = Hibernate.getSession()) {
            transaction = session.beginTransaction();
            session.update(room);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteRoom(Long id) {
        Transaction transaction = null;
        try (Session session = Hibernate.getSession()) {
            transaction = session.beginTransaction();
            Room room = session.get(Room.class, id);
            if (room != null) {
                session.delete(room);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
