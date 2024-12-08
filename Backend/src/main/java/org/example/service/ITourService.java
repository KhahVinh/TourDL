package org.example.service;

import org.example.modal.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public interface ITourService {

    //get all tour
    List<Tour> getAllTours();

    // create tour
    Tour createNewTour(Tour tour);

    // delete Tour By ID
    boolean deleteTourById(String id);

    // phan trang tour
    Page<Tour> getPageTours(Pageable pageable);

    // update tour by id
    //Tour updateTour(String id, Tour tourDetails);

    // search tour by name
    List<Tour> getTourByName(String Name);

    // bo loc tim kiem
    Page<Tour> filterTours(Pageable pageable, BigDecimal minBudget,BigDecimal maxBudget, String departure, String destination, Integer tourType, Integer transportId);
    Long totalTour();
    List<Long> getTotalByType();
}
