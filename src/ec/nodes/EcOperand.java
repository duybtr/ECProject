package ec.nodes;

/**
 *  @author Dane
 *  @created 10-02-2015
 */


public class EcOperand extends EcNode {


	public EcOperand(String data) {
		this.data = data;
	}
	
	public void spawnRandomNode(int height) {
		//nothing
	}
	
	public String toString() {
		return this.data;
	}
	
	public double calculateOutput(int input) {
		if (this.data.equals("x")) {
			return input;
		}
		else {
			return Integer.parseInt(this.data);
		}
	}
	
	public boolean search(String data) {
		if (this.data.equalsIgnoreCase(data)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getDepth() {
		return 0;
	}
	

}