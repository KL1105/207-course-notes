/**
 * Exercise 05 Chapter X for cleanup design principles, patterns, code-style documentation.
 *
 * What does this do
 *
 *
 *
 *
 */
public class Rectangle {
    private double width;
    private double height;

    /** Builds the Rectange with provided arguments w and h **/
    public Rectangle(double w,double h){
        this.width=w;
        this.height=h;
    }

    /** Doubles the area of this rectangle **/
    public double area(){
        return width*height;
    }

    /**
     * scales the rectangle
     * @param factor
     */
    public void scale(double factor) {
      width = width * factor;
      height = height * factor;
    }

    /**
     * checks if this rectangle is larger or other rectangle is.
     * Return true if this rectangle is larger. Otherwise, this rectangle
     * and is smaller than or equal size other rectangle: return false.
     * @param other
     */
    public boolean isLargerThan(Rectangle other){
        if(area() > other.area()) {
            return true;
        } else {
            return false;
        }
    }
}