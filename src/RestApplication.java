import service.HelloWorldService;
import service.RegionRestService;

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
        h.add(RegionRestService.class);
        return h;
    }
}
