/** 
 *
 * class Follower represent a fan of idol in showbiz
 *
 * -
 */
public class Follower implements Observer {
    private String name;
    
    /** 
     *
     * Constructor 
     *
     * @param name is the name of follower
     */
    public Follower(String name) { 

        this.name = name;
    }
    
    /** 
     *
     * update song name for followers
     *
     * @param songName is the name of song to update for followers are listening
     */
    @Override
    public void update(String songName) { 

        System.out.println(name + " is listening to " + songName);
    }

    /** 
     *
     * create song name 
     *
     * @param songName is the name of song
     */
    public void create(String songName) { 

        System.out.println(name + " New song name: " + songName);
    }
}
