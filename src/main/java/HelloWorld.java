import org.springframework.stereotype.Component;

@Component("helloworld")
public class HelloWorld {

    public HelloWorld() {
    }

    private String message;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}