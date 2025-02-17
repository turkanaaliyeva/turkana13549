public class Dimension {
    private int width = 0, length = 0, height = 0;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Width: ").append(Integer.toString(width))
        .append(" \n length: ").append(Integer.toString(length))
        .append("\n height: ").append(Integer.toString(height)).append("\n");
        return sb.toString();
    }
}