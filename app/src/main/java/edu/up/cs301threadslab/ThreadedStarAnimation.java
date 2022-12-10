package edu.up.cs301threadslab;

public class ThreadedStarAnimation extends Thread {
    private StarAnimation sAnim;

    public ThreadedStarAnimation(StarAnimation animation)
    {
        super();

        this.sAnim = animation;
    }

    @Override
    public void run() {
        while(true) {
            sAnim.removeStar();
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
