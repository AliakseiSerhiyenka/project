package com.example.BikeRentalApplication;

import com.example.BikeRentalApplication.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ReactiveAdapterRegistry;
import org.springframework.security.access.method.P;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
@SpringBootApplication
public class BikeRentalApplication {

	public static void main(String[] args) throws Exception {



//		var electRower = Rower.createElektrycznyRower(1,"BMX",
//				"Max",
//				"red",
//				5.5,
//				100.0,
//				"XL",
//				"N/A",
//				"Electryczny",1000,100,45);
//		System.out.println(electRower);

//
//
//		var mechRower = Rower.createMechanicznyRower(2,"BMX",
//				"Max",
//				"red",
//				5.5,
//				100.0,
//				"XL",
//				"N/A","Mechaniczny",21,"Duo");
//		//System.out.println(mechRower);
//		var rower2 = new Dorosly(mechRower,true,false);
//		//System.out.println(rower2);
//		int liczbaBegow = rower2.getNapend().getMech().getLiczbaBiegow();
//		System.out.println("Liczba begow: "+ liczbaBegow);
//		Rower.displayAllRovers();
//
//		Osoba os = new Osoba(
//				99,                      // id
//				"John",                 // imie
//				"Doe",                  // nazwisko
//				"Male",                 // plec
//				LocalDate.of(1990, 5, 15),  // dataUrodzenia
//				Arrays.asList(123456789, 987654321),         // numerTelefonu
//				"john.doe@example.com" // email
//		);
//		Pracownik pracownik = new Manager(os,"BLK 7",200.99);
//		os.setKlientRole();
//
//		System.out.println("Pracowniki");
//
//		System.out.println(pracownik);
//
//		Rezerwacja rezerwacja = new
//				Rezerwacja(1,LocalDate.now(),
//				LocalDate.now(),
//				LocalDate.now(),
//				"ACTIVE", new Rower(),
//				new Klient(os));
//		Sprzet sprzet1 = new Sprzet("Nazwa sprzetu 1", 100.0, "Typ sprzetu 1");
//		Sprzet sprzet2 = new Sprzet("Nazwa sprzetu 2", 150.0, "Typ sprzetu 2");
//		System.out.println(sprzet2);
//		rezerwacja.addSprzet(sprzet1);
//		rezerwacja.addSprzet(sprzet2);
//		System.out.println(rezerwacja.sprzet);


	}
}


