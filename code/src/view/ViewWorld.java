package view;

import control.World;

public class ViewWorld {

	public static void main(String[] args) {
		World world1 = new World(5,7);
		for (int i=0; i<world1.nRow; i++) {
			for (int j=0; j<world1.nColumn; j++) {
				System.out.print( String.format("%.2f", world1.getGrass(i,j)) + " ");
			}
			System.out.println();
		}

	}

}
