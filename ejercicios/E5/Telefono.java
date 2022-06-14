package ejercicios.E5;

public class Telefono {
    private IStteTelefono state;
    private ProgramasAbiertos programasAbiertos;
    private RAM ram;
    private CPU cpu;

    public Telefono(){
        this.programasAbiertos = new ProgramasAbiertos();
        this.ram = new RAM();
        this.cpu = new CPU();
        programasAbiertos.setProgramas("VAROS PROGRMAS ABIERTOS");
        
        state = new Apgdo();
    }

    public IStteTelefono getState() {
        return state;
    }

    public void setState(IStteTelefono state) {
        this.state = state;
    }

    public ProgramasAbiertos getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(ProgramasAbiertos programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    
}
