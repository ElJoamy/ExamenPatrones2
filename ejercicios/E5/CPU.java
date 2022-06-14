package ejercicios.E5;

public class CPU {
    String capacityT;
    int capacityUtilizada;
    String description;

    public CPU(){}

    public String getCapacityT() {
        return capacityT;
    }

    public CPU setCapacityT(String capacityT) {
        this.capacityT = capacityT;
        return this;
    }

    public int getCapacityUtilizada() {
        return capacityUtilizada;
    }

    public CPU setCapacityUtilizada(int capacityUtilizada) {
        this.capacityUtilizada = capacityUtilizada;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CPU setDescription(String description) {
        this.description = description;
        return this;
    }

    public void showInfo() {
        System.out.println("<---CPU--->");
        System.out.println("Capacidad total: " + capacityT);
        System.out.println("Capacidad utilizada: " + capacityUtilizada);
        System.out.println("Descripción: " + description);
    }
}
