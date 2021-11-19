package com.example.calculator;

import java.rmi.*;



public interface Calculator extends Remote {
	
	public int div(int a, int b) throws RemoteException;
	public int mul(int a, int b) throws RemoteException;
	public int sum(int a, int b) throws RemoteException;
	public int sub(int a, int b) throws RemoteException;

}


