import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void testVehicleConstructor() {
        assertEquals("Vehicle constructed", Vehicle.testConstructor("car", 4));
        assertEquals("Illegal number of wheels", Vehicle.testConstructor("truck", 3));
    }
	
	@Test
    public void testVehicleCopyConstructor() {
        Vehicle v1 = new Vehicle("Type A", 2);
        Vehicle v2 = new Vehicle(v1);
        assertEquals("Type A", v1.getType());
        assertEquals("Type A", v2.getType());

        v2.setType("Type B");
        assertEquals("Type A", v1.getType());
        assertEquals("Type B", v2.getType());
    }
	
	
}
