import java.util.*;

public class Soccer
{
	public static void main(String[] args)
	{
		Time sec=new Time()
			//continuos increment of time value
				sec.timeIncrement();
			
		MovePlayer move=new MovePlayer();
			//if up button pressed
				move.moveUp();	
			//if down button pressed
				move.moveDown();
			//if right button pressed
				move.moveRight();
			//if left button pressed
				move.moveLeft();
				
		Goal goalScore=new Goal();
			
			goalScore.scoreIncrease();//Increase the score
			goalScore.playCelebrationMusic();//play celebration music

		Shots target=new Shots();
		
		target.Longpass();
		target.Shortpass();
		target.Throw();
		target.Goalkick();

		
		Foul tackle=new Foul();
		yellowCard();//for minor foul
		redCard();//for major foul
		
				
		CompleteGame victory=new CompleteGame();
			victory.compareScore();
			showMessageWinner();
                   	playMusicVictory();
			showMessage();

	
}

class Goal
{
	
	scoreIncrease(){}
	playCelebrationMusic(){}
}

class Moveplayer
{
	moveUp(){}
	moveLeft(){}
	moveRight(){}
	moveDown(){}
}
class Time
{
	timeIncrement()
	{
		if(time==45){//half time}
		if(time==90){//game end}	
	}
}
class ChangePlayer
{
	playerIn();{//player going inside}
	playerOut();{//player going outside}
}

class Shots
{
	Longpass();{//for long pass}
	Shortpass();{//for short pass}
	Throw();{//for throwing ball}
	Goalkick();{//for charging to post}
	
}


class Foul
{

	yellowCard();
	{
		//if card==2;{redCard()}
	}
	redCard();
}

class CompleteGame
{
	compareScore()
	{ 
		//compares the score
	}
	
	showMessageWinner()
	{	
		//end Program "Victory!!!"
	}
	playMusicVictory(){}
	showMessage()
	{
		//end program "Game Over!!!"
	}
}


