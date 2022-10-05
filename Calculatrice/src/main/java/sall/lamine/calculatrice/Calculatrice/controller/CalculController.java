package sall.lamine.calculatrice.Calculatrice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import sall.lamine.calculatrice.Calculatrice.model.Calcul;

@RestController
@RequestMapping("/calcul") // URL de base de tout les endpoints de ce controller
@CrossOrigin
public class CalculController {

	List<Calcul> historique = new ArrayList<>();

	@GetMapping("/plus") // URL = /calcul/plus?n1=X&n2=X
	public Integer plus(@RequestParam Integer n1, @RequestParam Integer n2) {
		Calcul c = new Calcul(n1, n2, "plus", (double) n1 + n2);
		historique.add(c);
		return n1 + n2;
	}

	@GetMapping("/minus") // URL = /calcul/minus?n1=X&n2=X
	public Integer minus(@RequestParam Integer n1, @RequestParam Integer n2) {
		Calcul c = new Calcul(n1, n2, "minus", (double) n1 - n2);
		historique.add(c);
		return n1 - n2;
	}

	@GetMapping("/mult") // URL = /calcul/mult?n1=X&n2=X
	public Integer mult(@RequestParam Integer n1, @RequestParam Integer n2) {
		Calcul c = new Calcul(n1, n2, "mult", (double) n1 * n2);
		historique.add(c);
		return n1 * n2;
	}

	@GetMapping("/div") // URL = /calcul/div?n1=X&n2=X
	public Double div(@RequestParam Integer n1, @RequestParam Integer n2) {
		Calcul c = new Calcul(n1, n2, "div", (double) (n1 / n2));
		historique.add(c);
		if (n2 != 0)
			return (double) (n1 / n2);
		return null;
	}

	@GetMapping("/historique")
	public List<Calcul> getHistorique() {
		return historique;
	}

}
