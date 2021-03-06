package ejercicios.E2;

public abstract class Persona {
    protected Mediator mediator;
    private String nombre;
    private String  tipo;
    private String ci;

    public Persona(Mediator mediator){
        this.mediator = mediator;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
