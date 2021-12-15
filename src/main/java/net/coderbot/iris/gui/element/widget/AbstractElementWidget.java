package net.coderbot.iris.gui.element.widget;

import com.mojang.blaze3d.vertex.PoseStack;

public abstract class AbstractElementWidget {
	public static final AbstractElementWidget EMPTY = new AbstractElementWidget() {
		@Override
		public void render(PoseStack poseStack, int x, int y, int width, int height, int mouseX, int mouseY, float tickDelta, boolean hovered) {}
	};

	public AbstractElementWidget() {
	}

	protected void onRefresh() {}

	public abstract void render(PoseStack poseStack, int x, int y, int width, int height, int mouseX, int mouseY, float tickDelta, boolean hovered);

	public boolean mouseClicked(double mx, double my, int button) {
		return false;
	}

	public boolean mouseReleased(double mx, double my, int button) {
		return false;
	}
}