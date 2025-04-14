package org.sanket.solid;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Vehicle vehicle = new Bike();
        vehicle.calculateMaintenanceCost();

        NotificationService notificationService = new NotificationSender();
        notificationService.sendNotification("username ","userTo",vehicle);

        vehicle.setServicingCompleted(true);

        System.out.println("Maintenance Cost: " + vehicle.calculateMaintenanceCost());
        System.out.println("Is Servicing Done: " + vehicle.isServicingCompleted());

        notificationService.sendNotification("username ","userTo",vehicle);

    }
}