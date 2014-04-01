package innova4b.ejemplows1;

import javax.jws.WebService;

@WebService(endpointInterface = "innova4b.ejemplows1.StringService")
public class StringServiceImpl implements StringService {

	public String reverse(String value) {
		if (null==value)
			return null;
		return new StringBuffer(value).reverse().toString();
	}

}
