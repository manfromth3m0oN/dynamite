package xyz.m0on.dynamite;

import com.softwire.dynamite.runner.*;

public class BotRunner {
    public static void main(String[] args) {
        Results results = DynamiteRunner.playGames(LunarBot::new);
    }
}
