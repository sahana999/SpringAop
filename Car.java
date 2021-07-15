package com.example.demo;
import java.io.PrintWriter;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;

public class Car implements Serializable,Comparable<Car> {

	private int carNumber;
	private String carName;
	private Engine e;
	private MusicSystem ms;
   private  List<Seat> ss;
   private File f1;
	
	public Car() {
		
		super();
		System.out.println(" Constructor called");
	}
	
	
	
	public Car(int carNumber, String carName, Engine e, MusicSystem ms, List<Seat> ss) {
		super();
		this.carNumber = carNumber;
		this.carName = carName;
		this.e = e;
		this.ms = ms;
		this.ss = ss;
	}



	/**
	 * @return the ss
	 */
	public List<Seat> getSs() {
		return ss;
	}



	/**
	 * @param ss the ss to set
	 */
	public void setSs(List<Seat> ss) {
		this.ss = ss;
	}



	public MusicSystem getMs() {
		return ms;
	}
	public void setMs(MusicSystem ms) {
		this.ms = ms;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	/**
	 * @return the s
	 */
	
	/**
	 * @param s the s to set
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		result = prime * result + carNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		if (carNumber != other.carNumber)
			return false;
		return true;
	}
	
	
	
	@Override
	public int compareTo(Car car) {
		return this.carName.compareTo(car.carName);
	}
	
	
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", carName=" + carName + ", e=" + e + ", ms=" + ms + ", ss=" + ss + "]";
	}

	
	public void doInIt()
	{
		System.out.println(" do init called ");
	   try
	   {
		   f1=new File("C:\\Users\\User\\Desktop\\File");
		   new Car().doDestroy();
	   }catch(Exception e)
	   {
		   System.out.println("e");
	   }
	}
	
	public void doDestroy()
	{
		System.out.println(" do destroy  called ");
		try
		{
			
			PrintWriter pw=new PrintWriter(f1);
			pw.append( getCarNumber()+" "+ getCarName()+" "+getE()+" " +getMs()+" " +getSs()); 
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
}//end class




