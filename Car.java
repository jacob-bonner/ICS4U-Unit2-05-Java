/*
* This program allows the user to have two cars and change certain properties of
* the cars, such as colour, license plate number and the speed the car will
* travel once they have it.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-14
*/

import java.util.Scanner;  // Import the Scanner class

public class Car {
  /**
   * This function allows the user to have two cars and change certain
   * properties of the cars.
   */
  public static void main(String[] args) {
    try {
      // Creating the scanners for any inputs that may be necessary input
      final Scanner licenseInput = new Scanner(System.in);
      final Scanner colourInput = new Scanner(System.in);
      final Scanner speedInput = new Scanner(System.in);

      // User input for license plate of first car
      System.out.print("What is the license plate number of the first car: ");
      String carLicensePlate = licenseInput.nextLine();

      // User input for colour of first car
      System.out.print("What is the colour of the first car: ");
      String carColour = colourInput.nextLine();
      System.out.println();

      // Initializing the users first car
      Vehicle firstCar = new Vehicle(carLicensePlate, carColour);
      System.out.println("Here is your first car!");
      System.out.println("License Plate Number: " + firstCar.getLicensePlate());
      System.out.println("Colour: " + firstCar.getColour());
      System.out.println();

      // User input for license plate of second car
      System.out.print("What is the license plate number of the second car: ");
      carLicensePlate = licenseInput.nextLine();

      // User input for colour of second car
      System.out.print("What is the colour of the second car: ");
      carColour = colourInput.nextLine();
      System.out.println();

      // Initializing the users second car
      Vehicle secondCar = new Vehicle(carLicensePlate, carColour);
      System.out.println("Here is your second car!");
      System.out.println("License Plate Number: "
                         + secondCar.getLicensePlate());
      System.out.println("Colour: " + secondCar.getColour());
      System.out.println();

      // Changing the license plate number of the first car
      System.out.print("The license plate on your first car expired! What "
                       + "is your new license plate number: ");
      String carLicensePlateChange = licenseInput.nextLine();
      firstCar.setLicensePlate(carLicensePlateChange);
      System.out.println("Your new license plate number is: "
                         + firstCar.getLicensePlate());
      System.out.println();

      // Changing the colour of the second car
      System.out.print("The second car needs a new paint job! What "
                       + "colour do you want your car to be: ");
      String carColourChange = colourInput.nextLine();
      secondCar.setColour(carColourChange);
      System.out.println("The colour of your new paint job is: "
                         + secondCar.getColour());
      System.out.println();

      // Accelerating the first car
      System.out.print("Take one of your cars for a spin! How much would "
                       + "you like to speed up the car (in KM/h): ");
      int carSpeedChange = speedInput.nextInt();
      System.out.println("The car is travelling at "
                         + firstCar.accelerate(carSpeedChange) + " KM/h");
      System.out.println();

      // Accelerating the first car again
      System.out.print("Now that you are on the highway, how much would "
                       + "you like to speed up the car (in KM/h): ");
      carSpeedChange = speedInput.nextInt();
      System.out.println("The car is travelling at "
                         + firstCar.accelerate(carSpeedChange) + " KM/h");
      System.out.println();

      // Deccelerating the first car
      System.out.print("There is traffic, you need to slow down! How much "
                       + "would you like to slow down the car (in KM/h): ");
      carSpeedChange = speedInput.nextInt();
      System.out.println("The car is travelling at "
                         + firstCar.deccelerate(carSpeedChange) + " KM/h");

      // Catches and tells the user what error occured
    } catch (NullPointerException e) {
      System.out.println("");
      System.out.println("ERROR: Attempt to change car " 
                         + "property beyond allowed bounds");
    } catch (Exception e) {
      System.out.println("");
      System.out.println("ERROR: Invalid Input");
    }
  }
}
