package Turtle_task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Turtle_task.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    private Turtle turtle;

    @BeforeEach
    public void setUp() {
        turtle = new Turtle();
    }

    @Test
    public void testThatTurtleIsDefault() {
        turtle = new Turtle();
        assertTrue(turtle.penIsUp());
    }

    @Test
    public void testThatTurtlePenCanMoveDown() {
        turtle.penIsUp();
        assertTrue(turtle.penIsUp());
        turtle.movePenDown();
        assertFalse(turtle.penIsUp());
    }

    @Test
    public void testThatTurtlePenCanMoveUp() {
        turtle.movePenDown();
        assertFalse(turtle.penIsUp());
        turtle.movePenUp();
        assertTrue(turtle.penIsUp());
    }

    @Test
    public void testThatTurtleCanTurnRightWhenFacingEast() {
        assertSame(EAST, turtle.getCurrentLocation());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentLocation());
    }

    @Test
    public void testThatTurtleCanTurnRightWhenFacingSouth() {
        assertSame(EAST, turtle.getCurrentLocation());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentLocation());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentLocation());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentLocation());
    }

    @Test
    public void testThatTurtleCanTurnLeftWhenFacingEast() {
        assertSame(EAST, turtle.getCurrentLocation());
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentLocation());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentLocation());
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentLocation());
    }

    @Test
    public void testThatTurtleCan_moveForwardWhenPenIsDown_andFacingEast() {
        assertSame(WEST, turtle.getCurrentLocation());
        assertEquals(new position(0,0), turtle.getCurrentLocation());
        turtle.moveForward();
        assertEquals(new position(0,5), getCurrentPosition());
    }

}
