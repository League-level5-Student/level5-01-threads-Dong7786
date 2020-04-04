package _01_Olympic_Rings;

import java.awt.Color;
import java.awt.Graphics;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		OlympicRings_Threaded o = new OlympicRings_Threaded();
		
		
	}
	OlympicRings_Threaded(){
		Robot blue = new Robot(200, 300);
		Robot yellow = new Robot(400, 500);
		Robot black = new Robot(600, 300);
		Robot green = new Robot(800, 500);
		Robot red = new Robot(1000, 300);
		//blue.hide();
		blue.setSpeed(3);
		blue.setPenWidth(5);
		blue.setPenColor(Color.blue);
	
		
		Thread b = new Thread(() -> blue.move(1080));
		Thread b1 = new Thread(() -> blue.turn(360));
		
		b.start();
		b1.start();
		
	}
	void draw(Graphics g) {
		
		
	}
	
}

