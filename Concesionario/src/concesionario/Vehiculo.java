package concesionario;
//Yasmin
public abstract class Vehiculo {
   private int cilindrada,potencia;

    public Vehiculo() {
    }

    public Vehiculo(int cilindrada, int potencia) {
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public int getPotencia() {
        return potencia;
    }
    public String arrancar(){
        return "Arranca o vehiculo";
    }
    public abstract float calcularImposto();

    @Override
    public String toString() {
        return "Vehiculo{" + "cilindrada=" + cilindrada + ", potencia=" + potencia + '}';
    }
}
