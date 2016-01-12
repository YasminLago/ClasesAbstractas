package concesionario;
//Yasmin
public class Coche extends Vehiculo {
    private int nPortas;

    public Coche() {
        super();
    }
    public Coche(int cilindrada, int potencia, int nPortas) {
        super(cilindrada, potencia);
        this.nPortas=nPortas;
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }
    public float calcularImposto(){
        return (getCilindrada()/20)+(getPotencia()*20);
    }

    @Override
    public String toString() {
        return "Coche{" + "nPortas=" + nPortas +"Potencia"+getPotencia()+"Cilindrada"+getCilindrada()+'}';
    }
    
}
