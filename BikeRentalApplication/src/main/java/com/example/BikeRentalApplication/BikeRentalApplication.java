package com.example.BikeRentalApplication;

import com.example.BikeRentalApplication.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ReactiveAdapterRegistry;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class BikeRentalApplication {

	public static void main(String[] args) throws Exception {


		//SpringApplication.run(BikeRentalApplication.class, args);


		var electRower = Rower.createElektrycznyRower(1,"BMX",
				"Max",
				"red",
				5.5,
				100.0,
				"XL",
				"N/A",
				1,"Electryczny",1000,45,200);
		System.out.println(electRower);
		var rower1 = new Dzieciecy(electRower,true,"Turbo");


		var mechRower = Rower.createMechanicznyRower(2,"BMX",
				"Max",
				"red",
				5.5,
				100.0,
				"XL",
				"N/A",2,"Mechaniczny",21,"Duo");
		//System.out.println(mechRower);
		var rower2 = new Dorosly(mechRower,true,false);
		//System.out.println(rower2);
		int liczbaBegow = rower2.getNapend().getMech().getLiczbaBiegow();
		System.out.println("Liczba begow: "+ liczbaBegow);
		Rower.displayAllRovers();

		Osoba os = new Osoba(
				1,                      // id
				"John",                 // imie
				"Doe",                  // nazwisko
				"Male",                 // plec
				LocalDate.of(1990, 5, 15),  // dataUrodzenia
				Arrays.asList(123456789, 987654321),         // numerTelefonu
				"john.doe@example.com" // email
		);
		os.setKlientRole();
		os.setPracownikRole();
		System.out.println("Pracowniki");
		System.out.println(os);


	}
}


