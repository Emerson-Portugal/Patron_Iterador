package ConLibreria;

public class Persona {
    
    private String name;

    public Persona() {
    }

    public Persona(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return " Nombre "  + name + "\n" ;
    }

    

}
