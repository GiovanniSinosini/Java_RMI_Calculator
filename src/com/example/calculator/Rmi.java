package com.example.calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Rmi extends UnicastRemoteObject implements Calculator {
	private static final long serialVersionUID = 1L;

	protected Rmi() throws RemoteException {
		int a, b;
	}

	public int div(int a, int b) throws RemoteException {
		return a / b;
	}

	public int mul(int a, int b) throws RemoteException {
		return a * b;
	}

	public int sum(int a, int b) throws RemoteException {
		return a + b;
	}

	public int sub(int a, int b) throws RemoteException {
		return a - b;
	}

}
