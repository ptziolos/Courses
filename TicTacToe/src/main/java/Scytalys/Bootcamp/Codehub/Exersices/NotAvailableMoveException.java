package Scytalys.Bootcamp.Codehub.Exersices;

public class NotAvailableMoveException extends Exception {
    public NotAvailableMoveException() {
        super("This is not an available move.");
    }
}