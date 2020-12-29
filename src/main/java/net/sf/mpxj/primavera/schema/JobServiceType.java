//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.12.29 at 11:06:27 AM GMT
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
 * &lt;p&gt;Java class for JobServiceType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="JobServiceType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AddProjectInfo" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="4000"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="CopyOptions" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="50"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ExportFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ExportPlfFileNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ExportXMLByte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ImportXMLByte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="JobData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="JobDataX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="JobRecurringType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value=""/&amp;gt;
 *               &amp;lt;enumeration value="Enabled"/&amp;gt;
 *               &amp;lt;enumeration value="Disabled"/&amp;gt;
 *               &amp;lt;enumeration value="WebASAP"/&amp;gt;
 *               &amp;lt;enumeration value="None"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="JobStatus" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Pending"/&amp;gt;
 *               &amp;lt;enumeration value="Running"/&amp;gt;
 *               &amp;lt;enumeration value="Complete"/&amp;gt;
 *               &amp;lt;enumeration value="Failed"/&amp;gt;
 *               &amp;lt;enumeration value="Cancelled"/&amp;gt;
 *               &amp;lt;enumeration value="Delegated"/&amp;gt;
 *               &amp;lt;enumeration value="Completed With Errors"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="JobType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Schedule"/&amp;gt;
 *               &amp;lt;enumeration value="Summarize"/&amp;gt;
 *               &amp;lt;enumeration value="Apply Actuals"/&amp;gt;
 *               &amp;lt;enumeration value="Store Period Performance"/&amp;gt;
 *               &amp;lt;enumeration value="Sync Actual This Period"/&amp;gt;
 *               &amp;lt;enumeration value="Level"/&amp;gt;
 *               &amp;lt;enumeration value="Recalculate Assignment Costs"/&amp;gt;
 *               &amp;lt;enumeration value="Send To Unifier"/&amp;gt;
 *               &amp;lt;enumeration value="Update Baseline"/&amp;gt;
 *               &amp;lt;enumeration value="Import Project"/&amp;gt;
 *               &amp;lt;enumeration value="Schedule Check"/&amp;gt;
 *               &amp;lt;enumeration value="Export Project"/&amp;gt;
 *               &amp;lt;enumeration value="Project CBS Service"/&amp;gt;
 *               &amp;lt;enumeration value="Copy Project Service"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="JobTypeKey" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="LastRunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PlfDirName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectInfo" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="4000"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="TargetWbsId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "JobServiceType", propOrder =
{
   "addProjectInfo",
   "copyOptions",
   "exportFilePath",
   "exportPlfFileNames",
   "exportXMLByte",
   "fileName",
   "importXMLByte",
   "jobData",
   "jobDataX",
   "jobRecurringType",
   "jobStatus",
   "jobType",
   "jobTypeKey",
   "lastRunDate",
   "name",
   "objectId",
   "plfDirName",
   "projectInfo",
   "targetWbsId",
   "userId"
}) public class JobServiceType
{

   @XmlElement(name = "AddProjectInfo") protected String addProjectInfo;
   @XmlElement(name = "CopyOptions") protected String copyOptions;
   @XmlElement(name = "ExportFilePath") protected String exportFilePath;
   @XmlElement(name = "ExportPlfFileNames", nillable = true) protected String exportPlfFileNames;
   @XmlElement(name = "ExportXMLByte", nillable = true) protected String exportXMLByte;
   @XmlElement(name = "FileName") protected String fileName;
   @XmlElement(name = "ImportXMLByte") protected String importXMLByte;
   @XmlElement(name = "JobData") protected String jobData;
   @XmlElement(name = "JobDataX") protected String jobDataX;
   @XmlElement(name = "JobRecurringType") protected String jobRecurringType;
   @XmlElement(name = "JobStatus") protected String jobStatus;
   @XmlElement(name = "JobType") protected String jobType;
   @XmlElement(name = "JobTypeKey") protected String jobTypeKey;
   @XmlElement(name = "LastRunDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date lastRunDate;
   @XmlElement(name = "Name") protected String name;
   @XmlElement(name = "ObjectId", nillable = true) protected Integer objectId;
   @XmlElement(name = "PlfDirName") protected String plfDirName;
   @XmlElement(name = "ProjectInfo") protected String projectInfo;
   @XmlElement(name = "TargetWbsId", nillable = true) protected Integer targetWbsId;
   @XmlElement(name = "UserId", nillable = true) protected Integer userId;

   /**
    * Gets the value of the addProjectInfo property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getAddProjectInfo()
   {
      return addProjectInfo;
   }

   /**
    * Sets the value of the addProjectInfo property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setAddProjectInfo(String value)
   {
      this.addProjectInfo = value;
   }

   /**
    * Gets the value of the copyOptions property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getCopyOptions()
   {
      return copyOptions;
   }

   /**
    * Sets the value of the copyOptions property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCopyOptions(String value)
   {
      this.copyOptions = value;
   }

   /**
    * Gets the value of the exportFilePath property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getExportFilePath()
   {
      return exportFilePath;
   }

   /**
    * Sets the value of the exportFilePath property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setExportFilePath(String value)
   {
      this.exportFilePath = value;
   }

   /**
    * Gets the value of the exportPlfFileNames property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getExportPlfFileNames()
   {
      return exportPlfFileNames;
   }

   /**
    * Sets the value of the exportPlfFileNames property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setExportPlfFileNames(String value)
   {
      this.exportPlfFileNames = value;
   }

   /**
    * Gets the value of the exportXMLByte property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getExportXMLByte()
   {
      return exportXMLByte;
   }

   /**
    * Sets the value of the exportXMLByte property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setExportXMLByte(String value)
   {
      this.exportXMLByte = value;
   }

   /**
    * Gets the value of the fileName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getFileName()
   {
      return fileName;
   }

   /**
    * Sets the value of the fileName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setFileName(String value)
   {
      this.fileName = value;
   }

   /**
    * Gets the value of the importXMLByte property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getImportXMLByte()
   {
      return importXMLByte;
   }

   /**
    * Sets the value of the importXMLByte property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setImportXMLByte(String value)
   {
      this.importXMLByte = value;
   }

   /**
    * Gets the value of the jobData property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getJobData()
   {
      return jobData;
   }

   /**
    * Sets the value of the jobData property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setJobData(String value)
   {
      this.jobData = value;
   }

   /**
    * Gets the value of the jobDataX property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getJobDataX()
   {
      return jobDataX;
   }

   /**
    * Sets the value of the jobDataX property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setJobDataX(String value)
   {
      this.jobDataX = value;
   }

   /**
    * Gets the value of the jobRecurringType property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getJobRecurringType()
   {
      return jobRecurringType;
   }

   /**
    * Sets the value of the jobRecurringType property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setJobRecurringType(String value)
   {
      this.jobRecurringType = value;
   }

   /**
    * Gets the value of the jobStatus property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getJobStatus()
   {
      return jobStatus;
   }

   /**
    * Sets the value of the jobStatus property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setJobStatus(String value)
   {
      this.jobStatus = value;
   }

   /**
    * Gets the value of the jobType property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getJobType()
   {
      return jobType;
   }

   /**
    * Sets the value of the jobType property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setJobType(String value)
   {
      this.jobType = value;
   }

   /**
    * Gets the value of the jobTypeKey property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getJobTypeKey()
   {
      return jobTypeKey;
   }

   /**
    * Sets the value of the jobTypeKey property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setJobTypeKey(String value)
   {
      this.jobTypeKey = value;
   }

   /**
    * Gets the value of the lastRunDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getLastRunDate()
   {
      return lastRunDate;
   }

   /**
    * Sets the value of the lastRunDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setLastRunDate(Date value)
   {
      this.lastRunDate = value;
   }

   /**
    * Gets the value of the name property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the name property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setName(String value)
   {
      this.name = value;
   }

   /**
    * Gets the value of the objectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getObjectId()
   {
      return objectId;
   }

   /**
    * Sets the value of the objectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the plfDirName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getPlfDirName()
   {
      return plfDirName;
   }

   /**
    * Sets the value of the plfDirName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPlfDirName(String value)
   {
      this.plfDirName = value;
   }

   /**
    * Gets the value of the projectInfo property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getProjectInfo()
   {
      return projectInfo;
   }

   /**
    * Sets the value of the projectInfo property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setProjectInfo(String value)
   {
      this.projectInfo = value;
   }

   /**
    * Gets the value of the targetWbsId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getTargetWbsId()
   {
      return targetWbsId;
   }

   /**
    * Sets the value of the targetWbsId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setTargetWbsId(Integer value)
   {
      this.targetWbsId = value;
   }

   /**
    * Gets the value of the userId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getUserId()
   {
      return userId;
   }

   /**
    * Sets the value of the userId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setUserId(Integer value)
   {
      this.userId = value;
   }

}
