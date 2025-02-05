public class Room {

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
    }

    public enum RoomType {
        NONE,
        OFFICE,
        MAJLIS,
        G_STUDY,
        S_CASES,
        M_CASES,
        L_CASES,
        AUDITORIUM,
        LAB
    }

    public enum Equipment {
        NONE,
        SMART_BOARD,
        WHITEBOARD,
        COMPUTERS,
        PROJECTOR
    }

    private int ID = 0;
    private String name = "";
    private String loc = "UNKNOWN!";
    private RoomType type = RoomType.NONE;
    private Dimension dimension = new Dimension();
    private Equipment eq = Equipment.NONE;
    private boolean status = false;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Equipment getEq() {
        return eq;
    }

    public void setEq(Equipment eq) {
        this.eq = eq;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
