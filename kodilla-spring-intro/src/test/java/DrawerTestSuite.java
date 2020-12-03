import com.kodilla.spring.spring.intro.shape.Circle;
import com.kodilla.spring.spring.intro.shape.Drawer;
import com.kodilla.spring.spring.intro.shape.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrawerTestSuite {
    @Test

    void testDoDrawingWithCircle() {
        //Given
        Circle circle = new Circle();

        Drawer drawer = new Drawer(circle);

        //When

        String result = drawer.doDrawing();

        //Then

        Assertions.assertEquals("This is a circle", result);
    }

    @Test

    void testDoDrawingWithTriangle() {

        //Given

        Triangle triangle = new Triangle();

        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

        //Then
        Assertions.assertEquals("This is a square", result);

    }
}
