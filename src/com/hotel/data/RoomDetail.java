package com.hotel.data;

import java.util.ArrayList;

public class RoomDetail {

    private String roomNum; //호 수
    private String roomCapacity;
    private String roomBed;
    private String checkTime;
    private int roomPrice;
    private ArrayList<String> roomDates;

    public RoomDetail(String roomNum, String roomCapacity, String roomBed,
                      String checkTime, int roomPrice) {
        this.roomNum = roomNum;
        this.roomCapacity = roomCapacity;
        this.roomBed = roomBed;
        this.checkTime = checkTime;
        this.roomPrice = roomPrice;
//        this.roomDates = roomDates;
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

    public ArrayList<String> getRoomDates(){
        return roomDates;
    }


    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public void setRoomCapacity(String roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public void setRoomBed(String roomBed) {
        this.roomBed = roomBed;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public void setRoomDates(ArrayList<String> roomDates) {
        this.roomDates = roomDates;
    }
}
