package kr.co.project.restaurantreservesystem.interfaces;

import kr.co.project.restaurantreservesystem.domain.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> list() {
        List<Restaurant> restaurants = new ArrayList<>();

        Restaurant restaurant = new Restaurant(1004L,"Bob zip", "Seoul");
        restaurants.add(restaurant);
        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id) {
        Restaurant restaurant = null;

        if (id == 1004L) {
            restaurant = new Restaurant(1004L,"Bob zip", "Seoul");
        }

        if (id == 2020L) {
            restaurant = new Restaurant(2020L,"Cyber Food", "Seoul");
        }

        return restaurant;
    }
}