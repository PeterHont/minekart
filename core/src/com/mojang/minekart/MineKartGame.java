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
}
