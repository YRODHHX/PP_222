package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceIMPL implements CarService {
    @Override
    public List<Car> carCount(int count) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1,"WV",  "Black"));
        list.add(new Car(2,"Lada",  "Brown"));
        list.add(new Car(3,"Toyota",  "White"));
        list.add(new Car(4,"Cherry", "Silver"));
        list.add(new Car(5,"Volga", "Green"));

        if (count >= 5) {
            return list;
        } else {
            return list.subList(0,count);
        }
    }
}
