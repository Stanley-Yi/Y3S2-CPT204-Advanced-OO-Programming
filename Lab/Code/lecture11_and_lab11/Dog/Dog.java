public class Dog implements Comparable<Dog> {

    private String name;
    private int weight;

    public Dog(String n, int w) {
        name = n;
        weight = w;
    }

    /**
     * @param other another Dog
     * @return negative number if this is smaller than other
     *         0 if this equals other
     *         positive number if this is larger than other
     */
    @Override
    public int compareTo(Dog other) {

//        if (this.weight < other.weight) {
//            return -1;
//        } else if (this.weight == other.weight) {
//            return 0;
//        }
//        return 1;

        return this.weight - other.weight;

    }

    public void bark() {
        System.out.println(name + ": bark!");
    }


    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    // LAB EXERCISE 11.2  EQUALS

    @Override
    public boolean equals(Object other) {
		if (! (other instanceof Dog)) return false;
		if (this.weight == ((Dog) other).weight) {
            return this.name.equals(((Dog) other).name);
        }
		return false;
		
    }

}