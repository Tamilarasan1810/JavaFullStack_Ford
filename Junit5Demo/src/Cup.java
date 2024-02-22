public class Cup {
    private String liquidType;
    private double precentFull;

    public Cup(String liquidType,double precentFull)
    {
        this.liquidType = liquidType;
        this.precentFull = precentFull;
    }

    public String getLiquitType() {
        return liquidType;
    }

    public void setLiquitType(String liquidType) {
        this.liquidType = liquidType;
    }

    public double getPrecentFull() {
        return precentFull;
    }

    public void setPrecentFull(double precentFull) {
        this.precentFull = precentFull;
    }
}
