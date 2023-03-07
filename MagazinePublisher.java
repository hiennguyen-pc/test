import java.util.ArrayList;
import java.util.List;
/** 
 *
 * MagazinePublisher class represent a cooperation publish magazines, book online or sale in store 
 *
*  
*/
public class MagazinePublisher implements Publisher {
    private List<Subscriber> subscribers;
    private List<String> magazines;
    /** 
     *
     * constructor
     *
     *
     */
    public MagazinePublisher() {
        subscribers = new ArrayList<>();
        magazines = new ArrayList<>();
    }
    /** 
     *
     * Publisher add reader to list Subscriber to inform when they publish new magazine
     *
     * @param subscriber is the people following the magazine
     * @param magazine is the name of new magazine 
     */
    @Override
    public void addSubscriber(Subscriber subscriber, String magazine) {
        subscribers.add(subscriber);
        magazines.add(magazine);
    }
     /** 
     *
     * Publisher remove reader out of list Subscriber when they publish new magazine
     *
     * @param subscriber is the people following the magazine
     * @param magazine is the name of new magazine 
     */
    @Override
    public void removeSubscriber(Subscriber subscriber, String magazine) {
        int index = subscribers.indexOf(subscriber);
        if (index >= 0) {
            subscribers.remove(index);
            magazines.remove(index);
        }
    }
     /** 
     *
     * Publisher is notify to each people of list subscriber when they publish new magazine
     *
     * @param magazine is the name of new magazine 
     */
    @Override
    public void notifySubscribers(String magazine) {
        for (int i = 0; i < subscribers.size(); i++) {
            if (magazines.get(i).equals(magazine)) {
                subscribers.get(i).update(magazine);
            }
        }
    }
     /** 
     *
     * Publisher publish new magazine
     *
     * @param magazine is the name of new magazine 
     */
    public void publish(String magazine) {
        System.out.println("Publisher has published a new issue of " + magazine);
        notifySubscribers(magazine);
    }
}

