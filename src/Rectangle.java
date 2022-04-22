public class Rectangle {
    //צור משתנים צבע אורך ורוחב
    private int color;
    private int length;
    private int width;
    //פעולה שיוצרת מלבן חדש
    public Rectangle (int color, int length, int width)
    {
        this.color = color;
        this.length = length;
        this.width = width;
    }
    //getters and setters
    public int getColor() {
        return color;
    }
    public void setColor(int color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    //פעולה שמחזירה את השטח של המלבן (אורך כפול רוחב)
    public int area()
    {
        return this.length*this.width;
    }


}
