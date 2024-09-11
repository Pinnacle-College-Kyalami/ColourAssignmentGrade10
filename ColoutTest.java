import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ColourTest {

    @Test
    public void testColourChange() {
        ColourAssignment assignment = new ColourAssignment();
        
        for (int i = 0; i <= 255; i++) {
            int red = 255 - i;
            int blue = 0 + i;
            assertEquals(red, assignment.getRedValue(i));
            assertEquals(blue, assignment.getBlueValue(i));
        }
    }
}

