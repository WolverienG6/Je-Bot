package com.discord.bots;

import com.discord.bots.commands.help.BotInfo;
import com.discord.bots.commands.help.help;
import com.discord.bots.commands.system.SendEmbed;
import com.discord.bots.commands.system.ping;
import de.btobastian.sdcf4j.CommandHandler;
import de.btobastian.sdcf4j.handler.JavacordHandler;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {

    public static String prefix = "!Je";

    public static void main(String[] args) {
        DiscordApi bot = new DiscordApiBuilder()
                .setToken(System.getenv().get("TOKEN"))
                .login()
                .join();

        CommandHandler handler = new JavacordHandler(bot);

        handler.setDefaultPrefix(prefix);
        handler.registerCommand(new ping());
        handler.registerCommand(new SendEmbed());
        handler.registerCommand(new BotInfo());
        handler.registerCommand(new help(handler));

        System.out.println("Bot is Online!");
    }
}
