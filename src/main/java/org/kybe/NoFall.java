package org.kybe;

import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import org.rusherhack.client.api.accessors.packet.IMixinServerboundMovePlayerPacket;
import org.rusherhack.client.api.events.network.EventPacket;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;


public class NoFall extends ToggleableModule {
	public NoFall() {
		super("Matrix No Fall", "Matrix No Fall", ModuleCategory.CLIENT);
	}

	@Subscribe
	public void onPacket(EventPacket.Send e) {
		if (e.getPacket() instanceof ServerboundMovePlayerPacket p) {
			if (this.isToggled()) {
				((IMixinServerboundMovePlayerPacket) p).setOnGround(false);
			}
		}
	}
}
