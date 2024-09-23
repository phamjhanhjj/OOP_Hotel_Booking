
package vn.edu.phenikaauni.qlks1.Dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import vn.edu.phenikaauni.qlks1.Entity.Room;
import vn.edu.phenikaauni.qlks1.Entity.RoomXML;
import vn.edu.phenikaauni.qlks1.Utils.Utils;


public class RoomDao {
    private static final String CUSTOMER_FILE_NAME = "room.xml";
    
    //ghi danh sach phong vao file XML
    public static void writeRoomXMl(List<Room> listRoom){
        RoomXML roomXML = new RoomXML(listRoom);
        Utils.writeXMLtoFile(CUSTOMER_FILE_NAME, roomXML);
    }
    
    //doc danh sach phong tu file xml
    public static List<Room> readRoomXML(){
        File file = new File(CUSTOMER_FILE_NAME);
        if (file.length() > 0){
            RoomXML roomXML = (RoomXML)Utils.readXMLtoFile(CUSTOMER_FILE_NAME, RoomXML.class);
            return roomXML.getListRoom();
        }
        List<Room> listRoom = new ArrayList<Room>();
        return listRoom;
    }
    
    //thay doi trang thai phong duoc nhap
    public static void changeRoomStatus(String roomNumber){
        List<Room> listRoom = readRoomXML();
        for (Room r:listRoom){
            if (r.getRoomNumber().toString().equals(roomNumber)){
                r.setRoomStatus(!r.getRoomStatus());
            }
        }
        writeRoomXMl(listRoom);
    }
    
}
