package org.sanket.solid;

public class NotificationSender implements NotificationService {

    @Override
    public void sendNotification(String message, String to, Vehicle vehicle) {
        if (vehicle instanceof Bike){
            if (((Bike) vehicle).isServicingCompleted()){
                System.out.println(" Bike servicing is Completed");
            }else {
                System.out.println(" Bike servicing is Pending ! HoldON will notify once completed ");
            }

        } else if (vehicle instanceof Car) {

            if (((Car) vehicle).isServicingCompleted()){
                System.out.println(" Car servicing is Completed");
            }else {
                System.out.println(" Car servicing is Pending ! HoldON will notify once completed ");
            }
        }
    }
}
