package pilaresPoo.msnmessage;

import pilaresPoo.msnmessage.apps.MSNMessage;
import pilaresPoo.msnmessage.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessage msn = new MSNMessage();

        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("");

        Telegram telegram = new Telegram();

        telegram.enviarMensagem();
        telegram.receberMensagem();

    }
}
