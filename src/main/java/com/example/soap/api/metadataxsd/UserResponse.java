
package com.example.soap.api.metadataxsd;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="isAdult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isAdult"
})
@XmlRootElement(name = "UserResponse")
public class UserResponse {

    protected boolean isAdult;

    /**
     * Obtiene el valor de la propiedad isAdult.
     * 
     */
    public boolean isIsAdult() {
        return isAdult;
    }

    /**
     * Define el valor de la propiedad isAdult.
     * 
     */
    public void setIsAdult(boolean value) {
        this.isAdult = value;
    }

}
