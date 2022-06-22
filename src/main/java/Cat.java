import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("cat")
public class Cat {

    private String name;

    public void voice (){
        System.out.println("голос");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
