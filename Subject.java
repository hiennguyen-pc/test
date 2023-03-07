/** 
 *
 * interface subject 
 *
 * -
 */
public interface Subject {
    /** 
     *
     * method create new song 
     *
     * @param observer add song
     */
    void addObserver(Observer observer);

    /** 
     *
     * method update song 
     *
     * @param observer update song
     */
    void removeObserver(Observer observer);

    /** 
     *
     * method notify new song publish 
     *
     * @param songName song name
     */
    void notifyObservers(String songName);
}
