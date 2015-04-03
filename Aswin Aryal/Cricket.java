public class Cricket {
    public static void main(String[] args) {
        MovePlayer move = new MovePlayer();
        //if up button pressed //
        move.moveUp();
        //if down button pressed//
        move.moveDown();
        //if right button pressed//
        move.moveRight();
        //if left button pressed//
        move.moveLeft();
        Run runScore = new Run();
        runScore.six();
        runScore.four();
        runscore.one_Run();//for one run//
        runScore.two_Run();//for two run//
        runscore.threee_Run();//for three run//
        Ball bowling = new Ball();
        bowling.wicket();//when wicket falls//
        bowling.wide();//when ball is thrown wide//
        bowling.noball();//when ball is above the player height//
        CompleteGame victory=new CompleteGame();
        victory.compareScore();
        showMessageWinner();
    }
}
class Run{
    Increase_Score(){
        //increasing score code goes here//
    }
}
class MovePlayer{
    moveUp(){
        //code//
    }
    movedown(){
        //code//
    }
    moveRight(){
        //code//
    }
    moveDown(){
        //code//
    }
}
class Ball{
    wicket(){
        //code goes here//
  }
    wide();{
        //code goes here//
    }
    noball(){
        //code goes here//
    } }

