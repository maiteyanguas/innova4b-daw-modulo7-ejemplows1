package innova4b.ejemplows1;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface StringService {
	
	@WebMethod
	String reverse(String value);

}
