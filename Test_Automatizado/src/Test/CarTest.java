package Test;

import com.patrickfrr.Car;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {


    @Test
    public void testStopCar() {
        Car c = new Car();
        assertEquals(0, c.getSpeed());
    }

    @Test
    public void testSpeedUp() {
        Car c = new Car();
        c.potency = 10;
        c.speedUp();
        assertEquals(10, c.getSpeed());
    }

    @Test
    public void testBrake(){
         Car c = new Car();
         c.potency = 10;
         c.speedUp();
         c.brake();
         assertEquals(5, c.getSpeed());
    }

    @Test
    public void testBrakePointZero(){
        Car c = new Car();
        c.potency = 10;
        c.speedUp();
        c.brake();
        c.brake();
        c.brake();
        c.brake();
        assertEquals(0, c.getSpeed());
    }
}


