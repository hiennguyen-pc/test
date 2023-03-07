/** 
 *
 * MagazinePublisher class represent a cooperation publish magazines, book online or sale in store 
 *
*  
*/
public interface Publisher {
    /** 
     *
     * Publisher add reader to list Subscriber to inform when they publish new magazine
     *
     * @param subscriber is the people following the magazine
     * @param magazine is the name of new magazine 
     */
    void addSubscriber(Subscriber subscriber, String magazine);
     /** 
     *
     * Publisher remove reader out of list Subscriber when they publish new magazine
     *
     * @param subscriber is the people following the magazine
     * @param magazine is the name of new magazine 
     */
    void removeSubscriber(Subscriber subscriber, String magazine);
    /** 
     *
     * Publisher is notify to each people of list subscriber when they publish new magazine
     *
     * @param magazine is the name of new magazine 
     */
    void notifySubscribers(String magazine);
}