package org.sanket.solid;

class Car extends Vehicle {
    boolean isServicingCompleted =false;

    public boolean isServicingCompleted() {
        return isServicingCompleted;
    }

    public void setServicingCompleted(boolean servicingCompleted) {
        isServicingCompleted = servicingCompleted;
    }

    @Override
    public double calculateMaintenanceCost() {
        return 299;
    }



}
