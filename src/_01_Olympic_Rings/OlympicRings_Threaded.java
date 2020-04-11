package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded{
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 3 robots.
	public static void main(String[] args) {
		OlympicRings_Threaded o = new OlympicRings_Threaded();
		
		
	}
	OlympicRings_Threaded(){
		Robot[] robot = new Robot[5];
		robot[0] = new Robot(100, 400);
			robot[0].setPenColor(Color.blue);
		robot[1] = new Robot(400, 600);
			robot[1].setPenColor(Color.yellow);
		robot[2] = new Robot(700, 400);
			robot[2].setPenColor(Color.black);
		robot[3] = new Robot(1000, 600);
			robot[3].setPenColor(Color.green);
		robot[4] = new Robot(1300, 400);
			robot[4].setPenColor(Color.red);
		
		for(int i = 0; i < robot.length; i ++) {
			robot[i].hide();
			robot[i].setPenWidth(50);
			robot[i].penDown();
		}
		
		Thread blue = new Thread(() -> {
			for(int i = 0; i < 360; i ++) {
				robot[0].move(4);
				robot[0].turn(1);
			}
			});
		Thread yellow = new Thread(() ->{
			for(int i = 0; i < 360; i ++) {
				robot[1].move(4);
				robot[1].turn(1);
			}
			
		});
		Thread black = new Thread(() -> {
			for(int i = 0; i < 360; i ++) {
				robot[2].move(4);
				robot[2].turn(1);
				
			}
		});
		Thread green = new Thread(()-> {
			for(int i = 0; i < 360; i++) {
				robot[3].move(4);
				robot[3].turn(1);
				
			}
		});
		Thread red = new Thread(()-> {
			for(int i = 0; i < 360; i ++) {
				robot[4].move(4);
				robot[4].turn(1);
				
			}
		});
		
		blue.start();
		yellow.start();
		black.start();
		green.start();
		red.start();
	}
	
	
}

