package at.jku.isse.ecco.webdev.config;

import at.jku.isse.ecco.webdev.resource.HelloWorldResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HelloWorldResource.class);
    }
}
