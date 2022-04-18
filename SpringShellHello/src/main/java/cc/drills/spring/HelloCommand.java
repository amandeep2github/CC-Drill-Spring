package cc.drills.spring;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class HelloCommand {
    @ShellMethod(value = "Say Hello")
    public String sayHello(String name) {
        return String.format("Hello %s", name);
    }
}
