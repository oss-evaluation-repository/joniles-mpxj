//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2022.08.18 at 01:23:58 PM BST
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * &lt;p&gt;Java class for RiskImpactType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="RiskImpactType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RiskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RiskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RiskObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RiskThresholdLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RiskThresholdLevelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RiskThresholdLevelObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RiskThresholdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RiskThresholdObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "RiskImpactType", propOrder =
{
   "createDate",
   "createUser",
   "isBaseline",
   "isTemplate",
   "lastUpdateDate",
   "lastUpdateUser",
   "projectId",
   "projectName",
   "projectObjectId",
   "riskId",
   "riskName",
   "riskObjectId",
   "riskThresholdLevelCode",
   "riskThresholdLevelName",
   "riskThresholdLevelObjectId",
   "riskThresholdName",
   "riskThresholdObjectId"
}) public class RiskImpactType
{

   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "IsBaseline", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean isBaseline;
   @XmlElement(name = "IsTemplate", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean isTemplate;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "ProjectId") protected String projectId;
   @XmlElement(name = "ProjectName") protected String projectName;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "RiskId") protected String riskId;
   @XmlElement(name = "RiskName") protected String riskName;
   @XmlElement(name = "RiskObjectId") protected Integer riskObjectId;
   @XmlElement(name = "RiskThresholdLevelCode") protected String riskThresholdLevelCode;
   @XmlElement(name = "RiskThresholdLevelName") protected String riskThresholdLevelName;
   @XmlElement(name = "RiskThresholdLevelObjectId") protected Integer riskThresholdLevelObjectId;
   @XmlElement(name = "RiskThresholdName") protected String riskThresholdName;
   @XmlElement(name = "RiskThresholdObjectId") protected Integer riskThresholdObjectId;

   /**
    * Gets the value of the createDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateDate(Date value)
   {
      this.createDate = value;
   }

   /**
    * Gets the value of the createUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the isBaseline property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsBaseline()
   {
      return isBaseline;
   }

   /**
    * Sets the value of the isBaseline property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsBaseline(Boolean value)
   {
      this.isBaseline = value;
   }

   /**
    * Gets the value of the isTemplate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsTemplate()
   {
      return isTemplate;
   }

   /**
    * Sets the value of the isTemplate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsTemplate(Boolean value)
   {
      this.isTemplate = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateDate(Date value)
   {
      this.lastUpdateDate = value;
   }

   /**
    * Gets the value of the lastUpdateUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the projectId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectId()
   {
      return projectId;
   }

   /**
    * Sets the value of the projectId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectId(String value)
   {
      this.projectId = value;
   }

   /**
    * Gets the value of the projectName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectName()
   {
      return projectName;
   }

   /**
    * Sets the value of the projectName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectName(String value)
   {
      this.projectName = value;
   }

   /**
    * Gets the value of the projectObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getProjectObjectId()
   {
      return projectObjectId;
   }

   /**
    * Sets the value of the projectObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setProjectObjectId(Integer value)
   {
      this.projectObjectId = value;
   }

   /**
    * Gets the value of the riskId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRiskId()
   {
      return riskId;
   }

   /**
    * Sets the value of the riskId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRiskId(String value)
   {
      this.riskId = value;
   }

   /**
    * Gets the value of the riskName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRiskName()
   {
      return riskName;
   }

   /**
    * Sets the value of the riskName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRiskName(String value)
   {
      this.riskName = value;
   }

   /**
    * Gets the value of the riskObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getRiskObjectId()
   {
      return riskObjectId;
   }

   /**
    * Sets the value of the riskObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setRiskObjectId(Integer value)
   {
      this.riskObjectId = value;
   }

   /**
    * Gets the value of the riskThresholdLevelCode property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRiskThresholdLevelCode()
   {
      return riskThresholdLevelCode;
   }

   /**
    * Sets the value of the riskThresholdLevelCode property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRiskThresholdLevelCode(String value)
   {
      this.riskThresholdLevelCode = value;
   }

   /**
    * Gets the value of the riskThresholdLevelName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRiskThresholdLevelName()
   {
      return riskThresholdLevelName;
   }

   /**
    * Sets the value of the riskThresholdLevelName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRiskThresholdLevelName(String value)
   {
      this.riskThresholdLevelName = value;
   }

   /**
    * Gets the value of the riskThresholdLevelObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getRiskThresholdLevelObjectId()
   {
      return riskThresholdLevelObjectId;
   }

   /**
    * Sets the value of the riskThresholdLevelObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setRiskThresholdLevelObjectId(Integer value)
   {
      this.riskThresholdLevelObjectId = value;
   }

   /**
    * Gets the value of the riskThresholdName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRiskThresholdName()
   {
      return riskThresholdName;
   }

   /**
    * Sets the value of the riskThresholdName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRiskThresholdName(String value)
   {
      this.riskThresholdName = value;
   }

   /**
    * Gets the value of the riskThresholdObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getRiskThresholdObjectId()
   {
      return riskThresholdObjectId;
   }

   /**
    * Sets the value of the riskThresholdObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setRiskThresholdObjectId(Integer value)
   {
      this.riskThresholdObjectId = value;
   }

}
