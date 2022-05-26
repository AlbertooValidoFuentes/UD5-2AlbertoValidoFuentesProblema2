public class VeredaGT implements Vehicle{
    private String matricula;
    private final float MAX_ENERGY = 100.0f;
    private float energy;
    private int movementCount;
    private final int  ENERGY_DELTA = 5;

    public VeredaGT(String matricula, float energy) {
        this.matricula = matricula;
        this.energy = energy;
    }

    @Override
    public float energyLevel() {
        return energy;
    }

    @Override
    public void recharge() {

        if (energy == MAX_ENERGY) {
            System.out.println("The vehicle is already fully charged");
        } else {
            energy = MAX_ENERGY;
            System.out.println("The vehicle has been charged");
        }
    }

    @Override
    public void move() {
        if (energy < ENERGY_DELTA) {
            System.out.println("No energy");
        } else {
            energy -= ENERGY_DELTA;
            movementCount++;
        }
    }

    @Override
    public String status() {
        return "El vehiculo " + matricula + " tiene un nivel de carga de: " + energy + " y se ha movido "
                + movementCount + " veces.";
    }
}
