package ejercicios.E3;

public class UF implements IUser {
    String catalizador;
    UserP  persona;

    public UF(String catalizador, UserP persona) {
        this.catalizador = catalizador;
        this.persona = persona;
    }

    @Override
    public void actualizacion1(String msg, Notify n) {
        System.out.println("<---Notificaiones: " + msg + "--->");
        System.out.println("Persona: " + persona.getName());
        System.out.println("Pref: " + catalizador);
        
}
