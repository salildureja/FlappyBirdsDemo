package com.dfagame.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dfagame.DFAGame;

/**
 * Created by salildureja on 2/23/17.
 */

public class MenuState extends State {
    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playBtn.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, DFAGame.WIDTH, DFAGame.HEIGHT);
        sb.draw(playBtn, (DFAGame.WIDTH/2) - (playBtn.getWidth()/2),
                (DFAGame.HEIGHT/2) - (playBtn.getHeight()/2));
        sb.end();

    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
    }

}
