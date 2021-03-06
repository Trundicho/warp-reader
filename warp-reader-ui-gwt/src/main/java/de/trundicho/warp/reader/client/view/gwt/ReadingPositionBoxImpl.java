package de.trundicho.warp.reader.client.view.gwt;

import com.google.gwt.user.client.ui.IntegerBox;
import de.trundicho.warp.reader.core.controller.position.ReadingPositionPlayModelUpdater;
import de.trundicho.warp.reader.core.view.api.widgets.ReadingPositionBox;

class ReadingPositionBoxImpl implements ReadingPositionBox {
	private IntegerBox readPositionBox;

	ReadingPositionBoxImpl(IntegerBox readPositionBox) {
		this.readPositionBox = readPositionBox;
	}

	@Override
	public Integer getReadPositionPercentage() {
		return readPositionBox.getValue();
	}

	@Override
	public void setReadPositionPercentage(Integer readPosition) {
		readPositionBox.setValue(readPosition);
	}

	@Override
	public void registerChangeListenerAction(ReadingPositionPlayModelUpdater action) {
		readPositionBox.addChangeHandler(event -> action.run());
	}

}
