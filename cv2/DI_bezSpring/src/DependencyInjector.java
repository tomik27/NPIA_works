public class DependencyInjector {
    private static MailService mailService;
    private static CallService callService;
    private static SoundService soundService;
    public DependencyInjector() {
        //navrhovy vzor singleton

    }
    private static SoundService getSoundService(){
        if(soundService ==null)
            soundService =new SoundService();
        return soundService;
    }
    private static MailService getMailService(){
        if(mailService ==null)
            mailService =new MailService(getSoundService());
        //lazy object creation.. nevytvarime objekt, dokud o nej nekdo nepozada
        return mailService;
    }

    private static CallService getCallService(){
        if(callService ==null)
            callService =new CallService(getSoundService());
        //lazy object creation.. nevytvarime objekt, dokud o nej nekdo nepozada
        return callService;
    }

    public static IOS getOS(){
        return new OS(getMailService(), getCallService());
    }


}
