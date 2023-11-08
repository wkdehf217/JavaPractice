import hanjoon.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Car> carList = new ArrayList<>();

       //Car blueCar = new Car("파란 차");
       Car blackCar = new Car("까만 차","제네시스",500,0);

       for(Integer i =0;i<10;i++){
           blueCar.accel();
           blackCar.accel();
       }
       carList.add(blueCar);
       carList.add(blackCar);

       for(Car car : carList){
           System.out.println();
       }

    }
}