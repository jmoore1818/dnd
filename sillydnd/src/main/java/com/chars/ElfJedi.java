package com.chars;

import com.app.Weapons.Weapon;
import com.interfaces.Jedi;
import com.parents.Elf;

public class ElfJedi extends Elf implements Jedi {

	public ElfJedi() {
		super();
	}

	public ElfJedi(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 50);
		// TODO Auto-generated method stub

	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 100);

	}

	@Override
	public void setWeapon(Weapon weapon) {

		super.setWeapon(weapon.LIGHTSABER);
	}
}
