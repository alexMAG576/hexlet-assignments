package exercise;

import exercise.model.Address;
import exercise.annotation.Inspect;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {
        var address = new Address("London", 12345678);

        // BEGIN
        for (Method method : Address.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Inspect.class)) {
                var name = method.getName();
                var nameClass = method.getClass().getModifiers();
                System.out.println("Method " + name + " returns a value of type " + nameClass + ".");
            }
        }
        // END
    }
}
