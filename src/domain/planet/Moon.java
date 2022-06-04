package domain.planet;

import domain.Body;
import domain.Coordinate;

import java.math.BigInteger;

public class Moon extends Body {
	private String name;
	private Planet planet;
	
	public Moon(String designation, String name, String name2, Planet planet) {
		super(designation, name);
		name = name2;
		this.planet = planet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Planet getPlanet() {
		return planet.clone();
	}

	public void setPlanet(Planet planet) {
		this.planet = planet;
	}

	@Override
	public Coordinate getCoordinate() {
		return planet.getCoordinate();
	}

	@Override
	public BigInteger calcMass() {
		return getWeight();
	}
}
