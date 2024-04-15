
package com.example.soap.api.metadataxsd;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.soap.api.metadataxsd package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.soap.api.metadataxsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserRequest }
     * 
     * @return
     *     the new instance of {@link UserRequest }
     */
    public UserRequest createUserRequest() {
        return new UserRequest();
    }

    /**
     * Create an instance of {@link UserResponse }
     * 
     * @return
     *     the new instance of {@link UserResponse }
     */
    public UserResponse createUserResponse() {
        return new UserResponse();
    }

}
