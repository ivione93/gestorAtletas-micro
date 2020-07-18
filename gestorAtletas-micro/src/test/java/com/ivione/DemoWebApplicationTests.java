package com.ivione;

/*import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ivione.model.Usuario;
import com.ivione.repository.IUsuarioRepo;

@SpringBootTest
class DemoWebApplicationTests {
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void crearUsuarioTest() {
		Usuario us = new Usuario();
		us.setId(2);
		us.setNombre("ivione");
		us.setClave(encoder.encode("ivione93"));
		Usuario retorno = repo.save(us);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}*/
