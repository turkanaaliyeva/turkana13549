import java.util.ArrayList;

import enums.Equipment;
import enums.RoomType;

 
public class Room {

    private int ID;
    private String name;
    private String loc;
    public RoomType type;
    private Dimension dimension;
    private ArrayList <Equipment> eq;
    private boolean status;

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