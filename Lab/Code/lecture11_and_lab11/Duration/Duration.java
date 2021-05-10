public class Duration implements Comparable<Duration> {

    private final int mins;
    private final int secs;
    // rep invariant:
    //    mins >= 0, secs >= 0
    // abstraction function:
    //    represents a span of time of mins minutes and secs seconds

    /** Make a duration lasting for m minutes and s seconds. */
    public Duration(int m, int s) {
        mins = m; secs = s;
    }

    /** @return length of this duration in seconds */
    public int getLength() {
        return mins*60 + secs;
    }

    @Override
    public boolean equals (Object that) {
        if (this == that) return true;
        if (that == null) return false;
        if (!(that instanceof Duration)) return false;
        Duration thatDuration = (Duration) that;
        return this.getLength() == thatDuration.getLength();
    }


    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    // LAB EXERCISE 11.1  COMPARETO

    @Override
    public ... compareTo( ... ) {
		
		
		
    }

}