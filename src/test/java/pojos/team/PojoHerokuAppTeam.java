package pojos.team;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pojos.PojoHerokuAppBookingDates;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PojoHerokuAppTeam {
    //   Request body
    //    	           {
    //    	                "firstname" : "Ali",
    //    	                "lastname" : “Bak",
    //    	                "totalprice" : 500,
    //    	                "depositpaid" : false,
    //    	                "bookingdates" : {
    //    	                         "checkin" : "2021-06-01",
    //    	                         "checkout" : "2021-06-10"
    //    	                                  },
    //    	                "additionalneeds" : "wi-fi"
    //    	            }
    //    	            	Response Body = Expected Data
    //    	            	{

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private PojoHerokuAppBookingDatesTeam bookingdates;
    private String additionalneeds;



}
