
package vn.edu.phenikaauni.qlks1.Dao;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import vn.edu.phenikaauni.qlks1.Entity.Customer;
import vn.edu.phenikaauni.qlks1.Entity.CustomerXML;
import vn.edu.phenikaauni.qlks1.Utils.Utils;


public class CustomerDao {
    private static final String CUSTOMER_FILE_NAME = "customer.xml";
    
    //ham ghi danh sach khach hang vao file XML
    public static void writeCustomerXML(List<Customer> listCustomer){
        CustomerXML customerXML = new CustomerXML(listCustomer);
        Utils.writeXMLtoFile(CUSTOMER_FILE_NAME, customerXML);
    }
    
    //ham doc danh sach khach hang tu file XML
    public static List<Customer> readCustomerXML(){
        List<Customer> listCustomer = new ArrayList<Customer>();
        File fileName = new File(CUSTOMER_FILE_NAME);
        if (fileName.length() > 71){
            CustomerXML customerXML = (CustomerXML)Utils.readXMLtoFile(CUSTOMER_FILE_NAME, CustomerXML.class);
            listCustomer = customerXML.getCustomerXML();
        }
        return listCustomer;
    }
    
    public static void writeCustomerXMLToHistory(List<Customer> listCustomer){
        CustomerXML customerXML = new CustomerXML(listCustomer);
        Utils.writeXMLtoFile("history.xml", customerXML);
    }
    
    //ham doc danh sach khach hang tu file history
    public static List<Customer> readCustomerXMLToHistory(){
        List<Customer> listCustomer = new ArrayList<Customer>();
        File fileName = new File("history.xml");
        if (fileName.length() > 71){
            CustomerXML customerXML = (CustomerXML)Utils.readXMLtoFile("history.xml", CustomerXML.class);
            listCustomer = customerXML.getCustomerXML();
        }
        return listCustomer;
    }
    
    //ham them khach hang vao danh sach sau do ghi danh sach vao file xml
    public static void addCustomer(Customer customer){
        List<Customer> listCustomer = readCustomerXML();
        listCustomer.add(customer);
        writeCustomerXML(listCustomer);
    }
    
    public static void writeCustomerHistory(Customer customer){
        List<Customer> listCustomer = readCustomerXMLToHistory();
        listCustomer.add(customer);
        writeCustomerXMLToHistory(listCustomer);
    }
       
    //ham sap xep danh sach khach hang theo ten
    public static void sortByCustomerName(List<Customer> customers) {
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                return customer1.getName().compareTo(customer2.getName());
            }
        });
    }
    
    //ham sap xep danh sach khach hang theo can cuoc cong dan
    public static void sortByCCCD(List<Customer> customers) {
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                return customer1.getCccd().compareTo(customer2.getCccd());
            }
        });
    }
}
