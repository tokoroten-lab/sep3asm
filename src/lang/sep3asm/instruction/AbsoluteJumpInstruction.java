package lang.sep3asm.instruction;

import lang.sep3asm.*;
import lang.sep3asm.parse.Operand;

public class AbsoluteJumpInstruction extends Sep3Instruction {
	public AbsoluteJumpInstruction(int opCode, int from, int to) {
		super(opCode, from, to);
	}
	public void generate(Sep3asmParseContext ctx, Operand op1, Operand op2) {
		ctx.output(opCode | op1.to5bits() << 5);
		if (op1.needsExtraWord()) {
			ctx.output(op1.getExtraWord());
		}
	}
}
