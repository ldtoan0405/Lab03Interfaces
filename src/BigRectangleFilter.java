import java.awt.Rectangle;

public class BigRectangleFilter implements Filter {
    @Override
    public boolean accept(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle rect = (Rectangle) obj;
            return (2 * (rect.getWidth() + rect.getHeight())) > 10;
        }
        return false;
    }
}
