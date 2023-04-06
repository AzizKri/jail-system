package jail;

import java.util.ArrayList;


public class Cell {
    private Officer officer;
    private ArrayList<Prisoner> prisoners;
    private String cell_type;
    private int cell_number;
    
    public Cell() {
        this(new Officer(), new ArrayList<Prisoner>(), "", 0);
    }
    
    public Cell(Officer officer, ArrayList<Prisoner> prisoners, String cell_type, int cell_number) {
        this.officer = new Officer(officer);
        this.prisoners = copy(prisoners);
        this.cell_type = cell_type;
        this.cell_number = cell_number;
    }
    
    public Cell(Cell c1){
        this.officer = new Officer(c1.officer);
        this.prisoners = copy(c1.prisoners);
        this.cell_type = c1.cell_type;
        this.cell_number = c1.cell_number;
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

    public String getCell_type() {
        return cell_type;
    }

    public void setCell_type(String cell_type) {
        this.cell_type = cell_type;
    }

    public int getCell_number() {
        return cell_number;
    }

    public void setCell_number(int cell_number) {
        this.cell_number = cell_number;
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
