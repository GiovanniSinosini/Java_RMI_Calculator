package com.example.calculator;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Server {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Calculator RMI");
		window.setAlwaysOnTop(true);
		window.setUndecorated(true);
		
		try {
			
			Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
			r.rebind("Calculator", new Rmi());
			JOptionPane.showMessageDialog(null, "Connected Server");
			
		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(null, "ERROR - server not connection." + e);
		}

	}
}
