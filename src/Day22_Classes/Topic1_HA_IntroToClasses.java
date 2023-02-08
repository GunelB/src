package Day22_Classes;

import java.util.Scanner;

public class Topic1_HA_IntroToClasses {
    public static void main(String[] args) {
        String Car1Make = "Ford";
        String Car1Model = "Mustang";
        String Car1Color = "Red";
        int Car1Year = 2023;
        String Car1Transmission = "Automatic";

        PrintCar(Car1Make, Car1Model, Car1Color, Car1Year);

        //DataType VariableName = new DataType();
        Car MyElectricCar = new Car();
        MyElectricCar.Make = "Tesla";
        MyElectricCar.Model = "3";
        MyElectricCar.Color = "White";
        MyElectricCar.Year = 2021;
        MyElectricCar.Transmission = "Automatic";

        PrintCarClass(MyElectricCar);


        //DataType VariableName = new DataType();
        Car MySportsCar = new Car();
        MySportsCar.Make = "Subaru";
        MySportsCar.Model = "BRZ";
        MySportsCar.Color = "Blue";
        MySportsCar.Year = 2021;
        MySportsCar.Transmission = "Manual";

        PrintCarClass(MySportsCar);


//        String s2 = new String("something");
//        String s = "something";
    }

    ///Create a method
    ///This method will print car specifications.
    ///Parameters 1 Car
    ///Returntype void

    public static void PrintCarClass(Car p_Car){
        System.out.println("Make : "+p_Car.Make);
        System.out.println("Model : "+p_Car.Model);
        System.out.println("Color : "+p_Car.Color);
        System.out.println("Year : "+p_Car.Year);
        System.out.println("Transmission : "+p_Car.Transmission);
    }

    ///create a method
    ///this method will print car specifications.
    /// Parameters - 3 String
    /// ReturnType - void
    public static void PrintCar (String p_Make, String p_Model, String p_Color, int p_Year){
        System.out.println("Make : "+p_Make);
        System.out.println("Model : "+p_Model);
        System.out.println("Color : "+p_Color);
        System.out.println("Year : "+p_Year);
    }

}

class Car {
    //Fields - Properties
    String Make;
    String Model;
    String Color;
    int Year;

    String Transmission;
}