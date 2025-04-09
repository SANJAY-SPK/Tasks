/*3) Car Rental Records 
Question: A car rental company needs to store basic information about vehicles in an 
object-oriented way. Write a Java program that: 
1. Creates a Car class with private fields: brand, model, year. 
2. Uses a constructor and getters/setters to manage these fields. 
3. In the main() method, instantiates two or more Car objects and prints out their 
details, showing how encapsulation protects the fields.  */


import java.util.*;
public class CarRecords {

    static class Car{
        private String brand;
        private String model;
        private int year;
        public Car(String brand, String model, int year)
        {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        //getters
        public String getBrand()
        {
            return brand;
        }
        public String getModel()
        {
            return model;
        }
        public int getYear()
        {
            return year;
        }

        //setters
        public void setBrand(String brand)
        {
            this.brand = brand;
        }
        public void setModel(String model)
        {
            this.model = model;
        }
        public void setYear(int year)
        {
            this.year = year;
        }

    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String model = sc.next();
        int year = sc.nextInt();
        Car car1 = new Car(name, model, year);
        System.out.println("Car 1 Details: ");
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());
        sc.close();
        
    }
}
