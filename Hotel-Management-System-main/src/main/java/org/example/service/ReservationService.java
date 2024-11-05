package org.example.service;

import org.example.dao.ReservationDAO;
import org.example.model.Reservation;

import java.util.List;

public class ReservationService {
    private ReservationDAO reservationDAO = new ReservationDAO();

    public void saveReservation(Reservation reservation) {
        reservationDAO.saveReservation(reservation);
    }

    public Reservation getReservationById(Long reservationId) {
        return reservationDAO.getReservationById(reservationId);
    }

    public List<Reservation> getAllReservations() {
        return reservationDAO.getAllReservations();
    }
}
