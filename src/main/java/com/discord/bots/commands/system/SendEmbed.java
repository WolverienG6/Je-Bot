package com.discord.bots.commands.system;

import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

import java.awt.*;

public class SendEmbed implements CommandExecutor {
    @Command(aliases = "sendEmbed", description = "sends an embed to the channel")
    public void onSendEmbed(MessageCreateEvent message){
        message.getChannel().sendMessage(CreateEmbed(message));
    }

    private EmbedBuilder CreateEmbed(MessageCreateEvent message)
    {
        EmbedBuilder embed = new EmbedBuilder()
                .setTitle("Hello from Je!")
                .setDescription("This embed was sent from Je!")
                .setColor(new Color(62, 200, 146))
                .setFooter(message.getMessageAuthor().getDisplayName(),message.getMessageAuthor().getAvatar());

        return embed;
    }
}
