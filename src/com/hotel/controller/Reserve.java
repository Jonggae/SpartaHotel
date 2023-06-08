package com.hotel.controller;

import com.hotel.data.ReserveDate;
import com.hotel.data.RoomDetail;
import com.hotel.data.RoomList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reserve {
    Scanner sc = new Scanner(System.in);
//    ReserveDate reserveDate = new ReserveDate();


// 시작 화면에 출력될 메시지들입니다.
// 1. 예약하기 2. 예약확인 3. 예약취소  중 1번을 구현하는중
    public void mainReserve() {
        System.out.println("Sparta Hotel");
        System.out.println("1. 예약하기");
    }

// 1번을 누르면 우선 ReserveDate를 거쳐 원하는 날짜를 입력받고
// 그 날짜에 해당하는 방 목록을 우선 보여줍니다.


    // roomLists 메서드는 층별 방의 정보만 가져옵니다. 날짜연결은?? 아직? 우선 편의상 1층만
    public ArrayList<RoomList> roomLists() {
        ArrayList<RoomList> roomLists = new ArrayList<>();
        roomLists.add(new RoomList(1, "1층", "101호"));
        roomLists.add(new RoomList(2, "1층", "102호"));
        roomLists.add(new RoomList(3, "1층", "103호"));
//        roomLists.add(new RoomList(4,"2층","201호"));
//        roomLists.add(new RoomList(5,"2층","202호"));
//        roomLists.add(new RoomList(6,"2층","203호"));
//        roomLists.add(new RoomList(7,"3층","301호"));
//        roomLists.add(new RoomList(8,"3층","302호"));
//        roomLists.add(new RoomList(9,"3층","303호"));

//  출력할때 3개씩 구별하고싶은데? -> 좀 나중에합시다.
        System.out.println("원하는 방을 고르시면 상세정보가 보입니다.");
        System.out.println("--------------------------------------");
        for (RoomList roomList : roomLists) {
            System.out.println(roomList.getRoomNumber() + " ▶  " + roomList.getFloor() + "  " + roomList.getRoomIndex());
        }
        return roomLists;
    }

//    public Map<String,ArrayList<RoomDetail>> roomDetail() {
//        Map<String,ArrayList<RoomDetail>> roomDetail = new HashMap<>();
//        roomDetail.put("101호",new RoomDetail("101","2인","two Bed",
//                "아침저녁",100000,);
//
//    }
}
//RoomDetail의  roomNum은 String인 "1층 101호" 이런것을 말하는건가요?





