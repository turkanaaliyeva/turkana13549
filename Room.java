import java.util.ArrayList;

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

        @Override
        public String toString() {
            return "Width: " + Integer.toString(width) + " \n length: " + Integer.toString(length) + "\n height: " + Integer.toString(height) + "\n";
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
    private String tmtp_st(RoomType rm){
        switch (rm) {
            case OFFICE:
                return "OFFICE";
            case MAJLIS:
                return "MAJLIS";
            case G_STUDY:
                return "G_STUDY";
            case S_CASES:
                return "S_CASES";
            case M_CASES:
                return "M_CASES";
            case L_CASES:
                return "L_CASES";
            case AUDITORIUM:
                return "AUDITORIUM";
            case LAB:
                return "LAB";
            default:
                return "NONE";
        }
    }
    public enum Equipment {
        NONE,
        SMART_BOARD,
        WHITEBOARD,
        COMPUTERS,
        PROJECTOR
    }
    private String eq_st(ArrayList <Equipment> rm){
        String ans = "";
        for (Equipment equipment : rm) {
            switch (equipment) {
                case SMART_BOARD:
                    ans += "SMART_BOARD";
                    break;
                case WHITEBOARD:
                    ans += "WHITEBOARD";
                    break;
                case COMPUTERS:
                    ans += "COMPUTERS";
                    break;
                case PROJECTOR:
                    ans += "PROJECTOR";
                    break;
                default:
                    return "NONE";
            }
        }
        return ans;
    }

    private int ID;
    private String name;
    private String loc;
    private RoomType type;
    private Dimension dimension;
    private ArrayList <Equipment> eq;
    private boolean status;

    public Room(int ID, String name, String loc, RoomType type, int width, int length, int height, ArrayList <Equipment> eq, boolean status) {
        this.ID = ID;
        this.name = name;
        this.loc = loc;
        this.type = type;
        this.dimension = new Dimension();
        this.dimension.setWidth(width);
        this.dimension.setLength(length);
        this.dimension.setHeight(height);
        this.eq = eq;
        this.status = status;
    }

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

    public ArrayList <Equipment> getEq() {
        return eq;
    }

    public void setEq(ArrayList <Equipment> eq) {
        this.eq = eq;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString(){

        String s;
        if(this.status) s = "TRUE";
        else s = "FALSE";

        return "ID: " + Integer.toString(this.ID)  + " \n Name: " + this.name + " \n Location: " + this.loc + " \n Room Type: " + tmtp_st(this.type) + " \n Dimension: " + this.dimension.toString() + " \n Equipment:" + eq_st(this.eq) + " \n" + "Status: " + s + "\n";
        
    }
}