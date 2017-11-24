package behavioral.command;

//具体命令角色类
public class PlayCommand implements Command{
    private AudioPlayer myAudio;

    public PlayCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    /**
     * 执行方法
     */

    public void execute() {
        myAudio.play();
    }
}
