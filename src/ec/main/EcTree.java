
package ec.main;
import java.util.Random;


/**
 *  @author Duy
 *  @created 09-29-2015
 */
public class EcTree {
	
    private EcNode root;
	private int height;
    private double fitness;
    
  
    public EcTree(EcNode root){
    	this.root = root;
    }
    
    public EcTree(int height) {
    	this.root = EcNodeFactory.getNode("ECOPERATOR");
    	this.root.createRandomNode(height);
		if (!this.root.search("x")) {
			Random rn = new Random();
			Integer ranInt = rn.nextInt(this.root.getDepth());
			this.root.mutate("x",ranInt);
		}
    }
	
	public double getFitness() {
		return fitness;
	}

	public void setFitness(double fitness) {
		this.fitness = fitness;
	}
    
    /**
     * Display tree in equation form
     * For example: our target function will look like (((x * x )- 1 )/ 2 )
     * Can be parsed by tools such as WolframAlpha to get a more readable form.
     */
    
    public void displayTree() {
		System.out.print(this.root.toString() + " = " + this.root.calculateOutput(16));
    }
    
    public int calculateFitness(int x) {
    	// TODO : to be implemented
    	return 0;
    }
   /*
    public static EcTree createExampleTree() {
    	EcOperator ecRoot = new EcOperator();
    	ecRoot.data = "/";
    			
		EcTree ecTree = new EcTree(ecRoot);
		ecRoot.leftChild = new EcOperator();
		ecRoot.leftChild.data = "-";
		ecRoot.rightChild = new EcOperand();
		ecRoot.rightChild.data = "2";
		
		ecRoot.leftChild.leftChild = new EcOperator();
		ecRoot.leftChild.leftChild.data = "*";
		ecRoot.leftChild.rightChild = new EcOperand();
		ecRoot.leftChild.rightChild.data = "1";
	
		ecRoot.leftChild.leftChild.leftChild = new EcOperand();
		ecRoot.leftChild.leftChild.leftChild.data = "x";
		
		ecRoot.leftChild.leftChild.rightChild = new EcOperand();
		ecRoot.leftChild.leftChild.rightChild.data = "x";
		return ecTree;
    }*/
}
