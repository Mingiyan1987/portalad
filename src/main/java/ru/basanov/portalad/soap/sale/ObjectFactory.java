//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.15 at 03:40:26 PM MSK 
//


package ru.basanov.portalad.soap.sale;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.basanov.portalad.soap.sale package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _GetSaleReqeust_QNAME = new QName("http://basanov.ru/portalad/soap/sale", "getSaleReqeust");
    private final static QName _GetSaleResponse_QNAME = new QName("http://basanov.ru/portalad/soap/sale", "getSaleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.basanov.portalad.soap.sale
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaleReqeust }
     * 
     */
    public SaleReqeust createSaleReqeust() {
        return new SaleReqeust();
    }

    /**
     * Create an instance of {@link SaleResponse }
     * 
     */
    public SaleResponse createSaleResponse() {
        return new SaleResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaleReqeust }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basanov.ru/portalad/soap/sale", name = "getSaleReqeust")
    public JAXBElement<SaleReqeust> createGetSaleReqeust(SaleReqeust value) {
        return new JAXBElement<SaleReqeust>(_GetSaleReqeust_QNAME, SaleReqeust.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basanov.ru/portalad/soap/sale", name = "getSaleResponse")
    public JAXBElement<SaleResponse> createGetSaleResponse(SaleResponse value) {
        return new JAXBElement<SaleResponse>(_GetSaleResponse_QNAME, SaleResponse.class, null, value);
    }

}
