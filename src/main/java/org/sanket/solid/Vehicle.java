package org.sanket.solid;

public abstract class Vehicle {
    private boolean isServicingCompleted;

    public boolean isServicingCompleted() {
        return isServicingCompleted;
    }

    public void setServicingCompleted(boolean servicingCompleted) {
        isServicingCompleted = servicingCompleted;
    }

    public abstract double calculateMaintenanceCost();
}



