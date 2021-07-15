package com.example.demo;

import java.util.Objects;

import com.sun.tools.javac.util.List;

public class Seat {
	
	private int seatno;
	/**
	 * @return the seatno
	 */
	public Seat() {
		super();
	}

	/**
	 * @param seatno the seatno to set
	 */
	@Override
	public int hashCode() {
		return Objects.hash(seatno);
	}

	/**
	 * @return the seatno
	 */
	public int getSeatno() {
		return seatno;
	}

	/**
	 * @param seatno the seatno to set
	 */
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		return seatno == other.seatno;
	}

	@Override
	public String toString() {
		return "Seat [seatno=" + seatno + "]";
	}
	
	
	
		
	}
	
	

