/**
 * Exercise 05 Chapter X for cleanup design principles, patterns, code-style documentation.
 * <p>
 * What does this do?
 */
public class Rectangle {
    private double width;
    private double height;

    /**
     * Builds the Rectangle with provided arguments w and h.
     *
     * @param w the width of the rectangle
     * @param h the height of the rectangle
     */
    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    /**
     * Doubles the area of this rectangle.
     *
     * @return the area of the rectangle
     */
    public double area() {
        return width * height;
    }

    /**
     * Scales the rectangle.
     *
     * @param factor the scaling factor
     */
    public void scale(double factor) {
        width = width * factor;
        height = height * factor;
    }

    /**
     * Checks if this rectangle is larger than another rectangle.
     *
     * @param other the other rectangle to compare with
     * @return true if this rectangle is larger, false otherwise
     */
    public boolean isLargerThan(Rectangle other) {
        if (area() > other.area()) {
            return true;
        } else {
            return false;
        }
    }
}
