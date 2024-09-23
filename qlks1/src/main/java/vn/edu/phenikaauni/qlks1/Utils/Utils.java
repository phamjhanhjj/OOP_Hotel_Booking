
package vn.edu.phenikaauni.qlks1.Utils;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Utils {
    //ghi du lieu object vao file xml
    public static void writeXMLtoFile(String fileName, Object object){
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            File xmlFile = new File(fileName);
            jaxbMarshaller.marshal(object, xmlFile);
        } catch(JAXBException e){
            e.printStackTrace();
        }
    }

    //doc du lieu tu file xml
    public static Object readXMLtoFile(String fileName, Class<?> clazz){
        File xmlFile = new File(fileName);
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            return jaxbUnmarshaller.unmarshal(xmlFile);
        } catch (JAXBException e){
            e.printStackTrace();
        }
        return null;
    }
}
