package com.mojang.minekart;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.mojang.minekart.editor.EditorScreen;

public class MineKartGame extends Game {
	public Skin skin;

	private SpriteBatch batch;
	private Texture img;

	private EditorScreen editorScreen;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("minekart-logo.jpg");
		skin = new Skin(Gdx.files.internal("skin/glassy-ui.json"));
		editorScreen = new EditorScreen(this);
		setScreen(editorScreen);
	}

	/*
	@Override
	public void render () {
		Gdx.gl.glClearColor(0.3f, 0.1f, 0.3f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 69, 69);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	*/
}
