/*
* generated by Xtext
*/
package org.xtext.example.pascal.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class PascalGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class PascalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "pascal");
		private final Assignment cProgramAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cProgramProgramParserRuleCall_0 = (RuleCall)cProgramAssignment.eContents().get(0);
		
		//pascal:
		//	program+=program;
		public ParserRule getRule() { return rule; }

		//program+=program
		public Assignment getProgramAssignment() { return cProgramAssignment; }

		//program
		public RuleCall getProgramProgramParserRuleCall_0() { return cProgramProgramParserRuleCall_0; }
	}

	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cProgram_heading_blockParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cBlockParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//program:
		//	program_heading_block block ".";
		public ParserRule getRule() { return rule; }

		//program_heading_block block "."
		public Group getGroup() { return cGroup; }

		//program_heading_block
		public RuleCall getProgram_heading_blockParserRuleCall_0() { return cProgram_heading_blockParserRuleCall_0; }

		//block
		public RuleCall getBlockParserRuleCall_1() { return cBlockParserRuleCall_1; }

		//"."
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
	}

	public class Program_heading_blockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "program_heading_block");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProgramKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDENTIFIERTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIdentifier_listParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//program_heading_block:
		//	"program" IDENTIFIER ("(" identifier_list ")")? ";";
		public ParserRule getRule() { return rule; }

		//"program" IDENTIFIER ("(" identifier_list ")")? ";"
		public Group getGroup() { return cGroup; }

		//"program"
		public Keyword getProgramKeyword_0() { return cProgramKeyword_0; }

		//IDENTIFIER
		public RuleCall getIDENTIFIERTerminalRuleCall_1() { return cIDENTIFIERTerminalRuleCall_1; }

		//("(" identifier_list ")")?
		public Group getGroup_2() { return cGroup_2; }

		//"("
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//identifier_list
		public RuleCall getIdentifier_listParserRuleCall_2_1() { return cIdentifier_listParserRuleCall_2_1; }

		//")"
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class Identifier_listElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "identifier_list");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDENTIFIERTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDENTIFIERTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//identifier_list:
		//	(IDENTIFIER ("," IDENTIFIER)*)?;
		public ParserRule getRule() { return rule; }

		//(IDENTIFIER ("," IDENTIFIER)*)?
		public Group getGroup() { return cGroup; }

		//IDENTIFIER
		public RuleCall getIDENTIFIERTerminalRuleCall_0() { return cIDENTIFIERTerminalRuleCall_0; }

		//("," IDENTIFIER)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//IDENTIFIER
		public RuleCall getIDENTIFIERTerminalRuleCall_1_1() { return cIDENTIFIERTerminalRuleCall_1_1; }
	}

	public class BlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "block");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDeclaration_partParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cStatement_partParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//block:
		//	declaration_part statement_part;
		public ParserRule getRule() { return rule; }

		//declaration_part statement_part
		public Group getGroup() { return cGroup; }

		//declaration_part
		public RuleCall getDeclaration_partParserRuleCall_0() { return cDeclaration_partParserRuleCall_0; }

		//statement_part
		public RuleCall getStatement_partParserRuleCall_1() { return cStatement_partParserRuleCall_1; }
	}

	public class Statement_partElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "statement_part");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBeginKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cStatement_sequenceParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cEndKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//statement_part:
		//	"begin" statement_sequence "end";
		public ParserRule getRule() { return rule; }

		//"begin" statement_sequence "end"
		public Group getGroup() { return cGroup; }

		//"begin"
		public Keyword getBeginKeyword_0() { return cBeginKeyword_0; }

		//statement_sequence
		public RuleCall getStatement_sequenceParserRuleCall_1() { return cStatement_sequenceParserRuleCall_1; }

		//"end"
		public Keyword getEndKeyword_2() { return cEndKeyword_2; }
	}

	public class Statement_sequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "statement_sequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cStatementParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cStatementParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//statement_sequence:
		//	statement (";" statement)*;
		public ParserRule getRule() { return rule; }

		//statement (";" statement)*
		public Group getGroup() { return cGroup; }

		//statement
		public RuleCall getStatementParserRuleCall_0() { return cStatementParserRuleCall_0; }

		//(";" statement)*
		public Group getGroup_1() { return cGroup_1; }

		//";"
		public Keyword getSemicolonKeyword_1_0() { return cSemicolonKeyword_1_0; }

		//statement
		public RuleCall getStatementParserRuleCall_1_1() { return cStatementParserRuleCall_1_1; }
	}

	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "statement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cLabelParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cSimple_statementParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		////TODO
		//statement:
		//	(label ":")? simple_statement;
		public ParserRule getRule() { return rule; }

		//(label ":")? simple_statement
		public Group getGroup() { return cGroup; }

		//(label ":")?
		public Group getGroup_0() { return cGroup_0; }

		//label
		public RuleCall getLabelParserRuleCall_0_0() { return cLabelParserRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }

		//simple_statement
		public RuleCall getSimple_statementParserRuleCall_1() { return cSimple_statementParserRuleCall_1; }
	}

	public class LabelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "label");
		private final RuleCall cINTEGER_NUMBERTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//label:
		//	INTEGER_NUMBER;
		public ParserRule getRule() { return rule; }

		//INTEGER_NUMBER
		public RuleCall getINTEGER_NUMBERTerminalRuleCall() { return cINTEGER_NUMBERTerminalRuleCall; }
	}

	public class Simple_statementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "simple_statement");
		private final RuleCall cAssignment_statementParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		////TODO
		//simple_statement:
		//	assignment_statement?;
		public ParserRule getRule() { return rule; }

		//assignment_statement?
		public RuleCall getAssignment_statementParserRuleCall() { return cAssignment_statementParserRuleCall; }
	}

	public class Assignment_statementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "assignment_statement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cVariableParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cExpressionParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		////TODO
		//assignment_statement:
		//	variable ":=" expression;
		public ParserRule getRule() { return rule; }

		//variable ":=" expression
		public Group getGroup() { return cGroup; }

		//variable
		public RuleCall getVariableParserRuleCall_0() { return cVariableParserRuleCall_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_1() { return cColonEqualsSignKeyword_1; }

		//expression
		public RuleCall getExpressionParserRuleCall_2() { return cExpressionParserRuleCall_2; }
	}

	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "variable");
		private final RuleCall cEntire_variableParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		////TODO
		//variable:
		//	entire_variable;
		public ParserRule getRule() { return rule; }

		//entire_variable
		public RuleCall getEntire_variableParserRuleCall() { return cEntire_variableParserRuleCall; }
	}

	public class Entire_variableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "entire_variable");
		private final RuleCall cVariable_identifierParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		////TODO
		//entire_variable:
		//	variable_identifier;
		public ParserRule getRule() { return rule; }

		//variable_identifier
		public RuleCall getVariable_identifierParserRuleCall() { return cVariable_identifierParserRuleCall; }
	}

	public class Variable_identifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "variable_identifier");
		private final RuleCall cIDENTIFIERTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//variable_identifier:
		//	IDENTIFIER;
		public ParserRule getRule() { return rule; }

		//IDENTIFIER
		public RuleCall getIDENTIFIERTerminalRuleCall() { return cIDENTIFIERTerminalRuleCall; }
	}

	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSimple_expressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cRelation_operatorParserRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final RuleCall cSimple_expressionParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//expression:
		//	simple_expression (relation_operator simple_expression)?;
		public ParserRule getRule() { return rule; }

		//simple_expression (relation_operator simple_expression)?
		public Group getGroup() { return cGroup; }

		//simple_expression
		public RuleCall getSimple_expressionParserRuleCall_0() { return cSimple_expressionParserRuleCall_0; }

		//(relation_operator simple_expression)?
		public Group getGroup_1() { return cGroup_1; }

		//relation_operator
		public RuleCall getRelation_operatorParserRuleCall_1_0() { return cRelation_operatorParserRuleCall_1_0; }

		//simple_expression
		public RuleCall getSimple_expressionParserRuleCall_1_1() { return cSimple_expressionParserRuleCall_1_1; }
	}

	public class Relation_operatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "relation_operator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cLessThanSignGreaterThanSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cLessThanSignKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cLessThanSignEqualsSignKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cGreaterThanSignKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cGreaterThanSignEqualsSignKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cInKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		
		//relation_operator:
		//	"=" | "<>" | "<" | "<=" | ">" | ">=" | "in";
		public ParserRule getRule() { return rule; }

		//"=" | "<>" | "<" | "<=" | ">" | ">=" | "in"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"="
		public Keyword getEqualsSignKeyword_0() { return cEqualsSignKeyword_0; }

		//"<>"
		public Keyword getLessThanSignGreaterThanSignKeyword_1() { return cLessThanSignGreaterThanSignKeyword_1; }

		//"<"
		public Keyword getLessThanSignKeyword_2() { return cLessThanSignKeyword_2; }

		//"<="
		public Keyword getLessThanSignEqualsSignKeyword_3() { return cLessThanSignEqualsSignKeyword_3; }

		//">"
		public Keyword getGreaterThanSignKeyword_4() { return cGreaterThanSignKeyword_4; }

		//">="
		public Keyword getGreaterThanSignEqualsSignKeyword_5() { return cGreaterThanSignEqualsSignKeyword_5; }

		//"in"
		public Keyword getInKeyword_6() { return cInKeyword_6; }
	}

	public class Simple_expressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "simple_expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSIGNTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cTermParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cAddition_operatorParserRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final RuleCall cTermParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//simple_expression:
		//	SIGN? term (addition_operator term)*;
		public ParserRule getRule() { return rule; }

		//SIGN? term (addition_operator term)*
		public Group getGroup() { return cGroup; }

		//SIGN?
		public RuleCall getSIGNTerminalRuleCall_0() { return cSIGNTerminalRuleCall_0; }

		//term
		public RuleCall getTermParserRuleCall_1() { return cTermParserRuleCall_1; }

		//(addition_operator term)*
		public Group getGroup_2() { return cGroup_2; }

		//addition_operator
		public RuleCall getAddition_operatorParserRuleCall_2_0() { return cAddition_operatorParserRuleCall_2_0; }

		//term
		public RuleCall getTermParserRuleCall_2_1() { return cTermParserRuleCall_2_1; }
	}

	public class Addition_operatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "addition_operator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cPlusSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cOrKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//addition_operator:
		//	"+" | "-" | "or";
		public ParserRule getRule() { return rule; }

		//"+" | "-" | "or"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"+"
		public Keyword getPlusSignKeyword_0() { return cPlusSignKeyword_0; }

		//"-"
		public Keyword getHyphenMinusKeyword_1() { return cHyphenMinusKeyword_1; }

		//"or"
		public Keyword getOrKeyword_2() { return cOrKeyword_2; }
	}

	public class TermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "term");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFactorParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cMultiplication_operatorParserRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final RuleCall cFactorParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//term:
		//	factor (multiplication_operator factor)*;
		public ParserRule getRule() { return rule; }

		//factor (multiplication_operator factor)*
		public Group getGroup() { return cGroup; }

		//factor
		public RuleCall getFactorParserRuleCall_0() { return cFactorParserRuleCall_0; }

		//(multiplication_operator factor)*
		public Group getGroup_1() { return cGroup_1; }

		//multiplication_operator
		public RuleCall getMultiplication_operatorParserRuleCall_1_0() { return cMultiplication_operatorParserRuleCall_1_0; }

		//factor
		public RuleCall getFactorParserRuleCall_1_1() { return cFactorParserRuleCall_1_1; }
	}

	public class Multiplication_operatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "multiplication_operator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cAsteriskKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cSolidusKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cDivKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cModKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cAndKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//multiplication_operator:
		//	"*" | "/" | "div" | "mod" | "and";
		public ParserRule getRule() { return rule; }

		//"*" | "/" | "div" | "mod" | "and"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"*"
		public Keyword getAsteriskKeyword_0() { return cAsteriskKeyword_0; }

		//"/"
		public Keyword getSolidusKeyword_1() { return cSolidusKeyword_1; }

		//"div"
		public Keyword getDivKeyword_2() { return cDivKeyword_2; }

		//"mod"
		public Keyword getModKeyword_3() { return cModKeyword_3; }

		//"and"
		public Keyword getAndKeyword_4() { return cAndKeyword_4; }
	}

	public class FactorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "factor");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVariableParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNumberParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		////TODO
		//factor:
		//	variable | //| STRING | set | "nil" | constant_identifier | bound_identifier | function_designator | "(" expression ")" | "not" factor	
		//	number;
		public ParserRule getRule() { return rule; }

		//variable | //| STRING | set | "nil" | constant_identifier | bound_identifier | function_designator | "(" expression ")" | "not" factor	
		//number
		public Alternatives getAlternatives() { return cAlternatives; }

		//variable
		public RuleCall getVariableParserRuleCall_0() { return cVariableParserRuleCall_0; }

		////| STRING | set | "nil" | constant_identifier | bound_identifier | function_designator | "(" expression ")" | "not" factor	
		//number
		public RuleCall getNumberParserRuleCall_1() { return cNumberParserRuleCall_1; }
	}

	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "number");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINTEGER_NUMBERTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cREAL_NUMBERTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//number:
		//	INTEGER_NUMBER | REAL_NUMBER;
		public ParserRule getRule() { return rule; }

		//INTEGER_NUMBER | REAL_NUMBER
		public Alternatives getAlternatives() { return cAlternatives; }

		//INTEGER_NUMBER
		public RuleCall getINTEGER_NUMBERTerminalRuleCall_0() { return cINTEGER_NUMBERTerminalRuleCall_0; }

		//REAL_NUMBER
		public RuleCall getREAL_NUMBERTerminalRuleCall_1() { return cREAL_NUMBERTerminalRuleCall_1; }
	}

	public class Declaration_partElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "declaration_part");
		private final RuleCall cLabel_declaration_partParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		////TODO
		//declaration_part:
		//	label_declaration_part?;
		public ParserRule getRule() { return rule; }

		//label_declaration_part?
		public RuleCall getLabel_declaration_partParserRuleCall() { return cLabel_declaration_partParserRuleCall; }
	}

	public class Label_declaration_partElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "label_declaration_part");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLabelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cLabelParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cLabelParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//label_declaration_part:
		//	"label" label ("," label)* ";";
		public ParserRule getRule() { return rule; }

		//"label" label ("," label)* ";"
		public Group getGroup() { return cGroup; }

		//"label"
		public Keyword getLabelKeyword_0() { return cLabelKeyword_0; }

		//label
		public RuleCall getLabelParserRuleCall_1() { return cLabelParserRuleCall_1; }

		//("," label)*
		public Group getGroup_2() { return cGroup_2; }

		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }

		//label
		public RuleCall getLabelParserRuleCall_2_1() { return cLabelParserRuleCall_2_1; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	
	
	private final PascalElements pPascal;
	private final ProgramElements pProgram;
	private final Program_heading_blockElements pProgram_heading_block;
	private final Identifier_listElements pIdentifier_list;
	private final BlockElements pBlock;
	private final Statement_partElements pStatement_part;
	private final Statement_sequenceElements pStatement_sequence;
	private final StatementElements pStatement;
	private final LabelElements pLabel;
	private final Simple_statementElements pSimple_statement;
	private final Assignment_statementElements pAssignment_statement;
	private final VariableElements pVariable;
	private final Entire_variableElements pEntire_variable;
	private final Variable_identifierElements pVariable_identifier;
	private final ExpressionElements pExpression;
	private final Relation_operatorElements pRelation_operator;
	private final Simple_expressionElements pSimple_expression;
	private final Addition_operatorElements pAddition_operator;
	private final TermElements pTerm;
	private final Multiplication_operatorElements pMultiplication_operator;
	private final FactorElements pFactor;
	private final NumberElements pNumber;
	private final Declaration_partElements pDeclaration_part;
	private final Label_declaration_partElements pLabel_declaration_part;
	private final TerminalRule tINTEGER_NUMBER;
	private final TerminalRule tREAL_NUMBER;
	private final TerminalRule tIDENTIFIER;
	private final TerminalRule tSCALE_FACTOR;
	private final TerminalRule tDIGIT_SEQUENCE;
	private final TerminalRule tUNSIGNED_DIGIT_SEQUENCE;
	private final TerminalRule tDIGIT;
	private final TerminalRule tLETTER;
	private final TerminalRule tLETTER_EXTENDED;
	private final TerminalRule tSIGN;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PascalGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPascal = new PascalElements();
		this.pProgram = new ProgramElements();
		this.pProgram_heading_block = new Program_heading_blockElements();
		this.pIdentifier_list = new Identifier_listElements();
		this.pBlock = new BlockElements();
		this.pStatement_part = new Statement_partElements();
		this.pStatement_sequence = new Statement_sequenceElements();
		this.pStatement = new StatementElements();
		this.pLabel = new LabelElements();
		this.pSimple_statement = new Simple_statementElements();
		this.pAssignment_statement = new Assignment_statementElements();
		this.pVariable = new VariableElements();
		this.pEntire_variable = new Entire_variableElements();
		this.pVariable_identifier = new Variable_identifierElements();
		this.pExpression = new ExpressionElements();
		this.pRelation_operator = new Relation_operatorElements();
		this.pSimple_expression = new Simple_expressionElements();
		this.pAddition_operator = new Addition_operatorElements();
		this.pTerm = new TermElements();
		this.pMultiplication_operator = new Multiplication_operatorElements();
		this.pFactor = new FactorElements();
		this.pNumber = new NumberElements();
		this.pDeclaration_part = new Declaration_partElements();
		this.pLabel_declaration_part = new Label_declaration_partElements();
		this.tINTEGER_NUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INTEGER_NUMBER");
		this.tREAL_NUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "REAL_NUMBER");
		this.tIDENTIFIER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "IDENTIFIER");
		this.tSCALE_FACTOR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SCALE_FACTOR");
		this.tDIGIT_SEQUENCE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DIGIT_SEQUENCE");
		this.tUNSIGNED_DIGIT_SEQUENCE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "UNSIGNED_DIGIT_SEQUENCE");
		this.tDIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DIGIT");
		this.tLETTER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LETTER");
		this.tLETTER_EXTENDED = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LETTER_EXTENDED");
		this.tSIGN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SIGN");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.pascal.Pascal".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//pascal:
	//	program+=program;
	public PascalElements getPascalAccess() {
		return pPascal;
	}
	
	public ParserRule getPascalRule() {
		return getPascalAccess().getRule();
	}

	//program:
	//	program_heading_block block ".";
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}

	//program_heading_block:
	//	"program" IDENTIFIER ("(" identifier_list ")")? ";";
	public Program_heading_blockElements getProgram_heading_blockAccess() {
		return pProgram_heading_block;
	}
	
	public ParserRule getProgram_heading_blockRule() {
		return getProgram_heading_blockAccess().getRule();
	}

	//identifier_list:
	//	(IDENTIFIER ("," IDENTIFIER)*)?;
	public Identifier_listElements getIdentifier_listAccess() {
		return pIdentifier_list;
	}
	
	public ParserRule getIdentifier_listRule() {
		return getIdentifier_listAccess().getRule();
	}

	//block:
	//	declaration_part statement_part;
	public BlockElements getBlockAccess() {
		return pBlock;
	}
	
	public ParserRule getBlockRule() {
		return getBlockAccess().getRule();
	}

	//statement_part:
	//	"begin" statement_sequence "end";
	public Statement_partElements getStatement_partAccess() {
		return pStatement_part;
	}
	
	public ParserRule getStatement_partRule() {
		return getStatement_partAccess().getRule();
	}

	//statement_sequence:
	//	statement (";" statement)*;
	public Statement_sequenceElements getStatement_sequenceAccess() {
		return pStatement_sequence;
	}
	
	public ParserRule getStatement_sequenceRule() {
		return getStatement_sequenceAccess().getRule();
	}

	////TODO
	//statement:
	//	(label ":")? simple_statement;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}

	//label:
	//	INTEGER_NUMBER;
	public LabelElements getLabelAccess() {
		return pLabel;
	}
	
	public ParserRule getLabelRule() {
		return getLabelAccess().getRule();
	}

	////TODO
	//simple_statement:
	//	assignment_statement?;
	public Simple_statementElements getSimple_statementAccess() {
		return pSimple_statement;
	}
	
	public ParserRule getSimple_statementRule() {
		return getSimple_statementAccess().getRule();
	}

	////TODO
	//assignment_statement:
	//	variable ":=" expression;
	public Assignment_statementElements getAssignment_statementAccess() {
		return pAssignment_statement;
	}
	
	public ParserRule getAssignment_statementRule() {
		return getAssignment_statementAccess().getRule();
	}

	////TODO
	//variable:
	//	entire_variable;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}

	////TODO
	//entire_variable:
	//	variable_identifier;
	public Entire_variableElements getEntire_variableAccess() {
		return pEntire_variable;
	}
	
	public ParserRule getEntire_variableRule() {
		return getEntire_variableAccess().getRule();
	}

	//variable_identifier:
	//	IDENTIFIER;
	public Variable_identifierElements getVariable_identifierAccess() {
		return pVariable_identifier;
	}
	
	public ParserRule getVariable_identifierRule() {
		return getVariable_identifierAccess().getRule();
	}

	//expression:
	//	simple_expression (relation_operator simple_expression)?;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//relation_operator:
	//	"=" | "<>" | "<" | "<=" | ">" | ">=" | "in";
	public Relation_operatorElements getRelation_operatorAccess() {
		return pRelation_operator;
	}
	
	public ParserRule getRelation_operatorRule() {
		return getRelation_operatorAccess().getRule();
	}

	//simple_expression:
	//	SIGN? term (addition_operator term)*;
	public Simple_expressionElements getSimple_expressionAccess() {
		return pSimple_expression;
	}
	
	public ParserRule getSimple_expressionRule() {
		return getSimple_expressionAccess().getRule();
	}

	//addition_operator:
	//	"+" | "-" | "or";
	public Addition_operatorElements getAddition_operatorAccess() {
		return pAddition_operator;
	}
	
	public ParserRule getAddition_operatorRule() {
		return getAddition_operatorAccess().getRule();
	}

	//term:
	//	factor (multiplication_operator factor)*;
	public TermElements getTermAccess() {
		return pTerm;
	}
	
	public ParserRule getTermRule() {
		return getTermAccess().getRule();
	}

	//multiplication_operator:
	//	"*" | "/" | "div" | "mod" | "and";
	public Multiplication_operatorElements getMultiplication_operatorAccess() {
		return pMultiplication_operator;
	}
	
	public ParserRule getMultiplication_operatorRule() {
		return getMultiplication_operatorAccess().getRule();
	}

	////TODO
	//factor:
	//	variable | //| STRING | set | "nil" | constant_identifier | bound_identifier | function_designator | "(" expression ")" | "not" factor	
	//	number;
	public FactorElements getFactorAccess() {
		return pFactor;
	}
	
	public ParserRule getFactorRule() {
		return getFactorAccess().getRule();
	}

	//number:
	//	INTEGER_NUMBER | REAL_NUMBER;
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}

	////TODO
	//declaration_part:
	//	label_declaration_part?;
	public Declaration_partElements getDeclaration_partAccess() {
		return pDeclaration_part;
	}
	
	public ParserRule getDeclaration_partRule() {
		return getDeclaration_partAccess().getRule();
	}

	//label_declaration_part:
	//	"label" label ("," label)* ";";
	public Label_declaration_partElements getLabel_declaration_partAccess() {
		return pLabel_declaration_part;
	}
	
	public ParserRule getLabel_declaration_partRule() {
		return getLabel_declaration_partAccess().getRule();
	}

	//terminal INTEGER_NUMBER:
	//	DIGIT_SEQUENCE;
	public TerminalRule getINTEGER_NUMBERRule() {
		return tINTEGER_NUMBER;
	} 

	//terminal REAL_NUMBER:
	//	DIGIT_SEQUENCE "." UNSIGNED_DIGIT_SEQUENCE? SCALE_FACTOR? | DIGIT_SEQUENCE SCALE_FACTOR;
	public TerminalRule getREAL_NUMBERRule() {
		return tREAL_NUMBER;
	} 

	//terminal IDENTIFIER:
	//	LETTER_EXTENDED (LETTER_EXTENDED | DIGIT)*;
	public TerminalRule getIDENTIFIERRule() {
		return tIDENTIFIER;
	} 

	//terminal SCALE_FACTOR:
	//	("E" | "e") DIGIT_SEQUENCE;
	public TerminalRule getSCALE_FACTORRule() {
		return tSCALE_FACTOR;
	} 

	//terminal DIGIT_SEQUENCE:
	//	SIGN? UNSIGNED_DIGIT_SEQUENCE;
	public TerminalRule getDIGIT_SEQUENCERule() {
		return tDIGIT_SEQUENCE;
	} 

	//terminal UNSIGNED_DIGIT_SEQUENCE:
	//	DIGIT DIGIT*;
	public TerminalRule getUNSIGNED_DIGIT_SEQUENCERule() {
		return tUNSIGNED_DIGIT_SEQUENCE;
	} 

	//terminal DIGIT:
	//	"0".."9";
	public TerminalRule getDIGITRule() {
		return tDIGIT;
	} 

	//terminal LETTER:
	//	"A".."Z" | "a".."z";
	public TerminalRule getLETTERRule() {
		return tLETTER;
	} 

	//terminal LETTER_EXTENDED:
	//	LETTER | "_";
	public TerminalRule getLETTER_EXTENDEDRule() {
		return tLETTER_EXTENDED;
	} 

	//terminal SIGN:
	//	"+" | "-";
	public TerminalRule getSIGNRule() {
		return tSIGN;
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}