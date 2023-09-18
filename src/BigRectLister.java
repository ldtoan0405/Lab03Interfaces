import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        // Create and add rectangles to the list
        rectangles.add(new Rectangle(2, 3)); // Perimeter = 10
        rectangles.add(new Rectangle(5, 2)); // Perimeter = 14
        rectangles.add(new Rectangle(3, 3)); // Perimeter = 12
        rectangles.add(new Rectangle(1, 1)); // Perimeter = 4
        rectangles.add(new Rectangle(6, 6)); // Perimeter = 24
        rectangles.add(new Rectangle(4, 4)); // Perimeter = 16
        rectangles.add(new Rectangle(3, 7)); // Perimeter = 20
        rectangles.add(new Rectangle(2, 8)); // Perimeter = 20
        rectangles.add(new Rectangle(5, 5)); // Perimeter = 20
        rectangles.add(new Rectangle(1, 10)); // Perimeter = 22

        Filter bigRectangleFilter = new BigRectangleFilter();

        for (Rectangle rect : rectangles) {
            if (bigRectangleFilter.accept(rect)) {
                System.out.println("Rectangle with perimeter > 10: " + rect);
            }
        }
    }
}
