package com.mojang.minekart.editor;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.mojang.minekart.MineKartGame;

public class EditorScreen extends ScreenAdapter {
    private Stage stage;

    public EditorScreen(MineKartGame game) {
        stage = new Stage();

        Label topLabel = new Label("Build your cart!", game.skin);
        topLabel.setPosition(10, 500);
        stage.addActor(topLabel);



        CartGridView cartGridView = new CartGridView();
        stage.addActor(cartGridView);

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act(delta);
        stage.draw();
    }

}
