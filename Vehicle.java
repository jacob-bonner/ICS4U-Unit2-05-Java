/*
* This class creates a vehicle.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-14
*/

public class Vehicle {
  // Initializing fields
  private String licensePlate;
  private String colour;
  private int numberOfDoors;
  private int speed;
  private int maximumSpeed;

  /**
   * Setting field values with a constructor.
   */
  public Vehicle(String licensePlateInput, String colourInput) {
    this.licensePlate = licensePlateInput;
    this.colour = colourInput;
    this.numberOfDoors = 4;
    this.speed = 0;
    this.maximumSpeed = 477;
  }

  /**
   * Setter for the colour.
   */
  public void setColour(String userColour) {
    colour = userColour;
  }

  /**
   * Getter for the colour.
   */
  public String getColour() {
    return colour;
  }

  /**
   * Setter for the license plate number.
   */
  public void setLicensePlate(String userLicensePlate) {
    licensePlate = userLicensePlate;
  }
  
  /**
   * Getter for the license plate number.
   */
  public String getLicensePlate() {
    return licensePlate;
  }

  /**
   * Method that accelerates the car.
   */
  public int accelerate(int userIncrease) throws Exception {
    // Checking to see if speed exceeds maximum then increasing the speed
    if (this.speed + userIncrease > this.maximumSpeed) {
      throw null;
    } else {
      this.speed = this.speed + userIncrease;
    }

    // Returning the new speed to the user
    return this.speed;
  }
  
  /**
   * Method that deccelerates the car.
   */
  public int deccelerate(int userDecrease) throws Exception {
    // Checking to see if speed exceeds maximum then increasing the speed
    if (this.speed - userDecrease < 0) {
      throw null;
    } else {
      this.speed = this.speed - userDecrease;
    }

    // Returning the new speed to the user
    return this.speed;
  }
}
