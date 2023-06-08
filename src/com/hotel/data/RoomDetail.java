package com.hotel.data;

import java.util.ArrayList;

public class RoomDetail {

    private String roomNum;
    private String roomCapacity;
    private String roomBed;
    private String checkTime;
    private int roomPrice;
    private String[] roomDates;

    public RoomDetail(String roomNum, String roomCapacity, String roomBed, String checkTime, int roomPrice, String[] roomDates) {
        this.roomNum = roomNum;
        this.roomCapacity = roomCapacity;
        this.roomBed = roomBed;
        this.checkTime = checkTime;
        this.roomPrice = roomPrice;
        this.roomDates = roomDates;
    }

    ////////
    public String getRoomNum () {
        return roomNum;
    }
    public String getRoomCapacity() {
        return roomCapacity;
    }

    public String getRoomBed() {
        return roomBed;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public int getRoomPrice() {
        return roomPrice;
    }




}
