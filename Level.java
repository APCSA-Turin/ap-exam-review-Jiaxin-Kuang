
public class Level{
	// ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    private boolean goalReached;
    private int points;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public Level(boolean goalReached, int points) {
        this.goalReached = goalReached;
        this.points = points;
    }

/** Returns true if the player reached the goal on this level and returns false otherwise */
public boolean goalReached(){ 
return goalReached;
}
/** Returns the number of points (a positive integer) recorded for this level */
public int getPoints(){ 
return points;
}
// There may be instance variables, constructors, and methods that are not shown.
}
