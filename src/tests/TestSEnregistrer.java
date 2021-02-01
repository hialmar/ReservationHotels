package tests;

import java.util.Scanner;

import controlleurs.ControllerSEnregistrer;
import modeles.SystemeReservation;
import vue.BoundarySEnregistrer;

public class TestSEnregistrer {
	
	public static void main(String [] args) {
		SystemeReservation systeme = new SystemeReservation();
		ControllerSEnregistrer controleur = new ControllerSEnregistrer(systeme);
		Scanner scanner = new Scanner(System.in);
		BoundarySEnregistrer boundary = new BoundarySEnregistrer(controleur, scanner);
		
		for(int i=0; i<2; i++) {
			boundary.enregistrerHotel();
			
			System.out.println(boundary);
		}
	}

}
