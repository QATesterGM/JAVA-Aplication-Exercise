package model.computer;

public interface Video {

    void createVideo();
    void playVideo();
    void pauseVideo();
    void stopVideo();

    default void sayHelloFromVideo(){
        System.out.println("Hello from Video Interface");
    }

}
