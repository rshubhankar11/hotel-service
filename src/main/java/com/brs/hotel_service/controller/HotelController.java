package com.brs.hotel_service.controller;

import com.brs.hotel_service.entites.Hotel;
import com.brs.hotel_service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController{
    @Autowired
    private HotelService hotelService;

    //    Create new Hotel
    @PostMapping()
    public ResponseEntity<Hotel> createHote(@RequestBody Hotel hotel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.createHotel(hotel));
    }

    //    Get single Hotel
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId) {
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotel(hotelId));
    }

    // Get all Hotels
    @GetMapping()
    public ResponseEntity<List<Hotel>> getAllHotel() {
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotel());
    }

}
