package com.hotel.controller;

import com.hotel.data.ReserveDate;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    static Reserve reserve = new Reserve();
    static ReserveDate reserveDate = new ReserveDate();

    public static void main(String[] args) {
        reserveDate.reserveDate();

        reserve.roomDetail();
        reserve.reservation();

    }
}
