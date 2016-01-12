package concesionario;
//Yasmin
public class Camion extends Vehiculo{
    private int nRodas;

    public Camion() {
        super();
    }

    public Camion(int cilindrada, int potencia, int nRodas) {
        super(cilindrada, potencia);
        this.nRodas=nRodas;
    }

    public int getnRodas() {
        return nRodas;
    }

    public void setnRodas(int nRodas) {
        this.nRodas = nRodas;
    }
    public float calcularImposto(){
        return (getCilindrada()/30)+(getPotencia()*20)+(nRodas*20);
    }

    @Override
    public String toString() {
        return "Camion{" + "nRodas=" + nRodas + '}';
    }
    
}
