package com.javadevjournal.springbooth2.repository;

import java.util.Date;
import java.util.List;

import com.javadevjournal.springbooth2.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerJpaRepository extends JpaRepository<Manufacturer, Long> {
	List<Manufacturer> findByFoundedDateBefore(Date date);
	
	List<Manufacturer> findByActiveTrue();
	List<Manufacturer> findByActiveFalse();
	
	List<Manufacturer> getAllThatSellAcoustics(String name);
}
