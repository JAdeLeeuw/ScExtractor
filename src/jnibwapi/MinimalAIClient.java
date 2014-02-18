package jnibwapi;

/**
 * Example of a Java AI Client that does nothing.
 */
import jnibwapi.model.Unit;
import jnibwapi.util.BWColor;

public class MinimalAIClient implements BWAPIEventListener {
	private JNIBWAPI bwapi;
	
	public static void main(String[] args) {
		new MinimalAIClient();
	}
	
	public MinimalAIClient() {
		bwapi = new JNIBWAPI(this, false);
		bwapi.start();
	}
	
	@Override
	public void connected() {}
	
	@Override
	public void matchStart() {}
	
	@Override
	public void matchFrame() {
		for (Unit u : bwapi.getAllUnits()) {
			bwapi.drawCircle(u.getPosition(), 5, BWColor.Red, true, false);
		}
	}
	
	public void keyPressed(int keyCode) {}
	public void matchEnd(boolean winner) {}
	public void sendText(String text) {}
	public void receiveText(String text) {}
	public void nukeDetect(int x, int y) {}
	public void nukeDetect() {}
	public void playerLeft(int playerID) {}
	public void unitCreate(int unitID) {}
	public void unitDestroy(int unitID) {}
	public void unitDiscover(int unitID) {}
	public void unitEvade(int unitID) {}
	public void unitHide(int unitID) {}
	public void unitMorph(int unitID) {}
	public void unitShow(int unitID) {}
	public void unitRenegade(int unitID) {}
	public void saveGame(String gameName) {}
	public void unitComplete(int unitID) {}
	public void playerDropped(int playerID) {}
}
