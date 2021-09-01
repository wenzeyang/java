package collection_demo;

/**
 * @author youngwenze
 * @version 1.0
 * 2021/8/28 9:32
 * Description:
 * -
 */
public class DogClass{
    private String nickname;
    private int affinityScore;

    public DogClass(String nickname, int affinityScore){
        this.nickname = nickname;
        this.affinityScore = affinityScore;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAffinityScore() {
        return affinityScore;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAffinityScore(int affinityScore) {
        this.affinityScore = affinityScore;
    }

    @Override
    public String toString(){
        return "Dog{" + "name=" + nickname +" ,affinityScore=" + affinityScore+"}";
    }
}
