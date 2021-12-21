public class game {
    game(String job,double hp,double att,double MP){
        this.job=job;
        this.hp=hp;
        this.att=att;
        this.MP=MP;}

    String job;//職位
    double hp,att,MP;//生命，攻擊上限，護甲

    public void attack(game other){
        double hurt = Math.random()*(att);
        if(hurt<=other.MP)
            hurt = 0;
        else {
            hurt = hurt - other.MP;
        }
        other.hp-=hurt;

        System.out.println(job+"對"+other.job+"造成了"+hurt+"點傷害");
        System.out.println(" ");
        System.out.println(job+"當前血量為:"+hp);
        System.out.println(other.job+"當前血量為:"+other.hp);
        System.out.println(" ");
    }

    public boolean live(game other){
        if(hp<=0) {
            System.out.println(job+"已死亡    "+other.job+"獲得勝利");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {game p1=new game("surprise弓箭手",100,30,10);
        game p2=new game("power狂戰士",100,15,5);
        game p3=new game("magic魔法師",100,40,30);
        while(true)
        {
            p1.attack(p2);
            if(!p2.live(p1)){
                break;
            }
            p2.attack(p1);
            if(!p1.live(p2)){
                break;
            }
            p3.attack(p1);
            if(!p1.live(p3)){
                break;
            }
        }
    }
}
