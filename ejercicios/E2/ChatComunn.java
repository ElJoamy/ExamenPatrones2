package ejercicios.E2;

import java.util.HashMap;
import java.util.Map;

public class ChatComunn implements Mediator {
    Map<Persona, String> map = new HashMap<>();
 
    public void addChat(Persona persona) {
        map.put(persona, persona.getTipo());
    }

    @Override
    public void send(String msg, Persona persona) {
        Persona enviador = (Persona) persona;
        for (Persona p : map.keySet()) {
            if (!enviador.getCi().equals(p.getCi())) {
                if(enviador.getTipo().equals("Administrativos")){
                    p.receive(msg);
                }else if(enviador.getTipo().equals("Docentes")){
                    p.receive(msg);
                }else if(enviador.getTipo().equals("Estudiantes")){
                    p.receive(msg);
                }
            }
        }
    }
}
