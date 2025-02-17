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
            StringBuilder sb = new StringBuilder();
            sb.append("Width: ").append(Integer.toString(width))
            .append(" \n length: ").append(Integer.toString(length))
            .append("\n height: ").append(Integer.toString(height)).append("\n");
            return sb.toString();
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

    public Room(int ID, String name, String loc, 
    RoomType type, int width, int length, int height, 
    ArrayList <Equipment> eq, boolean status){
        this.ID = ID;
        this.name = name;
        this.loc = loc;
        this.type = type;
        this.dimension = new Dimension();
        this.dimension.setWidth(width);
        this.dimension.setLength(length);
        this.dimension.setHeight(height);
        this.eq = eq != null ? eq : new ArrayList<Equipment>();
        this.status = status;
    }

    public String toString() {
        return "Room{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                ", type=" + type +
                ", dimension=" + dimension + 
                ", eq=" + formatEquipment() +
                ", status=" + (status ? "Available" : "Occupied") +
                '}';
    }

    public void addEquipment(Equipment equipment) {
        if (!eq.contains(equipment)) {
            eq.add(equipment);
        }
    }

    public void removeEquipment(Equipment equipment) {
        eq.remove(equipment);
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

    public ArrayList<Equipment> getEq() {
        return eq;
    }

    public void setEq(ArrayList<Equipment> eq) {
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

        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(Integer.toString(this.ID))
        .append(" \n Name: ").append(this.name)
        .append(" \n Location: ").append(this.loc)
        .append(" \n Room Type: ").append(tmtp_st(this.type))
        .append(" \n Dimension: ").append(this.dimension.toString())
        .append(" \n Equipment:").append(eq_st(this.eq))
        .append(" \n Status: ").append(s).append("\n");
        return sb.toString();
    }
}