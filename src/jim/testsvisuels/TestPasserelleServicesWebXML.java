package jim.testsvisuels;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import jim.classes.Outils;
import jim.classes.PasserelleServicesWebXML;
import jim.classes.PointDeTrace;
import jim.classes.Trace;
import jim.classes.Utilisateur;

public class TestPasserelleServicesWebXML {

	public static void main(String[] args) throws ParseException {
		
		String msg;
	
//		// test visuel de la mÃ©thode creerUnUtilisateur
//		msg = PasserelleServicesWebXML.creerUnUtilisateur("jim", "delasalle.sio.lebreton.h@gmail.com", "1122334455");
//		System.out.println(msg);
//		
//		msg = PasserelleServicesWebXML.creerUnUtilisateur("turlututu", "delasalle.sio.lebreton.h@gmail.com", "1122334455");
//		System.out.println(msg);
//
//		msg = PasserelleServicesWebXML.creerUnUtilisateur("turlututu", "delasalle.sio.lebreton.hgmail.com", "1122334455");
//		System.out.println(msg);
//		
//		msg = PasserelleServicesWebXML.creerUnUtilisateur("turlututu", "delasalle.sio.lebreton.h@gmailcom", "1122334455");
//		System.out.println(msg);
//		
//		msg = PasserelleServicesWebXML.creerUnUtilisateur("turlututu", "delasallesioeleves@gmail.com", "1122334455");
//		System.out.println(msg);
//		
//		msg = PasserelleServicesWebXML.creerUnUtilisateur("turlututu", "de.la.salle.sio.eleves@gmail.com", "1122334455");
//		System.out.println(msg);
		
		// test visuel de la mÃ©thode getTousLesUtilisateurs
//		ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
//		msg = PasserelleServicesWebXML.getTousLesUtilisateurs("europa", Outils.sha1("mdputilisateur"), lesUtilisateurs);
//		// affichage de la rÃ©ponse
//		System.out.println(msg);
//		// affichage du nombre d'utilisateurs
//		System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
//		// affichage de tous les utilisateurs
//		for (Utilisateur unUtilisateur : lesUtilisateurs)
//		{	System.out.println(unUtilisateur.toString());
//		}


		// test visuel de la mÃ©thode getLesUtilisateursQueJautorise
//		ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
//		msg = PasserelleServicesWebXML.getLesUtilisateursQueJautorise("europa", Outils.sha1("mdputilisateur"), lesUtilisateurs);
//		// affichage de la rÃ©ponse
//		System.out.println(msg);
//		// affichage du nombre d'utilisateurs
//		System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
//		// affichage de tous les utilisateurs
//		for (Utilisateur unUtilisateur : lesUtilisateurs)
//		{	System.out.println(unUtilisateur.toString());
//		}

		// test visuel de la mÃ©thode getLesUtilisateursQuiMautorisent
		ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
		msg = PasserelleServicesWebXML.getLesUtilisateursQuiMautorisent("europa", Outils.sha1("mdputilisateur"), lesUtilisateurs);
		// affichage de la rÃ©ponse
		System.out.println(msg);
		// affichage du nombre d'utilisateurs
		System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
		// affichage de tous les utilisateurs
		for (Utilisateur unUtilisateur : lesUtilisateurs)
		{	System.out.println(unUtilisateur.toString());
		}

		
		// test visuel de la mÃ©thode getLesParcoursDunUtilisateur

		
		// test visuel de la mÃ©thode getUnParcoursEtSesPoints
		
	
	} // fin Main
} // fin class
