//Framework interms of class and object in a Snake Game.

import java.util.*;

public class Snake
{
	public static void main(String[] args)
	{
		time sec=new time()
			//continuos increment of time value
				sec.timeIncrement();
			
		moveSnake move=new moveSnake();
			//if up button pressed
				move.moveUp();	
			//if down button pressed
				move.moveDown();
			//if right button pressed
				move.moveRight();
			//if left button pressed
				move.moveLeft();
				
		eatFruit eat=new eatFruit();
			// if frit comes in contact with the snake
				eat.addTail();
				eat.scoreIncrease();
				eat.playEatSound();
					
		deadSnake dead= new deadSnake();
			//if snake collides with Wall
				dead.contactWall();
			//if snake collides with Tail
				dead.contactTail();
				
		completeGame victory=new completeGame();
			//if all the bocks are covered by snake
				victory.noBlocksLeft();
			
		
	}
}

class eatFruit
{
	addTail(){}
	scoreIncrease(){}
	playEatSound(){}
}

class moveSnake
{
	moveUp(){}
	moveLeft(){}
	moveRight(){}
	moveDown(){}
}

class deadSnake
{
	contactWall()
	{
		lifeDecrease();
	}
	contactTail()
	{
		lifeDecrease();
	}
	lifeDecrease()
	{	
		//if no life left
			noLife();
			
		//other wise decrease one life
		
	}
	noLife()
	{
			playDeadSound();
			showMessage();
		
	}	
	playDeadSound(){}
	showMessage()
	{
		//end program "Game Over!!!"
	}
}

class completeGame
{
	noBlocksLeft()
	{	
		//if the blocks are all covered by the snake
		playMusicVictory();
		showMessageWinner();
	}
	showMessageWinner()
	{	
		//end Program "Victory!!!"
	}
	playMusicVictory(){}
}

class time
{
	timeIncrement()
	{
		//continuos increment in time value
	}
}

