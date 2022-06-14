package ejercicios.E2;

public class Docentes extends Persona {
    
    public Docentes(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Recibido: " + msg);
    }
}
