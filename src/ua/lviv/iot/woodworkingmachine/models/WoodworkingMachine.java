package ua.lviv.iot.woodworkingmachine.models;

public abstract class WoodworkingMachine {
    private String name;
    private String appointment;
    private double power;

    public WoodworkingMachine(String name, String appointment, double power) {
        this.name = name;
        this.appointment = appointment;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public static <U extends Comparable<? super U>, T> U getProductionCompany(T t) {
return null;
    }

}
