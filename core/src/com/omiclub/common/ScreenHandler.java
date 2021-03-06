package com.omiclub.common;

import com.badlogic.gdx.Screen;
import com.omiclub.game.ClientScreen;
import com.omiclub.game.GameScreen;
import com.omiclub.game.MainMenu;
import com.omiclub.game.NameScreen;
import com.omiclub.game.PlayerSelector;
import com.omiclub.game.ScoreScreen;
import com.omiclub.game.ServerScreen;
import com.omiclub.game.SplashScreen;
import com.omiclub.game.TrumpSelectScreen;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by janith on 7/10/16.
 */
public class ScreenHandler {

    private static Map<String, Screen> screens = new HashMap<String, Screen>(5);

    public static Screen getSplashScreen(){
        if(!screens.containsKey("splash")){
            screens.put("splash", new SplashScreen());
        }
        return screens.get("splash");
    }

    public static Screen getNameScreen(){
        if(!screens.containsKey("name")){
            screens.put("name", new NameScreen());
        }
        return screens.get("name");
    }

    public static Screen getMainMenu(){
        if(!screens.containsKey("mainmenu")){
            screens.put("mainmenu", new MainMenu());
        }
        return screens.get("mainmenu");
    }

    public static Screen getServerScreen(){
        if(!screens.containsKey("serverscreen")){
            screens.put("serverscreen", new ServerScreen());
        }
        return screens.get("serverscreen");
    }

    public static Screen getPlayerSelector() {
        if(!screens.containsKey("playerselect")){
            screens.put("playerselect", new PlayerSelector());
        }
        return screens.get("playerselect");
    }

    public static Screen getTrumpSelectScreen() {
        if(!screens.containsKey("trumpselect")){
            screens.put("trumpselect", new TrumpSelectScreen());
        }
        return screens.get("trumpselect");
    }

    public static Screen getGameScreen() {
        if(!screens.containsKey("gamescreen")){
            screens.put("gamescreen", new GameScreen());
        }
        return screens.get("gamescreen");
    }

    public static Screen getClientScreen() {
        if(!screens.containsKey("clientscreen")){
            screens.put("clientscreen", new ClientScreen());
        }
        return screens.get("clientscreen");
    }

    public static Screen getScoreScreen() {
        if(!screens.containsKey("scoreScreen")){
            screens.put("scoreScreen", new ScoreScreen());
        }
        return screens.get("scoreScreen");
    }
}
