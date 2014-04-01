package innova4b.ejemplows1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringServiceImplTest {

	@Test
	public void reverse_devuelve_una_cadena_al_reves() {
		StringServiceImpl stringService = new StringServiceImpl();
		assertEquals("etiaM",stringService.reverse("Maite"));
	}

}
