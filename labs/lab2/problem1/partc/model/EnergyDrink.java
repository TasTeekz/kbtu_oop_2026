package labs.lab2.problem1.partc.model;

import java.util.Objects;

public class EnergyDrink extends Drink {

    private int caffeineMg;
    private int heartAttackRiskLevel; // 1–10

    public EnergyDrink(String name, double volume, int caffeineMg, int riskLevel) {
        super(name, volume);
        this.caffeineMg = caffeineMg;
        this.heartAttackRiskLevel = riskLevel;
    }

    public int getCaffeineMg() {
        return caffeineMg;
    }

    public int getHeartAttackRiskLevel() {
        return heartAttackRiskLevel;
    }

    public void setCaffeineMg(int caffeineMg) {
        this.caffeineMg = caffeineMg;
    }

    public void setHeartAttackRiskLevel(int heartAttackRiskLevel) {
        this.heartAttackRiskLevel = heartAttackRiskLevel;
    }

    @Override
    public String toString() {
        return "EnergyDrink{" +
                "name='" + getName() + '\'' +
                ", volume=" + getVolume() +
                ", caffeineMg=" + caffeineMg +
                ", heartAttackRiskLevel=" + heartAttackRiskLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o))
            return false;
        if (!(o instanceof EnergyDrink))
            return false;
        EnergyDrink that = (EnergyDrink) o;
        return caffeineMg == that.caffeineMg &&
                heartAttackRiskLevel == that.heartAttackRiskLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), caffeineMg, heartAttackRiskLevel);
    }
}