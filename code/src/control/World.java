package control;

import java.util.Random;

public class World {
	public int nRow;
	public int nColumn;
	private double[][] grass;
	
	public World(int row, int column) {
		nRow = row;
		nColumn = column;
		Random ran = new Random();
		grass = new double[row][column];
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				grass[i][j] = ran.nextDouble();
			}
		}
	}
	
	public double getGrass(int i, int j) {
		return grass[i][j];
	}
	
}
