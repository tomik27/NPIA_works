package cs.upce.fei.nnpia.cv2.dispring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class DiSpringApplication {

    @Autowired
    MailService mailService;

    @Autowired
    CallService callService;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext("cs.upce.fei.nnpia.cv2.dispring");

      context.getBean(DiSpringApplication.class).process();
    }

    private void process() {
        mailService.receiveMail();
        callService.receiveCall();
    }

}
