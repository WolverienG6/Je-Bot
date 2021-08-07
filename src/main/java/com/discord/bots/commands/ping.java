package com.discord.bots.commands;

import com.discord.bots.Main;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class ping implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent message) {
        if(message.getMessageContent().equalsIgnoreCase(Main.prefix))
        {
            message.getChannel().sendMessage("Hey, I am Je!");
        }
    }
}
