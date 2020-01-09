public class Table {

    int nbrOfChopsticks;
    private boolean chopstick[]; //true if chopstick[i] is available

    public Table(int nbrOfSticks){
        nbrOfChopsticks=nbrOfSticks;
        chopstick=new boolean[nbrOfChopsticks];
        for(int i=0;i<nbrOfChopsticks;i++){
            chopstick[i]=true;
        }
    }

    public void getLeft(int n){
        //philosopher n picks up its left chopstick
        chopstick[n]=false;
    }

    public void getRight(int n){
        //philosopher n picks up its right chopstick
        int pos=n+1;
        if(pos==nbrOfChopsticks)
            pos=0;
        chopstick[pos]=false;
    }

    public void releaseLeft(int n){
        //philosopher n puts down its left chopstick
        chopstick[n]=true;
    }

    public void releaseRight(int n){
        //philosopher n puts down its right chopstick
        int pos=n+1;
        if(pos==nbrOfChopsticks)
            pos=0;
        chopstick[pos]=true;
    }
}
