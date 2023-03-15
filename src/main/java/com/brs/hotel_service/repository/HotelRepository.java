package com.brs.hotel_service.repository;

import com.brs.hotel_service.entites.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{
}
