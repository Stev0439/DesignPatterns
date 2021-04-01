package designPatterns2;

public class Keyboard implements ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}
