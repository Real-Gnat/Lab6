package ua.lviv.iot.woodworkingmachine.models;

public class CirucularMachine extends WoodworkingMachine{
    private  ClassificationType Classification;
    private double Radius;
    private double Sortie;

    public CirucularMachine(String name, String appointment, double power, ClassificationType classification, double radius, double sortie) {
        super(name, appointment, power);
        Classification = classification;
        Radius = radius;
        Sortie = sortie;
    }

    public ClassificationType getClassification() {
        return Classification;
    }

    public void setClassification(ClassificationType classification) {
        this.Classification = classification;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        this.Radius = radius;
    }

    public double getSortie() {
        return Sortie;
    }

    public void setSortie(double sortie) {
        this.Sortie = sortie;
    }
}
