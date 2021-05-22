package unical.dimes.psw2021.server.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unical.dimes.psw2021.server.model.Restaurant;
import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Page<Restaurant> findByNameIgnoreCaseContainingAndCityIgnoreCase(String name, String city, Pageable pageable);

    Page<Restaurant> findByCityIgnoreCase(String city, Pageable pageable);

    List<Restaurant> findByCityIgnoreCase(String city);

    boolean existsByNameAndCityAndAddress(String name, String city, String address);
}
