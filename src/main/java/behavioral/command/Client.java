package behavioral.command;

public class Client {
    public static void main(String[] args) {
        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommadn = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommadn);
        keypad.setStopCommand(stopCommand);

        keypad.play();
        keypad.rewind();
        keypad.stop();
    }
}

