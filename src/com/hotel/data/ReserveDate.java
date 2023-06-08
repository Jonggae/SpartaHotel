package com.hotel.data;

import com.hotel.controller.Reserve;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
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
    private String[] dayAfter;
    Scanner sc = new Scanner(System.in);


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

    public String[] getDayAfter() {
        return dayAfter;
    }

    //날짜를 입력받는 메서드
    public String reserveDate() {
        SimpleDateFormat date = new SimpleDateFormat("MM 월 dd 일");

        LocalDate nowMonth = LocalDate.now();
        String thisMonth = nowMonth.getMonth().toString();
        Calendar cal = Calendar.getInstance();
// 현재 날짜 nowTime
        Date now = cal.getTime();
        String today = date.format(now);

// 오늘~일주일 후 날짜 저장 ("MM 월 dd 일" 형태로 저장)
        String[] dayAfter = new String[8];
        for (int i = 1; i < 8; i++) {
            dayAfter[0] = today; // dayAfter[0] -> 오늘 1-> 1일 후 ... [7]-> 7일 후

            cal.add(Calendar.DATE, 1);
            Date nextDay = cal.getTime();
            dayAfter[i] = date.format(nextDay);
        }

        System.out.println("예약을 원하는 날짜를 입력하세요.\n" + dayAfter[0] + "부터 " + dayAfter[7] + "까지 가능합니다. (요일 무관)");
        System.out.print("월 (0도 입력해주세요) ->");
        month = sc.next(); // 사용자가 원하는 달 입력
        System.out.print("일 (0도 입력해주세요) ->");
        day = sc.next(); // 사용자가 원하는 일자 입력
        String inputRoomDate = month + " 월 " + day + " 일"; // "MM 월 dd 일" 사용자로부터 입력받은 값

//        ArrayList<String> reserveDate = new ArrayList<>();
//              // reserveDate에 MMdd 식으로 저장됩니다. 예시 : 0608, 0614
//        for (int i = 0; i < 8; i++) reserveDate.add(dayAfter[i]);  // 1일 후부터 7일 후까지의 날짜 추가
//        System.out.println(reserveDate.get(0)+"***********");

        boolean isReservationPossible = false;      //코드 리팩터링위한 변수

        //isReservationPossible가 초기에 false고 사용자가 입력한 날짜값과 같다면 true반환
        for (int i = 0; i < dayAfter.length; i++) {
            if (inputRoomDate.equals(dayAfter[i])) {
                isReservationPossible = true;
                break;
            }
        }
        if (isReservationPossible) {
            System.out.println("\n" + inputRoomDate + " 예약 가능한 방 목록입니다.");
            reserve.roomLists();
        } else {
            System.out.println("해당 날짜에 예약할 수 없습니다. 다시 입력하세요.");
            System.out.println("========================================");
            reserveDate();
        }
        return thisMonth;
    }

}