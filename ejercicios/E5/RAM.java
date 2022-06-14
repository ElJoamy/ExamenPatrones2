package ejercicios.E5;

public class RAM {
    String capacityT;
    int capacityUtilizada;
    String description;

    public RAM(){}

    public String getCapacityT() {
        return capacityT;
    }

    public RAM setCapacityT(String capacityT) {
        this.capacityT = capacityT;
        return this;
    }

    public int getCapacityUtilizada() {
        return capacityUtilizada;
    }

    public RAM setCapacityUtilizada(int capacityUtilizada) {
        this.capacityUtilizada = capacityUtilizada;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RAM setDescription(String description) {
        this.description = description;
        return this;
    }

    public void showInfo() {
        System.out.println("<---Memoria RAM--->");
        System.out.println("Capacidad total: " + capacityT);
        System.out.println("Capacidad utilizada: " + capacityUtilizada);
        System.out.println("Descripción: " + description);
    }
}
