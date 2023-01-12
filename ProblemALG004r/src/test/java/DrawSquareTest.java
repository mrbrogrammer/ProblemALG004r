import za.co.problem.DrawSquare;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class DrawSquareTest {

    @Test
    void returnsNumber() {

        int num = DrawSquare.getDimensions();


        assertEquals(3, num);
    }

}
