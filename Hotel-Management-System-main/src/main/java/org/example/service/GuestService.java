package org.example.service;

import org.example.dao.GuestDAO;
import org.example.model.Guest;

import java.util.List;

public class GuestService {
    private GuestDAO guestDAO = new GuestDAO();

    public void saveGuest(Guest guest) {
        guestDAO.saveGuest(guest);
    }

    public Guest getGuestById(Long id) {
        return guestDAO.getGuestById(id);
    }

    public List<Guest> getAllGuests() {
        return guestDAO.getAllGuests();
    }

    public void updateGuest(Guest guest) {
        guestDAO.updateGuest(guest);
    }

    public void deleteGuest(Long id) {
        guestDAO.deleteGuest(id);
    }
}
