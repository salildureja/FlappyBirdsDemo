package com.dfagame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dfagame.States.GameStateManager;
import com.dfagame.States.MenuState;

public class DFAGame extends ApplicationAdapter {
	private GameStateManager gsm;
	private SpriteBatch batch;

	public static final int WIDTH = 480;
	public static final int HEIGHT = 800;

	public static final String TITLE = "DFA Game";
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		gsm = new GameStateManager();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		gsm.push(new MenuState(gsm));
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);	// wipes the screen clean and redraws everything
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
