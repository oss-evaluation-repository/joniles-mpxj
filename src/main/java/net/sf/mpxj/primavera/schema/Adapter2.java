//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.12.29 at 11:06:27 AM GMT
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2 extends XmlAdapter<String, Date>
{

   @Override public Date unmarshal(String value)
   {
      return (net.sf.mpxj.primavera.DatatypeConverter.parseTime(value));
   }

   @Override public String marshal(Date value)
   {
      return (net.sf.mpxj.primavera.DatatypeConverter.printTime(value));
   }

}
