package app;

import domain.Body;
import domain.Coordinate;
import domain.Universe;
import domain.news.News;
import domain.news.Newsflash;
import domain.news.Source;
import domain.person.*;
import domain.planet.*;
import domain.star.LuminosityClass;
import domain.star.Star;
import domain.star.StarType;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Application {
	public static void main(String[] args) {
		Star star = new Star("stardesignation","myStar", StarType.S,12
				, LuminosityClass.IV, (float) 98234.324,new Coordinate());
		star.setWeight(BigInteger.valueOf(9000000));
		Planet planet = new Planet("Planet designation","MyPlanet", PlanetType.L,star
				,0, 12324.6f,34.3f, 3.6f);
		planet.setWeight(BigInteger.valueOf(90000));
		star.addPlanet(planet);
		Moon moon = new Moon("moon designation","MyMoon","YourMoonToo",planet);
		moon.setWeight(BigInteger.valueOf(900));
		planet.addMoon(moon);

		Organization organization = new Organization("MyOrganisation","Tis but a fair organization");
		SortedSet<News> newsSet= new TreeSet<>();
		Source source = new Source("MySource", "Tis but a fair source", newsSet);

		newsSet.add(new News(source, LocalDateTime.now(),"beepboop"));
		Newsflash flash = new Newsflash(source,LocalDateTime.now(),LocalDateTime.now(),"menmenmen");
		Person person = new Person("Bob",null,"It's just a dude",new Species("Human"
				,"People", Intelligence.COMMON, TechnicalLevel.COMPUTERIZED,PlanetType.L, Climate.DESERT,planet));
		Universe.getInstance().addBody(star);
		System.out.println(Universe.getInstance().getBodies());
		Universe.getInstance().addBody(moon);
		System.out.println(Universe.getInstance().getBodies());
		Universe.getInstance().addBody(planet);
		System.out.println(Universe.getInstance().getBodies());
		System.out.println();

		System.out.println(star.calcMass());
		moon.setWeight(BigInteger.valueOf(800));
		System.out.println(star.calcMass());
		planet.setWeight(BigInteger.valueOf(70000));
		System.out.println(star.calcMass());
		star.setWeight(BigInteger.valueOf(6000000));
		System.out.println(star.calcMass());
	}


}
