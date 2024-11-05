package org.example.service;

import org.example.dao.RoomDAO;
import org.example.model.Room;

import java.util.List;

public class RoomService {
    private RoomDAO roomDAO = new RoomDAO();

    public Room getRoomById(Long id) {
        return roomDAO.getRoomById(id);
    }

    public List<Room> getAllRooms() {
        return roomDAO.getAllRooms();
    }

    // We can Implement other methods if needed

    public void saveRoom(Room room) {
        roomDAO.saveRoom(room);
    }

    public void updateRoom(Room room) {
        roomDAO.updateRoom(room);
    }

    public void deleteRoom(Long id) {
        roomDAO.deleteRoom(id);
    }
}
