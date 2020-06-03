/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

@Stateless
public class ConnectSB {
    
    @Resource(lookup = "SB_DB")
    DataSource db;
    
    public void connect(String data) throws SQLException {
        Connection cn = db.getConnection();
        String sql = "INSERT INTO Hackers(Signature) VALUES( '" + data + "');";
        Statement stat = cn.createStatement();
        stat.executeUpdate(sql);        
    }
    
}
