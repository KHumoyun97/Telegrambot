package uz.bot;


import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import uz.bot.controller.Controllermain;


public class Main  {

    public static void main(String[] args) throws TelegramApiException {
             ApiContextInitializer.init();
           TelegramBotsApi api=new TelegramBotsApi(DefaultBotSession.class);
        try {
            api.registerBot(new Controllermain());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
