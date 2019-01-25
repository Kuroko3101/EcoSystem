package control;

import java.util.Random;

public class Sheep extends Animal {
	public static double ENERGY_LOST = 0.01;
	
	public Sheep(double energy, int speed, World world, int row, int column) {
		this.energy = energy;
		this.speed = speed;
		this.world = world;
		this.currentRow = row;
		this.currentColumn = column;
		this.ran = new Random();
		this.iMale = ran.nextBoolean();
	}
	
	public Object move(Object o) {
		currentRow += ran.nextInt(2*speed+1)-speed;
		currentColumn += ran.nextInt(2*speed+1)-speed;

		currentRow = (currentRow >= world.nRow-1) ? currentRow-world.nRow : currentRow;
		currentRow = (currentRow < 0) ? currentRow+world.nRow : currentRow;
		
		currentColumn = (currentColumn >= world.nColumn-1) ? currentColumn-world.nColumn : currentRow;
		currentColumn = (currentColumn < 0) ? currentColumn+world.nColumn : currentColumn;

		energy -= ENERGY_LOST * speed;
		return null;
	}
	
	public void run() {
		while (true) {
			move(new Object());
			try {
				Thread.sleep(World.TIME_STEP);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
