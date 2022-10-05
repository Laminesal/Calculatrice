package sall.lamine.spring.web.pendu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sall.lamine.spring.web.pendu.model.EssaiPendu;

@RestController
@RequestMapping("/pendu")
@CrossOrigin
public class PenduController {

	String motMystere; //
	EssaiPendu essai; // Objet renvoyé dans la réponse

	@GetMapping("/init")
	public EssaiPendu getInit() {
		this.motMystere = "bonjour".toUpperCase();

		// Transformation du mot mystere en "mot à deviner"
		String word = "";
		for (Integer i = 0; i < this.motMystere.length(); i++) {
			word += "_";

		}
		
		// Amélioration
//		word = this.motMystere.replaceAll("[A-Z]","_");

		// Réponse de base
		this.essai = new EssaiPendu(word, 0, false);
		return this.essai;
	}

	@GetMapping("/letter")
	public EssaiPendu getLetter(@RequestParam String letter) {
//		if (!(this.essai.getErrors() < 8 && !this.essai.getWin())) {
//			return this.essai;
//		}

		// La lettre est dans le mot ?
		if (!this.motMystere.contains(letter)) {// Non
			this.essai.setErrors(this.essai.getErrors() + 1);// Une erreur de plus
		} else {// Oui
			for (Integer i = 0; i < this.motMystere.length(); i++) {// Parcours du mot mystère
				if (letter.equals(this.motMystere.substring(i, i + 1))) {// la lettre envoyée est à l'index actuel 
					// Remplacer le tiret à cette position par la lettre envoyée
					this.essai.setWord(this.essai.getWord().substring(0, i) + letter
							+ this.essai.getWord().substring(i + 1, this.motMystere.length()));

				}
			}

			
			// Si le mot à devnier n'a pas de tiret => c'est gagné
			if (!(this.essai.getWord().contains("_"))) {
				this.essai.setWin(true);
			}
			// this.essai.setWin(!this.essai.getWord().contains("_")); // Petite amélioration
		}
		
		return this.essai;

	}
}
