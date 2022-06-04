package domain;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;

public abstract class Body extends Observable implements Mass {

	private String designation;
	private String name; 
	private BigInteger weight; // The total weight of the body and all its subsidiaries

	public Body(String designation, String name) {
		super();
		this.designation = designation;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		NotifyObservers();
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
		NotifyObservers();
	}

	@Override
	public int hashCode() {
		final int prime = 670664461;
		int result = 1;
		result = prime * result + ((this.getDesignation() == null) ? 0 : this.getDesignation().hashCode());
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
		Body other = (Body) obj;
		if (this.getDesignation() == null) {
			if (other.getDesignation() != null)
				return false;
		} else if (!this.getDesignation().equals(other.getDesignation()))
			return false;
		return true;
	}
	
	public double calculateDistance(Body other) {
		return this.getCoordinate().calculateDistance(other.getCoordinate());
	}
	
	
	public String getIdentitity() {
		return getDesignation();
	}
	
	public BigInteger getWeight() {
		return weight;
	}

	public void setWeight(BigInteger weight) {
		this.weight = weight;
		NotifyObservers();
	}

	public abstract Coordinate getCoordinate();


}
