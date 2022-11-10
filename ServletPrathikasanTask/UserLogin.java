package prathikasantask;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLogin extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		if(name.equals("James")&&password.equals("1234567"))
		{
			Timestamp instant= new Timestamp(System.currentTimeMillis());
			Date date=new Date(instant.getTime());
			ZoneId z = TimeZone.getDefault().toZoneId() ;
			
			try {
				String s="<html><head><link rel=\"stylesheet\" href=\"login.css\"></head><body><h2>Hi "+name+"<br> T"
						+ "ime now:"+date+"<br><br>"+z+"</body></html>";
				res.getWriter().append(s);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
