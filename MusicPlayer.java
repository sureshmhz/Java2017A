/**
 * Created by Neesha on 4/2/2015.
 */
public class MusicPlayer {
    public static void main(String[] args) {
        List songList = new List();
        songList.favouriteSongs();//for listing the most played songs
        songList.recentlyPlayed();//for listing the songs which are played recently according to time
        songList.recentlyAdded();//for listing the newly added songs
        songList.allSongs();//for listing all the music files from memory

        SelectMusic musicOption= new SelectMusic();
        musicOption.play();//for playing the selected song
        musicOption.pause();//for pausing the playing song
        musicOption.forward();//for skipping the certain content of song in forward direction
        musicOption.backward();//for skipping certain content of song in backward direction


        ChangeMusic change=new ChangeMusic();
        change.next();//to play the next song of the list
        change.previous();//to play the previous song of the list

        Volume sound=new Volume();
        sound.volumeUp();//for increasing the sound
        sound.volumeDown();//for decreasing the sound
    }
}
class List{
    String favouriteSongs(){
        //code
    }
    String recentlyPlayed(){
        //code
    }
    String recentlyAdded(){
        //code
    }
    String allSongs(){
        //code
    }
}
class SelectMusic{
    String pause(){
        //code
    }
    String play(){
        //code
    }
    String forward(){
        //code
    }
    String backward(){
        //code
    }
}
class ChangeMusic{
    String next(){
        //code
    }
    String previous()
    {
        //code
    }

}
class Volume{
    String volumeUp(){
        //code
    }
    String volumeDown(){
        //code
    }
}

