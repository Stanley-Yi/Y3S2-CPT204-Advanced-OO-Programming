public class Vehicle {
    private String type;
    private int numWheels;
	
	/* DO NOT MODIFY CODE ABOVE */
	


    // LAB EXERCISE 6.1  Vehicle CONSTRUCTOR

    /**
     Constructs a vehicle.
     @param type the type of the vehicle.
     @param numWheels the number of wheels on this vehicle.
     */
    public Vehicle(String type, int numWheels) {
        if (type.equals("truck")) {
            if (numWheels < 4) {
                throw new IllegalArgumentException();
            }
        }
        if (type.equals("motorcycle")) {
            if (numWheels != 2) {
                throw new IllegalArgumentException();
            }
        }
        this.type = type;
        this.numWheels = numWheels;
    }


    // LAB EXERCISE 6.2  Vehicle TEST CONSTRUCTOR

    /**
     * The following method tests your constructor.
     * We use the exception handling mechanism to determine whether
     * the constructor completed normally, or an exception occurred.
     */
    public static String testConstructor(String type, int numWheels) {
        try {
            new Vehicle(type, numWheels);
        } catch (IllegalArgumentException e) {
            return "Illegal number of wheels";
        }
        return "Vehicle constructed";
    }
	
	
	// LAB EXERCISE 6.3  Vehicle COPY CONSTRUCTOR

    /**
     * Creates a copy of another Vehicle object.
     * @param other is another Vehicle object.
     */
    public Vehicle(Vehicle other) {
		this.type = other.type;
		this.numWheels = other.numWheels;
    }
	
	
	
	/* DO NOT MODIFY CODE BELOW */

    /**
     * Return the type of vehicle.
     * @return type of vehicle.
     */
    public String getType() {
        return type;
    }

    /**
     * Set the type of vehicle.
     * @param type of vehicle.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Return the number of wheels of vehicle.
     * @return number of wheels.
     */
    public int getNumWheels() {
        return numWheels;
    }

    /**
     * Set the number of wheels of vehicle.
     * @param numWheels number of wheels of vehicle.
     */
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }


    /**
     * Return the vehicle information for printing.
     * @return a string for printing.
     */
    public String toString() {
        return "Vehicle of type: " + type + " has " + numWheels + " wheels";
    }

}
