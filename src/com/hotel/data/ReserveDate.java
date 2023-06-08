package com.hotel.data;

import com.hotel.controller.Reserve;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ReserveDate {
    Reserve reserve = new Reserve();
    private String day;
    private String month;
    private String year;
    Scanner sc = new Scanner(System.in);

    public  ArrayList<String> reserveDate;

// 생서자가 필요한가?
//    public ReserveDate(String day, String month, String year) {
//        this.day = day;
//        this.month = month;
//        this.year = year;
//    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    //날짜를 입력받는 메서드
    public String reserveDate() {
        SimpleDateFormat date = new SimpleDateFormat("MM 월 dd 일");
//        SimpleDateFormat month = new SimpleDateFormat("MM");

        LocalDate nowMonth = LocalDate.now();
        String thisMonth = nowMonth.getMonth().toString();

        Calendar cal = Calendar.getInstance();
// 현재 날짜 nowTime
        Date now = cal.getTime();
        String today = date.format(now);
// 1일 후 날짜 oneDayAfter
        cal.add(Calendar.DATE, 1);
        Date oneDay = cal.getTime();
        String oneDayAfter = date.format(oneDay);
// 2일 후 날짜 twoDayAfter
        cal.add(Calendar.DATE, 1);
        Date twoDay = cal.getTime();
        String twoDayAfter = date.format(twoDay);
// 3일 후 날짜 threeDayAfter
        cal.add(Calendar.DATE, 1);
        Date threeDay = cal.getTime();
        String threeDayAfter = date.format(threeDay);
// 4일 후 날짜 fourDayAfter
        cal.add(Calendar.DATE, 1);
        Date fourDay = cal.getTime();
        String fourDayAfter = date.format(fourDay);
// 5일 후 날짜 fiveDayAfter
        cal.add(Calendar.DATE, 1);
        Date fiveDay = cal.getTime();
        String fiveDayAfter = date.format(fiveDay);
// 6일 후 날짜 sixDayAfter
        cal.add(Calendar.DATE, 1);
        Date sixDay = cal.getTime();
        String sixDayAfter = date.format(sixDay);
// 7일 후 날짜 sevenDayAfter
        cal.add(Calendar.DATE, 1);
        Date sevenDay = cal.getTime();
        String sevenDayAfter = date.format(sevenDay);

        System.out.println("예약을 원하는 날짜를 입력하세요.\n" + today + "부터 " + sevenDayAfter + "까지 가능합니다. (요일 무관)");
        System.out.print("월 (0도 입력해주세요) ->");
        month = sc.next(); // 사용자가 원하는 달 입력
        System.out.print("일 (0도 입력해주세요) ->");
        day = sc.next(); // 사용자가 원하는 일자 입력

        ArrayList<String> reserveDate = new ArrayList<>();
        reserveDate.add(thisMonth+today); // reserveDate에 MMdd 식으로 저장됩니다. 예시 : 0608, 0614
        reserveDate.add(thisMonth+oneDayAfter);
        reserveDate.add(thisMonth+twoDayAfter);
        reserveDate.add(thisMonth+threeDayAfter);
        reserveDate.add(thisMonth+fourDayAfter);
        reserveDate.add(thisMonth+fiveDayAfter);
        reserveDate.add(thisMonth+sixDayAfter);
        reserveDate.add(thisMonth+sevenDayAfter);

        String inputRoomDate = month + " 월 " + day + " 일"; //사용자로부터 입력받은 값


        // if문에 1일 2일 3일후 까지 다 집어넣으면.. ㅋㅋ?? -> 논의필요

        if (inputRoomDate.equals(today)) {
            System.out.println(inputRoomDate + " 예약 가능한 방 목록입니다.");
            reserve.roomLists();
        } else if (inputRoomDate.equals(oneDayAfter)) {
            System.out.println(inputRoomDate + " 예약 가능한 방 목록입니다.");
            reserve.roomLists();
        } else if (inputRoomDate.equals(twoDayAfter)) {
            System.out.println(inputRoomDate + " 예약 가능한 방 목록입니다.");
            reserve.roomLists();
        } else if (inputRoomDate.equals(threeDayAfter)) {
            System.out.println(inputRoomDate + " 예약 가능한 방 목록입니다.");
            reserve.roomLists();
        } else if (inputRoomDate.equals(fourDayAfter)) {
            System.out.println(inputRoomDate + " 예약 가능한 방 목록입니다.");
            reserve.roomLists();
        } else if (inputRoomDate.equals(fiveDayAfter)) {
            System.out.println(inputRoomDate + " 예약 가능한 방 목록입니다.");
            reserve.roomLists();
        } else if (inputRoomDate.equals(sixDayAfter)) {
            System.out.println(inputRoomDate + " 예약 가능한 방 목록입니다.");
            reserve.roomLists();
        } else if (inputRoomDate.equals(sevenDayAfter)) {
            System.out.println(inputRoomDate + " 예약 가능한 방 목록입니다.");
            reserve.roomLists();
        } else {
            System.out.println("해당 날짜에 예약할 수 없습니다. 다시 입력하세요.");
            System.out.println("========================================");
            reserveDate();
        }
        return today;

    }

}
