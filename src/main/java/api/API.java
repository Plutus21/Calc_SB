/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import connect.ConnectSB;
import java.sql.SQLException;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


@Path("api")
public class API {


    @EJB
    ConnectSB sb;
    
    @GET
    @Path("/Plus")
    public int plus (@QueryParam("a") int a, @QueryParam("b") int b, @QueryParam("name") String name) throws SQLException {
        int sum = a + b; 
        String string = Integer.toString(a) + "+" + Integer.toString(b) + "=" + Integer.toString(sum) + "(" + name + ")";
        sb.connect(string);
        return sum;  
    }

    @GET
    @Path("/Minus")    
    public int minus (@QueryParam("a") int a, @QueryParam("b") int b, @QueryParam("name") String name) throws SQLException {
        int minus = a - b;
        String string = Integer.toString(a) + "-" + Integer.toString(b) + "=" + Integer.toString(minus) + "(" + name + ")";
        sb.connect(string);        
        return minus;
    }   

}
