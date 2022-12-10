package edu.up.cs301threadslab;

public class ThreadedAnimationView extends Thread {
    private AnimationView av;

    public ThreadedAnimationView(AnimationView animView)
    {
        super();

        this.av = animView;
    }

    @Override
    public void run() {
        while(true) {
            av.postInvalidate();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
