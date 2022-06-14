package ejercicios.E5;

public class ProgramasAbiertos {
    String programas;

    public ProgramasAbiertos() {}

    public String getProgramas() {
        return programas;
    }

    public ProgramasAbiertos setProgramas(String programas) {
        this.programas = programas;
        return this;
    }

    public void showInfo() {
        System.out.println("Programas abiertos: " + programas);
    }
}
