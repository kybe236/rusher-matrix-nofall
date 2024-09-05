package org.kybe;

import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.plugin.Plugin;


public class Main extends Plugin {
	
	@Override
	public void onLoad() {
		final NoFall noFall = new NoFall();
		RusherHackAPI.getModuleManager().registerFeature(noFall);
	}
	
	@Override
	public void onUnload() {
	}
	
}