package amoa.server;

import amoa.webservices.ProductsManagerImpl;
import jakarta.xml.ws.Endpoint;
import org.eclipse.persistence.sessions.server.Server;
import java.util.logging.Logger;

public class ServicePublisher {
    private static final Logger logger = Logger.getLogger(ServicePublisher.class.getName());

    public static void main(String[] args) {
        String url = "http://localhost:2024/webservices/ProductsManager";
        logger.info("Starting Server");
        Endpoint.publish(url, new ProductsManagerImpl());
        logger.info("Server started");
    }
}
