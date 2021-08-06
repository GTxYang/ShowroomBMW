/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;
import java.sql.*;
import Database.Connect;
/**
 *
 * @author howl1
 */
public class KhachHang {
    public Connect cn = new Connect();
    
    public ResultSet ShowKH() throws SQLException {
        cn.connectSQL();
        String sql = "SELECT * FROM KhachHang";
        return cn.LoadData(sql);
    }
    
    
   public ResultSet ShowKH(String idkh) throws SQLException {
        String sql = "  SELECT * FROM KhachHang where IDKH='" + idkh + "'  ";
        return cn.LoadData(sql);
    }
   
    public void InsertData(String idkh,String tenkh, String sdt ,String gioitinh ) throws SQLException {
        String sql = "INSERT INTO KhachHang values('" + idkh + "',N'" + tenkh + "','" + sdt + "',N'" + gioitinh + "')";  
        cn.UpdateData(sql);
    }
   
   public void EditData(String idkh,String tenkh, String sdt ,String gioitinh ) throws SQLException {
        String sql = "Update KhachHang set HoTen = N'"+ tenkh +"',SDT = '"+ sdt +"',GioiTinh = N'"+ gioitinh +"'" + "where IDKH='" + idkh + "'";
        cn.UpdateData(sql);
    }
   
   public void DeleteData(String idkh) throws SQLException {
        String sql = "Delete from KhachHang where IDKH='" + idkh + "'";
        cn.UpdateData(sql);
    }
   
}
