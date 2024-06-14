package com.example.BikeRentalApplication.services;

import com.example.BikeRentalApplication.model.Osoba;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OsobaRepository extends JpaRepository<Osoba,Integer>  {
}
