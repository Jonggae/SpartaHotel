package com.hotel.data;


import java.util.ArrayList;

public class RoomList {

    private int roomNumber;
    private String floor;
    private String roomIndex;

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
    }}


