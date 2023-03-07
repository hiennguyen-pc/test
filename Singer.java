import java.util.ArrayList;
import java.util.List;

/** 
 *
 * singer class represent a idol in showbiz have many followers
 *
*  
*/
public class Singer implements Subject {
    private List<Observer> followers;
    private String latestSong;
    
    /** 
     *
     * constructor
     *
     *
     */
    public Singer() { 

        followers = new ArrayList<>();
    }
    
    /** 
     *
     * create new song 
     *
     * @param observer add song
     */
    @Override
    public void addObserver(Observer observer) { 

        followers.add(observer);
    }

    /** 
     *
     * followers delete song
     *
     * @param observer delete song
     */
    
    @Override
    public void removeObserver(Observer observer) { 

        followers.remove(observer);
    }

    /** 
     *
     * Notify new song for follower update list song. 
     *
     * @param songName is the name of song want to notify followes
     */
    @Override

    public void notifyObservers(String songName) { 

        latestSong = songName;
        for (Observer follower : followers) {
            follower.update(songName);
        }
    }
    
    /** 
     *
     * get list latest song 
     *
     * -
     */
    public String getLatestSong() { 

        return latestSong;
    }
    
    /** 
     *
     * Singer is singing the songname 
     *
     * @param songName is the name of song the singer is singing
     */
    public void sing(String songName) { 

        System.out.println("Singer is singing " + songName);
        notifyObservers(songName);
    }
}

