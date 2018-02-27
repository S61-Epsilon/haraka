import service.HelloWorldService;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class RestApplication extends Application{
    @Override
    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> h = new HashSet<>();
        h.add(HelloWorldService.class);
        return h;
    }
}
