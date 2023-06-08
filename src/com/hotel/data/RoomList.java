package com.hotel.data;


import java.util.ArrayList;

public class RoomList {

    private int roomNumber;
    private String floor;
    private String roomIndex;
    private ArrayList<String> roomList = new ArrayList<>();

    public RoomList(int roomNumber, String floor, String roomIndex) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.roomIndex = roomIndex;
    }

    public String getFloor() {
        return floor;
    }

    public String getRoomIndex() {
        return roomIndex;
    }

    public int getRoomNumber() {
        return roomNumber;

    }

    public ArrayList<String> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<String> roomList) {
        this.roomList = roomList;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setRoomIndex(String roomIndex) {
        this.roomIndex = roomIndex;
    }

}
