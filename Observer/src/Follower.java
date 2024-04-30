public class Follower implements Observer{
    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }

    public void update(String message) {
        System.out.println(message);
    }

    public void play() {
        System.out.println(followerName + "loves Youtube!");
    }
}
