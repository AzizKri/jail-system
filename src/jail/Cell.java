package jail;

import java.util.ArrayList;


public class Cell {
    private Officer officer;
    private ArrayList<Prisoner> prisoners;
    private String cellType;
    private int cellNumber;
    
    public Cell() {
        this(new Officer(), new ArrayList<Prisoner>(), "", 0);
    }
    
    public Cell(Officer officer, ArrayList<Prisoner> prisoners, String cell_type, int cell_number) {
        this.officer = new Officer(officer);
        this.prisoners = copy(prisoners);
        this.cellType = cellType;
        this.cellNumber = cellNumber;
    }
    
    public Cell(Cell c1){
        this.officer = new officer(c1.officer);
        this.prisoners = copy(c1.prisoners);
        this.cellType = c1.cellType;
        this.cellNumber = c1.cellNumber;
    }

    public Officer getOfficer() {
        return officer;
    }

    public void setOfficer(Officer officer) {
        this.officer = officer;
    }

    public ArrayList<Prisoner> getPrisoners() {
        return prisoners;
    }

    public void setPrisoners(ArrayList<Prisoner> prisoners) {
        this.prisoners = prisoners;
    }

    public String getCellType() {
        return cellType;
    }

    public void setCellType(String cellType) {
        this.cellType = cellType;
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
        this.prisoners.remove(p);
    }
    
    public void transfer(Prisoner p, Cell c){
        if (this.prisoners.contains(p) && !c.prisoners.conatins(p)){
            c.add_prisoner(p);
            this.remove_prisoner(p);
        }
    }
}
