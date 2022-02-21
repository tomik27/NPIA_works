public class MailService {
SoundService soundService;

    public MailService(SoundService soundService) {
        this.soundService = soundService;
    }

    public void receiveMail(){
    soundService.makeNoise("Tudů");
}
}
