package bt.edu.gcit.usermicroservice.exception;

//obj will be created but wont be maintain in ioc container
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
    super(message);
    }
   }
