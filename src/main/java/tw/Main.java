package tw;

import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {
	

    private static final int RUN_TIMES = 6;

    public static void main(String[] args) throws Exception {
    	LuckGame luckGame = new LuckGame();
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            String result = luckGame.runGame(input);
            if (result.equals("4A0B")) {
				break;
			}
        }
    }
    
    
}
