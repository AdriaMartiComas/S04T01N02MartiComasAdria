package cat.itacademy.barcelonactiva.martiComas.adria.s04.t01.n02;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

	@RequestMapping("/HelloWorld")
	public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom) {

		return "Hola " + nom + ", estas executant un projecte Gradle.";
	}

	@RequestMapping(value = { "/HelloWorld2", "/HelloWorld2/{nom}" })
	public String saluda2(@PathVariable(required = false) String nom) {

		if (nom == null) {
			nom = "";
		}

		return "Hola " + nom + ", estas executant un projecte Gradle.";
	}

}
