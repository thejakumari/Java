package xworkz.main;

import xworkz.amoeba.Amoeba;
import xworkz.amoeba.ProteusAmoeba;
import xworkz.bangle.Bangle;
import xworkz.bangle.GoldBangle;
import xworkz.coal.BlackCoal;
import xworkz.coal.Coal;
import xworkz.dinosaur.ChildDinasaur;
import xworkz.dinosaur.Dinasaru;
import xworkz.drum.Drum;
import xworkz.drum.SnareDrum;
import xworkz.flex.CSSFlex;
import xworkz.flex.Flex;
import xworkz.gate.Gate;
import xworkz.gate.SwingGate;
import xworkz.mic.ElectretMic;
import xworkz.mic.Mic;
import xworkz.theater.Theatre;
import xworkz.theater.UmaTheatre;
import xworkz.ticket.BusTicket;
import xworkz.ticket.Ticket;

public class Main {
	public static void main(String[] args) {
	System.out.println("Invoking main in Main");
	Gate gate= new SwingGate();
	gate.open();

	
	System.out.println("====================");
	Bangle ref=new GoldBangle();
	ref.sound();
	System.out.println("=================");
	Coal coal=new BlackCoal();
	coal.burn();
	System.out.println("=======================");
    Amoeba amoeba=new ProteusAmoeba();
    amoeba.changeShape();
    System.out.println("==========================");

    Dinasaru dinasaur=new ChildDinasaur();
	dinasaur.makeSound();
    System.out.println("=================");
    Flex flex=new CSSFlex();
    flex.display();
    System.out.println("=============================");
    Mic mic=new ElectretMic();
    mic.vibrate();
    System.out.println("====================");
    Drum drum=new SnareDrum(); 
    drum.makeNoise();
    System.out.println("===================");
    Theatre theatre=new UmaTheatre();
    theatre.entertainment();
    System.out.println("=========================");
    Ticket ticket=new BusTicket();
    ticket.service();

	}
}


