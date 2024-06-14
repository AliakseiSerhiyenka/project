package com.example.BikeRentalApplication.services;

import com.example.BikeRentalApplication.model.Rower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RowerRepository extends JpaRepository<Rower,Integer> {

}
