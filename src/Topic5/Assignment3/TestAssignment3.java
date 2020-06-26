package Topic5.Assignment3;

import Topic5.Assignment3.Automobile.TwoWheeler.Hero;
import Topic5.Assignment3.Automobile.TwoWheeler.Honda;

public class TestAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("Glamour 125", "WB16G1234", "Bo", 85);
		hero.getModelName();
		hero.getOwnerName();
		hero.getRegistrationNumber();
		hero.getSpeed();
		hero.radio();

		System.out.println();

		Honda honda = new Honda("Honda City", "WB18G7777", "Pr", 110);
		honda.getModelName();
		honda.getOwnerName();
		honda.getRegistrationNumber();
		honda.getSpeed();
		honda.cdplayer();
	}

}
