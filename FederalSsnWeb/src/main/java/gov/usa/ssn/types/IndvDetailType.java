//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.12 at 10:34:44 AM IST 
//

package gov.usa.ssn.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for IndvDetailType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="IndvDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="first-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last-name" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndvDetailType", propOrder = { "firstName", "lastName", "surname", "ssn", "dob" })
public class IndvDetailType {

	@XmlElement(name = "first-name", required = true)
	protected String firstName;
	@XmlElement(name = "last-name")
	protected String lastName;
	@XmlElement(required = true)
	protected String surname;
	@XmlElement(required = true)
	protected String ssn;
	@XmlElement(required = true)
	protected String dob;

	/**
	 * Gets the value of the firstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the value of the firstName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFirstName(String value) {
		this.firstName = value;
	}

	/**
	 * Gets the value of the lastName property.
	 * 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the value of the lastName property.
	 * 
	 */
	public void setLastName(String value) {
		this.lastName = value;
	}

	/**
	 * Gets the value of the surname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Sets the value of the surname property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSurname(String value) {
		this.surname = value;
	}

	/**
	 * Gets the value of the ssn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * Sets the value of the ssn property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSsn(String value) {
		this.ssn = value;
	}

	/**
	 * Gets the value of the dob property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * Sets the value of the dob property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDob(String value) {
		this.dob = value;
	}

}
