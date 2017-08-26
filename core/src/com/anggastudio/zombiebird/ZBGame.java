package com.anggastudio.zombiebird;

import com.anggastudio.screens.GameScreen;
import com.anggastudio.screens.SplashScreen;
import com.anggastudio.zbhelpers.AssetLoader;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class ZBGame extends Game {
	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}
