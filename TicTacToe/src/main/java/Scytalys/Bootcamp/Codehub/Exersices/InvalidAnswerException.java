package Scytalys.Bootcamp.Codehub.Exersices;

public class InvalidAnswerException extends Exception{
    public InvalidAnswerException() {
        super("This is not a valid answer");
    }
}
