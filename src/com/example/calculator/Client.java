package com.example.calculator;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Client {

	public static void main(String[] args) {

		JFrame window = new JFrame("Calculator RMI");
		window.setAlwaysOnTop(true);
		window.setUndecorated(true);

		Scanner sc = new Scanner(System.in);

		try {

			Registry registry = LocateRegistry.getRegistry("localhost", 1099);
			Calculator calculator = (Calculator) Naming.lookup("//localhost/Calculator");

			while (true) {

				String menu = JOptionPane.showInputDialog("### Calculator RMI ###  \n\nSelect Math Operation\n\n"

						+ "1 .............. Sum\n" 
						+ "2 .............. Subtraction\n" 
						+ "3 .............. Multiplication\n"
						+ "4 .............. Division\n\n\n"

						+ "Cancel for EXIT \n\n");

				switch (menu) {

				case "1": {
					int x = Integer.parseInt(JOptionPane.showInputDialog("Enter value 1:"));
					int y = Integer.parseInt(JOptionPane.showInputDialog("Enter value 2:"));

					JOptionPane.showMessageDialog(null, "Sum result: " + calculator.sum(x, y));
					break;
				}

				case "2": {
					int x = Integer.parseInt(JOptionPane.showInputDialog("Enter value 1:"));
					int y = Integer.parseInt(JOptionPane.showInputDialog("Enter value 2:"));

					JOptionPane.showMessageDialog(null, "Subtraction result: " + calculator.sub(x, y));
					break;
				}

				case "3": {
					int x = Integer.parseInt(JOptionPane.showInputDialog("Enter value 1:"));
					int y = Integer.parseInt(JOptionPane.showInputDialog("Enter value 2:"));

					JOptionPane.showMessageDialog(null, "Multiplication result: " + calculator.mul(x, y));
					break;

				}

				case "4": {
					int x = Integer.parseInt(JOptionPane.showInputDialog("Enter value 1:"));
					int y = Integer.parseInt(JOptionPane.showInputDialog("Enter value 2:"));

					JOptionPane.showMessageDialog(null, "Division result: " + calculator.div(x, y));
					break;
				}

				}
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Disconnected client");
		}

	}
}
