package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[6];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();
		Triangle tri = new Triangle(inp);

		// tri.print();
		tri.getCog();
	}
}

class Triangle {
	private Point[] p;

	public Triangle(int[] xy) {
		p = new Point[3];
		for (int i = 0, j = 0; i < p.length; i++, j += 2) {
			p[i] = new Point(xy[j], xy[j + 1]);
		}
	}

	public void print() {
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
	}

	public void getCog() {
		double cgx = 0.0, cgy = 0.0;

		for (int i = 0; i < p.length; i++) {
			cgx += p[i].getX();
			cgy += p[i].getY();
		}
		System.out.printf("(%.1f, %.1f)\n", ((double) cgx / 3), ((double) cgy / 3));
	}
}

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println("(" + x + " " + y + ")");
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
