package com.github.patrickfrr.citiesapi.countries.repository;

import com.github.patrickfrr.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
