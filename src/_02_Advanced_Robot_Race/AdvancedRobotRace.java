package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
    //   a random amount less than 50.
	
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
	
	//8. try different races with different amounts of robots.
	
    //9. make the robots race around a circular track.
	
	public static void main(String[] args) {
		new AdvancedRobotRace();
		
	}
	Robot[] robot =  new Robot[5];
		AdvancedRobotRace()	{
			
			for(int i = 0; i < robot.length; i ++) {
				robot[i] = new Robot();
				robot[i].moveTo(100, (robot[i].getWindow().getHeight() - 100 * i) - 150 );
				robot[i].turn(90);
				
			}
			startRace();
			
		}
		void startRace() {
			Random rand = new Random();
			
			Thread r = new Thread(() ->{
				while(robot[0].getX() < robot[0].getWindow().getWidth() - 50) {
				robot[0].setSpeed(rand.nextInt(20) +1);
				robot[0].move(25);
				System.out.print(robot[0].getX() + " | " + "r | ");
				System.out.println(robot[0].getWindow().getWidth() - 50);
				}
			}); 
			Thread r1 = new Thread(() ->{
				while(robot[1].getX() < robot[1].getWindow().getWidth() - 50){
				robot[1].setSpeed(rand.nextInt(20) +1);
				robot[1].move(25);
				System.out.print(robot[1].getX() + " | " + "r1 | ");
				System.out.println(robot[1].getWindow().getWidth() - 50);
				}
			}); 
			Thread r2 = new Thread(() ->{
				while(robot[2].getX() < robot[2].getWindow().getWidth() - 50) {
				robot[2].setSpeed(rand.nextInt(20) +1);
				robot[2].move(25);
			
				}
			}); 
			Thread r3 = new Thread(() ->{
				while(robot[3].getX() < robot[3].getWindow().getWidth() - 50) {
				robot[3].setSpeed(rand.nextInt(20) +1);
				robot[3].move(25);
	
				}
			}); 
			Thread r4 = new Thread(() ->{
				while(robot[4].getX() < robot[4].getWindow().getWidth() - 50) {
				robot[4].setSpeed(rand.nextInt(20) +1);
				robot[4].move(25);
	
				}
			}); 
			
			r.start();
			r1.start();
			r2.start();
			r3.start();
			r4.start();
			
			
		}
		
		
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
}
