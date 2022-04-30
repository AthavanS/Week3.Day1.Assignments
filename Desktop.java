package org.system;

public class Desktop extends Computer {
  public void desktopSize() {
	System.out.println("desktopSize");

}

	public static void main (String arg[])
	{
	Computer computer = new Computer();
		Desktop desktop = new Desktop();
	    computer.computerModel();
		desktop.desktopSize();
	}
}



