package OnlineRadioDatabase;

public class InvalidSongException extends RuntimeException{
    public InvalidSongException(String message) {
        super(message);
    }
}
