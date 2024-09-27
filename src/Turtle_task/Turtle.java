package Turtle_task;

import static Turtle_task.Direction.*;

public class Turtle {

    private boolean penIsUp = true;
    private Direction currentDirection = EAST;

    public boolean penIsUp() {
        return penIsUp;
    }

    public boolean movePenDown() {
        return penIsUp = false;
    }

    public void movePenUp() {
        penIsUp = true;
    }

    public Direction getCurrentLocation() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == SOUTH) currentDirection = WEST;
        else if(currentDirection == EAST) currentDirection = SOUTH;
        else if(currentDirection == WEST) currentDirection = NORTH;
        else if(currentDirection == NORTH) currentDirection = EAST;
    }

    public void turnLeft() {
        if(currentDirection == EAST) currentDirection = NORTH;
        else if(currentDirection == WEST) currentDirection = SOUTH;
        else if(currentDirection == SOUTH) currentDirection = EAST;
        else if(currentDirection == NORTH) currentDirection = WEST;
    }

    public void moveForward() {
    }
}
