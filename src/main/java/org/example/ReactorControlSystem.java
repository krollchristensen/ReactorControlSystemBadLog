package org.example;

public class ReactorControlSystem {
    public void startReactor() {
        System.out.println("Reactor is starting...");
        // Overlogging
        System.out.println("Opening valves...");
        System.out.println("Increasing nuclear fission rate...");
        System.out.println("Adjusting coolant flow...");
        System.out.println("Reactor started successfully.");

        // Logge følsomme data
        String operatorPassword = "superSecret123";
        System.out.println("Operator password for starting reactor: " + operatorPassword);
    }

    public void shutdownReactor() {
        System.out.println("Shutting down reactor...");
        // Overlogging
        System.out.println("Closing valves...");
        System.out.println("Decreasing nuclear fission rate...");
        System.out.println("Adjusting coolant flow to minimal...");
        // Mangler fejlhåndtering og logniveauer
        System.out.println("An unexpected error occurred!");
        System.out.println("Reactor shutdown successfully.");
    }

    public void adjustCoolantFlow(int flowRate) {
        // Manglende logniveauer og overlogging
        System.out.println("Adjusting coolant flow rate to: " + flowRate + " liters per minute.");
        if(flowRate > 1000) {
            System.out.println("Warning: Coolant flow rate exceeds safe limits!");
        }
    }

    public static void main(String[] args) {
        ReactorControlSystem controlSystem = new ReactorControlSystem();
        controlSystem.startReactor();
        controlSystem.adjustCoolantFlow(1200);
        controlSystem.shutdownReactor();
    }
}
