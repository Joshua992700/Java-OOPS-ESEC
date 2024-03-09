import java.util.Scanner;

interface Remote {
    void switchOn();

    void switchOff();
    
    void play();

    void increaseVolume();

    void decreaseVolume();
}

class TVRemote implements Remote {
    @Override
    public void switchOn() {
        System.out.println("TV Switched On");
    }

    @Override
    public void switchOff() {
        System.out.println("Tv Switched Off");
    }

    @Override
    public void increaseVolume() {
        System.out.println("TV Volume Increased");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("TV Volume Decreased");
    }
    
    @Override
    public void play() {
        
    }
}

class AudioPlayerRemote implements Remote {
    @Override
    public void switchOn() {
        System.out.println("Audio Player Switched On");
    }

    @Override
    public void switchOff() {
        System.out.println("Audio Player Switched Off");
    }

    @Override
    public void play() {
        System.out.println("Audio Player Playing");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Audio Player Volume Increased");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Audio Player Volume Decreased");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Remote remote;
        if (choice == 1) {
            remote = new TVRemote();
        } else if (choice == 2) {
            remote = new AudioPlayerRemote();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        remote.switchOn();
        remote.play();
        remote.increaseVolume();
        remote.decreaseVolume();
        remote.switchOff();
    }
}
