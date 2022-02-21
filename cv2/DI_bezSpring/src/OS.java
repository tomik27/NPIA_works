public class OS implements IOS {
  MailService mailService;
  CallService callService;

    public OS(MailService mailService, CallService callService) {
        this.mailService = mailService;
        this.callService = callService;
    }

    public static void main(String[] args) {
        IOS os = DependencyInjector.getOS();
        os.process();
    }

    @Override
    public void process() {
        mailService.receiveMail();
        callService.receiveCall();
    }

}
