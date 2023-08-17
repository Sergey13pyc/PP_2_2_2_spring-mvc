package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    public List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Nissan GTR", "White", 2014));
        carList.add(new Car("Nissan Silvia S15", "Metallic Blue", 2001));
        carList.add(new Car("Toyota Supra A80", "White", 1998));
        carList.add(new Car("Mazda Rx7", "Yellow", 1994));
        carList.add(new Car("Honda NSX", "Red", 1998));

    }


    @Override
    public List<Car> getCars(int count) {
        return carList.subList(0, count);
    }
}
