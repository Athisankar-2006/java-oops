package Abstraction;

 interface musicplayer {

    void play();//abstract method

    default void pause(){
        System.out.println("music is puase!..");
    }

    static void player(){
        System.out.println("music player is v2.0");
    }

    
}


class sopity implements musicplayer{
    public void play(){
        System.out.println("music is playing");
    }

   
}

public class defaultStatic {
    public static void main(String[] args) {

        musicplayer obj=new sopity();
        obj.play();
        obj.pause();
        musicplayer.player();
        
    }
    
}
