//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.15 at 05:57:00 PM GMT 
//


package net.sf.mpxj.phoenix.schema.phoenix5;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import net.sf.mpxj.Day;

public class Adapter8
    extends XmlAdapter<String, Day>
{


    @Override
   public Day unmarshal(String value) {
        return (net.sf.mpxj.phoenix.DatatypeConverter.parseDay(value));
    }

    @Override
   public String marshal(Day value) {
        return (net.sf.mpxj.phoenix.DatatypeConverter.printDay(value));
    }

}
