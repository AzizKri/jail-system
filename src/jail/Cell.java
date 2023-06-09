package jail;

import java.util.ArrayList;


public class Cell {
    private Officer officer;
    private ArrayList<Prisoner> prisoners = new ArrayList<Prisoner>();
    private int cellNumber;
    
    public Cell() {
        this(new Officer(), new ArrayList<Prisoner>(), 0);
    }
    
    public Cell(Officer officer, ArrayList<Prisoner> prisoners, int cellNumber) {
        this.officer = Database.getOfficer(officer.getBadgeNumber());
        this.prisoners = prisoners;
        this.cellNumber = cellNumber;
        Database.addCell(this);
    }
    
    public Cell(Cell c1){
        this.officer = new Officer(c1.officer);
        copy(c1.prisoners);
        this.cellNumber = c1.cellNumber;
        Database.addCell(this);
    }

    public Officer getOfficer() {
        return officer;
    }

    public void setOfficer(Officer officer) {
        this.officer = new Officer(officer);
    }

    public ArrayList<Prisoner> getPrisoners() {
        return prisoners;
    }

    public void setPrisoners(ArrayList<Prisoner> prisoners) {
        copy(prisoners);
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }
    
    public void copy(ArrayList<Prisoner> p){
        for (int i = 0; i < p.size(); i++) {
            this.prisoners.add(p.get(i));
        }
    }
    
    public void add_prisoner(Prisoner p){
        this.prisoners.add(p);
    }
    
    public void remove_prisoner(Prisoner p){
        for (int i = 0; i < prisoners.size(); i++) {
            if (prisoners.get(i).getInmateID().equals(p.getInmateID())){
                prisoners.remove(prisoners.get(i));
            }
        }
    }
    
    public void transfer(Prisoner p, Cell c){
            c.add_prisoner(p);
            this.remove_prisoner(p);
    }
    
    @Override
    public String toString(){
        String s = "";
        for (Prisoner prisoner : prisoners) {
            s += ";" + prisoner.getInmateID();
        }
        return officer + ";" + cellNumber;
    }
    
    public String display(){
        String s = "";
        for (int i = 0; i < prisoners.size(); i++) {
            s += prisoners.get(i).display() + "\n" + "-----------------------------------------------" + "\n";
        }
        return s;
    }
}
