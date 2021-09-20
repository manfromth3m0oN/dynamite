package xyz.m0on.dynamite;

import com.softwire.dynamite.bot.Bot;
import com.softwire.dynamite.game.Gamestate;
import com.softwire.dynamite.game.Move;

import java.util.concurrent.ThreadLocalRandom;

public class LunarBot implements Bot {
    public LunarBot() {
        System.out.println("Started new match");
    }

    @Override
    public Move makeMove(Gamestate gamestate) {
        int dynamiteCount = 0;
        int random = ThreadLocalRandom.current().nextInt(0, 5);
        System.out.printf("Random Number is: %d\n", random);
        if (dynamiteCount >=100) {
            random = ThreadLocalRandom.current().nextInt(0, 3);
        }
        switch (random) {
            case 0: return Move.R;
            case 1: return Move.P;
            case 2: return Move.S;
            case 3: return Move.W;
            case 4: {
                dynamiteCount++;
                return Move.D;
            }
        }
        return null;
    }
}
