package uz.bot.controller;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Controllermain extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "minesnew_bot";
    }

    @Override
    public String getBotToken() {

        return "5264094471:AAHJFZsy2Py-uS11Kt4tafO73TJyG8ifV0U";
    }

    @Override
    public void onUpdateReceived(Update update) {
       // System.out.println(update);
    Message message = update.getMessage();
    Integer messageId = message.getMessageId();

    String text = message.getText();
    User user = message.getFrom();

    SendMessage sendMessage = new SendMessage();
    sendMessage.setChatId(String.valueOf(message.getChatId()));
        if (text.equals("/start")){

            sendMessage.setText("Assalomu alekum Khumoyun telegram bot ga xush kelibsiz");

        }else if (text.equals("/help")){
            sendMessage.setText("Assalomu alekum botni ishlatishni bilmayabsizmi?");
        }
        else {
            sendMessage.setText("Mavjud emas!!!");
        }
        try    {
        execute(sendMessage);
    } catch(TelegramApiException e)
    {
        e.printStackTrace();
    }
}
}
