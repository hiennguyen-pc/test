import java.util.List;
/** 
 *
 * MagazineSubscriber class represent the people who subscribe magazine of the Publisher
 *
*  
*/
public class MagazineSubscriber implements Subscriber {
    private String name;
    private List<String> interests;
    /** 
     *
     * Subscriber is a person who in list want to recive notify about new magazine is published
     *
     * @param name is the name of Subscriber
     * @param interests is the list of Subscriber
     */
    public MagazineSubscriber(String name, List<String> interests) {
        this.name = name;
        this.interests = interests;
    }
    /** 
     *
     * Subscriber recive notify about new magazine is published
     *
     * @param magazine is the name of magazine
     */
    @Override
    public void update(String magazine) {
        System.out.println(name + " received the new issue of " + magazine);
    }
     /** 
     *
     * Add Subscriber in to list recieve the new magazine
     *
     * @param interest is the name of Subscriber
     */
    public void addInterest(String interest) {
        interests.add(interest);
    }
     /** 
     *
     * Remove Subscriber in to list recieve the new magazine
     *
     * @param interest is the name of Subscriber
     */
    public void removeInterest(String interest) {
        interests.remove(interest);
    }
     /** 
     *
     * Display list people who interested the magazine
     *
     */
    public List<String> getInterests() {
        return interests;
    }
}
