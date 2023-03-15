package com.brs.hotel_service.service;

import com.brs.hotel_service.entites.Hotel;

import java.util.List;

public interface  HotelService{
    Hotel createHotel(Hotel hotel);
    List<Hotel> getAllHotel();
    Hotel getHotel(String hotelId);
}
