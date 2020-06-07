public class UserNameMissingException extends RuntimeException {

    public UserNameMissingException()
    {
        super("Enter a valid user name");
    }
}
