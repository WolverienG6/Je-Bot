package com.discord.bots;

import com.discord.bots.commands.ping;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {

    public static String prefix = "!Je";

    public static void main(String[] args) {
        DiscordApi bot = new DiscordApiBuilder()
                .setToken(System.getenv().get("TOKEN"))
                .login()
                .join();

        bot.addListener(new ping());

        System.out.println("Bot is Online!");
    }
}
