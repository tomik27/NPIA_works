public class CallService {
    SoundService soundService;

    public CallService(SoundService emailService){
         this.soundService =  emailService;
    }


    public void receiveCall(){
        soundService.makeNoise("Nokia_Sound");
    }
}
