package ProgramsDayFour;

interface WiproDevice {
	void deviceType();

	void compileSpeed();
}

class Desktop implements WiproDevice {

	@Override
	public void deviceType() {
		System.out.println("Device is computer");

	}

	@Override
	public void compileSpeed() {
		System.out.println("works faster compares to laptop");

	}

}

class Laptop implements WiproDevice {

	@Override
	public void deviceType() {
		System.out.println("device type is laptop");

	}

	@Override
	public void compileSpeed() {
		System.out.println("works slower compares to Desktop");

	}

}

public class WiproDevices {
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.deviceType();
		d.compileSpeed();
		Laptop l = new Laptop();
		l.deviceType();
		l.compileSpeed();
	}
}
