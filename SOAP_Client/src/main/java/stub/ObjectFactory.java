
package stub;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stub package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _NoSuchProductException_QNAME = new QName("http://webservices.amoa/", "NoSuchProductException");
    private static final QName _Product_QNAME = new QName("http://webservices.amoa/", "product");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NoSuchProductException }
     * 
     * @return
     *     the new instance of {@link NoSuchProductException }
     */
    public NoSuchProductException createNoSuchProductException() {
        return new NoSuchProductException();
    }

    /**
     * Create an instance of {@link Product }
     * 
     * @return
     *     the new instance of {@link Product }
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Products }
     * 
     * @return
     *     the new instance of {@link Products }
     */
    public Products createProducts() {
        return new Products();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchProductException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NoSuchProductException }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.amoa/", name = "NoSuchProductException")
    public JAXBElement<NoSuchProductException> createNoSuchProductException(NoSuchProductException value) {
        return new JAXBElement<>(_NoSuchProductException_QNAME, NoSuchProductException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.amoa/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<>(_Product_QNAME, Product.class, null, value);
    }

}
