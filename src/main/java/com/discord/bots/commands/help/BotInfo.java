package com.discord.bots.commands.help;

import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

import java.awt.*;

public class BotInfo implements CommandExecutor {
    @Command(aliases = "botInfo",description = "Sends Bot Information", usage = "[mention|name]")
    public void OnBotInfo(MessageCreateEvent message)
    {
        message.getChannel().sendMessage(CreateEmbed(message));
    }

    private EmbedBuilder CreateEmbed(MessageCreateEvent message)
    {
        return new EmbedBuilder()
                .setTitle(" ** Bot Information: ** ")
                .setDescription("Hie I am Je!, create be WolverienG6")
                .setColor(new Color(142, 57, 191))
                .setFooter(message.getMessageAuthor().getDisplayName(),message.getMessageAuthor().getAvatar());
    }
}
