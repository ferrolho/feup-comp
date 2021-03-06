package grammar;

// Generated from JjQueryParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class JjQueryParser extends Parser {
	static {
		// RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int ALL_SELECTOR = 122, APOSTROPHE = 114, THROW = 46,
			STATIC = 40, INTERFACE = 30, AND_ASSIGN = 97, SEMICOLON = 115,
			BREAK = 6, BYTE = 7, ELSE = 17, ID = 112, IF = 24, ENUM = 18,
			SUB = 84, BANG = 71, LPAREN = 59, DOT = 67, JQEnd = 111, CASE = 8,
			AT = 105, LINE_COMMENT = 109, StringLiteral = 57, ELLIPSIS = 106,
			LBRACK = 63, JQBegin = 110, PUBLIC = 37, THROWS = 47,
			LAST_SELECTOR = 124, DOLLAR = 116, NullLiteral = 58,
			RSHIFT_ASSIGN = 102, LBRACE = 61, GOTO = 25,
			OPEN_PARENTHESIS = 118, SUB_ASSIGN = 94, SEMI = 65, CHAR = 10,
			CLOSE_BRACKET = 121, COLONCOLON = 92, ASSIGN = 68, COMMENT = 108,
			IMPORT = 27, ARROW = 91, BITOR = 88, CATCH = 9, MUL_ASSIGN = 95,
			DOUBLE = 16, PROTECTED = 36, LONG = 31, COMMA = 66, BITAND = 87,
			PRIVATE = 35, CONTINUE = 13, DIV = 86, FloatingPointLiteral = 54,
			LE = 76, QUOTES = 113, CharacterLiteral = 56, VOLATILE = 51,
			EXTENDS = 19, INSTANCEOF = 28, NEW = 33, ADD = 83, LT = 70,
			CLASS = 11, DO = 15, FINALLY = 21, Identifier = 104, CONST = 12,
			PACKAGE = 34, FIRST_SELECTOR = 123, OR_ASSIGN = 98, TRY = 49,
			IntegerLiteral = 53, SYNCHRONIZED = 44, CLOSE_PARENTHESIS = 119,
			MUL = 85, FOR = 23, FINAL = 20, RPAREN = 60, CARET = 89,
			URSHIFT_ASSIGN = 103, BOOLEAN = 5, NOTEQUAL = 78, RBRACK = 64,
			RBRACE = 62, AND = 79, THIS = 45, SWITCH = 43, VOID = 50,
			TRANSIENT = 48, INC = 81, FLOAT = 22, NATIVE = 32, DIV_ASSIGN = 96,
			BooleanLiteral = 55, ABSTRACT = 3, STRICTFP = 41, INT = 29,
			QUESTION = 73, RETURN = 38, SINGLE_LINE_COMMENT = 126,
			LSHIFT_ASSIGN = 101, COMMENTS_CHANNEL = 2, ADD_ASSIGN = 93,
			WS = 107, GE = 77, OP = 117, SUPER = 42, OR = 80, DEC = 82,
			MOD = 90, XOR_ASSIGN = 99, ASSERT = 4, EQUAL = 75,
			OPEN_BRACKET = 120, IMPLEMENTS = 26, COLON = 74, GT = 69,
			SHORT = 39, MOD_ASSIGN = 100, JQUERY_WS = 125, WHILE = 52,
			TILDE = 72, WHITESPACE_CHANNEL = 1, DEFAULT = 14;
	public static final String[] tokenNames = { "<INVALID>",
			"WHITESPACE_CHANNEL", "COMMENTS_CHANNEL", "'abstract'", "'assert'",
			"'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'",
			"'class'", "'const'", "'continue'", "'default'", "'do'",
			"'double'", "'else'", "'enum'", "'extends'", "'final'",
			"'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'",
			"'import'", "'instanceof'", "'int'", "'interface'", "'long'",
			"'native'", "'new'", "'package'", "'private'", "'protected'",
			"'public'", "'return'", "'short'", "'static'", "'strictfp'",
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'",
			"'throws'", "'transient'", "'try'", "'void'", "'volatile'",
			"'while'", "IntegerLiteral", "FloatingPointLiteral",
			"BooleanLiteral", "CharacterLiteral", "StringLiteral", "'null'",
			"LPAREN", "RPAREN", "'{'", "'}'", "LBRACK", "RBRACK", "SEMI",
			"','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'",
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'",
			"'+'", "'-'", "MUL", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'",
			"'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='",
			"'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'",
			"WS", "COMMENT", "LINE_COMMENT", "'/*@jQ'", "'*/'", "ID", "'\"'",
			"'''", "SEMICOLON", "'$'", "OP", "OPEN_PARENTHESIS",
			"CLOSE_PARENTHESIS", "OPEN_BRACKET", "CLOSE_BRACKET",
			"ALL_SELECTOR", "':first'", "':last'", "JQUERY_WS",
			"SINGLE_LINE_COMMENT" };
	public static final int RULE_literal = 0,
			RULE_type = 1,
			RULE_primitiveType = 2,
			RULE_numericType = 3,
			RULE_integralType = 4,
			RULE_floatingPointType = 5,
			RULE_referenceType = 6,
			RULE_classOrInterfaceType = 7,
			RULE_classType = 8,
			RULE_classType_lf_classOrInterfaceType = 9,
			RULE_classType_lfno_classOrInterfaceType = 10,
			RULE_interfaceType = 11,
			RULE_interfaceType_lf_classOrInterfaceType = 12,
			RULE_interfaceType_lfno_classOrInterfaceType = 13,
			RULE_typeVariable = 14,
			RULE_arrayType = 15,
			RULE_dims = 16,
			RULE_typeParameter = 17,
			RULE_typeParameterModifier = 18,
			RULE_typeBound = 19,
			RULE_additionalBound = 20,
			RULE_typeArguments = 21,
			RULE_typeArgumentList = 22,
			RULE_typeArgument = 23,
			RULE_wildcard = 24,
			RULE_wildcardBounds = 25,
			RULE_packageName = 26,
			RULE_typeName = 27,
			RULE_packageOrTypeName = 28,
			RULE_expressionName = 29,
			RULE_methodName = 30,
			RULE_ambiguousName = 31,
			RULE_compilationUnit = 32,
			RULE_packageDeclaration = 33,
			RULE_packageModifier = 34,
			RULE_importDeclaration = 35,
			RULE_singleTypeImportDeclaration = 36,
			RULE_typeImportOnDemandDeclaration = 37,
			RULE_singleStaticImportDeclaration = 38,
			RULE_staticImportOnDemandDeclaration = 39,
			RULE_typeDeclaration = 40,
			RULE_classDeclaration = 41,
			RULE_normalClassDeclaration = 42,
			RULE_classModifier = 43,
			RULE_typeParameters = 44,
			RULE_typeParameterList = 45,
			RULE_superclass = 46,
			RULE_superinterfaces = 47,
			RULE_interfaceTypeList = 48,
			RULE_classBody = 49,
			RULE_classBodyDeclaration = 50,
			RULE_classMemberDeclaration = 51,
			RULE_fieldDeclaration = 52,
			RULE_fieldModifier = 53,
			RULE_variableDeclaratorList = 54,
			RULE_variableDeclarator = 55,
			RULE_variableDeclaratorId = 56,
			RULE_variableInitializer = 57,
			RULE_unannType = 58,
			RULE_unannPrimitiveType = 59,
			RULE_unannReferenceType = 60,
			RULE_unannClassOrInterfaceType = 61,
			RULE_unannClassType = 62,
			RULE_unannClassType_lf_unannClassOrInterfaceType = 63,
			RULE_unannClassType_lfno_unannClassOrInterfaceType = 64,
			RULE_unannInterfaceType = 65,
			RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 66,
			RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 67,
			RULE_unannTypeVariable = 68,
			RULE_unannArrayType = 69,
			RULE_methodDeclaration = 70,
			RULE_methodModifier = 71,
			RULE_methodHeader = 72,
			RULE_result = 73,
			RULE_methodDeclarator = 74,
			RULE_formalParameterList = 75,
			RULE_formalParameters = 76,
			RULE_formalParameter = 77,
			RULE_variableModifier = 78,
			RULE_lastFormalParameter = 79,
			RULE_receiverParameter = 80,
			RULE_throws_ = 81,
			RULE_exceptionTypeList = 82,
			RULE_exceptionType = 83,
			RULE_methodBody = 84,
			RULE_instanceInitializer = 85,
			RULE_staticInitializer = 86,
			RULE_constructorDeclaration = 87,
			RULE_constructorModifier = 88,
			RULE_constructorDeclarator = 89,
			RULE_simpleTypeName = 90,
			RULE_constructorBody = 91,
			RULE_explicitConstructorInvocation = 92,
			RULE_enumDeclaration = 93,
			RULE_enumBody = 94,
			RULE_enumConstantList = 95,
			RULE_enumConstant = 96,
			RULE_enumConstantModifier = 97,
			RULE_enumBodyDeclarations = 98,
			RULE_interfaceDeclaration = 99,
			RULE_normalInterfaceDeclaration = 100,
			RULE_interfaceModifier = 101,
			RULE_extendsInterfaces = 102,
			RULE_interfaceBody = 103,
			RULE_interfaceMemberDeclaration = 104,
			RULE_constantDeclaration = 105,
			RULE_constantModifier = 106,
			RULE_interfaceMethodDeclaration = 107,
			RULE_interfaceMethodModifier = 108,
			RULE_annotationTypeDeclaration = 109,
			RULE_annotationTypeBody = 110,
			RULE_annotationTypeMemberDeclaration = 111,
			RULE_annotationTypeElementDeclaration = 112,
			RULE_annotationTypeElementModifier = 113,
			RULE_defaultValue = 114,
			RULE_annotation = 115,
			RULE_normalAnnotation = 116,
			RULE_elementValuePairList = 117,
			RULE_elementValuePair = 118,
			RULE_elementValue = 119,
			RULE_elementValueArrayInitializer = 120,
			RULE_elementValueList = 121,
			RULE_markerAnnotation = 122,
			RULE_singleElementAnnotation = 123,
			RULE_arrayInitializer = 124,
			RULE_variableInitializerList = 125,
			RULE_block = 126,
			RULE_blockStatements = 127,
			RULE_blockStatement = 128,
			RULE_localVariableDeclarationStatement = 129,
			RULE_localVariableDeclaration = 130,
			RULE_statement = 131,
			RULE_statementNoShortIf = 132,
			RULE_statementWithoutTrailingSubstatement = 133,
			RULE_emptyStatement = 134,
			RULE_labeledStatement = 135,
			RULE_labeledStatementNoShortIf = 136,
			RULE_expressionStatement = 137,
			RULE_statementExpression = 138,
			RULE_ifThenStatement = 139,
			RULE_ifThenElseStatement = 140,
			RULE_ifThenElseStatementNoShortIf = 141,
			RULE_assertStatement = 142,
			RULE_switchStatement = 143,
			RULE_switchBlock = 144,
			RULE_switchBlockStatementGroup = 145,
			RULE_switchLabels = 146,
			RULE_switchLabel = 147,
			RULE_enumConstantName = 148,
			RULE_whileStatement = 149,
			RULE_whileStatementNoShortIf = 150,
			RULE_doStatement = 151,
			RULE_forStatement = 152,
			RULE_forStatementNoShortIf = 153,
			RULE_basicForStatement = 154,
			RULE_basicForStatementNoShortIf = 155,
			RULE_forInit = 156,
			RULE_forUpdate = 157,
			RULE_statementExpressionList = 158,
			RULE_enhancedForStatement = 159,
			RULE_enhancedForStatementNoShortIf = 160,
			RULE_breakStatement = 161,
			RULE_continueStatement = 162,
			RULE_returnStatement = 163,
			RULE_throwStatement = 164,
			RULE_synchronizedStatement = 165,
			RULE_tryStatement = 166,
			RULE_catches = 167,
			RULE_catchClause = 168,
			RULE_catchFormalParameter = 169,
			RULE_catchType = 170,
			RULE_finally_ = 171,
			RULE_tryWithResourcesStatement = 172,
			RULE_resourceSpecification = 173,
			RULE_resourceList = 174,
			RULE_resource = 175,
			RULE_primary = 176,
			RULE_primaryNoNewArray = 177,
			RULE_primaryNoNewArray_lf_arrayAccess = 178,
			RULE_primaryNoNewArray_lfno_arrayAccess = 179,
			RULE_primaryNoNewArray_lf_primary = 180,
			RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 181,
			RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 182,
			RULE_primaryNoNewArray_lfno_primary = 183,
			RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 184,
			RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 185,
			RULE_classInstanceCreationExpression = 186,
			RULE_classInstanceCreationExpression_lf_primary = 187,
			RULE_classInstanceCreationExpression_lfno_primary = 188,
			RULE_typeArgumentsOrDiamond = 189, RULE_fieldAccess = 190,
			RULE_fieldAccess_lf_primary = 191,
			RULE_fieldAccess_lfno_primary = 192, RULE_arrayAccess = 193,
			RULE_arrayAccess_lf_primary = 194,
			RULE_arrayAccess_lfno_primary = 195, RULE_methodInvocation = 196,
			RULE_methodInvocation_lf_primary = 197,
			RULE_methodInvocation_lfno_primary = 198, RULE_argumentList = 199,
			RULE_methodReference = 200, RULE_methodReference_lf_primary = 201,
			RULE_methodReference_lfno_primary = 202,
			RULE_arrayCreationExpression = 203, RULE_dimExprs = 204,
			RULE_dimExpr = 205, RULE_constantExpression = 206,
			RULE_expression = 207, RULE_lambdaExpression = 208,
			RULE_lambdaParameters = 209,
			RULE_inferredFormalParameterList = 210, RULE_lambdaBody = 211,
			RULE_assignmentExpression = 212, RULE_assignment = 213,
			RULE_leftHandSide = 214, RULE_assignmentOperator = 215,
			RULE_conditionalExpression = 216,
			RULE_conditionalOrExpression = 217,
			RULE_conditionalAndExpression = 218,
			RULE_inclusiveOrExpression = 219, RULE_exclusiveOrExpression = 220,
			RULE_andExpression = 221, RULE_equalityExpression = 222,
			RULE_relationalExpression = 223, RULE_shiftExpression = 224,
			RULE_additiveExpression = 225, RULE_multiplicativeExpression = 226,
			RULE_unaryExpression = 227, RULE_preIncrementExpression = 228,
			RULE_preDecrementExpression = 229,
			RULE_unaryExpressionNotPlusMinus = 230,
			RULE_postfixExpression = 231, RULE_postIncrementExpression = 232,
			RULE_postIncrementExpression_lf_postfixExpression = 233,
			RULE_postDecrementExpression = 234,
			RULE_postDecrementExpression_lf_postfixExpression = 235,
			RULE_castExpression = 236, RULE_jQuery = 237, RULE_assign = 238,
			RULE_selector = 239, RULE_allSelector = 240,
			RULE_fieldSelector = 241, RULE_collectionAttributeSelector = 242,
			RULE_collectionMethodSelector = 243;
	public static final String[] ruleNames = { "literal", "type",
			"primitiveType", "numericType", "integralType",
			"floatingPointType", "referenceType", "classOrInterfaceType",
			"classType", "classType_lf_classOrInterfaceType",
			"classType_lfno_classOrInterfaceType", "interfaceType",
			"interfaceType_lf_classOrInterfaceType",
			"interfaceType_lfno_classOrInterfaceType", "typeVariable",
			"arrayType", "dims", "typeParameter", "typeParameterModifier",
			"typeBound", "additionalBound", "typeArguments",
			"typeArgumentList", "typeArgument", "wildcard", "wildcardBounds",
			"packageName", "typeName", "packageOrTypeName", "expressionName",
			"methodName", "ambiguousName", "compilationUnit",
			"packageDeclaration", "packageModifier", "importDeclaration",
			"singleTypeImportDeclaration", "typeImportOnDemandDeclaration",
			"singleStaticImportDeclaration", "staticImportOnDemandDeclaration",
			"typeDeclaration", "classDeclaration", "normalClassDeclaration",
			"classModifier", "typeParameters", "typeParameterList",
			"superclass", "superinterfaces", "interfaceTypeList", "classBody",
			"classBodyDeclaration", "classMemberDeclaration",
			"fieldDeclaration", "fieldModifier", "variableDeclaratorList",
			"variableDeclarator", "variableDeclaratorId",
			"variableInitializer", "unannType", "unannPrimitiveType",
			"unannReferenceType", "unannClassOrInterfaceType",
			"unannClassType", "unannClassType_lf_unannClassOrInterfaceType",
			"unannClassType_lfno_unannClassOrInterfaceType",
			"unannInterfaceType",
			"unannInterfaceType_lf_unannClassOrInterfaceType",
			"unannInterfaceType_lfno_unannClassOrInterfaceType",
			"unannTypeVariable", "unannArrayType", "methodDeclaration",
			"methodModifier", "methodHeader", "result", "methodDeclarator",
			"formalParameterList", "formalParameters", "formalParameter",
			"variableModifier", "lastFormalParameter", "receiverParameter",
			"throws_", "exceptionTypeList", "exceptionType", "methodBody",
			"instanceInitializer", "staticInitializer",
			"constructorDeclaration", "constructorModifier",
			"constructorDeclarator", "simpleTypeName", "constructorBody",
			"explicitConstructorInvocation", "enumDeclaration", "enumBody",
			"enumConstantList", "enumConstant", "enumConstantModifier",
			"enumBodyDeclarations", "interfaceDeclaration",
			"normalInterfaceDeclaration", "interfaceModifier",
			"extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration",
			"constantDeclaration", "constantModifier",
			"interfaceMethodDeclaration", "interfaceMethodModifier",
			"annotationTypeDeclaration", "annotationTypeBody",
			"annotationTypeMemberDeclaration",
			"annotationTypeElementDeclaration",
			"annotationTypeElementModifier", "defaultValue", "annotation",
			"normalAnnotation", "elementValuePairList", "elementValuePair",
			"elementValue", "elementValueArrayInitializer", "elementValueList",
			"markerAnnotation", "singleElementAnnotation", "arrayInitializer",
			"variableInitializerList", "block", "blockStatements",
			"blockStatement", "localVariableDeclarationStatement",
			"localVariableDeclaration", "statement", "statementNoShortIf",
			"statementWithoutTrailingSubstatement", "emptyStatement",
			"labeledStatement", "labeledStatementNoShortIf",
			"expressionStatement", "statementExpression", "ifThenStatement",
			"ifThenElseStatement", "ifThenElseStatementNoShortIf",
			"assertStatement", "switchStatement", "switchBlock",
			"switchBlockStatementGroup", "switchLabels", "switchLabel",
			"enumConstantName", "whileStatement", "whileStatementNoShortIf",
			"doStatement", "forStatement", "forStatementNoShortIf",
			"basicForStatement", "basicForStatementNoShortIf", "forInit",
			"forUpdate", "statementExpressionList", "enhancedForStatement",
			"enhancedForStatementNoShortIf", "breakStatement",
			"continueStatement", "returnStatement", "throwStatement",
			"synchronizedStatement", "tryStatement", "catches", "catchClause",
			"catchFormalParameter", "catchType", "finally_",
			"tryWithResourcesStatement", "resourceSpecification",
			"resourceList", "resource", "primary", "primaryNoNewArray",
			"primaryNoNewArray_lf_arrayAccess",
			"primaryNoNewArray_lfno_arrayAccess",
			"primaryNoNewArray_lf_primary",
			"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary",
			"primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary",
			"primaryNoNewArray_lfno_primary",
			"primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary",
			"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary",
			"classInstanceCreationExpression",
			"classInstanceCreationExpression_lf_primary",
			"classInstanceCreationExpression_lfno_primary",
			"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary",
			"fieldAccess_lfno_primary", "arrayAccess",
			"arrayAccess_lf_primary", "arrayAccess_lfno_primary",
			"methodInvocation", "methodInvocation_lf_primary",
			"methodInvocation_lfno_primary", "argumentList", "methodReference",
			"methodReference_lf_primary", "methodReference_lfno_primary",
			"arrayCreationExpression", "dimExprs", "dimExpr",
			"constantExpression", "expression", "lambdaExpression",
			"lambdaParameters", "inferredFormalParameterList", "lambdaBody",
			"assignmentExpression", "assignment", "leftHandSide",
			"assignmentOperator", "conditionalExpression",
			"conditionalOrExpression", "conditionalAndExpression",
			"inclusiveOrExpression", "exclusiveOrExpression", "andExpression",
			"equalityExpression", "relationalExpression", "shiftExpression",
			"additiveExpression", "multiplicativeExpression",
			"unaryExpression", "preIncrementExpression",
			"preDecrementExpression", "unaryExpressionNotPlusMinus",
			"postfixExpression", "postIncrementExpression",
			"postIncrementExpression_lf_postfixExpression",
			"postDecrementExpression",
			"postDecrementExpression_lf_postfixExpression", "castExpression",
			"jQuery", "assign", "selector", "allSelector", "fieldSelector",
			"collectionAttributeSelector", "collectionMethodSelector" };

	@Override
	public String getGrammarFileName() {
		return "JjQueryParser.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public JjQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() {
			return getToken(JjQueryParser.StringLiteral, 0);
		}

		public TerminalNode NullLiteral() {
			return getToken(JjQueryParser.NullLiteral, 0);
		}

		public TerminalNode IntegerLiteral() {
			return getToken(JjQueryParser.IntegerLiteral, 0);
		}

		public TerminalNode FloatingPointLiteral() {
			return getToken(JjQueryParser.FloatingPointLiteral, 0);
		}

		public TerminalNode BooleanLiteral() {
			return getToken(JjQueryParser.BooleanLiteral, 0);
		}

		public TerminalNode CharacterLiteral() {
			return getToken(JjQueryParser.CharacterLiteral, 0);
		}

		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_literal;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterLiteral(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(488);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral)
						| (1L << FloatingPointLiteral)
						| (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_type;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(492);
			switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(490);
					primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(491);
					referenceType();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode BOOLEAN() {
			return getToken(JjQueryParser.BOOLEAN, 0);
		}

		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class, 0);
		}

		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primitiveType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPrimitiveType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType()
			throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx,
				getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			setState(508);
			switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(494);
								annotation();
							}
						}
						setState(499);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(500);
					numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(501);
								annotation();
							}
						}
						setState(506);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(507);
					match(BOOLEAN);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class, 0);
		}

		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class, 0);
		}

		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_numericType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterNumericType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(512);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
					setState(510);
					integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
					setState(511);
					floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode SHORT() {
			return getToken(JjQueryParser.SHORT, 0);
		}

		public TerminalNode LONG() {
			return getToken(JjQueryParser.LONG, 0);
		}

		public TerminalNode BYTE() {
			return getToken(JjQueryParser.BYTE, 0);
		}

		public TerminalNode CHAR() {
			return getToken(JjQueryParser.CHAR, 0);
		}

		public TerminalNode INT() {
			return getToken(JjQueryParser.INT, 0);
		}

		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_integralType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterIntegralType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitIntegralType(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx,
				getState());
		enterRule(_localctx, 8, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(514);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE)
						| (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode DOUBLE() {
			return getToken(JjQueryParser.DOUBLE, 0);
		}

		public TerminalNode FLOAT() {
			return getToken(JjQueryParser.FLOAT, 0);
		}

		public FloatingPointTypeContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_floatingPointType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFloatingPointType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFloatingPointType(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType()
			throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx,
				getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(516);
				_la = _input.LA(1);
				if (!(_la == DOUBLE || _la == FLOAT)) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class, 0);
		}

		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class, 0);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
		}

		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_referenceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterReferenceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType()
			throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx,
				getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(521);
			switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(518);
					classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(519);
					typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(520);
					arrayType();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}

		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(
				int i) {
			return getRuleContext(
					ClassType_lf_classOrInterfaceTypeContext.class, i);
		}

		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(
					ClassType_lfno_classOrInterfaceTypeContext.class, 0);
		}

		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(
					InterfaceType_lfno_classOrInterfaceTypeContext.class, 0);
		}

		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}

		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(
				int i) {
			return getRuleContext(
					InterfaceType_lf_classOrInterfaceTypeContext.class, i);
		}

		public ClassOrInterfaceTypeContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType()
			throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(525);
				switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
				case 1: {
					setState(523);
					classType_lfno_classOrInterfaceType();
				}
					break;
				case 2: {
					setState(524);
					interfaceType_lfno_classOrInterfaceType();
				}
					break;
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							setState(529);
							switch (getInterpreter().adaptivePredict(_input, 7,
									_ctx)) {
							case 1: {
								setState(527);
								classType_lf_classOrInterfaceType();
							}
								break;
							case 2: {
								setState(528);
								interfaceType_lf_classOrInterfaceType();
							}
								break;
							}
						}
					}
					setState(533);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterClassType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(556);
			switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(534);
								annotation();
							}
						}
						setState(539);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(540);
					match(Identifier);
					setState(542);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(541);
							typeArguments();
						}
					}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(544);
					classOrInterfaceType();
					setState(545);
					match(DOT);
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(546);
								annotation();
							}
						}
						setState(551);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(552);
					match(Identifier);
					setState(554);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(553);
							typeArguments();
						}
					}

				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public ClassType_lf_classOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classType_lf_classOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassType_lf_classOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassType_lf_classOrInterfaceType(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType()
			throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(558);
				match(DOT);
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(559);
							annotation();
						}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(565);
				match(Identifier);
				setState(567);
				switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
				case 1: {
					setState(566);
					typeArguments();
				}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public ClassType_lfno_classOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classType_lfno_classOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassType_lfno_classOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassType_lfno_classOrInterfaceType(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType()
			throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(569);
							annotation();
						}
					}
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(575);
				match(Identifier);
				setState(577);
				switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
				case 1: {
					setState(576);
					typeArguments();
				}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class, 0);
		}

		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType()
			throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx,
				getState());
		enterRule(_localctx, 22, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(579);
				classType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends
			ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(
					ClassType_lf_classOrInterfaceTypeContext.class, 0);
		}

		public InterfaceType_lf_classOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceType_lf_classOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInterfaceType_lf_classOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInterfaceType_lf_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType()
			throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(581);
				classType_lf_classOrInterfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends
			ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(
					ClassType_lfno_classOrInterfaceTypeContext.class, 0);
		}

		public InterfaceType_lfno_classOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceType_lfno_classOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInterfaceType_lfno_classOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInterfaceType_lfno_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType()
			throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(583);
				classType_lfno_classOrInterfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeVariable;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeVariable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeVariable(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx,
				getState());
		enterRule(_localctx, 28, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(585);
							annotation();
						}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(591);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class, 0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class, 0);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
		}

		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterArrayType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			setState(602);
			switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(593);
					primitiveType();
					setState(594);
					dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(596);
					classOrInterfaceType();
					setState(597);
					dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(599);
					typeVariable();
					setState(600);
					dims();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_dims;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterDims(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(604);
							annotation();
						}
					}
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(610);
				match(LBRACK);
				setState(611);
				match(RBRACK);
				setState(622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(615);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == AT) {
									{
										{
											setState(612);
											annotation();
										}
									}
									setState(617);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(618);
								match(LBRACK);
								setState(619);
								match(RBRACK);
							}
						}
					}
					setState(624);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}

		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class, i);
		}

		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class, 0);
		}

		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter()
			throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx,
				getState());
		enterRule(_localctx, 34, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(625);
							typeParameterModifier();
						}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(631);
				match(Identifier);
				setState(633);
				_la = _input.LA(1);
				if (_la == EXTENDS) {
					{
						setState(632);
						typeBound();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TypeParameterModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeParameterModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterTypeParameterModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitTypeParameterModifier(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier()
			throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(
				_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(635);
				annotation();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class, 0);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
		}

		public TerminalNode EXTENDS() {
			return getToken(JjQueryParser.EXTENDS, 0);
		}

		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}

		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class, i);
		}

		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeBound;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeBound(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeBound);
		int _la;
		try {
			setState(647);
			switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(637);
					match(EXTENDS);
					setState(638);
					typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(639);
					match(EXTENDS);
					setState(640);
					classOrInterfaceType();
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == BITAND) {
						{
							{
								setState(641);
								additionalBound();
							}
						}
						setState(646);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class, 0);
		}

		public TerminalNode BITAND() {
			return getToken(JjQueryParser.BITAND, 0);
		}

		public AdditionalBoundContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_additionalBound;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAdditionalBound(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAdditionalBound(this);
		}
	}

	public final AdditionalBoundContext additionalBound()
			throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx,
				getState());
		enterRule(_localctx, 40, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(649);
				match(BITAND);
				setState(650);
				interfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class, 0);
		}

		public TerminalNode LT() {
			return getToken(JjQueryParser.LT, 0);
		}

		public TerminalNode GT() {
			return getToken(JjQueryParser.GT, 0);
		}

		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeArguments;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeArguments(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments()
			throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx,
				getState());
		enterRule(_localctx, 42, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(652);
				match(LT);
				setState(653);
				typeArgumentList();
				setState(654);
				match(GT);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public TypeArgumentListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeArgumentList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeArgumentList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeArgumentList(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList()
			throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx,
				getState());
		enterRule(_localctx, 44, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(656);
				typeArgument();
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(657);
							match(COMMA);
							setState(658);
							typeArgument();
						}
					}
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class, 0);
		}

		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeArgument;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeArgument(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx,
				getState());
		enterRule(_localctx, 46, RULE_typeArgument);
		try {
			setState(666);
			switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(664);
					referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(665);
					wildcard();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode QUESTION() {
			return getToken(JjQueryParser.QUESTION, 0);
		}

		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_wildcard;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterWildcard(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitWildcard(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(668);
							annotation();
						}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(674);
				match(QUESTION);
				setState(676);
				_la = _input.LA(1);
				if (_la == EXTENDS || _la == SUPER) {
					{
						setState(675);
						wildcardBounds();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public TerminalNode EXTENDS() {
			return getToken(JjQueryParser.EXTENDS, 0);
		}

		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_wildcardBounds;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterWildcardBounds(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitWildcardBounds(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds()
			throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx,
				getState());
		enterRule(_localctx, 50, RULE_wildcardBounds);
		try {
			setState(682);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
					setState(678);
					match(EXTENDS);
					setState(679);
					referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
					setState(680);
					match(SUPER);
					setState(681);
					referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class, 0);
		}

		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_packageName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPackageName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx,
				_parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(685);
					match(Identifier);
				}
				_ctx.stop = _input.LT(-1);
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new PackageNameContext(_parentctx,
										_parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_packageName);
								setState(687);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(688);
								match(DOT);
								setState(689);
								match(Identifier);
							}
						}
					}
					setState(694);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class, 0);
		}

		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(700);
			switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(695);
					match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(696);
					packageOrTypeName(0);
					setState(697);
					match(DOT);
					setState(698);
					match(Identifier);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class, 0);
		}

		public PackageOrTypeNameContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_packageOrTypeName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPackageOrTypeName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName()
			throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx,
				_parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(703);
					match(Identifier);
				}
				_ctx.stop = _input.LT(-1);
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 34, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new PackageOrTypeNameContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_packageOrTypeName);
								setState(705);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(706);
								match(DOT);
								setState(707);
								match(Identifier);
							}
						}
					}
					setState(712);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 34, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class, 0);
		}

		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expressionName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterExpressionName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitExpressionName(this);
		}
	}

	public final ExpressionNameContext expressionName()
			throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx,
				getState());
		enterRule(_localctx, 58, RULE_expressionName);
		try {
			setState(718);
			switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(713);
					match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(714);
					ambiguousName(0);
					setState(715);
					match(DOT);
					setState(716);
					match(Identifier);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(720);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class, 0);
		}

		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ambiguousName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAmbiguousName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAmbiguousName(this);
		}
	}

	public final AmbiguousNameContext ambiguousName()
			throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx,
				_parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(723);
					match(Identifier);
				}
				_ctx.stop = _input.LT(-1);
				setState(730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 36, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new AmbiguousNameContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_ambiguousName);
								setState(725);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(726);
								match(DOT);
								setState(727);
								match(Identifier);
							}
						}
					}
					setState(732);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 36, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class, i);
		}

		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class, i);
		}

		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}

		public TerminalNode EOF() {
			return getToken(JjQueryParser.EOF, 0);
		}

		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class, 0);
		}

		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}

		public CompilationUnitContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compilationUnit;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterCompilationUnit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit()
			throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx,
				getState());
		enterRule(_localctx, 64, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(734);
				switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
				case 1: {
					setState(733);
					packageDeclaration();
				}
					break;
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == IMPORT) {
					{
						{
							setState(736);
							importDeclaration();
						}
					}
					setState(741);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << CLASS)
						| (1L << ENUM)
						| (1L << FINAL)
						| (1L << INTERFACE)
						| (1L << PRIVATE)
						| (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)
						|| _la == SEMI || _la == AT) {
					{
						{
							setState(742);
							typeDeclaration();
						}
					}
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(748);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() {
			return getTokens(JjQueryParser.Identifier);
		}

		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier(int i) {
			return getToken(JjQueryParser.Identifier, i);
		}

		public TerminalNode PACKAGE() {
			return getToken(JjQueryParser.PACKAGE, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}

		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class, i);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public PackageDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_packageDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPackageDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration()
			throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 66, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(750);
							packageModifier();
						}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(756);
				match(PACKAGE);
				setState(757);
				match(Identifier);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == DOT) {
					{
						{
							setState(758);
							match(DOT);
							setState(759);
							match(Identifier);
						}
					}
					setState(764);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(765);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public PackageModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_packageModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPackageModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPackageModifier(this);
		}
	}

	public final PackageModifierContext packageModifier()
			throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx,
				getState());
		enterRule(_localctx, 68, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(767);
				annotation();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class, 0);
		}

		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,
					0);
		}

		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class, 0);
		}

		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class, 0);
		}

		public ImportDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_importDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterImportDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration()
			throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx,
				getState());
		enterRule(_localctx, 70, RULE_importDeclaration);
		try {
			setState(773);
			switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(769);
					singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(770);
					typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(771);
					singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(772);
					staticImportOnDemandDeclaration();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends
			ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode IMPORT() {
			return getToken(JjQueryParser.IMPORT, 0);
		}

		public SingleTypeImportDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_singleTypeImportDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterSingleTypeImportDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitSingleTypeImportDeclaration(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration()
			throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 72, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(775);
				match(IMPORT);
				setState(776);
				typeName();
				setState(777);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends
			ParserRuleContext {
		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class, 0);
		}

		public TerminalNode IMPORT() {
			return getToken(JjQueryParser.IMPORT, 0);
		}

		public TerminalNode MUL() {
			return getToken(JjQueryParser.MUL, 0);
		}

		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeImportOnDemandDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterTypeImportOnDemandDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitTypeImportOnDemandDeclaration(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration()
			throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 74, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(779);
				match(IMPORT);
				setState(780);
				packageOrTypeName(0);
				setState(781);
				match(DOT);
				setState(782);
				match(MUL);
				setState(783);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends
			ParserRuleContext {
		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode IMPORT() {
			return getToken(JjQueryParser.IMPORT, 0);
		}

		public SingleStaticImportDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_singleStaticImportDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterSingleStaticImportDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitSingleStaticImportDeclaration(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration()
			throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 76, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(785);
				match(IMPORT);
				setState(786);
				match(STATIC);
				setState(787);
				typeName();
				setState(788);
				match(DOT);
				setState(789);
				match(Identifier);
				setState(790);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends
			ParserRuleContext {
		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode IMPORT() {
			return getToken(JjQueryParser.IMPORT, 0);
		}

		public TerminalNode MUL() {
			return getToken(JjQueryParser.MUL, 0);
		}

		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_staticImportOnDemandDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterStaticImportOnDemandDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitStaticImportOnDemandDeclaration(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration()
			throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 78, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(792);
				match(IMPORT);
				setState(793);
				match(STATIC);
				setState(794);
				typeName();
				setState(795);
				match(DOT);
				setState(796);
				match(MUL);
				setState(797);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class, 0);
		}

		public TypeDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration()
			throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx,
				getState());
		enterRule(_localctx, 80, RULE_typeDeclaration);
		try {
			setState(802);
			switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(799);
					classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(800);
					interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(801);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class, 0);
		}

		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class, 0);
		}

		public ClassDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterClassDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration()
			throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx,
				getState());
		enterRule(_localctx, 82, RULE_classDeclaration);
		try {
			setState(806);
			switch (getInterpreter().adaptivePredict(_input, 44, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(804);
					normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(805);
					enumDeclaration();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class, 0);
		}

		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public TerminalNode CLASS() {
			return getToken(JjQueryParser.CLASS, 0);
		}

		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class, i);
		}

		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class, 0);
		}

		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class, 0);
		}

		public NormalClassDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_normalClassDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterNormalClassDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration()
			throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 84, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << FINAL)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)
						|| _la == AT) {
					{
						{
							setState(808);
							classModifier();
						}
					}
					setState(813);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(814);
				match(CLASS);
				setState(815);
				match(Identifier);
				setState(817);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(816);
						typeParameters();
					}
				}

				setState(820);
				_la = _input.LA(1);
				if (_la == EXTENDS) {
					{
						setState(819);
						superclass();
					}
				}

				setState(823);
				_la = _input.LA(1);
				if (_la == IMPLEMENTS) {
					{
						setState(822);
						superinterfaces();
					}
				}

				setState(825);
				classBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() {
			return getToken(JjQueryParser.ABSTRACT, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode FINAL() {
			return getToken(JjQueryParser.FINAL, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TerminalNode STRICTFP() {
			return getToken(JjQueryParser.STRICTFP, 0);
		}

		public TerminalNode PROTECTED() {
			return getToken(JjQueryParser.PROTECTED, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public TerminalNode PRIVATE() {
			return getToken(JjQueryParser.PRIVATE, 0);
		}

		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterClassModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier()
			throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx,
				getState());
		enterRule(_localctx, 86, RULE_classModifier);
		try {
			setState(835);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(827);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(828);
					match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
					setState(829);
					match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
					setState(830);
					match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
					setState(831);
					match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
					setState(832);
					match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
					setState(833);
					match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
					setState(834);
					match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class, 0);
		}

		public TerminalNode LT() {
			return getToken(JjQueryParser.LT, 0);
		}

		public TerminalNode GT() {
			return getToken(JjQueryParser.GT, 0);
		}

		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeParameters;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters()
			throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx,
				getState());
		enterRule(_localctx, 88, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(837);
				match(LT);
				setState(838);
				typeParameterList();
				setState(839);
				match(GT);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}

		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public TypeParameterListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeParameterList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeParameterList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeParameterList(this);
		}
	}

	public final TypeParameterListContext typeParameterList()
			throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx,
				getState());
		enterRule(_localctx, 90, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(841);
				typeParameter();
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(842);
							match(COMMA);
							setState(843);
							typeParameter();
						}
					}
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode EXTENDS() {
			return getToken(JjQueryParser.EXTENDS, 0);
		}

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class, 0);
		}

		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_superclass;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSuperclass(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSuperclass(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(849);
				match(EXTENDS);
				setState(850);
				classType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class, 0);
		}

		public TerminalNode IMPLEMENTS() {
			return getToken(JjQueryParser.IMPLEMENTS, 0);
		}

		public SuperinterfacesContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_superinterfaces;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSuperinterfaces(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSuperinterfaces(this);
		}
	}

	public final SuperinterfacesContext superinterfaces()
			throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx,
				getState());
		enterRule(_localctx, 94, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(852);
				match(IMPLEMENTS);
				setState(853);
				interfaceTypeList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}

		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public InterfaceTypeListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceTypeList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterInterfaceTypeList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitInterfaceTypeList(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList()
			throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx,
				getState());
		enterRule(_localctx, 96, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(855);
				interfaceType();
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(856);
							match(COMMA);
							setState(857);
							interfaceType();
						}
					}
					setState(862);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}

		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class, i);
		}

		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterClassBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(863);
				match(LBRACE);
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << BOOLEAN)
						| (1L << BYTE)
						| (1L << CHAR)
						| (1L << CLASS)
						| (1L << DOUBLE)
						| (1L << ENUM)
						| (1L << FINAL)
						| (1L << FLOAT)
						| (1L << INT)
						| (1L << INTERFACE)
						| (1L << LONG)
						| (1L << NATIVE)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << SHORT)
						| (1L << STATIC)
						| (1L << STRICTFP)
						| (1L << SYNCHRONIZED)
						| (1L << TRANSIENT)
						| (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (LT - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
					{
						{
							setState(864);
							classBodyDeclaration();
						}
					}
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(870);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class, 0);
		}

		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class, 0);
		}

		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class, 0);
		}

		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class, 0);
		}

		public ClassBodyDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classBodyDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassBodyDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration()
			throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 100, RULE_classBodyDeclaration);
		try {
			setState(876);
			switch (getInterpreter().adaptivePredict(_input, 53, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(872);
					classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(873);
					instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(874);
					staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(875);
					constructorDeclaration();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class, 0);
		}

		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class, 0);
		}

		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class, 0);
		}

		public ClassMemberDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classMemberDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassMemberDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration()
			throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 102, RULE_classMemberDeclaration);
		try {
			setState(883);
			switch (getInterpreter().adaptivePredict(_input, 54, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(878);
					fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(879);
					methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(880);
					classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(881);
					interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(882);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class, 0);
		}

		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class, i);
		}

		public FieldDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFieldDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration()
			throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx,
				getState());
		enterRule(_localctx, 104, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL)
						| (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC)
						| (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)
						|| _la == AT) {
					{
						{
							setState(885);
							fieldModifier();
						}
					}
					setState(890);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(891);
				unannType();
				setState(892);
				variableDeclaratorList();
				setState(893);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode FINAL() {
			return getToken(JjQueryParser.FINAL, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TerminalNode TRANSIENT() {
			return getToken(JjQueryParser.TRANSIENT, 0);
		}

		public TerminalNode PROTECTED() {
			return getToken(JjQueryParser.PROTECTED, 0);
		}

		public TerminalNode VOLATILE() {
			return getToken(JjQueryParser.VOLATILE, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public TerminalNode PRIVATE() {
			return getToken(JjQueryParser.PRIVATE, 0);
		}

		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFieldModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier()
			throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx,
				getState());
		enterRule(_localctx, 106, RULE_fieldModifier);
		try {
			setState(903);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(895);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(896);
					match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
					setState(897);
					match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
					setState(898);
					match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
					setState(899);
					match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
					setState(900);
					match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
					setState(901);
					match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
					setState(902);
					match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public VariableDeclaratorListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclaratorList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterVariableDeclaratorList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitVariableDeclaratorList(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList()
			throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(
				_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(905);
				variableDeclarator();
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(906);
							match(COMMA);
							setState(907);
							variableDeclarator();
						}
					}
					setState(912);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() {
			return getToken(JjQueryParser.ASSIGN, 0);
		}

		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class, 0);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public VariableDeclaratorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclarator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterVariableDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator()
			throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(
				_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(913);
				variableDeclaratorId();
				setState(916);
				_la = _input.LA(1);
				if (_la == ASSIGN) {
					{
						setState(914);
						match(ASSIGN);
						setState(915);
						variableInitializer();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class, 0);
		}

		public VariableDeclaratorIdContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclaratorId;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterVariableDeclaratorId(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId()
			throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(
				_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(918);
				match(Identifier);
				setState(920);
				_la = _input.LA(1);
				if (_la == LBRACK || _la == AT) {
					{
						setState(919);
						dims();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public VariableInitializerContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterVariableInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer()
			throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(
				_ctx, getState());
		enterRule(_localctx, 114, RULE_variableInitializer);
		try {
			setState(924);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(922);
					expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
					setState(923);
					arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class, 0);
		}

		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class, 0);
		}

		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterUnannType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannType(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannType);
		try {
			setState(928);
			switch (getInterpreter().adaptivePredict(_input, 61, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(926);
					unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(927);
					unannReferenceType();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() {
			return getToken(JjQueryParser.BOOLEAN, 0);
		}

		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class, 0);
		}

		public UnannPrimitiveTypeContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannPrimitiveType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannPrimitiveType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannPrimitiveType(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType()
			throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(
				_ctx, getState());
		enterRule(_localctx, 118, RULE_unannPrimitiveType);
		try {
			setState(932);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
					setState(930);
					numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
					setState(931);
					match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class, 0);
		}

		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class, 0);
		}

		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class, 0);
		}

		public UnannReferenceTypeContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannReferenceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannReferenceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannReferenceType(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType()
			throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 120, RULE_unannReferenceType);
		try {
			setState(937);
			switch (getInterpreter().adaptivePredict(_input, 63, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(934);
					unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(935);
					unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(936);
					unannArrayType();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends
			ParserRuleContext {
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(
					UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,
					0);
		}

		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(
				int i) {
			return getRuleContext(
					UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,
					i);
		}

		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(
					UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,
					0);
		}

		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(
				int i) {
			return getRuleContext(
					UnannClassType_lf_unannClassOrInterfaceTypeContext.class, i);
		}

		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}

		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}

		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannClassOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitUnannClassOrInterfaceType(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType()
			throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 122, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(941);
				switch (getInterpreter().adaptivePredict(_input, 64, _ctx)) {
				case 1: {
					setState(939);
					unannClassType_lfno_unannClassOrInterfaceType();
				}
					break;
				case 2: {
					setState(940);
					unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
					break;
				}
				setState(947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 66, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							setState(945);
							switch (getInterpreter().adaptivePredict(_input,
									65, _ctx)) {
							case 1: {
								setState(943);
								unannClassType_lf_unannClassOrInterfaceType();
							}
								break;
							case 2: {
								setState(944);
								unannInterfaceType_lf_unannClassOrInterfaceType();
							}
								break;
							}
						}
					}
					setState(949);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 66, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class, 0);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannClassType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterUnannClassType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannClassType(this);
		}
	}

	public final UnannClassTypeContext unannClassType()
			throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx,
				getState());
		enterRule(_localctx, 124, RULE_unannClassType);
		int _la;
		try {
			setState(966);
			switch (getInterpreter().adaptivePredict(_input, 70, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(950);
					match(Identifier);
					setState(952);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(951);
							typeArguments();
						}
					}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(954);
					unannClassOrInterfaceType();
					setState(955);
					match(DOT);
					setState(959);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(956);
								annotation();
							}
						}
						setState(961);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(962);
					match(Identifier);
					setState(964);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(963);
							typeArguments();
						}
					}

				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext
			extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public UnannClassType_lf_unannClassOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannClassType_lf_unannClassOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType()
			throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 126,
				RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(968);
				match(DOT);
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(969);
							annotation();
						}
					}
					setState(974);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(975);
				match(Identifier);
				setState(977);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(976);
						typeArguments();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext
			extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannClassType_lfno_unannClassOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType()
			throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 128,
				RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(979);
				match(Identifier);
				setState(981);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(980);
						typeArguments();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class, 0);
		}

		public UnannInterfaceTypeContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannInterfaceType(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType()
			throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 130, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(983);
				unannClassType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext
			extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(
					UnannClassType_lf_unannClassOrInterfaceTypeContext.class, 0);
		}

		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannInterfaceType_lf_unannClassOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType()
			throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 132,
				RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(985);
				unannClassType_lf_unannClassOrInterfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext
			extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(
					UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,
					0);
		}

		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType()
			throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 134,
				RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(987);
				unannClassType_lfno_unannClassOrInterfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public UnannTypeVariableContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannTypeVariable;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterUnannTypeVariable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannTypeVariable(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable()
			throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx,
				getState());
		enterRule(_localctx, 136, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(989);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class, 0);
		}

		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class, 0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class, 0);
		}

		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class, 0);
		}

		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannArrayType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterUnannArrayType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannArrayType(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType()
			throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx,
				getState());
		enterRule(_localctx, 138, RULE_unannArrayType);
		try {
			setState(1000);
			switch (getInterpreter().adaptivePredict(_input, 74, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(991);
					unannPrimitiveType();
					setState(992);
					dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(994);
					unannClassOrInterfaceType();
					setState(995);
					dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(997);
					unannTypeVariable();
					setState(998);
					dims();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class, 0);
		}

		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class, 0);
		}

		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}

		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class, i);
		}

		public MethodDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration()
			throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx,
				getState());
		enterRule(_localctx, 140, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << FINAL)
						| (1L << NATIVE)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << STATIC)
						| (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0)
						|| _la == AT) {
					{
						{
							setState(1002);
							methodModifier();
						}
					}
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1008);
				methodHeader();
				setState(1009);
				methodBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public TerminalNode NATIVE() {
			return getToken(JjQueryParser.NATIVE, 0);
		}

		public TerminalNode ABSTRACT() {
			return getToken(JjQueryParser.ABSTRACT, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode FINAL() {
			return getToken(JjQueryParser.FINAL, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TerminalNode STRICTFP() {
			return getToken(JjQueryParser.STRICTFP, 0);
		}

		public TerminalNode PROTECTED() {
			return getToken(JjQueryParser.PROTECTED, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public TerminalNode SYNCHRONIZED() {
			return getToken(JjQueryParser.SYNCHRONIZED, 0);
		}

		public TerminalNode PRIVATE() {
			return getToken(JjQueryParser.PRIVATE, 0);
		}

		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodModifier(this);
		}
	}

	public final MethodModifierContext methodModifier()
			throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx,
				getState());
		enterRule(_localctx, 142, RULE_methodModifier);
		try {
			setState(1021);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1011);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(1012);
					match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
					setState(1013);
					match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
					setState(1014);
					match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
					setState(1015);
					match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
					setState(1016);
					match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
					setState(1017);
					match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
					setState(1018);
					match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
					setState(1019);
					match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
					setState(1020);
					match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public ResultContext result() {
			return getRuleContext(ResultContext.class, 0);
		}

		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class, 0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodHeader;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodHeader(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx,
				getState());
		enterRule(_localctx, 144, RULE_methodHeader);
		int _la;
		try {
			setState(1040);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
					setState(1023);
					result();
					setState(1024);
					methodDeclarator();
					setState(1026);
					_la = _input.LA(1);
					if (_la == THROWS) {
						{
							setState(1025);
							throws_();
						}
					}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
					setState(1028);
					typeParameters();
					setState(1032);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(1029);
								annotation();
							}
						}
						setState(1034);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1035);
					result();
					setState(1036);
					methodDeclarator();
					setState(1038);
					_la = _input.LA(1);
					if (_la == THROWS) {
						{
							setState(1037);
							throws_();
						}
					}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public TerminalNode VOID() {
			return getToken(JjQueryParser.VOID, 0);
		}

		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_result;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterResult(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_result);
		try {
			setState(1044);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
					setState(1042);
					unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
					setState(1043);
					match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public MethodDeclaratorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodDeclarator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator()
			throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx,
				getState());
		enterRule(_localctx, 148, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1046);
				match(Identifier);
				setState(1047);
				match(LPAREN);
				setState(1049);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FINAL) | (1L << FLOAT) | (1L << INT)
						| (1L << LONG) | (1L << SHORT))) != 0)
						|| _la == Identifier || _la == AT) {
					{
						setState(1048);
						formalParameterList();
					}
				}

				setState(1051);
				match(RPAREN);
				setState(1053);
				_la = _input.LA(1);
				if (_la == LBRACK || _la == AT) {
					{
						setState(1052);
						dims();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class, 0);
		}

		public TerminalNode COMMA() {
			return getToken(JjQueryParser.COMMA, 0);
		}

		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class, 0);
		}

		public FormalParameterListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_formalParameterList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterFormalParameterList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList()
			throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(
				_ctx, getState());
		enterRule(_localctx, 150, RULE_formalParameterList);
		try {
			setState(1060);
			switch (getInterpreter().adaptivePredict(_input, 84, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1055);
					formalParameters();
					setState(1056);
					match(COMMA);
					setState(1057);
					lastFormalParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1059);
					lastFormalParameter();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class, 0);
		}

		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public FormalParametersContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_formalParameters;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFormalParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters()
			throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx,
				getState());
		enterRule(_localctx, 152, RULE_formalParameters);
		try {
			int _alt;
			setState(1078);
			switch (getInterpreter().adaptivePredict(_input, 87, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1062);
					formalParameter();
					setState(1067);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 85, _ctx);
					while (_alt != 2
							&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(1063);
									match(COMMA);
									setState(1064);
									formalParameter();
								}
							}
						}
						setState(1069);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 85,
								_ctx);
					}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1070);
					receiverParameter();
					setState(1075);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 86, _ctx);
					while (_alt != 2
							&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(1071);
									match(COMMA);
									setState(1072);
									formalParameter();
								}
							}
						}
						setState(1077);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 86,
								_ctx);
					}
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public FormalParameterContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_formalParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFormalParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter()
			throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx,
				getState());
		enterRule(_localctx, 154, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FINAL || _la == AT) {
					{
						{
							setState(1080);
							variableModifier();
						}
					}
					setState(1085);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1086);
				unannType();
				setState(1087);
				variableDeclaratorId();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode FINAL() {
			return getToken(JjQueryParser.FINAL, 0);
		}

		public VariableModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterVariableModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier()
			throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx,
				getState());
		enterRule(_localctx, 156, RULE_variableModifier);
		try {
			setState(1091);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1089);
					annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
					setState(1090);
					match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class, 0);
		}

		public TerminalNode ELLIPSIS() {
			return getToken(JjQueryParser.ELLIPSIS, 0);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public LastFormalParameterContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_lastFormalParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterLastFormalParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter()
			throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(
				_ctx, getState());
		enterRule(_localctx, 158, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1110);
			switch (getInterpreter().adaptivePredict(_input, 92, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1096);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == FINAL || _la == AT) {
						{
							{
								setState(1093);
								variableModifier();
							}
						}
						setState(1098);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1099);
					unannType();
					setState(1103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(1100);
								annotation();
							}
						}
						setState(1105);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1106);
					match(ELLIPSIS);
					setState(1107);
					variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1109);
					formalParameter();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode THIS() {
			return getToken(JjQueryParser.THIS, 0);
		}

		public ReceiverParameterContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_receiverParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterReceiverParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter()
			throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx,
				getState());
		enterRule(_localctx, 160, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(1112);
							annotation();
						}
					}
					setState(1117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1118);
				unannType();
				setState(1121);
				_la = _input.LA(1);
				if (_la == Identifier) {
					{
						setState(1119);
						match(Identifier);
						setState(1120);
						match(DOT);
					}
				}

				setState(1123);
				match(THIS);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public TerminalNode THROWS() {
			return getToken(JjQueryParser.THROWS, 0);
		}

		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class, 0);
		}

		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_throws_;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterThrows_(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitThrows_(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1125);
				match(THROWS);
				setState(1126);
				exceptionTypeList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public ExceptionTypeListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_exceptionTypeList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterExceptionTypeList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitExceptionTypeList(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList()
			throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx,
				getState());
		enterRule(_localctx, 164, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1128);
				exceptionType();
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(1129);
							match(COMMA);
							setState(1130);
							exceptionType();
						}
					}
					setState(1135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class, 0);
		}

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class, 0);
		}

		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_exceptionType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterExceptionType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitExceptionType(this);
		}
	}

	public final ExceptionTypeContext exceptionType()
			throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx,
				getState());
		enterRule(_localctx, 166, RULE_exceptionType);
		try {
			setState(1138);
			switch (getInterpreter().adaptivePredict(_input, 96, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1136);
					classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1137);
					typeVariable();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodBody);
		try {
			setState(1142);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
					setState(1140);
					block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
					setState(1141);
					match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public InstanceInitializerContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_instanceInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInstanceInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInstanceInitializer(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer()
			throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(
				_ctx, getState());
		enterRule(_localctx, 170, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1144);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public StaticInitializerContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_staticInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterStaticInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitStaticInitializer(this);
		}
	}

	public final StaticInitializerContext staticInitializer()
			throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx,
				getState());
		enterRule(_localctx, 172, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1146);
				match(STATIC);
				setState(1147);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class, 0);
		}

		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class, 0);
		}

		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class, 0);
		}

		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}

		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class, i);
		}

		public ConstructorDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constructorDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConstructorDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration()
			throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 174, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE)
						| (1L << PROTECTED) | (1L << PUBLIC))) != 0)
						|| _la == AT) {
					{
						{
							setState(1149);
							constructorModifier();
						}
					}
					setState(1154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1155);
				constructorDeclarator();
				setState(1157);
				_la = _input.LA(1);
				if (_la == THROWS) {
					{
						setState(1156);
						throws_();
					}
				}

				setState(1159);
				constructorBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode PROTECTED() {
			return getToken(JjQueryParser.PROTECTED, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public TerminalNode PRIVATE() {
			return getToken(JjQueryParser.PRIVATE, 0);
		}

		public ConstructorModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constructorModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConstructorModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConstructorModifier(this);
		}
	}

	public final ConstructorModifierContext constructorModifier()
			throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(
				_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorModifier);
		try {
			setState(1165);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1161);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(1162);
					match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
					setState(1163);
					match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
					setState(1164);
					match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class, 0);
		}

		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ConstructorDeclaratorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constructorDeclarator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConstructorDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConstructorDeclarator(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator()
			throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(
				_ctx, getState());
		enterRule(_localctx, 178, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1168);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(1167);
						typeParameters();
					}
				}

				setState(1170);
				simpleTypeName();
				setState(1171);
				match(LPAREN);
				setState(1173);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FINAL) | (1L << FLOAT) | (1L << INT)
						| (1L << LONG) | (1L << SHORT))) != 0)
						|| _la == Identifier || _la == AT) {
					{
						setState(1172);
						formalParameterList();
					}
				}

				setState(1175);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_simpleTypeName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSimpleTypeName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSimpleTypeName(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName()
			throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx,
				getState());
		enterRule(_localctx, 180, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1177);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class, 0);
		}

		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class, 0);
		}

		public ConstructorBodyContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constructorBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterConstructorBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody()
			throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx,
				getState());
		enterRule(_localctx, 182, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1179);
				match(LBRACE);
				setState(1181);
				switch (getInterpreter().adaptivePredict(_input, 103, _ctx)) {
				case 1: {
					setState(1180);
					explicitConstructorInvocation();
				}
					break;
				}
				setState(1184);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK)
						| (1L << BYTE) | (1L << CHAR) | (1L << CLASS)
						| (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE)
						| (1L << ENUM) | (1L << FINAL) | (1L << FLOAT)
						| (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED)
						| (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT)
						| (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER)
						| (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS)
						| (1L << THROW) | (1L << TRY) | (1L << VOID)
						| (1L << WHILE) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (INC - 65))
								| (1L << (DEC - 65))
								| (1L << (Identifier - 65)) | (1L << (AT - 65)) | (1L << (JQBegin - 65)))) != 0)) {
					{
						setState(1183);
						blockStatements();
					}
				}

				setState(1186);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode THIS() {
			return getToken(JjQueryParser.THIS, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public ExplicitConstructorInvocationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_explicitConstructorInvocation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterExplicitConstructorInvocation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation()
			throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(
				_ctx, getState());
		enterRule(_localctx, 184, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1234);
			switch (getInterpreter().adaptivePredict(_input, 113, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1189);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(1188);
							typeArguments();
						}
					}

					setState(1191);
					match(THIS);
					setState(1192);
					match(LPAREN);
					setState(1194);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(1193);
							argumentList();
						}
					}

					setState(1196);
					match(RPAREN);
					setState(1197);
					match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1199);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(1198);
							typeArguments();
						}
					}

					setState(1201);
					match(SUPER);
					setState(1202);
					match(LPAREN);
					setState(1204);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(1203);
							argumentList();
						}
					}

					setState(1206);
					match(RPAREN);
					setState(1207);
					match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1208);
					expressionName();
					setState(1209);
					match(DOT);
					setState(1211);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(1210);
							typeArguments();
						}
					}

					setState(1213);
					match(SUPER);
					setState(1214);
					match(LPAREN);
					setState(1216);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(1215);
							argumentList();
						}
					}

					setState(1218);
					match(RPAREN);
					setState(1219);
					match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1221);
					primary();
					setState(1222);
					match(DOT);
					setState(1224);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(1223);
							typeArguments();
						}
					}

					setState(1226);
					match(SUPER);
					setState(1227);
					match(LPAREN);
					setState(1229);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(1228);
							argumentList();
						}
					}

					setState(1231);
					match(RPAREN);
					setState(1232);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class, 0);
		}

		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}

		public TerminalNode ENUM() {
			return getToken(JjQueryParser.ENUM, 0);
		}

		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class, i);
		}

		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class, 0);
		}

		public EnumDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterEnumDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration()
			throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx,
				getState());
		enterRule(_localctx, 186, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << FINAL)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)
						|| _la == AT) {
					{
						{
							setState(1236);
							classModifier();
						}
					}
					setState(1241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1242);
				match(ENUM);
				setState(1243);
				match(Identifier);
				setState(1245);
				_la = _input.LA(1);
				if (_la == IMPLEMENTS) {
					{
						setState(1244);
						superinterfaces();
					}
				}

				setState(1247);
				enumBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class, 0);
		}

		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public TerminalNode COMMA() {
			return getToken(JjQueryParser.COMMA, 0);
		}

		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterEnumBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1249);
				match(LBRACE);
				setState(1251);
				_la = _input.LA(1);
				if (_la == Identifier || _la == AT) {
					{
						setState(1250);
						enumConstantList();
					}
				}

				setState(1254);
				_la = _input.LA(1);
				if (_la == COMMA) {
					{
						setState(1253);
						match(COMMA);
					}
				}

				setState(1257);
				_la = _input.LA(1);
				if (_la == SEMI) {
					{
						setState(1256);
						enumBodyDeclarations();
					}
				}

				setState(1259);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public EnumConstantListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumConstantList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterEnumConstantList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEnumConstantList(this);
		}
	}

	public final EnumConstantListContext enumConstantList()
			throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx,
				getState());
		enterRule(_localctx, 190, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1261);
				enumConstant();
				setState(1266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 119, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1262);
								match(COMMA);
								setState(1263);
								enumConstant();
							}
						}
					}
					setState(1268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 119, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}

		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class, i);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumConstant;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterEnumConstant(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx,
				getState());
		enterRule(_localctx, 192, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(1269);
							enumConstantModifier();
						}
					}
					setState(1274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1275);
				match(Identifier);
				setState(1281);
				_la = _input.LA(1);
				if (_la == LPAREN) {
					{
						setState(1276);
						match(LPAREN);
						setState(1278);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
								| (1L << BYTE)
								| (1L << CHAR)
								| (1L << DOUBLE)
								| (1L << FLOAT)
								| (1L << INT)
								| (1L << LONG)
								| (1L << NEW)
								| (1L << SHORT)
								| (1L << SUPER)
								| (1L << THIS)
								| (1L << VOID)
								| (1L << IntegerLiteral)
								| (1L << FloatingPointLiteral)
								| (1L << BooleanLiteral)
								| (1L << CharacterLiteral)
								| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
								|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
										| (1L << (TILDE - 71))
										| (1L << (INC - 71))
										| (1L << (DEC - 71))
										| (1L << (ADD - 71))
										| (1L << (SUB - 71))
										| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
							{
								setState(1277);
								argumentList();
							}
						}

						setState(1280);
						match(RPAREN);
					}
				}

				setState(1284);
				_la = _input.LA(1);
				if (_la == LBRACE) {
					{
						setState(1283);
						classBody();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public EnumConstantModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumConstantModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterEnumConstantModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitEnumConstantModifier(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier()
			throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(
				_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1286);
				annotation();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}

		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class, i);
		}

		public EnumBodyDeclarationsContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumBodyDeclarations;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterEnumBodyDeclarations(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations()
			throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(
				_ctx, getState());
		enterRule(_localctx, 196, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1288);
				match(SEMI);
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << BOOLEAN)
						| (1L << BYTE)
						| (1L << CHAR)
						| (1L << CLASS)
						| (1L << DOUBLE)
						| (1L << ENUM)
						| (1L << FINAL)
						| (1L << FLOAT)
						| (1L << INT)
						| (1L << INTERFACE)
						| (1L << LONG)
						| (1L << NATIVE)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << SHORT)
						| (1L << STATIC)
						| (1L << STRICTFP)
						| (1L << SYNCHRONIZED)
						| (1L << TRANSIENT)
						| (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (LT - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
					{
						{
							setState(1289);
							classBodyDeclaration();
						}
					}
					setState(1294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class, 0);
		}

		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
		}

		public InterfaceDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInterfaceDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration()
			throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 198, RULE_interfaceDeclaration);
		try {
			setState(1297);
			switch (getInterpreter().adaptivePredict(_input, 125, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1295);
					normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1296);
					annotationTypeDeclaration();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends
			ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class, 0);
		}

		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}

		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class, i);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class, 0);
		}

		public TerminalNode INTERFACE() {
			return getToken(JjQueryParser.INTERFACE, 0);
		}

		public NormalInterfaceDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_normalInterfaceDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterNormalInterfaceDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration()
			throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 200, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << STATIC) | (1L << STRICTFP))) != 0)
						|| _la == AT) {
					{
						{
							setState(1299);
							interfaceModifier();
						}
					}
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1305);
				match(INTERFACE);
				setState(1306);
				match(Identifier);
				setState(1308);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(1307);
						typeParameters();
					}
				}

				setState(1311);
				_la = _input.LA(1);
				if (_la == EXTENDS) {
					{
						setState(1310);
						extendsInterfaces();
					}
				}

				setState(1313);
				interfaceBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() {
			return getToken(JjQueryParser.ABSTRACT, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TerminalNode STRICTFP() {
			return getToken(JjQueryParser.STRICTFP, 0);
		}

		public TerminalNode PROTECTED() {
			return getToken(JjQueryParser.PROTECTED, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public TerminalNode PRIVATE() {
			return getToken(JjQueryParser.PRIVATE, 0);
		}

		public InterfaceModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterInterfaceModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitInterfaceModifier(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier()
			throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx,
				getState());
		enterRule(_localctx, 202, RULE_interfaceModifier);
		try {
			setState(1322);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1315);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(1316);
					match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
					setState(1317);
					match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
					setState(1318);
					match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
					setState(1319);
					match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
					setState(1320);
					match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
					setState(1321);
					match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class, 0);
		}

		public TerminalNode EXTENDS() {
			return getToken(JjQueryParser.EXTENDS, 0);
		}

		public ExtendsInterfacesContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_extendsInterfaces;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterExtendsInterfaces(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitExtendsInterfaces(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces()
			throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx,
				getState());
		enterRule(_localctx, 204, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1324);
				match(EXTENDS);
				setState(1325);
				interfaceTypeList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(
				int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class, i);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}

		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterInterfaceBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody()
			throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx,
				getState());
		enterRule(_localctx, 206, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1327);
				match(LBRACE);
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << BOOLEAN)
						| (1L << BYTE)
						| (1L << CHAR)
						| (1L << CLASS)
						| (1L << DEFAULT)
						| (1L << DOUBLE)
						| (1L << ENUM)
						| (1L << FINAL)
						| (1L << FLOAT)
						| (1L << INT)
						| (1L << INTERFACE)
						| (1L << LONG)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (LT - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
					{
						{
							setState(1328);
							interfaceMemberDeclaration();
						}
					}
					setState(1333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1334);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends
			ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class, 0);
		}

		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class, 0);
		}

		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class, 0);
		}

		public InterfaceMemberDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceMemberDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInterfaceMemberDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration()
			throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceMemberDeclaration);
		try {
			setState(1341);
			switch (getInterpreter().adaptivePredict(_input, 131, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1336);
					constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1337);
					interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1338);
					classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1339);
					interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1340);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class, i);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}

		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class, 0);
		}

		public ConstantDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constantDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConstantDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration()
			throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 210, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL)
						| (1L << PUBLIC) | (1L << STATIC))) != 0)
						|| _la == AT) {
					{
						{
							setState(1343);
							constantModifier();
						}
					}
					setState(1348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1349);
				unannType();
				setState(1350);
				variableDeclaratorList();
				setState(1351);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode FINAL() {
			return getToken(JjQueryParser.FINAL, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public ConstantModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constantModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterConstantModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitConstantModifier(this);
		}
	}

	public final ConstantModifierContext constantModifier()
			throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx,
				getState());
		enterRule(_localctx, 212, RULE_constantModifier);
		try {
			setState(1357);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1353);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(1354);
					match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
					setState(1355);
					match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
					setState(1356);
					match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends
			ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class, 0);
		}

		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}

		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class, 0);
		}

		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class, i);
		}

		public InterfaceMethodDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceMethodDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInterfaceMethodDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration()
			throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 214, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)
						|| _la == AT) {
					{
						{
							setState(1359);
							interfaceMethodModifier();
						}
					}
					setState(1364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1365);
				methodHeader();
				setState(1366);
				methodBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends
			ParserRuleContext {
		public TerminalNode ABSTRACT() {
			return getToken(JjQueryParser.ABSTRACT, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TerminalNode STRICTFP() {
			return getToken(JjQueryParser.STRICTFP, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public TerminalNode DEFAULT() {
			return getToken(JjQueryParser.DEFAULT, 0);
		}

		public InterfaceMethodModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceMethodModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInterfaceMethodModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier()
			throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(
				_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceMethodModifier);
		try {
			setState(1374);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1368);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(1369);
					match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
					setState(1370);
					match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
					setState(1371);
					match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
					setState(1372);
					match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
					setState(1373);
					match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends
			ParserRuleContext {
		public TerminalNode AT() {
			return getToken(JjQueryParser.AT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class, 0);
		}

		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}

		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class, i);
		}

		public TerminalNode INTERFACE() {
			return getToken(JjQueryParser.INTERFACE, 0);
		}

		public AnnotationTypeDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotationTypeDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAnnotationTypeDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration()
			throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 218, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 136, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1376);
								interfaceModifier();
							}
						}
					}
					setState(1381);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 136, _ctx);
				}
				setState(1382);
				match(AT);
				setState(1383);
				match(INTERFACE);
				setState(1384);
				match(Identifier);
				setState(1385);
				annotationTypeBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(
				int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,
					i);
		}

		public AnnotationTypeBodyContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotationTypeBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAnnotationTypeBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody()
			throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(
				_ctx, getState());
		enterRule(_localctx, 220, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1387);
				match(LBRACE);
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << BOOLEAN)
						| (1L << BYTE)
						| (1L << CHAR)
						| (1L << CLASS)
						| (1L << DOUBLE)
						| (1L << ENUM)
						| (1L << FINAL)
						| (1L << FLOAT)
						| (1L << INT)
						| (1L << INTERFACE)
						| (1L << LONG)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << SHORT)
						| (1L << STATIC) | (1L << STRICTFP))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
					{
						{
							setState(1388);
							annotationTypeMemberDeclaration();
						}
					}
					setState(1393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1394);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends
			ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class, 0);
		}

		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(
					AnnotationTypeElementDeclarationContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class, 0);
		}

		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class, 0);
		}

		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotationTypeMemberDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAnnotationTypeMemberDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitAnnotationTypeMemberDeclaration(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration()
			throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1401);
			switch (getInterpreter().adaptivePredict(_input, 138, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1396);
					annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1397);
					constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1398);
					classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1399);
					interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1400);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends
			ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class, 0);
		}

		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public AnnotationTypeElementModifierContext annotationTypeElementModifier(
				int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class, i);
		}

		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}

		public AnnotationTypeElementDeclarationContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotationTypeElementDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAnnotationTypeElementDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration()
			throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == ABSTRACT || _la == PUBLIC || _la == AT) {
					{
						{
							setState(1403);
							annotationTypeElementModifier();
						}
					}
					setState(1408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1409);
				unannType();
				setState(1410);
				match(Identifier);
				setState(1411);
				match(LPAREN);
				setState(1412);
				match(RPAREN);
				setState(1414);
				_la = _input.LA(1);
				if (_la == LBRACK || _la == AT) {
					{
						setState(1413);
						dims();
					}
				}

				setState(1417);
				_la = _input.LA(1);
				if (_la == DEFAULT) {
					{
						setState(1416);
						defaultValue();
					}
				}

				setState(1419);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends
			ParserRuleContext {
		public TerminalNode ABSTRACT() {
			return getToken(JjQueryParser.ABSTRACT, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public AnnotationTypeElementModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotationTypeElementModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAnnotationTypeElementModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitAnnotationTypeElementModifier(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier()
			throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(
				_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeElementModifier);
		try {
			setState(1424);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1421);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(1422);
					match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
					setState(1423);
					match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() {
			return getToken(JjQueryParser.DEFAULT, 0);
		}

		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class, 0);
		}

		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_defaultValue;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterDefaultValue(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx,
				getState());
		enterRule(_localctx, 228, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1426);
				match(DEFAULT);
				setState(1427);
				elementValue();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class, 0);
		}

		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class, 0);
		}

		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class, 0);
		}

		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_annotation);
		try {
			setState(1432);
			switch (getInterpreter().adaptivePredict(_input, 143, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1429);
					normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1430);
					markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1431);
					singleElementAnnotation();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() {
			return getToken(JjQueryParser.AT, 0);
		}

		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public NormalAnnotationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_normalAnnotation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterNormalAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitNormalAnnotation(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation()
			throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx,
				getState());
		enterRule(_localctx, 232, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1434);
				match(AT);
				setState(1435);
				typeName();
				setState(1436);
				match(LPAREN);
				setState(1438);
				_la = _input.LA(1);
				if (_la == Identifier) {
					{
						setState(1437);
						elementValuePairList();
					}
				}

				setState(1440);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}

		public ElementValuePairListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValuePairList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterElementValuePairList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitElementValuePairList(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList()
			throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(
				_ctx, getState());
		enterRule(_localctx, 234, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1442);
				elementValuePair();
				setState(1447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(1443);
							match(COMMA);
							setState(1444);
							elementValuePair();
						}
					}
					setState(1449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode ASSIGN() {
			return getToken(JjQueryParser.ASSIGN, 0);
		}

		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class, 0);
		}

		public ElementValuePairContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValuePair;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterElementValuePair(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair()
			throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx,
				getState());
		enterRule(_localctx, 236, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1450);
				match(Identifier);
				setState(1451);
				match(ASSIGN);
				setState(1452);
				elementValue();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class, 0);
		}

		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValue;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterElementValue(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx,
				getState());
		enterRule(_localctx, 238, RULE_elementValue);
		try {
			setState(1457);
			switch (getInterpreter().adaptivePredict(_input, 146, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1454);
					conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1455);
					elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1456);
					annotation();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends
			ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class, 0);
		}

		public TerminalNode COMMA() {
			return getToken(JjQueryParser.COMMA, 0);
		}

		public ElementValueArrayInitializerContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValueArrayInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterElementValueArrayInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer()
			throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(
				_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1459);
				match(LBRACE);
				setState(1461);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(1460);
						elementValueList();
					}
				}

				setState(1464);
				_la = _input.LA(1);
				if (_la == COMMA) {
					{
						setState(1463);
						match(COMMA);
					}
				}

				setState(1466);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public ElementValueListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValueList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterElementValueList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitElementValueList(this);
		}
	}

	public final ElementValueListContext elementValueList()
			throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx,
				getState());
		enterRule(_localctx, 242, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1468);
				elementValue();
				setState(1473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 149, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1469);
								match(COMMA);
								setState(1470);
								elementValue();
							}
						}
					}
					setState(1475);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 149, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() {
			return getToken(JjQueryParser.AT, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public MarkerAnnotationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_markerAnnotation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMarkerAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMarkerAnnotation(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation()
			throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx,
				getState());
		enterRule(_localctx, 244, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1476);
				match(AT);
				setState(1477);
				typeName();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends
			ParserRuleContext {
		public TerminalNode AT() {
			return getToken(JjQueryParser.AT, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class, 0);
		}

		public SingleElementAnnotationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_singleElementAnnotation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterSingleElementAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitSingleElementAnnotation(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation()
			throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(
				_ctx, getState());
		enterRule(_localctx, 246, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1479);
				match(AT);
				setState(1480);
				typeName();
				setState(1481);
				match(LPAREN);
				setState(1482);
				elementValue();
				setState(1483);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public TerminalNode COMMA() {
			return getToken(JjQueryParser.COMMA, 0);
		}

		public ArrayInitializerContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterArrayInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer()
			throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx,
				getState());
		enterRule(_localctx, 248, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1485);
				match(LBRACE);
				setState(1487);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(1486);
						variableInitializerList();
					}
				}

				setState(1490);
				_la = _input.LA(1);
				if (_la == COMMA) {
					{
						setState(1489);
						match(COMMA);
					}
				}

				setState(1492);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends
			ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public VariableInitializerListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableInitializerList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterVariableInitializerList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitVariableInitializerList(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList()
			throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(
				_ctx, getState());
		enterRule(_localctx, 250, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1494);
				variableInitializer();
				setState(1499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 152, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1495);
								match(COMMA);
								setState(1496);
								variableInitializer();
							}
						}
					}
					setState(1501);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 152, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class, 0);
		}

		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_block;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1502);
				match(LBRACE);
				setState(1504);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK)
						| (1L << BYTE) | (1L << CHAR) | (1L << CLASS)
						| (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE)
						| (1L << ENUM) | (1L << FINAL) | (1L << FLOAT)
						| (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED)
						| (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT)
						| (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER)
						| (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS)
						| (1L << THROW) | (1L << TRY) | (1L << VOID)
						| (1L << WHILE) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (INC - 65))
								| (1L << (DEC - 65))
								| (1L << (Identifier - 65)) | (1L << (AT - 65)) | (1L << (JQBegin - 65)))) != 0)) {
					{
						setState(1503);
						blockStatements();
					}
				}

				setState(1506);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}

		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class, i);
		}

		public BlockStatementsContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_blockStatements;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterBlockStatements(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements()
			throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx,
				getState());
		enterRule(_localctx, 254, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1508);
				blockStatement();
				setState(1512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << ASSERT)
						| (1L << BOOLEAN)
						| (1L << BREAK)
						| (1L << BYTE)
						| (1L << CHAR)
						| (1L << CLASS)
						| (1L << CONTINUE)
						| (1L << DO)
						| (1L << DOUBLE)
						| (1L << ENUM)
						| (1L << FINAL)
						| (1L << FLOAT)
						| (1L << FOR)
						| (1L << IF)
						| (1L << INT)
						| (1L << LONG)
						| (1L << NEW)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << RETURN)
						| (1L << SHORT)
						| (1L << STATIC)
						| (1L << STRICTFP)
						| (1L << SUPER)
						| (1L << SWITCH)
						| (1L << SYNCHRONIZED)
						| (1L << THIS)
						| (1L << THROW)
						| (1L << TRY)
						| (1L << VOID)
						| (1L << WHILE)
						| (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral)
						| (1L << BooleanLiteral)
						| (1L << CharacterLiteral)
						| (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (INC - 65))
								| (1L << (DEC - 65))
								| (1L << (Identifier - 65)) | (1L << (AT - 65)) | (1L << (JQBegin - 65)))) != 0)) {
					{
						{
							setState(1509);
							blockStatement();
						}
					}
					setState(1514);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public JQueryContext jQuery() {
			return getRuleContext(JQueryContext.class, 0);
		}

		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(
					LocalVariableDeclarationStatementContext.class, 0);
		}

		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_blockStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterBlockStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement()
			throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx,
				getState());
		enterRule(_localctx, 256, RULE_blockStatement);
		try {
			setState(1519);
			switch (getInterpreter().adaptivePredict(_input, 155, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1515);
					localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1516);
					classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1517);
					statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1518);
					jQuery();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends
			ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public LocalVariableDeclarationStatementContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_localVariableDeclarationStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterLocalVariableDeclarationStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement()
			throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(
				_ctx, getState());
		enterRule(_localctx, 258, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1521);
				localVariableDeclaration();
				setState(1522);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends
			ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class, 0);
		}

		public LocalVariableDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_localVariableDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterLocalVariableDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration()
			throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FINAL || _la == AT) {
					{
						{
							setState(1524);
							variableModifier();
						}
					}
					setState(1529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1530);
				unannType();
				setState(1531);
				variableDeclaratorList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class, 0);
		}

		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class, 0);
		}

		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class, 0);
		}

		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class, 0);
		}

		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class, 0);
		}

		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(
					StatementWithoutTrailingSubstatementContext.class, 0);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_statement);
		try {
			setState(1539);
			switch (getInterpreter().adaptivePredict(_input, 157, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1533);
					statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1534);
					labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1535);
					ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1536);
					ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1537);
					whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(1538);
					forStatement();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class, 0);
		}

		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class, 0);
		}

		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class, 0);
		}

		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class, 0);
		}

		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(
					StatementWithoutTrailingSubstatementContext.class, 0);
		}

		public StatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitStatementNoShortIf(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf()
			throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 264, RULE_statementNoShortIf);
		try {
			setState(1546);
			switch (getInterpreter().adaptivePredict(_input, 158, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1541);
					statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1542);
					labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1543);
					ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1544);
					whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1545);
					forStatementNoShortIf();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends
			ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class, 0);
		}

		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class, 0);
		}

		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class, 0);
		}

		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class, 0);
		}

		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class, 0);
		}

		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class, 0);
		}

		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class, 0);
		}

		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class, 0);
		}

		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class, 0);
		}

		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class, 0);
		}

		public StatementWithoutTrailingSubstatementContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statementWithoutTrailingSubstatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterStatementWithoutTrailingSubstatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitStatementWithoutTrailingSubstatement(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement()
			throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(
				_ctx, getState());
		enterRule(_localctx, 266, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1560);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
					setState(1548);
					block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
					setState(1549);
					emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
					setState(1550);
					expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
					setState(1551);
					assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
					setState(1552);
					switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
					setState(1553);
					doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
					setState(1554);
					breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
					setState(1555);
					continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
					setState(1556);
					returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
					setState(1557);
					synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
					setState(1558);
					throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
					setState(1559);
					tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_emptyStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterEmptyStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement()
			throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx,
				getState());
		enterRule(_localctx, 268, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1562);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public LabeledStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_labeledStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterLabeledStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement()
			throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx,
				getState());
		enterRule(_localctx, 270, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1564);
				match(Identifier);
				setState(1565);
				match(COLON);
				setState(1566);
				statement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends
			ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class, 0);
		}

		public LabeledStatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_labeledStatementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterLabeledStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitLabeledStatementNoShortIf(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf()
			throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 272, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1568);
				match(Identifier);
				setState(1569);
				match(COLON);
				setState(1570);
				statementNoShortIf();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class, 0);
		}

		public ExpressionStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expressionStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterExpressionStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement()
			throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(
				_ctx, getState());
		enterRule(_localctx, 274, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1572);
				statementExpression();
				setState(1573);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class, 0);
		}

		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class, 0);
		}

		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class, 0);
		}

		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class, 0);
		}

		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class, 0);
		}

		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class, 0);
		}

		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,
					0);
		}

		public StatementExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statementExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterStatementExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression()
			throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 276, RULE_statementExpression);
		try {
			setState(1582);
			switch (getInterpreter().adaptivePredict(_input, 160, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1575);
					assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1576);
					preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1577);
					preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1578);
					postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1579);
					postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(1580);
					methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(1581);
					classInstanceCreationExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode IF() {
			return getToken(JjQueryParser.IF, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public IfThenStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifThenStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterIfThenStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitIfThenStatement(this);
		}
	}

	public final IfThenStatementContext ifThenStatement()
			throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx,
				getState());
		enterRule(_localctx, 278, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1584);
				match(IF);
				setState(1585);
				match(LPAREN);
				setState(1586);
				expression();
				setState(1587);
				match(RPAREN);
				setState(1588);
				statement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() {
			return getToken(JjQueryParser.ELSE, 0);
		}

		public TerminalNode IF() {
			return getToken(JjQueryParser.IF, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public IfThenElseStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifThenElseStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterIfThenElseStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitIfThenElseStatement(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement()
			throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(
				_ctx, getState());
		enterRule(_localctx, 280, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1590);
				match(IF);
				setState(1591);
				match(LPAREN);
				setState(1592);
				expression();
				setState(1593);
				match(RPAREN);
				setState(1594);
				statementNoShortIf();
				setState(1595);
				match(ELSE);
				setState(1596);
				statement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends
			ParserRuleContext {
		public TerminalNode ELSE() {
			return getToken(JjQueryParser.ELSE, 0);
		}

		public TerminalNode IF() {
			return getToken(JjQueryParser.IF, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class, i);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifThenElseStatementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterIfThenElseStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitIfThenElseStatementNoShortIf(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf()
			throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 282, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1598);
				match(IF);
				setState(1599);
				match(LPAREN);
				setState(1600);
				expression();
				setState(1601);
				match(RPAREN);
				setState(1602);
				statementNoShortIf();
				setState(1603);
				match(ELSE);
				setState(1604);
				statementNoShortIf();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public TerminalNode ASSERT() {
			return getToken(JjQueryParser.ASSERT, 0);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public AssertStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assertStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAssertStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement()
			throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx,
				getState());
		enterRule(_localctx, 284, RULE_assertStatement);
		try {
			setState(1616);
			switch (getInterpreter().adaptivePredict(_input, 161, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1606);
					match(ASSERT);
					setState(1607);
					expression();
					setState(1608);
					match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1610);
					match(ASSERT);
					setState(1611);
					expression();
					setState(1612);
					match(COLON);
					setState(1613);
					expression();
					setState(1614);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class, 0);
		}

		public TerminalNode SWITCH() {
			return getToken(JjQueryParser.SWITCH, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public SwitchStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSwitchStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement()
			throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx,
				getState());
		enterRule(_localctx, 286, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1618);
				match(SWITCH);
				setState(1619);
				match(LPAREN);
				setState(1620);
				expression();
				setState(1621);
				match(RPAREN);
				setState(1622);
				switchBlock();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class, i);
		}

		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}

		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}

		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class, i);
		}

		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchBlock;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSwitchBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1624);
				match(LBRACE);
				setState(1628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 162, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1625);
								switchBlockStatementGroup();
							}
						}
					}
					setState(1630);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 162, _ctx);
				}
				setState(1634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == CASE || _la == DEFAULT) {
					{
						{
							setState(1631);
							switchLabel();
						}
					}
					setState(1636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1637);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends
			ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class, 0);
		}

		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class, 0);
		}

		public SwitchBlockStatementGroupContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchBlockStatementGroup;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterSwitchBlockStatementGroup(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup()
			throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(
				_ctx, getState());
		enterRule(_localctx, 290, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1639);
				switchLabels();
				setState(1640);
				blockStatements();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}

		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class, i);
		}

		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchLabels;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSwitchLabels(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx,
				getState());
		enterRule(_localctx, 292, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1642);
				switchLabel();
				setState(1646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == CASE || _la == DEFAULT) {
					{
						{
							setState(1643);
							switchLabel();
						}
					}
					setState(1648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() {
			return getToken(JjQueryParser.CASE, 0);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class, 0);
		}

		public TerminalNode DEFAULT() {
			return getToken(JjQueryParser.DEFAULT, 0);
		}

		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class, 0);
		}

		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchLabel;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSwitchLabel(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchLabel);
		try {
			setState(1659);
			switch (getInterpreter().adaptivePredict(_input, 165, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1649);
					match(CASE);
					setState(1650);
					constantExpression();
					setState(1651);
					match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1653);
					match(CASE);
					setState(1654);
					enumConstantName();
					setState(1655);
					match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1657);
					match(DEFAULT);
					setState(1658);
					match(COLON);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public EnumConstantNameContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumConstantName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterEnumConstantName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName()
			throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx,
				getState());
		enterRule(_localctx, 296, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1661);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public TerminalNode WHILE() {
			return getToken(JjQueryParser.WHILE, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_whileStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterWhileStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement()
			throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx,
				getState());
		enterRule(_localctx, 298, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1663);
				match(WHILE);
				setState(1664);
				match(LPAREN);
				setState(1665);
				expression();
				setState(1666);
				match(RPAREN);
				setState(1667);
				statement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends
			ParserRuleContext {
		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode WHILE() {
			return getToken(JjQueryParser.WHILE, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public WhileStatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_whileStatementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterWhileStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitWhileStatementNoShortIf(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf()
			throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 300, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1669);
				match(WHILE);
				setState(1670);
				match(LPAREN);
				setState(1671);
				expression();
				setState(1672);
				match(RPAREN);
				setState(1673);
				statementNoShortIf();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() {
			return getToken(JjQueryParser.DO, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public TerminalNode WHILE() {
			return getToken(JjQueryParser.WHILE, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_doStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterDoStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1675);
				match(DO);
				setState(1676);
				statement();
				setState(1677);
				match(WHILE);
				setState(1678);
				match(LPAREN);
				setState(1679);
				expression();
				setState(1680);
				match(RPAREN);
				setState(1681);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class, 0);
		}

		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class, 0);
		}

		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterForStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx,
				getState());
		enterRule(_localctx, 304, RULE_forStatement);
		try {
			setState(1685);
			switch (getInterpreter().adaptivePredict(_input, 166, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1683);
					basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1684);
					enhancedForStatement();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class, 0);
		}

		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class, 0);
		}

		public ForStatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forStatementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterForStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitForStatementNoShortIf(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf()
			throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 306, RULE_forStatementNoShortIf);
		try {
			setState(1689);
			switch (getInterpreter().adaptivePredict(_input, 167, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1687);
					basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1688);
					enhancedForStatementNoShortIf();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public List<TerminalNode> SEMI() {
			return getTokens(JjQueryParser.SEMI);
		}

		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class, 0);
		}

		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class, 0);
		}

		public TerminalNode FOR() {
			return getToken(JjQueryParser.FOR, 0);
		}

		public TerminalNode SEMI(int i) {
			return getToken(JjQueryParser.SEMI, i);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public BasicForStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_basicForStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterBasicForStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitBasicForStatement(this);
		}
	}

	public final BasicForStatementContext basicForStatement()
			throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx,
				getState());
		enterRule(_localctx, 308, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1691);
				match(FOR);
				setState(1692);
				match(LPAREN);
				setState(1694);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FINAL) | (1L << FLOAT) | (1L << INT)
						| (1L << LONG) | (1L << NEW) | (1L << SHORT)
						| (1L << SUPER) | (1L << THIS) | (1L << VOID)
						| (1L << IntegerLiteral) | (1L << FloatingPointLiteral)
						| (1L << BooleanLiteral) | (1L << CharacterLiteral)
						| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81))
								| (1L << (DEC - 81))
								| (1L << (Identifier - 81)) | (1L << (AT - 81)))) != 0)) {
					{
						setState(1693);
						forInit();
					}
				}

				setState(1696);
				match(SEMI);
				setState(1698);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(1697);
						expression();
					}
				}

				setState(1700);
				match(SEMI);
				setState(1702);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81))
								| (1L << (DEC - 81))
								| (1L << (Identifier - 81)) | (1L << (AT - 81)))) != 0)) {
					{
						setState(1701);
						forUpdate();
					}
				}

				setState(1704);
				match(RPAREN);
				setState(1705);
				statement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends
			ParserRuleContext {
		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public List<TerminalNode> SEMI() {
			return getTokens(JjQueryParser.SEMI);
		}

		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class, 0);
		}

		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class, 0);
		}

		public TerminalNode FOR() {
			return getToken(JjQueryParser.FOR, 0);
		}

		public TerminalNode SEMI(int i) {
			return getToken(JjQueryParser.SEMI, i);
		}

		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public BasicForStatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_basicForStatementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterBasicForStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitBasicForStatementNoShortIf(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf()
			throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 310, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1707);
				match(FOR);
				setState(1708);
				match(LPAREN);
				setState(1710);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FINAL) | (1L << FLOAT) | (1L << INT)
						| (1L << LONG) | (1L << NEW) | (1L << SHORT)
						| (1L << SUPER) | (1L << THIS) | (1L << VOID)
						| (1L << IntegerLiteral) | (1L << FloatingPointLiteral)
						| (1L << BooleanLiteral) | (1L << CharacterLiteral)
						| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81))
								| (1L << (DEC - 81))
								| (1L << (Identifier - 81)) | (1L << (AT - 81)))) != 0)) {
					{
						setState(1709);
						forInit();
					}
				}

				setState(1712);
				match(SEMI);
				setState(1714);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(1713);
						expression();
					}
				}

				setState(1716);
				match(SEMI);
				setState(1718);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81))
								| (1L << (DEC - 81))
								| (1L << (Identifier - 81)) | (1L << (AT - 81)))) != 0)) {
					{
						setState(1717);
						forUpdate();
					}
				}

				setState(1720);
				match(RPAREN);
				setState(1721);
				statementNoShortIf();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class, 0);
		}

		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class, 0);
		}

		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forInit;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterForInit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_forInit);
		try {
			setState(1725);
			switch (getInterpreter().adaptivePredict(_input, 174, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1723);
					statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1724);
					localVariableDeclaration();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class, 0);
		}

		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forUpdate;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterForUpdate(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1727);
				statementExpressionList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends
			ParserRuleContext {
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public StatementExpressionListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statementExpressionList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterStatementExpressionList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitStatementExpressionList(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList()
			throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(
				_ctx, getState());
		enterRule(_localctx, 316, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1729);
				statementExpression();
				setState(1734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(1730);
							match(COMMA);
							setState(1731);
							statementExpression();
						}
					}
					setState(1736);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public TerminalNode FOR() {
			return getToken(JjQueryParser.FOR, 0);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public EnhancedForStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enhancedForStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterEnhancedForStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitEnhancedForStatement(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement()
			throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(
				_ctx, getState());
		enterRule(_localctx, 318, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1737);
				match(FOR);
				setState(1738);
				match(LPAREN);
				setState(1742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FINAL || _la == AT) {
					{
						{
							setState(1739);
							variableModifier();
						}
					}
					setState(1744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1745);
				unannType();
				setState(1746);
				variableDeclaratorId();
				setState(1747);
				match(COLON);
				setState(1748);
				expression();
				setState(1749);
				match(RPAREN);
				setState(1750);
				statement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends
			ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public TerminalNode FOR() {
			return getToken(JjQueryParser.FOR, 0);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enhancedForStatementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterEnhancedForStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitEnhancedForStatementNoShortIf(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf()
			throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 320, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1752);
				match(FOR);
				setState(1753);
				match(LPAREN);
				setState(1757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FINAL || _la == AT) {
					{
						{
							setState(1754);
							variableModifier();
						}
					}
					setState(1759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1760);
				unannType();
				setState(1761);
				variableDeclaratorId();
				setState(1762);
				match(COLON);
				setState(1763);
				expression();
				setState(1764);
				match(RPAREN);
				setState(1765);
				statementNoShortIf();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode BREAK() {
			return getToken(JjQueryParser.BREAK, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_breakStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterBreakStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement()
			throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx,
				getState());
		enterRule(_localctx, 322, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1767);
				match(BREAK);
				setState(1769);
				_la = _input.LA(1);
				if (_la == Identifier) {
					{
						setState(1768);
						match(Identifier);
					}
				}

				setState(1771);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode CONTINUE() {
			return getToken(JjQueryParser.CONTINUE, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public ContinueStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_continueStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterContinueStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement()
			throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx,
				getState());
		enterRule(_localctx, 324, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1773);
				match(CONTINUE);
				setState(1775);
				_la = _input.LA(1);
				if (_la == Identifier) {
					{
						setState(1774);
						match(Identifier);
					}
				}

				setState(1777);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() {
			return getToken(JjQueryParser.RETURN, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ReturnStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_returnStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterReturnStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement()
			throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx,
				getState());
		enterRule(_localctx, 326, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1779);
				match(RETURN);
				setState(1781);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(1780);
						expression();
					}
				}

				setState(1783);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode THROW() {
			return getToken(JjQueryParser.THROW, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_throwStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterThrowStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement()
			throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx,
				getState());
		enterRule(_localctx, 328, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1785);
				match(THROW);
				setState(1786);
				expression();
				setState(1787);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public TerminalNode SYNCHRONIZED() {
			return getToken(JjQueryParser.SYNCHRONIZED, 0);
		}

		public SynchronizedStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_synchronizedStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterSynchronizedStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitSynchronizedStatement(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement()
			throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(
				_ctx, getState());
		enterRule(_localctx, 330, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1789);
				match(SYNCHRONIZED);
				setState(1790);
				match(LPAREN);
				setState(1791);
				expression();
				setState(1792);
				match(RPAREN);
				setState(1793);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() {
			return getToken(JjQueryParser.TRY, 0);
		}

		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class, 0);
		}

		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class, 0);
		}

		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tryStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTryStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx,
				getState());
		enterRule(_localctx, 332, RULE_tryStatement);
		int _la;
		try {
			setState(1807);
			switch (getInterpreter().adaptivePredict(_input, 182, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1795);
					match(TRY);
					setState(1796);
					block();
					setState(1797);
					catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1799);
					match(TRY);
					setState(1800);
					block();
					setState(1802);
					_la = _input.LA(1);
					if (_la == CATCH) {
						{
							setState(1801);
							catches();
						}
					}

					setState(1804);
					finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1806);
					tryWithResourcesStatement();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class, i);
		}

		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}

		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_catches;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterCatches(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1809);
				catchClause();
				setState(1813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == CATCH) {
					{
						{
							setState(1810);
							catchClause();
						}
					}
					setState(1815);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode CATCH() {
			return getToken(JjQueryParser.CATCH, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_catchClause;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterCatchClause(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1816);
				match(CATCH);
				setState(1817);
				match(LPAREN);
				setState(1818);
				catchFormalParameter();
				setState(1819);
				match(RPAREN);
				setState(1820);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class, 0);
		}

		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public CatchFormalParameterContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_catchFormalParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterCatchFormalParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitCatchFormalParameter(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter()
			throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(
				_ctx, getState());
		enterRule(_localctx, 338, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FINAL || _la == AT) {
					{
						{
							setState(1822);
							variableModifier();
						}
					}
					setState(1827);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1828);
				catchType();
				setState(1829);
				variableDeclaratorId();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class, 0);
		}

		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class, i);
		}

		public List<TerminalNode> BITOR() {
			return getTokens(JjQueryParser.BITOR);
		}

		public TerminalNode BITOR(int i) {
			return getToken(JjQueryParser.BITOR, i);
		}

		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}

		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_catchType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterCatchType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1831);
				unannClassType();
				setState(1836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == BITOR) {
					{
						{
							setState(1832);
							match(BITOR);
							setState(1833);
							classType();
						}
					}
					setState(1838);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public TerminalNode FINALLY() {
			return getToken(JjQueryParser.FINALLY, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_finally_;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFinally_(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFinally_(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 342, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1839);
				match(FINALLY);
				setState(1840);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends
			ParserRuleContext {
		public TerminalNode TRY() {
			return getToken(JjQueryParser.TRY, 0);
		}

		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class, 0);
		}

		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class, 0);
		}

		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public TryWithResourcesStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tryWithResourcesStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterTryWithResourcesStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitTryWithResourcesStatement(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement()
			throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(
				_ctx, getState());
		enterRule(_localctx, 344, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1842);
				match(TRY);
				setState(1843);
				resourceSpecification();
				setState(1844);
				block();
				setState(1846);
				_la = _input.LA(1);
				if (_la == CATCH) {
					{
						setState(1845);
						catches();
					}
				}

				setState(1849);
				_la = _input.LA(1);
				if (_la == FINALLY) {
					{
						setState(1848);
						finally_();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class, 0);
		}

		public ResourceSpecificationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_resourceSpecification;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterResourceSpecification(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification()
			throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(
				_ctx, getState());
		enterRule(_localctx, 346, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1851);
				match(LPAREN);
				setState(1852);
				resourceList();
				setState(1854);
				_la = _input.LA(1);
				if (_la == SEMI) {
					{
						setState(1853);
						match(SEMI);
					}
				}

				setState(1856);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class, i);
		}

		public List<TerminalNode> SEMI() {
			return getTokens(JjQueryParser.SEMI);
		}

		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}

		public TerminalNode SEMI(int i) {
			return getToken(JjQueryParser.SEMI, i);
		}

		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_resourceList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterResourceList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitResourceList(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx,
				getState());
		enterRule(_localctx, 348, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1858);
				resource();
				setState(1863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 189, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1859);
								match(SEMI);
								setState(1860);
								resource();
							}
						}
					}
					setState(1865);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 189, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode ASSIGN() {
			return getToken(JjQueryParser.ASSIGN, 0);
		}

		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_resource;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterResource(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FINAL || _la == AT) {
					{
						{
							setState(1866);
							variableModifier();
						}
					}
					setState(1871);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1872);
				unannType();
				setState(1873);
				variableDeclaratorId();
				setState(1874);
				match(ASSIGN);
				setState(1875);
				expression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(
				int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class, i);
		}

		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,
					0);
		}

		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class, 0);
		}

		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}

		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPrimary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1879);
				switch (getInterpreter().adaptivePredict(_input, 191, _ctx)) {
				case 1: {
					setState(1877);
					primaryNoNewArray_lfno_primary();
				}
					break;
				case 2: {
					setState(1878);
					arrayCreationExpression();
				}
					break;
				}
				setState(1884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 192, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1881);
								primaryNoNewArray_lf_primary();
							}
						}
					}
					setState(1886);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 192, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class, 0);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public TerminalNode THIS() {
			return getToken(JjQueryParser.THIS, 0);
		}

		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class, 0);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode VOID() {
			return getToken(JjQueryParser.VOID, 0);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class, 0);
		}

		public TerminalNode CLASS() {
			return getToken(JjQueryParser.CLASS, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,
					0);
		}

		public PrimaryNoNewArrayContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPrimaryNoNewArray(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPrimaryNoNewArray(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray()
			throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx,
				getState());
		enterRule(_localctx, 354, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1916);
			switch (getInterpreter().adaptivePredict(_input, 194, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1887);
					literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1888);
					typeName();
					setState(1893);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == LBRACK) {
						{
							{
								setState(1889);
								match(LBRACK);
								setState(1890);
								match(RBRACK);
							}
						}
						setState(1895);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1896);
					match(DOT);
					setState(1897);
					match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1899);
					match(VOID);
					setState(1900);
					match(DOT);
					setState(1901);
					match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1902);
					match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1903);
					typeName();
					setState(1904);
					match(DOT);
					setState(1905);
					match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(1907);
					match(LPAREN);
					setState(1908);
					expression();
					setState(1909);
					match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(1911);
					classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(1912);
					fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
					setState(1913);
					arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
					setState(1914);
					methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
					setState(1915);
					methodReference();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends
			ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lf_arrayAccess;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lf_arrayAccess(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess()
			throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(
				_ctx, getState());
		enterRule(_localctx, 356, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends
			ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public TerminalNode THIS() {
			return getToken(JjQueryParser.THIS, 0);
		}

		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class, 0);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode VOID() {
			return getToken(JjQueryParser.VOID, 0);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class, 0);
		}

		public TerminalNode CLASS() {
			return getToken(JjQueryParser.CLASS, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,
					0);
		}

		public PrimaryNoNewArray_lfno_arrayAccessContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lfno_arrayAccess;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess()
			throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(
				_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1948);
			switch (getInterpreter().adaptivePredict(_input, 196, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1920);
					literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1921);
					typeName();
					setState(1926);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == LBRACK) {
						{
							{
								setState(1922);
								match(LBRACK);
								setState(1923);
								match(RBRACK);
							}
						}
						setState(1928);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1929);
					match(DOT);
					setState(1930);
					match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1932);
					match(VOID);
					setState(1933);
					match(DOT);
					setState(1934);
					match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1935);
					match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1936);
					typeName();
					setState(1937);
					match(DOT);
					setState(1938);
					match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(1940);
					match(LPAREN);
					setState(1941);
					expression();
					setState(1942);
					match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(1944);
					classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(1945);
					fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
					setState(1946);
					methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
					setState(1947);
					methodReference();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends
			ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(
					ClassInstanceCreationExpression_lf_primaryContext.class, 0);
		}

		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class, 0);
		}

		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class, 0);
		}

		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class, 0);
		}

		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class, 0);
		}

		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary()
			throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1955);
			switch (getInterpreter().adaptivePredict(_input, 197, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1950);
					classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1951);
					fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1952);
					arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1953);
					methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1954);
					methodReference_lf_primary();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext
			extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary()
			throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 362,
				RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext
			extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(
					ClassInstanceCreationExpression_lf_primaryContext.class, 0);
		}

		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class, 0);
		}

		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class, 0);
		}

		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class, 0);
		}

		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary()
			throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 364,
				RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1963);
			switch (getInterpreter().adaptivePredict(_input, 198, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1959);
					classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1960);
					fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1961);
					methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1962);
					methodReference_lf_primary();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends
			ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(
					ClassInstanceCreationExpression_lfno_primaryContext.class,
					0);
		}

		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class, 0);
		}

		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public TerminalNode THIS() {
			return getToken(JjQueryParser.THIS, 0);
		}

		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class, 0);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode VOID() {
			return getToken(JjQueryParser.VOID, 0);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class, 0);
		}

		public TerminalNode CLASS() {
			return getToken(JjQueryParser.CLASS, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary()
			throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2005);
			switch (getInterpreter().adaptivePredict(_input, 201, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1965);
					literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1966);
					typeName();
					setState(1971);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == LBRACK) {
						{
							{
								setState(1967);
								match(LBRACK);
								setState(1968);
								match(RBRACK);
							}
						}
						setState(1973);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1974);
					match(DOT);
					setState(1975);
					match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1977);
					unannPrimitiveType();
					setState(1982);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == LBRACK) {
						{
							{
								setState(1978);
								match(LBRACK);
								setState(1979);
								match(RBRACK);
							}
						}
						setState(1984);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1985);
					match(DOT);
					setState(1986);
					match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1988);
					match(VOID);
					setState(1989);
					match(DOT);
					setState(1990);
					match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1991);
					match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(1992);
					typeName();
					setState(1993);
					match(DOT);
					setState(1994);
					match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(1996);
					match(LPAREN);
					setState(1997);
					expression();
					setState(1998);
					match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(2000);
					classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
					setState(2001);
					fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
					setState(2002);
					arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
					setState(2003);
					methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
					setState(2004);
					methodReference_lfno_primary();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext
			extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary()
			throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 368,
				RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext
			extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(
					ClassInstanceCreationExpression_lfno_primaryContext.class,
					0);
		}

		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public TerminalNode THIS() {
			return getToken(JjQueryParser.THIS, 0);
		}

		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class, 0);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode VOID() {
			return getToken(JjQueryParser.VOID, 0);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class, 0);
		}

		public TerminalNode CLASS() {
			return getToken(JjQueryParser.CLASS, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary()
			throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 370,
				RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2048);
			switch (getInterpreter().adaptivePredict(_input, 204, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2009);
					literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2010);
					typeName();
					setState(2015);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == LBRACK) {
						{
							{
								setState(2011);
								match(LBRACK);
								setState(2012);
								match(RBRACK);
							}
						}
						setState(2017);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2018);
					match(DOT);
					setState(2019);
					match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2021);
					unannPrimitiveType();
					setState(2026);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == LBRACK) {
						{
							{
								setState(2022);
								match(LBRACK);
								setState(2023);
								match(RBRACK);
							}
						}
						setState(2028);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2029);
					match(DOT);
					setState(2030);
					match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2032);
					match(VOID);
					setState(2033);
					match(DOT);
					setState(2034);
					match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(2035);
					match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(2036);
					typeName();
					setState(2037);
					match(DOT);
					setState(2038);
					match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(2040);
					match(LPAREN);
					setState(2041);
					expression();
					setState(2042);
					match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(2044);
					classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
					setState(2045);
					fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
					setState(2046);
					methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
					setState(2047);
					methodReference_lfno_primary();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode NEW() {
			return getToken(JjQueryParser.NEW, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public List<TerminalNode> Identifier() {
			return getTokens(JjQueryParser.Identifier);
		}

		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier(int i) {
			return getToken(JjQueryParser.Identifier, i);
		}

		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class, 0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public ClassInstanceCreationExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classInstanceCreationExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassInstanceCreationExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassInstanceCreationExpression(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression()
			throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 372, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2133);
			switch (getInterpreter().adaptivePredict(_input, 222, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2050);
					match(NEW);
					setState(2052);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2051);
							typeArguments();
						}
					}

					setState(2057);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(2054);
								annotation();
							}
						}
						setState(2059);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2060);
					match(Identifier);
					setState(2071);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == DOT) {
						{
							{
								setState(2061);
								match(DOT);
								setState(2065);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == AT) {
									{
										{
											setState(2062);
											annotation();
										}
									}
									setState(2067);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(2068);
								match(Identifier);
							}
						}
						setState(2073);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2075);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2074);
							typeArgumentsOrDiamond();
						}
					}

					setState(2077);
					match(LPAREN);
					setState(2079);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2078);
							argumentList();
						}
					}

					setState(2081);
					match(RPAREN);
					setState(2083);
					_la = _input.LA(1);
					if (_la == LBRACE) {
						{
							setState(2082);
							classBody();
						}
					}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2085);
					expressionName();
					setState(2086);
					match(DOT);
					setState(2087);
					match(NEW);
					setState(2089);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2088);
							typeArguments();
						}
					}

					setState(2094);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(2091);
								annotation();
							}
						}
						setState(2096);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2097);
					match(Identifier);
					setState(2099);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2098);
							typeArgumentsOrDiamond();
						}
					}

					setState(2101);
					match(LPAREN);
					setState(2103);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2102);
							argumentList();
						}
					}

					setState(2105);
					match(RPAREN);
					setState(2107);
					_la = _input.LA(1);
					if (_la == LBRACE) {
						{
							setState(2106);
							classBody();
						}
					}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2109);
					primary();
					setState(2110);
					match(DOT);
					setState(2111);
					match(NEW);
					setState(2113);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2112);
							typeArguments();
						}
					}

					setState(2118);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(2115);
								annotation();
							}
						}
						setState(2120);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2121);
					match(Identifier);
					setState(2123);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2122);
							typeArgumentsOrDiamond();
						}
					}

					setState(2125);
					match(LPAREN);
					setState(2127);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2126);
							argumentList();
						}
					}

					setState(2129);
					match(RPAREN);
					setState(2131);
					_la = _input.LA(1);
					if (_la == LBRACE) {
						{
							setState(2130);
							classBody();
						}
					}

				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext
			extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class, 0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode NEW() {
			return getToken(JjQueryParser.NEW, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public ClassInstanceCreationExpression_lf_primaryContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classInstanceCreationExpression_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassInstanceCreationExpression_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassInstanceCreationExpression_lf_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary()
			throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 374,
				RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2135);
				match(DOT);
				setState(2136);
				match(NEW);
				setState(2138);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(2137);
						typeArguments();
					}
				}

				setState(2143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(2140);
							annotation();
						}
					}
					setState(2145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2146);
				match(Identifier);
				setState(2148);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(2147);
						typeArgumentsOrDiamond();
					}
				}

				setState(2150);
				match(LPAREN);
				setState(2152);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(2151);
						argumentList();
					}
				}

				setState(2154);
				match(RPAREN);
				setState(2156);
				switch (getInterpreter().adaptivePredict(_input, 227, _ctx)) {
				case 1: {
					setState(2155);
					classBody();
				}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext
			extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode NEW() {
			return getToken(JjQueryParser.NEW, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public List<TerminalNode> Identifier() {
			return getTokens(JjQueryParser.Identifier);
		}

		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier(int i) {
			return getToken(JjQueryParser.Identifier, i);
		}

		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class, 0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public ClassInstanceCreationExpression_lfno_primaryContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classInstanceCreationExpression_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassInstanceCreationExpression_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassInstanceCreationExpression_lfno_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary()
			throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 376,
				RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2217);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
					setState(2158);
					match(NEW);
					setState(2160);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2159);
							typeArguments();
						}
					}

					setState(2165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(2162);
								annotation();
							}
						}
						setState(2167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2168);
					match(Identifier);
					setState(2179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == DOT) {
						{
							{
								setState(2169);
								match(DOT);
								setState(2173);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == AT) {
									{
										{
											setState(2170);
											annotation();
										}
									}
									setState(2175);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(2176);
								match(Identifier);
							}
						}
						setState(2181);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2183);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2182);
							typeArgumentsOrDiamond();
						}
					}

					setState(2185);
					match(LPAREN);
					setState(2187);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2186);
							argumentList();
						}
					}

					setState(2189);
					match(RPAREN);
					setState(2191);
					switch (getInterpreter().adaptivePredict(_input, 234, _ctx)) {
					case 1: {
						setState(2190);
						classBody();
					}
						break;
					}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
					setState(2193);
					expressionName();
					setState(2194);
					match(DOT);
					setState(2195);
					match(NEW);
					setState(2197);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2196);
							typeArguments();
						}
					}

					setState(2202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(2199);
								annotation();
							}
						}
						setState(2204);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2205);
					match(Identifier);
					setState(2207);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2206);
							typeArgumentsOrDiamond();
						}
					}

					setState(2209);
					match(LPAREN);
					setState(2211);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2210);
							argumentList();
						}
					}

					setState(2213);
					match(RPAREN);
					setState(2215);
					switch (getInterpreter().adaptivePredict(_input, 239, _ctx)) {
					case 1: {
						setState(2214);
						classBody();
					}
						break;
					}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode LT() {
			return getToken(JjQueryParser.LT, 0);
		}

		public TerminalNode GT() {
			return getToken(JjQueryParser.GT, 0);
		}

		public TypeArgumentsOrDiamondContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeArgumentsOrDiamond;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterTypeArgumentsOrDiamond(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond()
			throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(
				_ctx, getState());
		enterRule(_localctx, 378, RULE_typeArgumentsOrDiamond);
		try {
			setState(2222);
			switch (getInterpreter().adaptivePredict(_input, 241, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2219);
					typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2220);
					match(LT);
					setState(2221);
					match(GT);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldAccess;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFieldAccess(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFieldAccess(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_fieldAccess);
		try {
			setState(2237);
			switch (getInterpreter().adaptivePredict(_input, 242, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2224);
					primary();
					setState(2225);
					match(DOT);
					setState(2226);
					match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2228);
					match(SUPER);
					setState(2229);
					match(DOT);
					setState(2230);
					match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2231);
					typeName();
					setState(2232);
					match(DOT);
					setState(2233);
					match(SUPER);
					setState(2234);
					match(DOT);
					setState(2235);
					match(Identifier);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public FieldAccess_lf_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldAccess_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterFieldAccess_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitFieldAccess_lf_primary(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary()
			throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 382, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2239);
				match(DOT);
				setState(2240);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends
			ParserRuleContext {
		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public FieldAccess_lfno_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldAccess_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterFieldAccess_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitFieldAccess_lfno_primary(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary()
			throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 384, RULE_fieldAccess_lfno_primary);
		try {
			setState(2251);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
					setState(2242);
					match(SUPER);
					setState(2243);
					match(DOT);
					setState(2244);
					match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
					setState(2245);
					typeName();
					setState(2246);
					match(DOT);
					setState(2247);
					match(SUPER);
					setState(2248);
					match(DOT);
					setState(2249);
					match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(
					PrimaryNoNewArray_lfno_arrayAccessContext.class, 0);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(
				int i) {
			return getRuleContext(
					PrimaryNoNewArray_lf_arrayAccessContext.class, i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}

		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayAccess;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterArrayAccess(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2263);
				switch (getInterpreter().adaptivePredict(_input, 244, _ctx)) {
				case 1: {
					setState(2253);
					expressionName();
					setState(2254);
					match(LBRACK);
					setState(2255);
					expression();
					setState(2256);
					match(RBRACK);
				}
					break;
				case 2: {
					setState(2258);
					primaryNoNewArray_lfno_arrayAccess();
					setState(2259);
					match(LBRACK);
					setState(2260);
					expression();
					setState(2261);
					match(RBRACK);
				}
					break;
				}
				setState(2272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LBRACK) {
					{
						{
							setState(2265);
							primaryNoNewArray_lf_arrayAccess();
							setState(2266);
							match(LBRACK);
							setState(2267);
							expression();
							setState(2268);
							match(RBRACK);
						}
					}
					setState(2274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(
					PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,
					0);
		}

		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(
				int i) {
			return getRuleContext(
					PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,
					i);
		}

		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public ArrayAccess_lf_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayAccess_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterArrayAccess_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitArrayAccess_lf_primary(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary()
			throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 388, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2275);
					primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
					setState(2276);
					match(LBRACK);
					setState(2277);
					expression();
					setState(2278);
					match(RBRACK);
				}
				setState(2287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 246, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2280);
								primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
								setState(2281);
								match(LBRACK);
								setState(2282);
								expression();
								setState(2283);
								match(RBRACK);
							}
						}
					}
					setState(2289);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 246, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends
			ParserRuleContext {
		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(
					PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,
					0);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(
				int i) {
			return getRuleContext(
					PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,
					i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayAccess_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterArrayAccess_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitArrayAccess_lfno_primary(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary()
			throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 390, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2300);
				switch (getInterpreter().adaptivePredict(_input, 247, _ctx)) {
				case 1: {
					setState(2290);
					expressionName();
					setState(2291);
					match(LBRACK);
					setState(2292);
					expression();
					setState(2293);
					match(RBRACK);
				}
					break;
				case 2: {
					setState(2295);
					primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
					setState(2296);
					match(LBRACK);
					setState(2297);
					expression();
					setState(2298);
					match(RBRACK);
				}
					break;
				}
				setState(2309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 248, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2302);
								primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
								setState(2303);
								match(LBRACK);
								setState(2304);
								expression();
								setState(2305);
								match(RBRACK);
							}
						}
					}
					setState(2311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 248, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public MethodInvocationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodInvocation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodInvocation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation()
			throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx,
				getState());
		enterRule(_localctx, 392, RULE_methodInvocation);
		int _la;
		try {
			setState(2380);
			switch (getInterpreter().adaptivePredict(_input, 260, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2312);
					methodName();
					setState(2313);
					match(LPAREN);
					setState(2315);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2314);
							argumentList();
						}
					}

					setState(2317);
					match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2319);
					typeName();
					setState(2320);
					match(DOT);
					setState(2322);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2321);
							typeArguments();
						}
					}

					setState(2324);
					match(Identifier);
					setState(2325);
					match(LPAREN);
					setState(2327);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2326);
							argumentList();
						}
					}

					setState(2329);
					match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2331);
					expressionName();
					setState(2332);
					match(DOT);
					setState(2334);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2333);
							typeArguments();
						}
					}

					setState(2336);
					match(Identifier);
					setState(2337);
					match(LPAREN);
					setState(2339);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2338);
							argumentList();
						}
					}

					setState(2341);
					match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2343);
					primary();
					setState(2344);
					match(DOT);
					setState(2346);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2345);
							typeArguments();
						}
					}

					setState(2348);
					match(Identifier);
					setState(2349);
					match(LPAREN);
					setState(2351);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2350);
							argumentList();
						}
					}

					setState(2353);
					match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(2355);
					match(SUPER);
					setState(2356);
					match(DOT);
					setState(2358);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2357);
							typeArguments();
						}
					}

					setState(2360);
					match(Identifier);
					setState(2361);
					match(LPAREN);
					setState(2363);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2362);
							argumentList();
						}
					}

					setState(2365);
					match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(2366);
					typeName();
					setState(2367);
					match(DOT);
					setState(2368);
					match(SUPER);
					setState(2369);
					match(DOT);
					setState(2371);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2370);
							typeArguments();
						}
					}

					setState(2373);
					match(Identifier);
					setState(2374);
					match(LPAREN);
					setState(2376);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2375);
							argumentList();
						}
					}

					setState(2378);
					match(RPAREN);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public MethodInvocation_lf_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodInvocation_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterMethodInvocation_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitMethodInvocation_lf_primary(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary()
			throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 394, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2382);
				match(DOT);
				setState(2384);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(2383);
						typeArguments();
					}
				}

				setState(2386);
				match(Identifier);
				setState(2387);
				match(LPAREN);
				setState(2389);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(2388);
						argumentList();
					}
				}

				setState(2391);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodInvocation_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterMethodInvocation_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitMethodInvocation_lfno_primary(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary()
			throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 396, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2449);
			switch (getInterpreter().adaptivePredict(_input, 272, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2393);
					methodName();
					setState(2394);
					match(LPAREN);
					setState(2396);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2395);
							argumentList();
						}
					}

					setState(2398);
					match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2400);
					typeName();
					setState(2401);
					match(DOT);
					setState(2403);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2402);
							typeArguments();
						}
					}

					setState(2405);
					match(Identifier);
					setState(2406);
					match(LPAREN);
					setState(2408);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2407);
							argumentList();
						}
					}

					setState(2410);
					match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2412);
					expressionName();
					setState(2413);
					match(DOT);
					setState(2415);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2414);
							typeArguments();
						}
					}

					setState(2417);
					match(Identifier);
					setState(2418);
					match(LPAREN);
					setState(2420);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2419);
							argumentList();
						}
					}

					setState(2422);
					match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2424);
					match(SUPER);
					setState(2425);
					match(DOT);
					setState(2427);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2426);
							typeArguments();
						}
					}

					setState(2429);
					match(Identifier);
					setState(2430);
					match(LPAREN);
					setState(2432);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2431);
							argumentList();
						}
					}

					setState(2434);
					match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(2435);
					typeName();
					setState(2436);
					match(DOT);
					setState(2437);
					match(SUPER);
					setState(2438);
					match(DOT);
					setState(2440);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2439);
							typeArguments();
						}
					}

					setState(2442);
					match(Identifier);
					setState(2443);
					match(LPAREN);
					setState(2445);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2444);
							argumentList();
						}
					}

					setState(2447);
					match(RPAREN);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_argumentList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterArgumentList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx,
				getState());
		enterRule(_localctx, 398, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2451);
				expression();
				setState(2456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(2452);
							match(COMMA);
							setState(2453);
							expression();
						}
					}
					setState(2458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class, 0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public TerminalNode NEW() {
			return getToken(JjQueryParser.NEW, 0);
		}

		public TerminalNode COLONCOLON() {
			return getToken(JjQueryParser.COLONCOLON, 0);
		}

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class, 0);
		}

		public MethodReferenceContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodReference;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodReference(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodReference(this);
		}
	}

	public final MethodReferenceContext methodReference()
			throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx,
				getState());
		enterRule(_localctx, 400, RULE_methodReference);
		int _la;
		try {
			setState(2506);
			switch (getInterpreter().adaptivePredict(_input, 280, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2459);
					expressionName();
					setState(2460);
					match(COLONCOLON);
					setState(2462);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2461);
							typeArguments();
						}
					}

					setState(2464);
					match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2466);
					referenceType();
					setState(2467);
					match(COLONCOLON);
					setState(2469);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2468);
							typeArguments();
						}
					}

					setState(2471);
					match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2473);
					primary();
					setState(2474);
					match(COLONCOLON);
					setState(2476);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2475);
							typeArguments();
						}
					}

					setState(2478);
					match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2480);
					match(SUPER);
					setState(2481);
					match(COLONCOLON);
					setState(2483);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2482);
							typeArguments();
						}
					}

					setState(2485);
					match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(2486);
					typeName();
					setState(2487);
					match(DOT);
					setState(2488);
					match(SUPER);
					setState(2489);
					match(COLONCOLON);
					setState(2491);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2490);
							typeArguments();
						}
					}

					setState(2493);
					match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(2495);
					classType();
					setState(2496);
					match(COLONCOLON);
					setState(2498);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2497);
							typeArguments();
						}
					}

					setState(2500);
					match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(2502);
					arrayType();
					setState(2503);
					match(COLONCOLON);
					setState(2504);
					match(NEW);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode COLONCOLON() {
			return getToken(JjQueryParser.COLONCOLON, 0);
		}

		public MethodReference_lf_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodReference_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterMethodReference_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitMethodReference_lf_primary(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary()
			throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 402, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2508);
				match(COLONCOLON);
				setState(2510);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(2509);
						typeArguments();
					}
				}

				setState(2512);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class, 0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public TerminalNode NEW() {
			return getToken(JjQueryParser.NEW, 0);
		}

		public TerminalNode COLONCOLON() {
			return getToken(JjQueryParser.COLONCOLON, 0);
		}

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class, 0);
		}

		public MethodReference_lfno_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodReference_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterMethodReference_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitMethodReference_lfno_primary(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary()
			throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 404, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2554);
			switch (getInterpreter().adaptivePredict(_input, 287, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2514);
					expressionName();
					setState(2515);
					match(COLONCOLON);
					setState(2517);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2516);
							typeArguments();
						}
					}

					setState(2519);
					match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2521);
					referenceType();
					setState(2522);
					match(COLONCOLON);
					setState(2524);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2523);
							typeArguments();
						}
					}

					setState(2526);
					match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2528);
					match(SUPER);
					setState(2529);
					match(COLONCOLON);
					setState(2531);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2530);
							typeArguments();
						}
					}

					setState(2533);
					match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2534);
					typeName();
					setState(2535);
					match(DOT);
					setState(2536);
					match(SUPER);
					setState(2537);
					match(COLONCOLON);
					setState(2539);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2538);
							typeArguments();
						}
					}

					setState(2541);
					match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(2543);
					classType();
					setState(2544);
					match(COLONCOLON);
					setState(2546);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2545);
							typeArguments();
						}
					}

					setState(2548);
					match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(2550);
					arrayType();
					setState(2551);
					match(COLONCOLON);
					setState(2552);
					match(NEW);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends
			ParserRuleContext {
		public DimsContext dims() {
			return getRuleContext(DimsContext.class, 0);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
		}

		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class, 0);
		}

		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class, 0);
		}

		public TerminalNode NEW() {
			return getToken(JjQueryParser.NEW, 0);
		}

		public ArrayCreationExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayCreationExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterArrayCreationExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitArrayCreationExpression(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression()
			throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 406, RULE_arrayCreationExpression);
		try {
			setState(2578);
			switch (getInterpreter().adaptivePredict(_input, 290, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2556);
					match(NEW);
					setState(2557);
					primitiveType();
					setState(2558);
					dimExprs();
					setState(2560);
					switch (getInterpreter().adaptivePredict(_input, 288, _ctx)) {
					case 1: {
						setState(2559);
						dims();
					}
						break;
					}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2562);
					match(NEW);
					setState(2563);
					classOrInterfaceType();
					setState(2564);
					dimExprs();
					setState(2566);
					switch (getInterpreter().adaptivePredict(_input, 289, _ctx)) {
					case 1: {
						setState(2565);
						dims();
					}
						break;
					}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2568);
					match(NEW);
					setState(2569);
					primitiveType();
					setState(2570);
					dims();
					setState(2571);
					arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2573);
					match(NEW);
					setState(2574);
					classOrInterfaceType();
					setState(2575);
					dims();
					setState(2576);
					arrayInitializer();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}

		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class, i);
		}

		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_dimExprs;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterDimExprs(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitDimExprs(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2580);
				dimExpr();
				setState(2584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 291, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2581);
								dimExpr();
							}
						}
					}
					setState(2586);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 291, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode RBRACK() {
			return getToken(JjQueryParser.RBRACK, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode LBRACK() {
			return getToken(JjQueryParser.LBRACK, 0);
		}

		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_dimExpr;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterDimExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitDimExpr(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(2587);
							annotation();
						}
					}
					setState(2592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2593);
				match(LBRACK);
				setState(2594);
				expression();
				setState(2595);
				match(RBRACK);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ConstantExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constantExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConstantExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression()
			throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 412, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2597);
				expression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class, 0);
		}

		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class, 0);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_expression);
		try {
			setState(2601);
			switch (getInterpreter().adaptivePredict(_input, 293, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2599);
					lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2600);
					assignmentExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class, 0);
		}

		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class, 0);
		}

		public TerminalNode ARROW() {
			return getToken(JjQueryParser.ARROW, 0);
		}

		public LambdaExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_lambdaExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterLambdaExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression()
			throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx,
				getState());
		enterRule(_localctx, 416, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2603);
				lambdaParameters();
				setState(2604);
				match(ARROW);
				setState(2605);
				lambdaBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public LambdaParametersContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_lambdaParameters;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterLambdaParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters()
			throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx,
				getState());
		enterRule(_localctx, 418, RULE_lambdaParameters);
		int _la;
		try {
			setState(2617);
			switch (getInterpreter().adaptivePredict(_input, 295, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2607);
					match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2608);
					match(LPAREN);
					setState(2610);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FINAL)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG) | (1L << SHORT))) != 0)
							|| _la == Identifier || _la == AT) {
						{
							setState(2609);
							formalParameterList();
						}
					}

					setState(2612);
					match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2613);
					match(LPAREN);
					setState(2614);
					inferredFormalParameterList();
					setState(2615);
					match(RPAREN);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends
			ParserRuleContext {
		public List<TerminalNode> Identifier() {
			return getTokens(JjQueryParser.Identifier);
		}

		public TerminalNode Identifier(int i) {
			return getToken(JjQueryParser.Identifier, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public InferredFormalParameterListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_inferredFormalParameterList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInferredFormalParameterList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInferredFormalParameterList(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList()
			throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(
				_ctx, getState());
		enterRule(_localctx, 420, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2619);
				match(Identifier);
				setState(2624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(2620);
							match(COMMA);
							setState(2621);
							match(Identifier);
						}
					}
					setState(2626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_lambdaBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterLambdaBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_lambdaBody);
		try {
			setState(2629);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(2627);
					expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
					setState(2628);
					block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class, 0);
		}

		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class, 0);
		}

		public AssignmentExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignmentExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAssignmentExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression()
			throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 424, RULE_assignmentExpression);
		try {
			setState(2633);
			switch (getInterpreter().adaptivePredict(_input, 298, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2631);
					conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2632);
					assignment();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class, 0);
		}

		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAssignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2635);
				leftHandSide();
				setState(2636);
				assignmentOperator();
				setState(2637);
				expression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class, 0);
		}

		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_leftHandSide;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterLeftHandSide(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitLeftHandSide(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx,
				getState());
		enterRule(_localctx, 428, RULE_leftHandSide);
		try {
			setState(2642);
			switch (getInterpreter().adaptivePredict(_input, 299, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2639);
					expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2640);
					fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2641);
					arrayAccess();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() {
			return getToken(JjQueryParser.ASSIGN, 0);
		}

		public TerminalNode MUL_ASSIGN() {
			return getToken(JjQueryParser.MUL_ASSIGN, 0);
		}

		public TerminalNode OR_ASSIGN() {
			return getToken(JjQueryParser.OR_ASSIGN, 0);
		}

		public TerminalNode DIV_ASSIGN() {
			return getToken(JjQueryParser.DIV_ASSIGN, 0);
		}

		public TerminalNode RSHIFT_ASSIGN() {
			return getToken(JjQueryParser.RSHIFT_ASSIGN, 0);
		}

		public TerminalNode MOD_ASSIGN() {
			return getToken(JjQueryParser.MOD_ASSIGN, 0);
		}

		public TerminalNode URSHIFT_ASSIGN() {
			return getToken(JjQueryParser.URSHIFT_ASSIGN, 0);
		}

		public TerminalNode SUB_ASSIGN() {
			return getToken(JjQueryParser.SUB_ASSIGN, 0);
		}

		public TerminalNode AND_ASSIGN() {
			return getToken(JjQueryParser.AND_ASSIGN, 0);
		}

		public TerminalNode LSHIFT_ASSIGN() {
			return getToken(JjQueryParser.LSHIFT_ASSIGN, 0);
		}

		public TerminalNode XOR_ASSIGN() {
			return getToken(JjQueryParser.XOR_ASSIGN, 0);
		}

		public TerminalNode ADD_ASSIGN() {
			return getToken(JjQueryParser.ADD_ASSIGN, 0);
		}

		public AssignmentOperatorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignmentOperator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAssignmentOperator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator()
			throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(
				_ctx, getState());
		enterRule(_localctx, 430, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2644);
				_la = _input.LA(1);
				if (!(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ASSIGN - 68))
						| (1L << (ADD_ASSIGN - 68))
						| (1L << (SUB_ASSIGN - 68))
						| (1L << (MUL_ASSIGN - 68))
						| (1L << (DIV_ASSIGN - 68))
						| (1L << (AND_ASSIGN - 68))
						| (1L << (OR_ASSIGN - 68))
						| (1L << (XOR_ASSIGN - 68))
						| (1L << (MOD_ASSIGN - 68))
						| (1L << (LSHIFT_ASSIGN - 68))
						| (1L << (RSHIFT_ASSIGN - 68)) | (1L << (URSHIFT_ASSIGN - 68)))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class, 0);
		}

		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class, 0);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode QUESTION() {
			return getToken(JjQueryParser.QUESTION, 0);
		}

		public ConditionalExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_conditionalExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConditionalExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression()
			throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 432, RULE_conditionalExpression);
		try {
			setState(2653);
			switch (getInterpreter().adaptivePredict(_input, 300, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2646);
					conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2647);
					conditionalOrExpression(0);
					setState(2648);
					match(QUESTION);
					setState(2649);
					expression();
					setState(2650);
					match(COLON);
					setState(2651);
					conditionalExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends
			ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class, 0);
		}

		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class, 0);
		}

		public TerminalNode OR() {
			return getToken(JjQueryParser.OR, 0);
		}

		public ConditionalOrExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_conditionalOrExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConditionalOrExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression()
			throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(
				_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 434;
		enterRecursionRule(_localctx, 434, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2656);
					conditionalAndExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 301, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ConditionalOrExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_conditionalOrExpression);
								setState(2658);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2659);
								match(OR);
								setState(2660);
								conditionalAndExpression(0);
							}
						}
					}
					setState(2665);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 301, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends
			ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class, 0);
		}

		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class, 0);
		}

		public TerminalNode AND() {
			return getToken(JjQueryParser.AND, 0);
		}

		public ConditionalAndExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_conditionalAndExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConditionalAndExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression()
			throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(
				_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2667);
					inclusiveOrExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 302, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ConditionalAndExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_conditionalAndExpression);
								setState(2669);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2670);
								match(AND);
								setState(2671);
								inclusiveOrExpression(0);
							}
						}
					}
					setState(2676);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 302, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class, 0);
		}

		public TerminalNode BITOR() {
			return getToken(JjQueryParser.BITOR, 0);
		}

		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class, 0);
		}

		public InclusiveOrExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_inclusiveOrExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInclusiveOrExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression()
			throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(
				_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2678);
					exclusiveOrExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 303, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new InclusiveOrExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_inclusiveOrExpression);
								setState(2680);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2681);
								match(BITOR);
								setState(2682);
								exclusiveOrExpression(0);
							}
						}
					}
					setState(2687);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 303, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class, 0);
		}

		public TerminalNode CARET() {
			return getToken(JjQueryParser.CARET, 0);
		}

		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class, 0);
		}

		public ExclusiveOrExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_exclusiveOrExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterExclusiveOrExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression()
			throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(
				_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2689);
					andExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 304, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ExclusiveOrExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_exclusiveOrExpression);
								setState(2691);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2692);
								match(CARET);
								setState(2693);
								andExpression(0);
							}
						}
					}
					setState(2698);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 304, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class, 0);
		}

		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class, 0);
		}

		public TerminalNode BITAND() {
			return getToken(JjQueryParser.BITAND, 0);
		}

		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_andExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAndExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression()
			throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx,
				_parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2700);
					equalityExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 305, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new AndExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_andExpression);
								setState(2702);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2703);
								match(BITAND);
								setState(2704);
								equalityExpression(0);
							}
						}
					}
					setState(2709);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 305, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public TerminalNode EQUAL() {
			return getToken(JjQueryParser.EQUAL, 0);
		}

		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class, 0);
		}

		public TerminalNode NOTEQUAL() {
			return getToken(JjQueryParser.NOTEQUAL, 0);
		}

		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class, 0);
		}

		public EqualityExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_equalityExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterEqualityExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression()
			throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(
				_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2711);
					relationalExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 307, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(2719);
							switch (getInterpreter().adaptivePredict(_input,
									306, _ctx)) {
							case 1: {
								_localctx = new EqualityExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_equalityExpression);
								setState(2713);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 2)");
								setState(2714);
								match(EQUAL);
								setState(2715);
								relationalExpression(0);
							}
								break;
							case 2: {
								_localctx = new EqualityExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_equalityExpression);
								setState(2716);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2717);
								match(NOTEQUAL);
								setState(2718);
								relationalExpression(0);
							}
								break;
							}
						}
					}
					setState(2723);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 307, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public TerminalNode GE() {
			return getToken(JjQueryParser.GE, 0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public TerminalNode LT() {
			return getToken(JjQueryParser.LT, 0);
		}

		public TerminalNode GT() {
			return getToken(JjQueryParser.GT, 0);
		}

		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class, 0);
		}

		public TerminalNode LE() {
			return getToken(JjQueryParser.LE, 0);
		}

		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class, 0);
		}

		public TerminalNode INSTANCEOF() {
			return getToken(JjQueryParser.INSTANCEOF, 0);
		}

		public RelationalExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_relationalExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterRelationalExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression()
			throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(
				_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2725);
					shiftExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 309, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(2742);
							switch (getInterpreter().adaptivePredict(_input,
									308, _ctx)) {
							case 1: {
								_localctx = new RelationalExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_relationalExpression);
								setState(2727);
								if (!(precpred(_ctx, 5)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 5)");
								setState(2728);
								match(LT);
								setState(2729);
								shiftExpression(0);
							}
								break;
							case 2: {
								_localctx = new RelationalExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_relationalExpression);
								setState(2730);
								if (!(precpred(_ctx, 4)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 4)");
								setState(2731);
								match(GT);
								setState(2732);
								shiftExpression(0);
							}
								break;
							case 3: {
								_localctx = new RelationalExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_relationalExpression);
								setState(2733);
								if (!(precpred(_ctx, 3)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 3)");
								setState(2734);
								match(LE);
								setState(2735);
								shiftExpression(0);
							}
								break;
							case 4: {
								_localctx = new RelationalExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_relationalExpression);
								setState(2736);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 2)");
								setState(2737);
								match(GE);
								setState(2738);
								shiftExpression(0);
							}
								break;
							case 5: {
								_localctx = new RelationalExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_relationalExpression);
								setState(2739);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2740);
								match(INSTANCEOF);
								setState(2741);
								referenceType();
							}
								break;
							}
						}
					}
					setState(2746);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 309, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LT() {
			return getTokens(JjQueryParser.LT);
		}

		public List<TerminalNode> GT() {
			return getTokens(JjQueryParser.GT);
		}

		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class, 0);
		}

		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class, 0);
		}

		public TerminalNode GT(int i) {
			return getToken(JjQueryParser.GT, i);
		}

		public TerminalNode LT(int i) {
			return getToken(JjQueryParser.LT, i);
		}

		public ShiftExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_shiftExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterShiftExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression()
			throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx,
				_parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2748);
					additiveExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 311, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(2763);
							switch (getInterpreter().adaptivePredict(_input,
									310, _ctx)) {
							case 1: {
								_localctx = new ShiftExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_shiftExpression);
								setState(2750);
								if (!(precpred(_ctx, 3)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 3)");
								setState(2751);
								match(LT);
								setState(2752);
								match(LT);
								setState(2753);
								additiveExpression(0);
							}
								break;
							case 2: {
								_localctx = new ShiftExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_shiftExpression);
								setState(2754);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 2)");
								setState(2755);
								match(GT);
								setState(2756);
								match(GT);
								setState(2757);
								additiveExpression(0);
							}
								break;
							case 3: {
								_localctx = new ShiftExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_shiftExpression);
								setState(2758);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2759);
								match(GT);
								setState(2760);
								match(GT);
								setState(2761);
								match(GT);
								setState(2762);
								additiveExpression(0);
							}
								break;
							}
						}
					}
					setState(2767);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 311, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public TerminalNode SUB() {
			return getToken(JjQueryParser.SUB, 0);
		}

		public TerminalNode ADD() {
			return getToken(JjQueryParser.ADD, 0);
		}

		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class, 0);
		}

		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class, 0);
		}

		public AdditiveExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_additiveExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAdditiveExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression()
			throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(
				_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2769);
					multiplicativeExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 313, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(2777);
							switch (getInterpreter().adaptivePredict(_input,
									312, _ctx)) {
							case 1: {
								_localctx = new AdditiveExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_additiveExpression);
								setState(2771);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 2)");
								setState(2772);
								match(ADD);
								setState(2773);
								multiplicativeExpression(0);
							}
								break;
							case 2: {
								_localctx = new AdditiveExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_additiveExpression);
								setState(2774);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2775);
								match(SUB);
								setState(2776);
								multiplicativeExpression(0);
							}
								break;
							}
						}
					}
					setState(2781);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 313, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends
			ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class, 0);
		}

		public TerminalNode MOD() {
			return getToken(JjQueryParser.MOD, 0);
		}

		public TerminalNode DIV() {
			return getToken(JjQueryParser.DIV, 0);
		}

		public TerminalNode MUL() {
			return getToken(JjQueryParser.MUL, 0);
		}

		public MultiplicativeExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_multiplicativeExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterMultiplicativeExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression()
			throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(
				_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2783);
					unaryExpression();
				}
				_ctx.stop = _input.LT(-1);
				setState(2796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 315, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(2794);
							switch (getInterpreter().adaptivePredict(_input,
									314, _ctx)) {
							case 1: {
								_localctx = new MultiplicativeExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_multiplicativeExpression);
								setState(2785);
								if (!(precpred(_ctx, 3)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 3)");
								setState(2786);
								match(MUL);
								setState(2787);
								unaryExpression();
							}
								break;
							case 2: {
								_localctx = new MultiplicativeExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_multiplicativeExpression);
								setState(2788);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 2)");
								setState(2789);
								match(DIV);
								setState(2790);
								unaryExpression();
							}
								break;
							case 3: {
								_localctx = new MultiplicativeExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_multiplicativeExpression);
								setState(2791);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2792);
								match(MOD);
								setState(2793);
								unaryExpression();
							}
								break;
							}
						}
					}
					setState(2798);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 315, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public TerminalNode SUB() {
			return getToken(JjQueryParser.SUB, 0);
		}

		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class, 0);
		}

		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class, 0);
		}

		public TerminalNode ADD() {
			return getToken(JjQueryParser.ADD, 0);
		}

		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class, 0);
		}

		public UnaryExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unaryExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterUnaryExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression()
			throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx,
				getState());
		enterRule(_localctx, 454, RULE_unaryExpression);
		try {
			setState(2806);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
					setState(2799);
					preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
					setState(2800);
					preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
					setState(2801);
					match(ADD);
					setState(2802);
					unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
					setState(2803);
					match(SUB);
					setState(2804);
					unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
					setState(2805);
					unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public TerminalNode INC() {
			return getToken(JjQueryParser.INC, 0);
		}

		public PreIncrementExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_preIncrementExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPreIncrementExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPreIncrementExpression(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression()
			throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 456, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2808);
				match(INC);
				setState(2809);
				unaryExpression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() {
			return getToken(JjQueryParser.DEC, 0);
		}

		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public PreDecrementExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_preDecrementExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPreDecrementExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPreDecrementExpression(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression()
			throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 458, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2811);
				match(DEC);
				setState(2812);
				unaryExpression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends
			ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class, 0);
		}

		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class, 0);
		}

		public TerminalNode TILDE() {
			return getToken(JjQueryParser.TILDE, 0);
		}

		public TerminalNode BANG() {
			return getToken(JjQueryParser.BANG, 0);
		}

		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unaryExpressionNotPlusMinus;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnaryExpressionNotPlusMinus(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus()
			throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(
				_ctx, getState());
		enterRule(_localctx, 460, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2820);
			switch (getInterpreter().adaptivePredict(_input, 317, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2814);
					postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2815);
					match(TILDE);
					setState(2816);
					unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2817);
					match(BANG);
					setState(2818);
					unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2819);
					castExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}

		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(
				int i) {
			return getRuleContext(
					PostIncrementExpression_lf_postfixExpressionContext.class,
					i);
		}

		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(
				int i) {
			return getRuleContext(
					PostDecrementExpression_lf_postfixExpressionContext.class,
					i);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public PostfixExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_postfixExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPostfixExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression()
			throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx,
				getState());
		enterRule(_localctx, 462, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2824);
				switch (getInterpreter().adaptivePredict(_input, 318, _ctx)) {
				case 1: {
					setState(2822);
					primary();
				}
					break;
				case 2: {
					setState(2823);
					expressionName();
				}
					break;
				}
				setState(2830);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 320, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							setState(2828);
							switch (_input.LA(1)) {
							case INC: {
								setState(2826);
								postIncrementExpression_lf_postfixExpression();
							}
								break;
							case DEC: {
								setState(2827);
								postDecrementExpression_lf_postfixExpression();
							}
								break;
							default:
								throw new NoViableAltException(this);
							}
						}
					}
					setState(2832);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 320, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends
			ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class, 0);
		}

		public TerminalNode INC() {
			return getToken(JjQueryParser.INC, 0);
		}

		public PostIncrementExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_postIncrementExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPostIncrementExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPostIncrementExpression(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression()
			throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 464, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2833);
				postfixExpression();
				setState(2834);
				match(INC);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext
			extends ParserRuleContext {
		public TerminalNode INC() {
			return getToken(JjQueryParser.INC, 0);
		}

		public PostIncrementExpression_lf_postfixExpressionContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_postIncrementExpression_lf_postfixExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPostIncrementExpression_lf_postfixExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPostIncrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression()
			throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 466,
				RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2836);
				match(INC);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends
			ParserRuleContext {
		public TerminalNode DEC() {
			return getToken(JjQueryParser.DEC, 0);
		}

		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class, 0);
		}

		public PostDecrementExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_postDecrementExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPostDecrementExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPostDecrementExpression(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression()
			throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 468, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2838);
				postfixExpression();
				setState(2839);
				match(DEC);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext
			extends ParserRuleContext {
		public TerminalNode DEC() {
			return getToken(JjQueryParser.DEC, 0);
		}

		public PostDecrementExpression_lf_postfixExpressionContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_postDecrementExpression_lf_postfixExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPostDecrementExpression_lf_postfixExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPostDecrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression()
			throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 470,
				RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2841);
				match(DEC);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class, 0);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}

		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class, 0);
		}

		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class, i);
		}

		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_castExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterCastExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression()
			throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx,
				getState());
		enterRule(_localctx, 472, RULE_castExpression);
		int _la;
		try {
			setState(2870);
			switch (getInterpreter().adaptivePredict(_input, 323, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2843);
					match(LPAREN);
					setState(2844);
					primitiveType();
					setState(2845);
					match(RPAREN);
					setState(2846);
					unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2848);
					match(LPAREN);
					setState(2849);
					referenceType();
					setState(2853);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == BITAND) {
						{
							{
								setState(2850);
								additionalBound();
							}
						}
						setState(2855);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2856);
					match(RPAREN);
					setState(2857);
					unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2859);
					match(LPAREN);
					setState(2860);
					referenceType();
					setState(2864);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == BITAND) {
						{
							{
								setState(2861);
								additionalBound();
							}
						}
						setState(2866);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2867);
					match(RPAREN);
					setState(2868);
					lambdaExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JQueryContext extends ParserRuleContext {
		public TerminalNode JQBegin() {
			return getToken(JjQueryParser.JQBegin, 0);
		}

		public TerminalNode JQEnd() {
			return getToken(JjQueryParser.JQEnd, 0);
		}

		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}

		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class, i);
		}

		public JQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_jQuery;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterJQuery(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitJQuery(this);
		}
	}

	public final JQueryContext jQuery() throws RecognitionException {
		JQueryContext _localctx = new JQueryContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_jQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2872);
				match(JQBegin);
				setState(2876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == ID) {
					{
						{
							setState(2873);
							assign();
						}
					}
					setState(2878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2879);
				match(JQEnd);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(JjQueryParser.ID, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(JjQueryParser.SEMICOLON, 0);
		}

		public TerminalNode CLOSE_PARENTHESIS() {
			return getToken(JjQueryParser.CLOSE_PARENTHESIS, 0);
		}

		public TerminalNode OP() {
			return getToken(JjQueryParser.OP, 0);
		}

		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class, 0);
		}

		public List<TerminalNode> QUOTES() {
			return getTokens(JjQueryParser.QUOTES);
		}

		public TerminalNode DOLLAR() {
			return getToken(JjQueryParser.DOLLAR, 0);
		}

		public TerminalNode QUOTES(int i) {
			return getToken(JjQueryParser.QUOTES, i);
		}

		public TerminalNode OPEN_PARENTHESIS() {
			return getToken(JjQueryParser.OPEN_PARENTHESIS, 0);
		}

		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assign;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2881);
				match(ID);
				setState(2882);
				match(OP);
				setState(2883);
				match(DOLLAR);
				setState(2884);
				match(OPEN_PARENTHESIS);
				setState(2885);
				match(QUOTES);
				setState(2886);
				selector();
				setState(2887);
				match(QUOTES);
				setState(2888);
				match(CLOSE_PARENTHESIS);
				setState(2889);
				match(SEMICOLON);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public FieldSelectorContext fieldSelector() {
			return getRuleContext(FieldSelectorContext.class, 0);
		}

		public CollectionFieldSelectorContext collectionAttributeSelector() {
			return getRuleContext(CollectionFieldSelectorContext.class, 0);
		}

		public AllSelectorContext allSelector() {
			return getRuleContext(AllSelectorContext.class, 0);
		}

		public CollectionMethodSelectorContext collectionMethodSelector() {
			return getRuleContext(CollectionMethodSelectorContext.class, 0);
		}

		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_selector;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSelector(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_selector);
		try {
			setState(2895);
			switch (getInterpreter().adaptivePredict(_input, 325, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2891);
					allSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2892);
					fieldSelector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2893);
					collectionAttributeSelector();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2894);
					collectionMethodSelector();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllSelectorContext extends ParserRuleContext {
		public TerminalNode ALL_SELECTOR() {
			return getToken(JjQueryParser.ALL_SELECTOR, 0);
		}

		public AllSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_allSelector;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAllSelector(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAllSelector(this);
		}
	}

	public final AllSelectorContext allSelector() throws RecognitionException {
		AllSelectorContext _localctx = new AllSelectorContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_allSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2897);
				match(ALL_SELECTOR);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldSelectorContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(JjQueryParser.ID, 0);
		}

		public FieldSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldSelector;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFieldSelector(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFieldSelector(this);
		}
	}

	public final FieldSelectorContext fieldSelector()
			throws RecognitionException {
		FieldSelectorContext _localctx = new FieldSelectorContext(_ctx,
				getState());
		enterRule(_localctx, 482, RULE_fieldSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2899);
				match(ID);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionFieldSelectorContext extends
			ParserRuleContext {
		public List<TerminalNode> ID() {
			return getTokens(JjQueryParser.ID);
		}

		public TerminalNode OP() {
			return getToken(JjQueryParser.OP, 0);
		}

		public TerminalNode OPEN_BRACKET() {
			return getToken(JjQueryParser.OPEN_BRACKET, 0);
		}

		public List<TerminalNode> APOSTROPHE() {
			return getTokens(JjQueryParser.APOSTROPHE);
		}

		public TerminalNode APOSTROPHE(int i) {
			return getToken(JjQueryParser.APOSTROPHE, i);
		}

		public TerminalNode ID(int i) {
			return getToken(JjQueryParser.ID, i);
		}

		public TerminalNode CLOSE_BRACKET() {
			return getToken(JjQueryParser.CLOSE_BRACKET, 0);
		}

		public CollectionFieldSelectorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_collectionAttributeSelector;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterCollectionFieldSelector(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitCollectionAttributeSelector(this);
		}
	}

	public final CollectionFieldSelectorContext collectionAttributeSelector()
			throws RecognitionException {
		CollectionFieldSelectorContext _localctx = new CollectionFieldSelectorContext(
				_ctx, getState());
		enterRule(_localctx, 484, RULE_collectionAttributeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2901);
				match(ID);
				setState(2902);
				match(OPEN_BRACKET);
				setState(2903);
				match(ID);
				setState(2904);
				match(OP);
				setState(2905);
				match(APOSTROPHE);
				setState(2906);
				match(ID);
				setState(2907);
				match(APOSTROPHE);
				setState(2908);
				match(CLOSE_BRACKET);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionMethodSelectorContext extends
			ParserRuleContext {
		public List<TerminalNode> ID() {
			return getTokens(JjQueryParser.ID);
		}

		public TerminalNode CLOSE_PARENTHESIS() {
			return getToken(JjQueryParser.CLOSE_PARENTHESIS, 0);
		}

		public TerminalNode OP() {
			return getToken(JjQueryParser.OP, 0);
		}

		public TerminalNode OPEN_BRACKET() {
			return getToken(JjQueryParser.OPEN_BRACKET, 0);
		}

		public List<TerminalNode> APOSTROPHE() {
			return getTokens(JjQueryParser.APOSTROPHE);
		}

		public TerminalNode APOSTROPHE(int i) {
			return getToken(JjQueryParser.APOSTROPHE, i);
		}

		public TerminalNode ID(int i) {
			return getToken(JjQueryParser.ID, i);
		}

		public TerminalNode OPEN_PARENTHESIS() {
			return getToken(JjQueryParser.OPEN_PARENTHESIS, 0);
		}

		public TerminalNode CLOSE_BRACKET() {
			return getToken(JjQueryParser.CLOSE_BRACKET, 0);
		}

		public CollectionMethodSelectorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_collectionMethodSelector;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterCollectionMethodSelector(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitCollectionMethodSelector(this);
		}
	}

	public final CollectionMethodSelectorContext collectionMethodSelector()
			throws RecognitionException {
		CollectionMethodSelectorContext _localctx = new CollectionMethodSelectorContext(
				_ctx, getState());
		enterRule(_localctx, 486, RULE_collectionMethodSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2910);
				match(ID);
				setState(2911);
				match(OPEN_BRACKET);
				setState(2912);
				match(ID);
				setState(2913);
				match(OPEN_PARENTHESIS);
				setState(2914);
				match(CLOSE_PARENTHESIS);
				setState(2915);
				match(OP);
				setState(2916);
				match(APOSTROPHE);
				setState(2917);
				match(ID);
				setState(2918);
				match(APOSTROPHE);
				setState(2919);
				match(CLOSE_BRACKET);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return packageName_sempred((PackageNameContext) _localctx,
					predIndex);
		case 28:
			return packageOrTypeName_sempred(
					(PackageOrTypeNameContext) _localctx, predIndex);
		case 31:
			return ambiguousName_sempred((AmbiguousNameContext) _localctx,
					predIndex);
		case 217:
			return conditionalOrExpression_sempred(
					(ConditionalOrExpressionContext) _localctx, predIndex);
		case 218:
			return conditionalAndExpression_sempred(
					(ConditionalAndExpressionContext) _localctx, predIndex);
		case 219:
			return inclusiveOrExpression_sempred(
					(InclusiveOrExpressionContext) _localctx, predIndex);
		case 220:
			return exclusiveOrExpression_sempred(
					(ExclusiveOrExpressionContext) _localctx, predIndex);
		case 221:
			return andExpression_sempred((AndExpressionContext) _localctx,
					predIndex);
		case 222:
			return equalityExpression_sempred(
					(EqualityExpressionContext) _localctx, predIndex);
		case 223:
			return relationalExpression_sempred(
					(RelationalExpressionContext) _localctx, predIndex);
		case 224:
			return shiftExpression_sempred((ShiftExpressionContext) _localctx,
					predIndex);
		case 225:
			return additiveExpression_sempred(
					(AdditiveExpressionContext) _localctx, predIndex);
		case 226:
			return multiplicativeExpression_sempred(
					(MultiplicativeExpressionContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx,
			int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}

	private boolean additiveExpression_sempred(
			AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean packageOrTypeName_sempred(
			PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean inclusiveOrExpression_sempred(
			InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean relationalExpression_sempred(
			RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean conditionalAndExpression_sempred(
			ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean multiplicativeExpression_sempred(
			MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx,
			int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean andExpression_sempred(AndExpressionContext _localctx,
			int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean conditionalOrExpression_sempred(
			ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean exclusiveOrExpression_sempred(
			ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean equalityExpression_sempred(
			EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean packageName_sempred(PackageNameContext _localctx,
			int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0080\u0b6c\4\2\t"
			+ "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
			+ "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
			+ "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
			+ "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
			+ ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"
			+ "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
			+ "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"
			+ "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"
			+ "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"
			+ "`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"
			+ "k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"
			+ "w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"
			+ "\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"
			+ "\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"
			+ "\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"
			+ "\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"
			+ "\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"
			+ "\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"
			+ "\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"
			+ "\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"
			+ "\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"
			+ "\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"
			+ "\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"
			+ "\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"
			+ "\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"
			+ "\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"
			+ "\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"
			+ "\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"
			+ "\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"
			+ "\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"
			+ "\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"
			+ "\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"
			+ "\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"
			+ "\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"
			+ "\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"
			+ "\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"
			+ "\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"
			+ "\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"
			+ "\3\2\3\2\3\3\3\3\5\3\u01ef\n\3\3\4\7\4\u01f2\n\4\f\4\16\4\u01f5\13\4\3"
			+ "\4\3\4\7\4\u01f9\n\4\f\4\16\4\u01fc\13\4\3\4\5\4\u01ff\n\4\3\5\3\5\5\5"
			+ "\u0203\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b\u020c\n\b\3\t\3\t\5\t\u0210"
			+ "\n\t\3\t\3\t\7\t\u0214\n\t\f\t\16\t\u0217\13\t\3\n\7\n\u021a\n\n\f\n\16"
			+ "\n\u021d\13\n\3\n\3\n\5\n\u0221\n\n\3\n\3\n\3\n\7\n\u0226\n\n\f\n\16\n"
			+ "\u0229\13\n\3\n\3\n\5\n\u022d\n\n\5\n\u022f\n\n\3\13\3\13\7\13\u0233\n"
			+ "\13\f\13\16\13\u0236\13\13\3\13\3\13\5\13\u023a\n\13\3\f\7\f\u023d\n\f"
			+ "\f\f\16\f\u0240\13\f\3\f\3\f\5\f\u0244\n\f\3\r\3\r\3\16\3\16\3\17\3\17"
			+ "\3\20\7\20\u024d\n\20\f\20\16\20\u0250\13\20\3\20\3\20\3\21\3\21\3\21"
			+ "\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u025d\n\21\3\22\7\22\u0260\n\22\f"
			+ "\22\16\22\u0263\13\22\3\22\3\22\3\22\7\22\u0268\n\22\f\22\16\22\u026b"
			+ "\13\22\3\22\3\22\7\22\u026f\n\22\f\22\16\22\u0272\13\22\3\23\7\23\u0275"
			+ "\n\23\f\23\16\23\u0278\13\23\3\23\3\23\5\23\u027c\n\23\3\24\3\24\3\25"
			+ "\3\25\3\25\3\25\3\25\7\25\u0285\n\25\f\25\16\25\u0288\13\25\5\25\u028a"
			+ "\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0296\n\30"
			+ "\f\30\16\30\u0299\13\30\3\31\3\31\5\31\u029d\n\31\3\32\7\32\u02a0\n\32"
			+ "\f\32\16\32\u02a3\13\32\3\32\3\32\5\32\u02a7\n\32\3\33\3\33\3\33\3\33"
			+ "\5\33\u02ad\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u02b5\n\34\f\34\16"
			+ "\34\u02b8\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u02bf\n\35\3\36\3\36\3\36"
			+ "\3\36\3\36\3\36\7\36\u02c7\n\36\f\36\16\36\u02ca\13\36\3\37\3\37\3\37"
			+ "\3\37\3\37\5\37\u02d1\n\37\3 \3 \3!\3!\3!\3!\3!\3!\7!\u02db\n!\f!\16!"
			+ "\u02de\13!\3\"\5\"\u02e1\n\"\3\"\7\"\u02e4\n\"\f\"\16\"\u02e7\13\"\3\""
			+ "\7\"\u02ea\n\"\f\"\16\"\u02ed\13\"\3\"\3\"\3#\7#\u02f2\n#\f#\16#\u02f5"
			+ "\13#\3#\3#\3#\3#\7#\u02fb\n#\f#\16#\u02fe\13#\3#\3#\3$\3$\3%\3%\3%\3%"
			+ "\5%\u0308\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3("
			+ "\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\5*\u0325\n*\3+\3+\5+\u0329\n+\3,\7,\u032c"
			+ "\n,\f,\16,\u032f\13,\3,\3,\3,\5,\u0334\n,\3,\5,\u0337\n,\3,\5,\u033a\n"
			+ ",\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0346\n-\3.\3.\3.\3.\3/\3/\3/\7/\u034f"
			+ "\n/\f/\16/\u0352\13/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\7\62"
			+ "\u035d\n\62\f\62\16\62\u0360\13\62\3\63\3\63\7\63\u0364\n\63\f\63\16\63"
			+ "\u0367\13\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u036f\n\64\3\65\3\65\3"
			+ "\65\3\65\3\65\5\65\u0376\n\65\3\66\7\66\u0379\n\66\f\66\16\66\u037c\13"
			+ "\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u038a"
			+ "\n\67\38\38\38\78\u038f\n8\f8\168\u0392\138\39\39\39\59\u0397\n9\3:\3"
			+ ":\5:\u039b\n:\3;\3;\5;\u039f\n;\3<\3<\5<\u03a3\n<\3=\3=\5=\u03a7\n=\3"
			+ ">\3>\3>\5>\u03ac\n>\3?\3?\5?\u03b0\n?\3?\3?\7?\u03b4\n?\f?\16?\u03b7\13"
			+ "?\3@\3@\5@\u03bb\n@\3@\3@\3@\7@\u03c0\n@\f@\16@\u03c3\13@\3@\3@\5@\u03c7"
			+ "\n@\5@\u03c9\n@\3A\3A\7A\u03cd\nA\fA\16A\u03d0\13A\3A\3A\5A\u03d4\nA\3"
			+ "B\3B\5B\u03d8\nB\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\5"
			+ "G\u03eb\nG\3H\7H\u03ee\nH\fH\16H\u03f1\13H\3H\3H\3H\3I\3I\3I\3I\3I\3I"
			+ "\3I\3I\3I\3I\5I\u0400\nI\3J\3J\3J\5J\u0405\nJ\3J\3J\7J\u0409\nJ\fJ\16"
			+ "J\u040c\13J\3J\3J\3J\5J\u0411\nJ\5J\u0413\nJ\3K\3K\5K\u0417\nK\3L\3L\3"
			+ "L\5L\u041c\nL\3L\3L\5L\u0420\nL\3M\3M\3M\3M\3M\5M\u0427\nM\3N\3N\3N\7"
			+ "N\u042c\nN\fN\16N\u042f\13N\3N\3N\3N\7N\u0434\nN\fN\16N\u0437\13N\5N\u0439"
			+ "\nN\3O\7O\u043c\nO\fO\16O\u043f\13O\3O\3O\3O\3P\3P\5P\u0446\nP\3Q\7Q\u0449"
			+ "\nQ\fQ\16Q\u044c\13Q\3Q\3Q\7Q\u0450\nQ\fQ\16Q\u0453\13Q\3Q\3Q\3Q\3Q\5"
			+ "Q\u0459\nQ\3R\7R\u045c\nR\fR\16R\u045f\13R\3R\3R\3R\5R\u0464\nR\3R\3R"
			+ "\3S\3S\3S\3T\3T\3T\7T\u046e\nT\fT\16T\u0471\13T\3U\3U\5U\u0475\nU\3V\3"
			+ "V\5V\u0479\nV\3W\3W\3X\3X\3X\3Y\7Y\u0481\nY\fY\16Y\u0484\13Y\3Y\3Y\5Y"
			+ "\u0488\nY\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u0490\nZ\3[\5[\u0493\n[\3[\3[\3[\5[\u0498"
			+ "\n[\3[\3[\3\\\3\\\3]\3]\5]\u04a0\n]\3]\5]\u04a3\n]\3]\3]\3^\5^\u04a8\n"
			+ "^\3^\3^\3^\5^\u04ad\n^\3^\3^\3^\5^\u04b2\n^\3^\3^\3^\5^\u04b7\n^\3^\3"
			+ "^\3^\3^\3^\5^\u04be\n^\3^\3^\3^\5^\u04c3\n^\3^\3^\3^\3^\3^\3^\5^\u04cb"
			+ "\n^\3^\3^\3^\5^\u04d0\n^\3^\3^\3^\5^\u04d5\n^\3_\7_\u04d8\n_\f_\16_\u04db"
			+ "\13_\3_\3_\3_\5_\u04e0\n_\3_\3_\3`\3`\5`\u04e6\n`\3`\5`\u04e9\n`\3`\5"
			+ "`\u04ec\n`\3`\3`\3a\3a\3a\7a\u04f3\na\fa\16a\u04f6\13a\3b\7b\u04f9\nb"
			+ "\fb\16b\u04fc\13b\3b\3b\3b\5b\u0501\nb\3b\5b\u0504\nb\3b\5b\u0507\nb\3"
			+ "c\3c\3d\3d\7d\u050d\nd\fd\16d\u0510\13d\3e\3e\5e\u0514\ne\3f\7f\u0517"
			+ "\nf\ff\16f\u051a\13f\3f\3f\3f\5f\u051f\nf\3f\5f\u0522\nf\3f\3f\3g\3g\3"
			+ "g\3g\3g\3g\3g\5g\u052d\ng\3h\3h\3h\3i\3i\7i\u0534\ni\fi\16i\u0537\13i"
			+ "\3i\3i\3j\3j\3j\3j\3j\5j\u0540\nj\3k\7k\u0543\nk\fk\16k\u0546\13k\3k\3"
			+ "k\3k\3k\3l\3l\3l\3l\5l\u0550\nl\3m\7m\u0553\nm\fm\16m\u0556\13m\3m\3m"
			+ "\3m\3n\3n\3n\3n\3n\3n\5n\u0561\nn\3o\7o\u0564\no\fo\16o\u0567\13o\3o\3"
			+ "o\3o\3o\3o\3p\3p\7p\u0570\np\fp\16p\u0573\13p\3p\3p\3q\3q\3q\3q\3q\5q"
			+ "\u057c\nq\3r\7r\u057f\nr\fr\16r\u0582\13r\3r\3r\3r\3r\3r\5r\u0589\nr\3"
			+ "r\5r\u058c\nr\3r\3r\3s\3s\3s\5s\u0593\ns\3t\3t\3t\3u\3u\3u\5u\u059b\n"
			+ "u\3v\3v\3v\3v\5v\u05a1\nv\3v\3v\3w\3w\3w\7w\u05a8\nw\fw\16w\u05ab\13w"
			+ "\3x\3x\3x\3x\3y\3y\3y\5y\u05b4\ny\3z\3z\5z\u05b8\nz\3z\5z\u05bb\nz\3z"
			+ "\3z\3{\3{\3{\7{\u05c2\n{\f{\16{\u05c5\13{\3|\3|\3|\3}\3}\3}\3}\3}\3}\3"
			+ "~\3~\5~\u05d2\n~\3~\5~\u05d5\n~\3~\3~\3\177\3\177\3\177\7\177\u05dc\n"
			+ "\177\f\177\16\177\u05df\13\177\3\u0080\3\u0080\5\u0080\u05e3\n\u0080\3"
			+ "\u0080\3\u0080\3\u0081\3\u0081\7\u0081\u05e9\n\u0081\f\u0081\16\u0081"
			+ "\u05ec\13\u0081\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u05f2\n\u0082"
			+ "\3\u0083\3\u0083\3\u0083\3\u0084\7\u0084\u05f8\n\u0084\f\u0084\16\u0084"
			+ "\u05fb\13\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085"
			+ "\3\u0085\3\u0085\5\u0085\u0606\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086"
			+ "\3\u0086\5\u0086\u060d\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"
			+ "\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u061b"
			+ "\n\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a"
			+ "\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c"
			+ "\3\u008c\3\u008c\3\u008c\5\u008c\u0631\n\u008c\3\u008d\3\u008d\3\u008d"
			+ "\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"
			+ "\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"
			+ "\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"
			+ "\3\u0090\3\u0090\5\u0090\u0653\n\u0090\3\u0091\3\u0091\3\u0091\3\u0091"
			+ "\3\u0091\3\u0091\3\u0092\3\u0092\7\u0092\u065d\n\u0092\f\u0092\16\u0092"
			+ "\u0660\13\u0092\3\u0092\7\u0092\u0663\n\u0092\f\u0092\16\u0092\u0666\13"
			+ "\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\7\u0094"
			+ "\u066f\n\u0094\f\u0094\16\u0094\u0672\13\u0094\3\u0095\3\u0095\3\u0095"
			+ "\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u067e"
			+ "\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"
			+ "\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099"
			+ "\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\5\u009a\u0698"
			+ "\n\u009a\3\u009b\3\u009b\5\u009b\u069c\n\u009b\3\u009c\3\u009c\3\u009c"
			+ "\5\u009c\u06a1\n\u009c\3\u009c\3\u009c\5\u009c\u06a5\n\u009c\3\u009c\3"
			+ "\u009c\5\u009c\u06a9\n\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3"
			+ "\u009d\5\u009d\u06b1\n\u009d\3\u009d\3\u009d\5\u009d\u06b5\n\u009d\3\u009d"
			+ "\3\u009d\5\u009d\u06b9\n\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e"
			+ "\5\u009e\u06c0\n\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\7\u00a0"
			+ "\u06c7\n\u00a0\f\u00a0\16\u00a0\u06ca\13\u00a0\3\u00a1\3\u00a1\3\u00a1"
			+ "\7\u00a1\u06cf\n\u00a1\f\u00a1\16\u00a1\u06d2\13\u00a1\3\u00a1\3\u00a1"
			+ "\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\7\u00a2"
			+ "\u06de\n\u00a2\f\u00a2\16\u00a2\u06e1\13\u00a2\3\u00a2\3\u00a2\3\u00a2"
			+ "\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\5\u00a3\u06ec\n\u00a3"
			+ "\3\u00a3\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u06f2\n\u00a4\3\u00a4\3\u00a4"
			+ "\3\u00a5\3\u00a5\5\u00a5\u06f8\n\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6"
			+ "\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8"
			+ "\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u070d\n\u00a8"
			+ "\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0712\n\u00a8\3\u00a9\3\u00a9\7\u00a9"
			+ "\u0716\n\u00a9\f\u00a9\16\u00a9\u0719\13\u00a9\3\u00aa\3\u00aa\3\u00aa"
			+ "\3\u00aa\3\u00aa\3\u00aa\3\u00ab\7\u00ab\u0722\n\u00ab\f\u00ab\16\u00ab"
			+ "\u0725\13\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\7\u00ac"
			+ "\u072d\n\u00ac\f\u00ac\16\u00ac\u0730\13\u00ac\3\u00ad\3\u00ad\3\u00ad"
			+ "\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0739\n\u00ae\3\u00ae\5\u00ae"
			+ "\u073c\n\u00ae\3\u00af\3\u00af\3\u00af\5\u00af\u0741\n\u00af\3\u00af\3"
			+ "\u00af\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u0748\n\u00b0\f\u00b0\16\u00b0"
			+ "\u074b\13\u00b0\3\u00b1\7\u00b1\u074e\n\u00b1\f\u00b1\16\u00b1\u0751\13"
			+ "\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\5\u00b2"
			+ "\u075a\n\u00b2\3\u00b2\7\u00b2\u075d\n\u00b2\f\u00b2\16\u00b2\u0760\13"
			+ "\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u0766\n\u00b3\f\u00b3\16"
			+ "\u00b3\u0769\13\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"
			+ "\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"
			+ "\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u077f\n\u00b3\3\u00b4"
			+ "\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u0787\n\u00b5\f\u00b5"
			+ "\16\u00b5\u078a\13\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"
			+ "\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"
			+ "\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u079f\n\u00b5\3\u00b6\3\u00b6"
			+ "\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u07a6\n\u00b6\3\u00b7\3\u00b7\3\u00b8"
			+ "\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u07ae\n\u00b8\3\u00b9\3\u00b9\3\u00b9"
			+ "\3\u00b9\7\u00b9\u07b4\n\u00b9\f\u00b9\16\u00b9\u07b7\13\u00b9\3\u00b9"
			+ "\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u07bf\n\u00b9\f\u00b9"
			+ "\16\u00b9\u07c2\13\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"
			+ "\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"
			+ "\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u07d8\n\u00b9\3\u00ba"
			+ "\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u07e0\n\u00bb\f\u00bb"
			+ "\16\u00bb\u07e3\13\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"
			+ "\7\u00bb\u07eb\n\u00bb\f\u00bb\16\u00bb\u07ee\13\u00bb\3\u00bb\3\u00bb"
			+ "\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"
			+ "\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb"
			+ "\u0803\n\u00bb\3\u00bc\3\u00bc\5\u00bc\u0807\n\u00bc\3\u00bc\7\u00bc\u080a"
			+ "\n\u00bc\f\u00bc\16\u00bc\u080d\13\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc"
			+ "\u0812\n\u00bc\f\u00bc\16\u00bc\u0815\13\u00bc\3\u00bc\7\u00bc\u0818\n"
			+ "\u00bc\f\u00bc\16\u00bc\u081b\13\u00bc\3\u00bc\5\u00bc\u081e\n\u00bc\3"
			+ "\u00bc\3\u00bc\5\u00bc\u0822\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0826\n\u00bc"
			+ "\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u082c\n\u00bc\3\u00bc\7\u00bc"
			+ "\u082f\n\u00bc\f\u00bc\16\u00bc\u0832\13\u00bc\3\u00bc\3\u00bc\5\u00bc"
			+ "\u0836\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u083a\n\u00bc\3\u00bc\3\u00bc\5"
			+ "\u00bc\u083e\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0844\n\u00bc"
			+ "\3\u00bc\7\u00bc\u0847\n\u00bc\f\u00bc\16\u00bc\u084a\13\u00bc\3\u00bc"
			+ "\3\u00bc\5\u00bc\u084e\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0852\n\u00bc\3"
			+ "\u00bc\3\u00bc\5\u00bc\u0856\n\u00bc\5\u00bc\u0858\n\u00bc\3\u00bd\3\u00bd"
			+ "\3\u00bd\5\u00bd\u085d\n\u00bd\3\u00bd\7\u00bd\u0860\n\u00bd\f\u00bd\16"
			+ "\u00bd\u0863\13\u00bd\3\u00bd\3\u00bd\5\u00bd\u0867\n\u00bd\3\u00bd\3"
			+ "\u00bd\5\u00bd\u086b\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u086f\n\u00bd\3\u00be"
			+ "\3\u00be\5\u00be\u0873\n\u00be\3\u00be\7\u00be\u0876\n\u00be\f\u00be\16"
			+ "\u00be\u0879\13\u00be\3\u00be\3\u00be\3\u00be\7\u00be\u087e\n\u00be\f"
			+ "\u00be\16\u00be\u0881\13\u00be\3\u00be\7\u00be\u0884\n\u00be\f\u00be\16"
			+ "\u00be\u0887\13\u00be\3\u00be\5\u00be\u088a\n\u00be\3\u00be\3\u00be\5"
			+ "\u00be\u088e\n\u00be\3\u00be\3\u00be\5\u00be\u0892\n\u00be\3\u00be\3\u00be"
			+ "\3\u00be\3\u00be\5\u00be\u0898\n\u00be\3\u00be\7\u00be\u089b\n\u00be\f"
			+ "\u00be\16\u00be\u089e\13\u00be\3\u00be\3\u00be\5\u00be\u08a2\n\u00be\3"
			+ "\u00be\3\u00be\5\u00be\u08a6\n\u00be\3\u00be\3\u00be\5\u00be\u08aa\n\u00be"
			+ "\5\u00be\u08ac\n\u00be\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u08b1\n\u00bf\3"
			+ "\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"
			+ "\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u08c0\n\u00c0\3\u00c1\3\u00c1"
			+ "\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"
			+ "\3\u00c2\5\u00c2\u08ce\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"
			+ "\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u08da\n\u00c3\3\u00c3"
			+ "\3\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u08e1\n\u00c3\f\u00c3\16\u00c3"
			+ "\u08e4\13\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"
			+ "\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u08f0\n\u00c4\f\u00c4\16\u00c4\u08f3"
			+ "\13\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"
			+ "\3\u00c5\3\u00c5\5\u00c5\u08ff\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"
			+ "\3\u00c5\7\u00c5\u0906\n\u00c5\f\u00c5\16\u00c5\u0909\13\u00c5\3\u00c6"
			+ "\3\u00c6\3\u00c6\5\u00c6\u090e\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"
			+ "\3\u00c6\5\u00c6\u0915\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u091a\n"
			+ "\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0921\n\u00c6\3"
			+ "\u00c6\3\u00c6\3\u00c6\5\u00c6\u0926\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3"
			+ "\u00c6\3\u00c6\5\u00c6\u092d\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0932"
			+ "\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0939\n\u00c6"
			+ "\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u093e\n\u00c6\3\u00c6\3\u00c6\3\u00c6"
			+ "\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0946\n\u00c6\3\u00c6\3\u00c6\3\u00c6"
			+ "\5\u00c6\u094b\n\u00c6\3\u00c6\3\u00c6\5\u00c6\u094f\n\u00c6\3\u00c7\3"
			+ "\u00c7\5\u00c7\u0953\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0958\n\u00c7"
			+ "\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u095f\n\u00c8\3\u00c8"
			+ "\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0966\n\u00c8\3\u00c8\3\u00c8"
			+ "\3\u00c8\5\u00c8\u096b\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"
			+ "\5\u00c8\u0972\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0977\n\u00c8\3"
			+ "\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u097e\n\u00c8\3\u00c8\3"
			+ "\u00c8\3\u00c8\5\u00c8\u0983\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3"
			+ "\u00c8\3\u00c8\5\u00c8\u098b\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0990"
			+ "\n\u00c8\3\u00c8\3\u00c8\5\u00c8\u0994\n\u00c8\3\u00c9\3\u00c9\3\u00c9"
			+ "\7\u00c9\u0999\n\u00c9\f\u00c9\16\u00c9\u099c\13\u00c9\3\u00ca\3\u00ca"
			+ "\3\u00ca\5\u00ca\u09a1\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"
			+ "\5\u00ca\u09a8\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca"
			+ "\u09af\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09b6\n"
			+ "\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09be\n"
			+ "\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09c5\n\u00ca\3"
			+ "\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09cd\n\u00ca\3"
			+ "\u00cb\3\u00cb\5\u00cb\u09d1\n\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3"
			+ "\u00cc\5\u00cc\u09d8\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5"
			+ "\u00cc\u09df\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09e6"
			+ "\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09ee"
			+ "\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09f5\n\u00cc"
			+ "\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09fd\n\u00cc"
			+ "\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a03\n\u00cd\3\u00cd\3\u00cd"
			+ "\3\u00cd\3\u00cd\5\u00cd\u0a09\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"
			+ "\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a15\n\u00cd"
			+ "\3\u00ce\3\u00ce\7\u00ce\u0a19\n\u00ce\f\u00ce\16\u00ce\u0a1c\13\u00ce"
			+ "\3\u00cf\7\u00cf\u0a1f\n\u00cf\f\u00cf\16\u00cf\u0a22\13\u00cf\3\u00cf"
			+ "\3\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d1\3\u00d1\5\u00d1\u0a2c"
			+ "\n\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\5\u00d3"
			+ "\u0a35\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a3c\n"
			+ "\u00d3\3\u00d4\3\u00d4\3\u00d4\7\u00d4\u0a41\n\u00d4\f\u00d4\16\u00d4"
			+ "\u0a44\13\u00d4\3\u00d5\3\u00d5\5\u00d5\u0a48\n\u00d5\3\u00d6\3\u00d6"
			+ "\5\u00d6\u0a4c\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8"
			+ "\3\u00d8\5\u00d8\u0a55\n\u00d8\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da"
			+ "\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0a60\n\u00da\3\u00db\3\u00db"
			+ "\3\u00db\3\u00db\3\u00db\3\u00db\7\u00db\u0a68\n\u00db\f\u00db\16\u00db"
			+ "\u0a6b\13\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc"
			+ "\u0a73\n\u00dc\f\u00dc\16\u00dc\u0a76\13\u00dc\3\u00dd\3\u00dd\3\u00dd"
			+ "\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0a7e\n\u00dd\f\u00dd\16\u00dd\u0a81"
			+ "\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0a89"
			+ "\n\u00de\f\u00de\16\u00de\u0a8c\13\u00de\3\u00df\3\u00df\3\u00df\3\u00df"
			+ "\3\u00df\3\u00df\7\u00df\u0a94\n\u00df\f\u00df\16\u00df\u0a97\13\u00df"
			+ "\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"
			+ "\7\u00e0\u0aa2\n\u00e0\f\u00e0\16\u00e0\u0aa5\13\u00e0\3\u00e1\3\u00e1"
			+ "\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"
			+ "\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0ab9"
			+ "\n\u00e1\f\u00e1\16\u00e1\u0abc\13\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2"
			+ "\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"
			+ "\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u0ace\n\u00e2\f\u00e2\16\u00e2\u0ad1"
			+ "\13\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"
			+ "\3\u00e3\7\u00e3\u0adc\n\u00e3\f\u00e3\16\u00e3\u0adf\13\u00e3\3\u00e4"
			+ "\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"
			+ "\3\u00e4\3\u00e4\7\u00e4\u0aed\n\u00e4\f\u00e4\16\u00e4\u0af0\13\u00e4"
			+ "\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0af9"
			+ "\n\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8"
			+ "\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0b07\n\u00e8\3\u00e9\3\u00e9"
			+ "\5\u00e9\u0b0b\n\u00e9\3\u00e9\3\u00e9\7\u00e9\u0b0f\n\u00e9\f\u00e9\16"
			+ "\u00e9\u0b12\13\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00ec"
			+ "\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"
			+ "\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0b26\n\u00ee\f\u00ee\16\u00ee\u0b29"
			+ "\13\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0b31"
			+ "\n\u00ee\f\u00ee\16\u00ee\u0b34\13\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee"
			+ "\u0b39\n\u00ee\3\u00ef\3\u00ef\7\u00ef\u0b3d\n\u00ef\f\u00ef\16\u00ef"
			+ "\u0b40\13\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0"
			+ "\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1"
			+ "\5\u00f1\u0b52\n\u00f1\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f4\3\u00f4"
			+ "\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f5\3\u00f5"
			+ "\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5"
			+ "\3\u00f5\2\17\66:@\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4"
			+ "\u01c6\u00f6\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"
			+ "\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"
			+ "\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"
			+ "\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"
			+ "\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"
			+ "\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"
			+ "\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"
			+ "\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"
			+ "\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"
			+ "\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148"
			+ "\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160"
			+ "\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178"
			+ "\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190"
			+ "\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8"
			+ "\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0"
			+ "\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8"
			+ "\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\2\6\3\2\67<\7\2\t\t\f"
			+ "\f\37\37!!))\4\2\22\22\30\30\4\2FF_i\u0c5b\2\u01ea\3\2\2\2\4\u01ee\3\2"
			+ "\2\2\6\u01fe\3\2\2\2\b\u0202\3\2\2\2\n\u0204\3\2\2\2\f\u0206\3\2\2\2\16"
			+ "\u020b\3\2\2\2\20\u020f\3\2\2\2\22\u022e\3\2\2\2\24\u0230\3\2\2\2\26\u023e"
			+ "\3\2\2\2\30\u0245\3\2\2\2\32\u0247\3\2\2\2\34\u0249\3\2\2\2\36\u024e\3"
			+ "\2\2\2 \u025c\3\2\2\2\"\u0261\3\2\2\2$\u0276\3\2\2\2&\u027d\3\2\2\2(\u0289"
			+ "\3\2\2\2*\u028b\3\2\2\2,\u028e\3\2\2\2.\u0292\3\2\2\2\60\u029c\3\2\2\2"
			+ "\62\u02a1\3\2\2\2\64\u02ac\3\2\2\2\66\u02ae\3\2\2\28\u02be\3\2\2\2:\u02c0"
			+ "\3\2\2\2<\u02d0\3\2\2\2>\u02d2\3\2\2\2@\u02d4\3\2\2\2B\u02e0\3\2\2\2D"
			+ "\u02f3\3\2\2\2F\u0301\3\2\2\2H\u0307\3\2\2\2J\u0309\3\2\2\2L\u030d\3\2"
			+ "\2\2N\u0313\3\2\2\2P\u031a\3\2\2\2R\u0324\3\2\2\2T\u0328\3\2\2\2V\u032d"
			+ "\3\2\2\2X\u0345\3\2\2\2Z\u0347\3\2\2\2\\\u034b\3\2\2\2^\u0353\3\2\2\2"
			+ "`\u0356\3\2\2\2b\u0359\3\2\2\2d\u0361\3\2\2\2f\u036e\3\2\2\2h\u0375\3"
			+ "\2\2\2j\u037a\3\2\2\2l\u0389\3\2\2\2n\u038b\3\2\2\2p\u0393\3\2\2\2r\u0398"
			+ "\3\2\2\2t\u039e\3\2\2\2v\u03a2\3\2\2\2x\u03a6\3\2\2\2z\u03ab\3\2\2\2|"
			+ "\u03af\3\2\2\2~\u03c8\3\2\2\2\u0080\u03ca\3\2\2\2\u0082\u03d5\3\2\2\2"
			+ "\u0084\u03d9\3\2\2\2\u0086\u03db\3\2\2\2\u0088\u03dd\3\2\2\2\u008a\u03df"
			+ "\3\2\2\2\u008c\u03ea\3\2\2\2\u008e\u03ef\3\2\2\2\u0090\u03ff\3\2\2\2\u0092"
			+ "\u0412\3\2\2\2\u0094\u0416\3\2\2\2\u0096\u0418\3\2\2\2\u0098\u0426\3\2"
			+ "\2\2\u009a\u0438\3\2\2\2\u009c\u043d\3\2\2\2\u009e\u0445\3\2\2\2\u00a0"
			+ "\u0458\3\2\2\2\u00a2\u045d\3\2\2\2\u00a4\u0467\3\2\2\2\u00a6\u046a\3\2"
			+ "\2\2\u00a8\u0474\3\2\2\2\u00aa\u0478\3\2\2\2\u00ac\u047a\3\2\2\2\u00ae"
			+ "\u047c\3\2\2\2\u00b0\u0482\3\2\2\2\u00b2\u048f\3\2\2\2\u00b4\u0492\3\2"
			+ "\2\2\u00b6\u049b\3\2\2\2\u00b8\u049d\3\2\2\2\u00ba\u04d4\3\2\2\2\u00bc"
			+ "\u04d9\3\2\2\2\u00be\u04e3\3\2\2\2\u00c0\u04ef\3\2\2\2\u00c2\u04fa\3\2"
			+ "\2\2\u00c4\u0508\3\2\2\2\u00c6\u050a\3\2\2\2\u00c8\u0513\3\2\2\2\u00ca"
			+ "\u0518\3\2\2\2\u00cc\u052c\3\2\2\2\u00ce\u052e\3\2\2\2\u00d0\u0531\3\2"
			+ "\2\2\u00d2\u053f\3\2\2\2\u00d4\u0544\3\2\2\2\u00d6\u054f\3\2\2\2\u00d8"
			+ "\u0554\3\2\2\2\u00da\u0560\3\2\2\2\u00dc\u0565\3\2\2\2\u00de\u056d\3\2"
			+ "\2\2\u00e0\u057b\3\2\2\2\u00e2\u0580\3\2\2\2\u00e4\u0592\3\2\2\2\u00e6"
			+ "\u0594\3\2\2\2\u00e8\u059a\3\2\2\2\u00ea\u059c\3\2\2\2\u00ec\u05a4\3\2"
			+ "\2\2\u00ee\u05ac\3\2\2\2\u00f0\u05b3\3\2\2\2\u00f2\u05b5\3\2\2\2\u00f4"
			+ "\u05be\3\2\2\2\u00f6\u05c6\3\2\2\2\u00f8\u05c9\3\2\2\2\u00fa\u05cf\3\2"
			+ "\2\2\u00fc\u05d8\3\2\2\2\u00fe\u05e0\3\2\2\2\u0100\u05e6\3\2\2\2\u0102"
			+ "\u05f1\3\2\2\2\u0104\u05f3\3\2\2\2\u0106\u05f9\3\2\2\2\u0108\u0605\3\2"
			+ "\2\2\u010a\u060c\3\2\2\2\u010c\u061a\3\2\2\2\u010e\u061c\3\2\2\2\u0110"
			+ "\u061e\3\2\2\2\u0112\u0622\3\2\2\2\u0114\u0626\3\2\2\2\u0116\u0630\3\2"
			+ "\2\2\u0118\u0632\3\2\2\2\u011a\u0638\3\2\2\2\u011c\u0640\3\2\2\2\u011e"
			+ "\u0652\3\2\2\2\u0120\u0654\3\2\2\2\u0122\u065a\3\2\2\2\u0124\u0669\3\2"
			+ "\2\2\u0126\u066c\3\2\2\2\u0128\u067d\3\2\2\2\u012a\u067f\3\2\2\2\u012c"
			+ "\u0681\3\2\2\2\u012e\u0687\3\2\2\2\u0130\u068d\3\2\2\2\u0132\u0697\3\2"
			+ "\2\2\u0134\u069b\3\2\2\2\u0136\u069d\3\2\2\2\u0138\u06ad\3\2\2\2\u013a"
			+ "\u06bf\3\2\2\2\u013c\u06c1\3\2\2\2\u013e\u06c3\3\2\2\2\u0140\u06cb\3\2"
			+ "\2\2\u0142\u06da\3\2\2\2\u0144\u06e9\3\2\2\2\u0146\u06ef\3\2\2\2\u0148"
			+ "\u06f5\3\2\2\2\u014a\u06fb\3\2\2\2\u014c\u06ff\3\2\2\2\u014e\u0711\3\2"
			+ "\2\2\u0150\u0713\3\2\2\2\u0152\u071a\3\2\2\2\u0154\u0723\3\2\2\2\u0156"
			+ "\u0729\3\2\2\2\u0158\u0731\3\2\2\2\u015a\u0734\3\2\2\2\u015c\u073d\3\2"
			+ "\2\2\u015e\u0744\3\2\2\2\u0160\u074f\3\2\2\2\u0162\u0759\3\2\2\2\u0164"
			+ "\u077e\3\2\2\2\u0166\u0780\3\2\2\2\u0168\u079e\3\2\2\2\u016a\u07a5\3\2"
			+ "\2\2\u016c\u07a7\3\2\2\2\u016e\u07ad\3\2\2\2\u0170\u07d7\3\2\2\2\u0172"
			+ "\u07d9\3\2\2\2\u0174\u0802\3\2\2\2\u0176\u0857\3\2\2\2\u0178\u0859\3\2"
			+ "\2\2\u017a\u08ab\3\2\2\2\u017c\u08b0\3\2\2\2\u017e\u08bf\3\2\2\2\u0180"
			+ "\u08c1\3\2\2\2\u0182\u08cd\3\2\2\2\u0184\u08d9\3\2\2\2\u0186\u08e5\3\2"
			+ "\2\2\u0188\u08fe\3\2\2\2\u018a\u094e\3\2\2\2\u018c\u0950\3\2\2\2\u018e"
			+ "\u0993\3\2\2\2\u0190\u0995\3\2\2\2\u0192\u09cc\3\2\2\2\u0194\u09ce\3\2"
			+ "\2\2\u0196\u09fc\3\2\2\2\u0198\u0a14\3\2\2\2\u019a\u0a16\3\2\2\2\u019c"
			+ "\u0a20\3\2\2\2\u019e\u0a27\3\2\2\2\u01a0\u0a2b\3\2\2\2\u01a2\u0a2d\3\2"
			+ "\2\2\u01a4\u0a3b\3\2\2\2\u01a6\u0a3d\3\2\2\2\u01a8\u0a47\3\2\2\2\u01aa"
			+ "\u0a4b\3\2\2\2\u01ac\u0a4d\3\2\2\2\u01ae\u0a54\3\2\2\2\u01b0\u0a56\3\2"
			+ "\2\2\u01b2\u0a5f\3\2\2\2\u01b4\u0a61\3\2\2\2\u01b6\u0a6c\3\2\2\2\u01b8"
			+ "\u0a77\3\2\2\2\u01ba\u0a82\3\2\2\2\u01bc\u0a8d\3\2\2\2\u01be\u0a98\3\2"
			+ "\2\2\u01c0\u0aa6\3\2\2\2\u01c2\u0abd\3\2\2\2\u01c4\u0ad2\3\2\2\2\u01c6"
			+ "\u0ae0\3\2\2\2\u01c8\u0af8\3\2\2\2\u01ca\u0afa\3\2\2\2\u01cc\u0afd\3\2"
			+ "\2\2\u01ce\u0b06\3\2\2\2\u01d0\u0b0a\3\2\2\2\u01d2\u0b13\3\2\2\2\u01d4"
			+ "\u0b16\3\2\2\2\u01d6\u0b18\3\2\2\2\u01d8\u0b1b\3\2\2\2\u01da\u0b38\3\2"
			+ "\2\2\u01dc\u0b3a\3\2\2\2\u01de\u0b43\3\2\2\2\u01e0\u0b51\3\2\2\2\u01e2"
			+ "\u0b53\3\2\2\2\u01e4\u0b55\3\2\2\2\u01e6\u0b57\3\2\2\2\u01e8\u0b60\3\2"
			+ "\2\2\u01ea\u01eb\t\2\2\2\u01eb\3\3\2\2\2\u01ec\u01ef\5\6\4\2\u01ed\u01ef"
			+ "\5\16\b\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef\5\3\2\2\2\u01f0"
			+ "\u01f2\5\u00e8u\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1"
			+ "\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6"
			+ "\u01ff\5\b\5\2\u01f7\u01f9\5\u00e8u\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc"
			+ "\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc"
			+ "\u01fa\3\2\2\2\u01fd\u01ff\7\7\2\2\u01fe\u01f3\3\2\2\2\u01fe\u01fa\3\2"
			+ "\2\2\u01ff\7\3\2\2\2\u0200\u0203\5\n\6\2\u0201\u0203\5\f\7\2\u0202\u0200"
			+ "\3\2\2\2\u0202\u0201\3\2\2\2\u0203\t\3\2\2\2\u0204\u0205\t\3\2\2\u0205"
			+ "\13\3\2\2\2\u0206\u0207\t\4\2\2\u0207\r\3\2\2\2\u0208\u020c\5\20\t\2\u0209"
			+ "\u020c\5\36\20\2\u020a\u020c\5 \21\2\u020b\u0208\3\2\2\2\u020b\u0209\3"
			+ "\2\2\2\u020b\u020a\3\2\2\2\u020c\17\3\2\2\2\u020d\u0210\5\26\f\2\u020e"
			+ "\u0210\5\34\17\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210\u0215\3"
			+ "\2\2\2\u0211\u0214\5\24\13\2\u0212\u0214\5\32\16\2\u0213\u0211\3\2\2\2"
			+ "\u0213\u0212\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216"
			+ "\3\2\2\2\u0216\21\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021a\5\u00e8u\2\u0219"
			+ "\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2"
			+ "\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u0220\7j\2\2\u021f"
			+ "\u0221\5,\27\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u022f\3\2"
			+ "\2\2\u0222\u0223\5\20\t\2\u0223\u0227\7E\2\2\u0224\u0226\5\u00e8u\2\u0225"
			+ "\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2"
			+ "\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022c\7j\2\2\u022b"
			+ "\u022d\5,\27\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2"
			+ "\2\2\u022e\u021b\3\2\2\2\u022e\u0222\3\2\2\2\u022f\23\3\2\2\2\u0230\u0234"
			+ "\7E\2\2\u0231\u0233\5\u00e8u\2\u0232\u0231\3\2\2\2\u0233\u0236\3\2\2\2"
			+ "\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0234"
			+ "\3\2\2\2\u0237\u0239\7j\2\2\u0238\u023a\5,\27\2\u0239\u0238\3\2\2\2\u0239"
			+ "\u023a\3\2\2\2\u023a\25\3\2\2\2\u023b\u023d\5\u00e8u\2\u023c\u023b\3\2"
			+ "\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f"
			+ "\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0243\7j\2\2\u0242\u0244\5,\27"
			+ "\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\27\3\2\2\2\u0245\u0246"
			+ "\5\22\n\2\u0246\31\3\2\2\2\u0247\u0248\5\24\13\2\u0248\33\3\2\2\2\u0249"
			+ "\u024a\5\26\f\2\u024a\35\3\2\2\2\u024b\u024d\5\u00e8u\2\u024c\u024b\3"
			+ "\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f"
			+ "\u0251\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0252\7j\2\2\u0252\37\3\2\2\2"
			+ "\u0253\u0254\5\6\4\2\u0254\u0255\5\"\22\2\u0255\u025d\3\2\2\2\u0256\u0257"
			+ "\5\20\t\2\u0257\u0258\5\"\22\2\u0258\u025d\3\2\2\2\u0259\u025a\5\36\20"
			+ "\2\u025a\u025b\5\"\22\2\u025b\u025d\3\2\2\2\u025c\u0253\3\2\2\2\u025c"
			+ "\u0256\3\2\2\2\u025c\u0259\3\2\2\2\u025d!\3\2\2\2\u025e\u0260\5\u00e8"
			+ "u\2\u025f\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261"
			+ "\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0265\7A"
			+ "\2\2\u0265\u0270\7B\2\2\u0266\u0268\5\u00e8u\2\u0267\u0266\3\2\2\2\u0268"
			+ "\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2"
			+ "\2\2\u026b\u0269\3\2\2\2\u026c\u026d\7A\2\2\u026d\u026f\7B\2\2\u026e\u0269"
			+ "\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271"
			+ "#\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0275\5&\24\2\u0274\u0273\3\2\2\2"
			+ "\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279"
			+ "\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027b\7j\2\2\u027a\u027c\5(\25\2\u027b"
			+ "\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c%\3\2\2\2\u027d\u027e\5\u00e8"
			+ "u\2\u027e\'\3\2\2\2\u027f\u0280\7\25\2\2\u0280\u028a\5\36\20\2\u0281\u0282"
			+ "\7\25\2\2\u0282\u0286\5\20\t\2\u0283\u0285\5*\26\2\u0284\u0283\3\2\2\2"
			+ "\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u028a"
			+ "\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u027f\3\2\2\2\u0289\u0281\3\2\2\2\u028a"
			+ ")\3\2\2\2\u028b\u028c\7Y\2\2\u028c\u028d\5\30\r\2\u028d+\3\2\2\2\u028e"
			+ "\u028f\7H\2\2\u028f\u0290\5.\30\2\u0290\u0291\7G\2\2\u0291-\3\2\2\2\u0292"
			+ "\u0297\5\60\31\2\u0293\u0294\7D\2\2\u0294\u0296\5\60\31\2\u0295\u0293"
			+ "\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298"
			+ "/\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029d\5\16\b\2\u029b\u029d\5\62\32"
			+ "\2\u029c\u029a\3\2\2\2\u029c\u029b\3\2\2\2\u029d\61\3\2\2\2\u029e\u02a0"
			+ "\5\u00e8u\2\u029f\u029e\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2"
			+ "\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a6"
			+ "\7K\2\2\u02a5\u02a7\5\64\33\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2"
			+ "\u02a7\63\3\2\2\2\u02a8\u02a9\7\25\2\2\u02a9\u02ad\5\16\b\2\u02aa\u02ab"
			+ "\7,\2\2\u02ab\u02ad\5\16\b\2\u02ac\u02a8\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad"
			+ "\65\3\2\2\2\u02ae\u02af\b\34\1\2\u02af\u02b0\7j\2\2\u02b0\u02b6\3\2\2"
			+ "\2\u02b1\u02b2\f\3\2\2\u02b2\u02b3\7E\2\2\u02b3\u02b5\7j\2\2\u02b4\u02b1"
			+ "\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"
			+ "\67\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02bf\7j\2\2\u02ba\u02bb\5:\36\2"
			+ "\u02bb\u02bc\7E\2\2\u02bc\u02bd\7j\2\2\u02bd\u02bf\3\2\2\2\u02be\u02b9"
			+ "\3\2\2\2\u02be\u02ba\3\2\2\2\u02bf9\3\2\2\2\u02c0\u02c1\b\36\1\2\u02c1"
			+ "\u02c2\7j\2\2\u02c2\u02c8\3\2\2\2\u02c3\u02c4\f\3\2\2\u02c4\u02c5\7E\2"
			+ "\2\u02c5\u02c7\7j\2\2\u02c6\u02c3\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6"
			+ "\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9;\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb"
			+ "\u02d1\7j\2\2\u02cc\u02cd\5@!\2\u02cd\u02ce\7E\2\2\u02ce\u02cf\7j\2\2"
			+ "\u02cf\u02d1\3\2\2\2\u02d0\u02cb\3\2\2\2\u02d0\u02cc\3\2\2\2\u02d1=\3"
			+ "\2\2\2\u02d2\u02d3\7j\2\2\u02d3?\3\2\2\2\u02d4\u02d5\b!\1\2\u02d5\u02d6"
			+ "\7j\2\2\u02d6\u02dc\3\2\2\2\u02d7\u02d8\f\3\2\2\u02d8\u02d9\7E\2\2\u02d9"
			+ "\u02db\7j\2\2\u02da\u02d7\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2"
			+ "\2\2\u02dc\u02dd\3\2\2\2\u02ddA\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e1"
			+ "\5D#\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e5\3\2\2\2\u02e2"
			+ "\u02e4\5H%\2\u02e3\u02e2\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2"
			+ "\2\u02e5\u02e6\3\2\2\2\u02e6\u02eb\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02ea"
			+ "\5R*\2\u02e9\u02e8\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb"
			+ "\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02ef\7\2"
			+ "\2\3\u02efC\3\2\2\2\u02f0\u02f2\5F$\2\u02f1\u02f0\3\2\2\2\u02f2\u02f5"
			+ "\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5"
			+ "\u02f3\3\2\2\2\u02f6\u02f7\7$\2\2\u02f7\u02fc\7j\2\2\u02f8\u02f9\7E\2"
			+ "\2\u02f9\u02fb\7j\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa"
			+ "\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff"
			+ "\u0300\7C\2\2\u0300E\3\2\2\2\u0301\u0302\5\u00e8u\2\u0302G\3\2\2\2\u0303"
			+ "\u0308\5J&\2\u0304\u0308\5L\'\2\u0305\u0308\5N(\2\u0306\u0308\5P)\2\u0307"
			+ "\u0303\3\2\2\2\u0307\u0304\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0306\3\2"
			+ "\2\2\u0308I\3\2\2\2\u0309\u030a\7\35\2\2\u030a\u030b\58\35\2\u030b\u030c"
			+ "\7C\2\2\u030cK\3\2\2\2\u030d\u030e\7\35\2\2\u030e\u030f\5:\36\2\u030f"
			+ "\u0310\7E\2\2\u0310\u0311\7W\2\2\u0311\u0312\7C\2\2\u0312M\3\2\2\2\u0313"
			+ "\u0314\7\35\2\2\u0314\u0315\7*\2\2\u0315\u0316\58\35\2\u0316\u0317\7E"
			+ "\2\2\u0317\u0318\7j\2\2\u0318\u0319\7C\2\2\u0319O\3\2\2\2\u031a\u031b"
			+ "\7\35\2\2\u031b\u031c\7*\2\2\u031c\u031d\58\35\2\u031d\u031e\7E\2\2\u031e"
			+ "\u031f\7W\2\2\u031f\u0320\7C\2\2\u0320Q\3\2\2\2\u0321\u0325\5T+\2\u0322"
			+ "\u0325\5\u00c8e\2\u0323\u0325\7C\2\2\u0324\u0321\3\2\2\2\u0324\u0322\3"
			+ "\2\2\2\u0324\u0323\3\2\2\2\u0325S\3\2\2\2\u0326\u0329\5V,\2\u0327\u0329"
			+ "\5\u00bc_\2\u0328\u0326\3\2\2\2\u0328\u0327\3\2\2\2\u0329U\3\2\2\2\u032a"
			+ "\u032c\5X-\2\u032b\u032a\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2"
			+ "\2\u032d\u032e\3\2\2\2\u032e\u0330\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0331"
			+ "\7\r\2\2\u0331\u0333\7j\2\2\u0332\u0334\5Z.\2\u0333\u0332\3\2\2\2\u0333"
			+ "\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u0337\5^\60\2\u0336\u0335\3\2"
			+ "\2\2\u0336\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u033a\5`\61\2\u0339"
			+ "\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\5d"
			+ "\63\2\u033cW\3\2\2\2\u033d\u0346\5\u00e8u\2\u033e\u0346\7\'\2\2\u033f"
			+ "\u0346\7&\2\2\u0340\u0346\7%\2\2\u0341\u0346\7\5\2\2\u0342\u0346\7*\2"
			+ "\2\u0343\u0346\7\26\2\2\u0344\u0346\7+\2\2\u0345\u033d\3\2\2\2\u0345\u033e"
			+ "\3\2\2\2\u0345\u033f\3\2\2\2\u0345\u0340\3\2\2\2\u0345\u0341\3\2\2\2\u0345"
			+ "\u0342\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0344\3\2\2\2\u0346Y\3\2\2\2"
			+ "\u0347\u0348\7H\2\2\u0348\u0349\5\\/\2\u0349\u034a\7G\2\2\u034a[\3\2\2"
			+ "\2\u034b\u0350\5$\23\2\u034c\u034d\7D\2\2\u034d\u034f\5$\23\2\u034e\u034c"
			+ "\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351"
			+ "]\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0354\7\25\2\2\u0354\u0355\5\22\n"
			+ "\2\u0355_\3\2\2\2\u0356\u0357\7\34\2\2\u0357\u0358\5b\62\2\u0358a\3\2"
			+ "\2\2\u0359\u035e\5\30\r\2\u035a\u035b\7D\2\2\u035b\u035d\5\30\r\2\u035c"
			+ "\u035a\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035f\3\2"
			+ "\2\2\u035fc\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0365\7?\2\2\u0362\u0364"
			+ "\5f\64\2\u0363\u0362\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365"
			+ "\u0366\3\2\2\2\u0366\u0368\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u0369\7@"
			+ "\2\2\u0369e\3\2\2\2\u036a\u036f\5h\65\2\u036b\u036f\5\u00acW\2\u036c\u036f"
			+ "\5\u00aeX\2\u036d\u036f\5\u00b0Y\2\u036e\u036a\3\2\2\2\u036e\u036b\3\2"
			+ "\2\2\u036e\u036c\3\2\2\2\u036e\u036d\3\2\2\2\u036fg\3\2\2\2\u0370\u0376"
			+ "\5j\66\2\u0371\u0376\5\u008eH\2\u0372\u0376\5T+\2\u0373\u0376\5\u00c8"
			+ "e\2\u0374\u0376\7C\2\2\u0375\u0370\3\2\2\2\u0375\u0371\3\2\2\2\u0375\u0372"
			+ "\3\2\2\2\u0375\u0373\3\2\2\2\u0375\u0374\3\2\2\2\u0376i\3\2\2\2\u0377"
			+ "\u0379\5l\67\2\u0378\u0377\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2"
			+ "\2\2\u037a\u037b\3\2\2\2\u037b\u037d\3\2\2\2\u037c\u037a\3\2\2\2\u037d"
			+ "\u037e\5v<\2\u037e\u037f\5n8\2\u037f\u0380\7C\2\2\u0380k\3\2\2\2\u0381"
			+ "\u038a\5\u00e8u\2\u0382\u038a\7\'\2\2\u0383\u038a\7&\2\2\u0384\u038a\7"
			+ "%\2\2\u0385\u038a\7*\2\2\u0386\u038a\7\26\2\2\u0387\u038a\7\62\2\2\u0388"
			+ "\u038a\7\65\2\2\u0389\u0381\3\2\2\2\u0389\u0382\3\2\2\2\u0389\u0383\3"
			+ "\2\2\2\u0389\u0384\3\2\2\2\u0389\u0385\3\2\2\2\u0389\u0386\3\2\2\2\u0389"
			+ "\u0387\3\2\2\2\u0389\u0388\3\2\2\2\u038am\3\2\2\2\u038b\u0390\5p9\2\u038c"
			+ "\u038d\7D\2\2\u038d\u038f\5p9\2\u038e\u038c\3\2\2\2\u038f\u0392\3\2\2"
			+ "\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391o\3\2\2\2\u0392\u0390"
			+ "\3\2\2\2\u0393\u0396\5r:\2\u0394\u0395\7F\2\2\u0395\u0397\5t;\2\u0396"
			+ "\u0394\3\2\2\2\u0396\u0397\3\2\2\2\u0397q\3\2\2\2\u0398\u039a\7j\2\2\u0399"
			+ "\u039b\5\"\22\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039bs\3\2\2\2"
			+ "\u039c\u039f\5\u01a0\u00d1\2\u039d\u039f\5\u00fa~\2\u039e\u039c\3\2\2"
			+ "\2\u039e\u039d\3\2\2\2\u039fu\3\2\2\2\u03a0\u03a3\5x=\2\u03a1\u03a3\5"
			+ "z>\2\u03a2\u03a0\3\2\2\2\u03a2\u03a1\3\2\2\2\u03a3w\3\2\2\2\u03a4\u03a7"
			+ "\5\b\5\2\u03a5\u03a7\7\7\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a5\3\2\2\2\u03a7"
			+ "y\3\2\2\2\u03a8\u03ac\5|?\2\u03a9\u03ac\5\u008aF\2\u03aa\u03ac\5\u008c"
			+ "G\2\u03ab\u03a8\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03aa\3\2\2\2\u03ac"
			+ "{\3\2\2\2\u03ad\u03b0\5\u0082B\2\u03ae\u03b0\5\u0088E\2\u03af\u03ad\3"
			+ "\2\2\2\u03af\u03ae\3\2\2\2\u03b0\u03b5\3\2\2\2\u03b1\u03b4\5\u0080A\2"
			+ "\u03b2\u03b4\5\u0086D\2\u03b3\u03b1\3\2\2\2\u03b3\u03b2\3\2\2\2\u03b4"
			+ "\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6}\3\2\2\2"
			+ "\u03b7\u03b5\3\2\2\2\u03b8\u03ba\7j\2\2\u03b9\u03bb\5,\27\2\u03ba\u03b9"
			+ "\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03c9\3\2\2\2\u03bc\u03bd\5|?\2\u03bd"
			+ "\u03c1\7E\2\2\u03be\u03c0\5\u00e8u\2\u03bf\u03be\3\2\2\2\u03c0\u03c3\3"
			+ "\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3"
			+ "\u03c1\3\2\2\2\u03c4\u03c6\7j\2\2\u03c5\u03c7\5,\27\2\u03c6\u03c5\3\2"
			+ "\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8\u03b8\3\2\2\2\u03c8"
			+ "\u03bc\3\2\2\2\u03c9\177\3\2\2\2\u03ca\u03ce\7E\2\2\u03cb\u03cd\5\u00e8"
			+ "u\2\u03cc\u03cb\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce"
			+ "\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d3\7j"
			+ "\2\2\u03d2\u03d4\5,\27\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4"
			+ "\u0081\3\2\2\2\u03d5\u03d7\7j\2\2\u03d6\u03d8\5,\27\2\u03d7\u03d6\3\2"
			+ "\2\2\u03d7\u03d8\3\2\2\2\u03d8\u0083\3\2\2\2\u03d9\u03da\5~@\2\u03da\u0085"
			+ "\3\2\2\2\u03db\u03dc\5\u0080A\2\u03dc\u0087\3\2\2\2\u03dd\u03de\5\u0082"
			+ "B\2\u03de\u0089\3\2\2\2\u03df\u03e0\7j\2\2\u03e0\u008b\3\2\2\2\u03e1\u03e2"
			+ "\5x=\2\u03e2\u03e3\5\"\22\2\u03e3\u03eb\3\2\2\2\u03e4\u03e5\5|?\2\u03e5"
			+ "\u03e6\5\"\22\2\u03e6\u03eb\3\2\2\2\u03e7\u03e8\5\u008aF\2\u03e8\u03e9"
			+ "\5\"\22\2\u03e9\u03eb\3\2\2\2\u03ea\u03e1\3\2\2\2\u03ea\u03e4\3\2\2\2"
			+ "\u03ea\u03e7\3\2\2\2\u03eb\u008d\3\2\2\2\u03ec\u03ee\5\u0090I\2\u03ed"
			+ "\u03ec\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2\2\2\u03ef\u03f0\3\2"
			+ "\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u03f3\5\u0092J\2\u03f3"
			+ "\u03f4\5\u00aaV\2\u03f4\u008f\3\2\2\2\u03f5\u0400\5\u00e8u\2\u03f6\u0400"
			+ "\7\'\2\2\u03f7\u0400\7&\2\2\u03f8\u0400\7%\2\2\u03f9\u0400\7\5\2\2\u03fa"
			+ "\u0400\7*\2\2\u03fb\u0400\7\26\2\2\u03fc\u0400\7.\2\2\u03fd\u0400\7\""
			+ "\2\2\u03fe\u0400\7+\2\2\u03ff\u03f5\3\2\2\2\u03ff\u03f6\3\2\2\2\u03ff"
			+ "\u03f7\3\2\2\2\u03ff\u03f8\3\2\2\2\u03ff\u03f9\3\2\2\2\u03ff\u03fa\3\2"
			+ "\2\2\u03ff\u03fb\3\2\2\2\u03ff\u03fc\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff"
			+ "\u03fe\3\2\2\2\u0400\u0091\3\2\2\2\u0401\u0402\5\u0094K\2\u0402\u0404"
			+ "\5\u0096L\2\u0403\u0405\5\u00a4S\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2"
			+ "\2\2\u0405\u0413\3\2\2\2\u0406\u040a\5Z.\2\u0407\u0409\5\u00e8u\2\u0408"
			+ "\u0407\3\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2"
			+ "\2\2\u040b\u040d\3\2\2\2\u040c\u040a\3\2\2\2\u040d\u040e\5\u0094K\2\u040e"
			+ "\u0410\5\u0096L\2\u040f\u0411\5\u00a4S\2\u0410\u040f\3\2\2\2\u0410\u0411"
			+ "\3\2\2\2\u0411\u0413\3\2\2\2\u0412\u0401\3\2\2\2\u0412\u0406\3\2\2\2\u0413"
			+ "\u0093\3\2\2\2\u0414\u0417\5v<\2\u0415\u0417\7\64\2\2\u0416\u0414\3\2"
			+ "\2\2\u0416\u0415\3\2\2\2\u0417\u0095\3\2\2\2\u0418\u0419\7j\2\2\u0419"
			+ "\u041b\7=\2\2\u041a\u041c\5\u0098M\2\u041b\u041a\3\2\2\2\u041b\u041c\3"
			+ "\2\2\2\u041c\u041d\3\2\2\2\u041d\u041f\7>\2\2\u041e\u0420\5\"\22\2\u041f"
			+ "\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0097\3\2\2\2\u0421\u0422\5\u009a"
			+ "N\2\u0422\u0423\7D\2\2\u0423\u0424\5\u00a0Q\2\u0424\u0427\3\2\2\2\u0425"
			+ "\u0427\5\u00a0Q\2\u0426\u0421\3\2\2\2\u0426\u0425\3\2\2\2\u0427\u0099"
			+ "\3\2\2\2\u0428\u042d\5\u009cO\2\u0429\u042a\7D\2\2\u042a\u042c\5\u009c"
			+ "O\2\u042b\u0429\3\2\2\2\u042c\u042f\3\2\2\2\u042d\u042b\3\2\2\2\u042d"
			+ "\u042e\3\2\2\2\u042e\u0439\3\2\2\2\u042f\u042d\3\2\2\2\u0430\u0435\5\u00a2"
			+ "R\2\u0431\u0432\7D\2\2\u0432\u0434\5\u009cO\2\u0433\u0431\3\2\2\2\u0434"
			+ "\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0439\3\2"
			+ "\2\2\u0437\u0435\3\2\2\2\u0438\u0428\3\2\2\2\u0438\u0430\3\2\2\2\u0439"
			+ "\u009b\3\2\2\2\u043a\u043c\5\u009eP\2\u043b\u043a\3\2\2\2\u043c\u043f"
			+ "\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0440\3\2\2\2\u043f"
			+ "\u043d\3\2\2\2\u0440\u0441\5v<\2\u0441\u0442\5r:\2\u0442\u009d\3\2\2\2"
			+ "\u0443\u0446\5\u00e8u\2\u0444\u0446\7\26\2\2\u0445\u0443\3\2\2\2\u0445"
			+ "\u0444\3\2\2\2\u0446\u009f\3\2\2\2\u0447\u0449\5\u009eP\2\u0448\u0447"
			+ "\3\2\2\2\u0449\u044c\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b"
			+ "\u044d\3\2\2\2\u044c\u044a\3\2\2\2\u044d\u0451\5v<\2\u044e\u0450\5\u00e8"
			+ "u\2\u044f\u044e\3\2\2\2\u0450\u0453\3\2\2\2\u0451\u044f\3\2\2\2\u0451"
			+ "\u0452\3\2\2\2\u0452\u0454\3\2\2\2\u0453\u0451\3\2\2\2\u0454\u0455\7l"
			+ "\2\2\u0455\u0456\5r:\2\u0456\u0459\3\2\2\2\u0457\u0459\5\u009cO\2\u0458"
			+ "\u044a\3\2\2\2\u0458\u0457\3\2\2\2\u0459\u00a1\3\2\2\2\u045a\u045c\5\u00e8"
			+ "u\2\u045b\u045a\3\2\2\2\u045c\u045f\3\2\2\2\u045d\u045b\3\2\2\2\u045d"
			+ "\u045e\3\2\2\2\u045e\u0460\3\2\2\2\u045f\u045d\3\2\2\2\u0460\u0463\5v"
			+ "<\2\u0461\u0462\7j\2\2\u0462\u0464\7E\2\2\u0463\u0461\3\2\2\2\u0463\u0464"
			+ "\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\7/\2\2\u0466\u00a3\3\2\2\2\u0467"
			+ "\u0468\7\61\2\2\u0468\u0469\5\u00a6T\2\u0469\u00a5\3\2\2\2\u046a\u046f"
			+ "\5\u00a8U\2\u046b\u046c\7D\2\2\u046c\u046e\5\u00a8U\2\u046d\u046b\3\2"
			+ "\2\2\u046e\u0471\3\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470"
			+ "\u00a7\3\2\2\2\u0471\u046f\3\2\2\2\u0472\u0475\5\22\n\2\u0473\u0475\5"
			+ "\36\20\2\u0474\u0472\3\2\2\2\u0474\u0473\3\2\2\2\u0475\u00a9\3\2\2\2\u0476"
			+ "\u0479\5\u00fe\u0080\2\u0477\u0479\7C\2\2\u0478\u0476\3\2\2\2\u0478\u0477"
			+ "\3\2\2\2\u0479\u00ab\3\2\2\2\u047a\u047b\5\u00fe\u0080\2\u047b\u00ad\3"
			+ "\2\2\2\u047c\u047d\7*\2\2\u047d\u047e\5\u00fe\u0080\2\u047e\u00af\3\2"
			+ "\2\2\u047f\u0481\5\u00b2Z\2\u0480\u047f\3\2\2\2\u0481\u0484\3\2\2\2\u0482"
			+ "\u0480\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0485\3\2\2\2\u0484\u0482\3\2"
			+ "\2\2\u0485\u0487\5\u00b4[\2\u0486\u0488\5\u00a4S\2\u0487\u0486\3\2\2\2"
			+ "\u0487\u0488\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\5\u00b8]\2\u048a"
			+ "\u00b1\3\2\2\2\u048b\u0490\5\u00e8u\2\u048c\u0490\7\'\2\2\u048d\u0490"
			+ "\7&\2\2\u048e\u0490\7%\2\2\u048f\u048b\3\2\2\2\u048f\u048c\3\2\2\2\u048f"
			+ "\u048d\3\2\2\2\u048f\u048e\3\2\2\2\u0490\u00b3\3\2\2\2\u0491\u0493\5Z"
			+ ".\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\3\2\2\2\u0494"
			+ "\u0495\5\u00b6\\\2\u0495\u0497\7=\2\2\u0496\u0498\5\u0098M\2\u0497\u0496"
			+ "\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\7>\2\2\u049a"
			+ "\u00b5\3\2\2\2\u049b\u049c\7j\2\2\u049c\u00b7\3\2\2\2\u049d\u049f\7?\2"
			+ "\2\u049e\u04a0\5\u00ba^\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0"
			+ "\u04a2\3\2\2\2\u04a1\u04a3\5\u0100\u0081\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3"
			+ "\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\7@\2\2\u04a5\u00b9\3\2\2\2\u04a6"
			+ "\u04a8\5,\27\2\u04a7\u04a6\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\3\2"
			+ "\2\2\u04a9\u04aa\7/\2\2\u04aa\u04ac\7=\2\2\u04ab\u04ad\5\u0190\u00c9\2"
			+ "\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04af"
			+ "\7>\2\2\u04af\u04d5\7C\2\2\u04b0\u04b2\5,\27\2\u04b1\u04b0\3\2\2\2\u04b1"
			+ "\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\7,\2\2\u04b4\u04b6\7=\2"
			+ "\2\u04b5\u04b7\5\u0190\u00c9\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2"
			+ "\u04b7\u04b8\3\2\2\2\u04b8\u04b9\7>\2\2\u04b9\u04d5\7C\2\2\u04ba\u04bb"
			+ "\5<\37\2\u04bb\u04bd\7E\2\2\u04bc\u04be\5,\27\2\u04bd\u04bc\3\2\2\2\u04bd"
			+ "\u04be\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\7,\2\2\u04c0\u04c2\7=\2"
			+ "\2\u04c1\u04c3\5\u0190\u00c9\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2"
			+ "\u04c3\u04c4\3\2\2\2\u04c4\u04c5\7>\2\2\u04c5\u04c6\7C\2\2\u04c6\u04d5"
			+ "\3\2\2\2\u04c7\u04c8\5\u0162\u00b2\2\u04c8\u04ca\7E\2\2\u04c9\u04cb\5"
			+ ",\27\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc"
			+ "\u04cd\7,\2\2\u04cd\u04cf\7=\2\2\u04ce\u04d0\5\u0190\u00c9\2\u04cf\u04ce"
			+ "\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\7>\2\2\u04d2"
			+ "\u04d3\7C\2\2\u04d3\u04d5\3\2\2\2\u04d4\u04a7\3\2\2\2\u04d4\u04b1\3\2"
			+ "\2\2\u04d4\u04ba\3\2\2\2\u04d4\u04c7\3\2\2\2\u04d5\u00bb\3\2\2\2\u04d6"
			+ "\u04d8\5X-\2\u04d7\u04d6\3\2\2\2\u04d8\u04db\3\2\2\2\u04d9\u04d7\3\2\2"
			+ "\2\u04d9\u04da\3\2\2\2\u04da\u04dc\3\2\2\2\u04db\u04d9\3\2\2\2\u04dc\u04dd"
			+ "\7\24\2\2\u04dd\u04df\7j\2\2\u04de\u04e0\5`\61\2\u04df\u04de\3\2\2\2\u04df"
			+ "\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\5\u00be`\2\u04e2\u00bd"
			+ "\3\2\2\2\u04e3\u04e5\7?\2\2\u04e4\u04e6\5\u00c0a\2\u04e5\u04e4\3\2\2\2"
			+ "\u04e5\u04e6\3\2\2\2\u04e6\u04e8\3\2\2\2\u04e7\u04e9\7D\2\2\u04e8\u04e7"
			+ "\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04ec\5\u00c6d"
			+ "\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee"
			+ "\7@\2\2\u04ee\u00bf\3\2\2\2\u04ef\u04f4\5\u00c2b\2\u04f0\u04f1\7D\2\2"
			+ "\u04f1\u04f3\5\u00c2b\2\u04f2\u04f0\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4"
			+ "\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u00c1\3\2\2\2\u04f6\u04f4\3\2"
			+ "\2\2\u04f7\u04f9\5\u00c4c\2\u04f8\u04f7\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa"
			+ "\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04fa\3\2"
			+ "\2\2\u04fd\u0503\7j\2\2\u04fe\u0500\7=\2\2\u04ff\u0501\5\u0190\u00c9\2"
			+ "\u0500\u04ff\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504"
			+ "\7>\2\2\u0503\u04fe\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0506\3\2\2\2\u0505"
			+ "\u0507\5d\63\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u00c3\3\2"
			+ "\2\2\u0508\u0509\5\u00e8u\2\u0509\u00c5\3\2\2\2\u050a\u050e\7C\2\2\u050b"
			+ "\u050d\5f\64\2\u050c\u050b\3\2\2\2\u050d\u0510\3\2\2\2\u050e\u050c\3\2"
			+ "\2\2\u050e\u050f\3\2\2\2\u050f\u00c7\3\2\2\2\u0510\u050e\3\2\2\2\u0511"
			+ "\u0514\5\u00caf\2\u0512\u0514\5\u00dco\2\u0513\u0511\3\2\2\2\u0513\u0512"
			+ "\3\2\2\2\u0514\u00c9\3\2\2\2\u0515\u0517\5\u00ccg\2\u0516\u0515\3\2\2"
			+ "\2\u0517\u051a\3\2\2\2\u0518\u0516\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051b"
			+ "\3\2\2\2\u051a\u0518\3\2\2\2\u051b\u051c\7 \2\2\u051c\u051e\7j\2\2\u051d"
			+ "\u051f\5Z.\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0521\3\2\2"
			+ "\2\u0520\u0522\5\u00ceh\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522"
			+ "\u0523\3\2\2\2\u0523\u0524\5\u00d0i\2\u0524\u00cb\3\2\2\2\u0525\u052d"
			+ "\5\u00e8u\2\u0526\u052d\7\'\2\2\u0527\u052d\7&\2\2\u0528\u052d\7%\2\2"
			+ "\u0529\u052d\7\5\2\2\u052a\u052d\7*\2\2\u052b\u052d\7+\2\2\u052c\u0525"
			+ "\3\2\2\2\u052c\u0526\3\2\2\2\u052c\u0527\3\2\2\2\u052c\u0528\3\2\2\2\u052c"
			+ "\u0529\3\2\2\2\u052c\u052a\3\2\2\2\u052c\u052b\3\2\2\2\u052d\u00cd\3\2"
			+ "\2\2\u052e\u052f\7\25\2\2\u052f\u0530\5b\62\2\u0530\u00cf\3\2\2\2\u0531"
			+ "\u0535\7?\2\2\u0532\u0534\5\u00d2j\2\u0533\u0532\3\2\2\2\u0534\u0537\3"
			+ "\2\2\2\u0535\u0533\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0538\3\2\2\2\u0537"
			+ "\u0535\3\2\2\2\u0538\u0539\7@\2\2\u0539\u00d1\3\2\2\2\u053a\u0540\5\u00d4"
			+ "k\2\u053b\u0540\5\u00d8m\2\u053c\u0540\5T+\2\u053d\u0540\5\u00c8e\2\u053e"
			+ "\u0540\7C\2\2\u053f\u053a\3\2\2\2\u053f\u053b\3\2\2\2\u053f\u053c\3\2"
			+ "\2\2\u053f\u053d\3\2\2\2\u053f\u053e\3\2\2\2\u0540\u00d3\3\2\2\2\u0541"
			+ "\u0543\5\u00d6l\2\u0542\u0541\3\2\2\2\u0543\u0546\3\2\2\2\u0544\u0542"
			+ "\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0547\3\2\2\2\u0546\u0544\3\2\2\2\u0547"
			+ "\u0548\5v<\2\u0548\u0549\5n8\2\u0549\u054a\7C\2\2\u054a\u00d5\3\2\2\2"
			+ "\u054b\u0550\5\u00e8u\2\u054c\u0550\7\'\2\2\u054d\u0550\7*\2\2\u054e\u0550"
			+ "\7\26\2\2\u054f\u054b\3\2\2\2\u054f\u054c\3\2\2\2\u054f\u054d\3\2\2\2"
			+ "\u054f\u054e\3\2\2\2\u0550\u00d7\3\2\2\2\u0551\u0553\5\u00dan\2\u0552"
			+ "\u0551\3\2\2\2\u0553\u0556\3\2\2\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2"
			+ "\2\2\u0555\u0557\3\2\2\2\u0556\u0554\3\2\2\2\u0557\u0558\5\u0092J\2\u0558"
			+ "\u0559\5\u00aaV\2\u0559\u00d9\3\2\2\2\u055a\u0561\5\u00e8u\2\u055b\u0561"
			+ "\7\'\2\2\u055c\u0561\7\5\2\2\u055d\u0561\7\20\2\2\u055e\u0561\7*\2\2\u055f"
			+ "\u0561\7+\2\2\u0560\u055a\3\2\2\2\u0560\u055b\3\2\2\2\u0560\u055c\3\2"
			+ "\2\2\u0560\u055d\3\2\2\2\u0560\u055e\3\2\2\2\u0560\u055f\3\2\2\2\u0561"
			+ "\u00db\3\2\2\2\u0562\u0564\5\u00ccg\2\u0563\u0562\3\2\2\2\u0564\u0567"
			+ "\3\2\2\2\u0565\u0563\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0568\3\2\2\2\u0567"
			+ "\u0565\3\2\2\2\u0568\u0569\7k\2\2\u0569\u056a\7 \2\2\u056a\u056b\7j\2"
			+ "\2\u056b\u056c\5\u00dep\2\u056c\u00dd\3\2\2\2\u056d\u0571\7?\2\2\u056e"
			+ "\u0570\5\u00e0q\2\u056f\u056e\3\2\2\2\u0570\u0573\3\2\2\2\u0571\u056f"
			+ "\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\3\2\2\2\u0573\u0571\3\2\2\2\u0574"
			+ "\u0575\7@\2\2\u0575\u00df\3\2\2\2\u0576\u057c\5\u00e2r\2\u0577\u057c\5"
			+ "\u00d4k\2\u0578\u057c\5T+\2\u0579\u057c\5\u00c8e\2\u057a\u057c\7C\2\2"
			+ "\u057b\u0576\3\2\2\2\u057b\u0577\3\2\2\2\u057b\u0578\3\2\2\2\u057b\u0579"
			+ "\3\2\2\2\u057b\u057a\3\2\2\2\u057c\u00e1\3\2\2\2\u057d\u057f\5\u00e4s"
			+ "\2\u057e\u057d\3\2\2\2\u057f\u0582\3\2\2\2\u0580\u057e\3\2\2\2\u0580\u0581"
			+ "\3\2\2\2\u0581\u0583\3\2\2\2\u0582\u0580\3\2\2\2\u0583\u0584\5v<\2\u0584"
			+ "\u0585\7j\2\2\u0585\u0586\7=\2\2\u0586\u0588\7>\2\2\u0587\u0589\5\"\22"
			+ "\2\u0588\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058b\3\2\2\2\u058a\u058c"
			+ "\5\u00e6t\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\3\2\2"
			+ "\2\u058d\u058e\7C\2\2\u058e\u00e3\3\2\2\2\u058f\u0593\5\u00e8u\2\u0590"
			+ "\u0593\7\'\2\2\u0591\u0593\7\5\2\2\u0592\u058f\3\2\2\2\u0592\u0590\3\2"
			+ "\2\2\u0592\u0591\3\2\2\2\u0593\u00e5\3\2\2\2\u0594\u0595\7\20\2\2\u0595"
			+ "\u0596\5\u00f0y\2\u0596\u00e7\3\2\2\2\u0597\u059b\5\u00eav\2\u0598\u059b"
			+ "\5\u00f6|\2\u0599\u059b\5\u00f8}\2\u059a\u0597\3\2\2\2\u059a\u0598\3\2"
			+ "\2\2\u059a\u0599\3\2\2\2\u059b\u00e9\3\2\2\2\u059c\u059d\7k\2\2\u059d"
			+ "\u059e\58\35\2\u059e\u05a0\7=\2\2\u059f\u05a1\5\u00ecw\2\u05a0\u059f\3"
			+ "\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a3\7>\2\2\u05a3"
			+ "\u00eb\3\2\2\2\u05a4\u05a9\5\u00eex\2\u05a5\u05a6\7D\2\2\u05a6\u05a8\5"
			+ "\u00eex\2\u05a7\u05a5\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2"
			+ "\u05a9\u05aa\3\2\2\2\u05aa\u00ed\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ac\u05ad"
			+ "\7j\2\2\u05ad\u05ae\7F\2\2\u05ae\u05af\5\u00f0y\2\u05af\u00ef\3\2\2\2"
			+ "\u05b0\u05b4\5\u01b2\u00da\2\u05b1\u05b4\5\u00f2z\2\u05b2\u05b4\5\u00e8"
			+ "u\2\u05b3\u05b0\3\2\2\2\u05b3\u05b1\3\2\2\2\u05b3\u05b2\3\2\2\2\u05b4"
			+ "\u00f1\3\2\2\2\u05b5\u05b7\7?\2\2\u05b6\u05b8\5\u00f4{\2\u05b7\u05b6\3"
			+ "\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9\u05bb\7D\2\2\u05ba"
			+ "\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\7@"
			+ "\2\2\u05bd\u00f3\3\2\2\2\u05be\u05c3\5\u00f0y\2\u05bf\u05c0\7D\2\2\u05c0"
			+ "\u05c2\5\u00f0y\2\u05c1\u05bf\3\2\2\2\u05c2\u05c5\3\2\2\2\u05c3\u05c1"
			+ "\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u00f5\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c6"
			+ "\u05c7\7k\2\2\u05c7\u05c8\58\35\2\u05c8\u00f7\3\2\2\2\u05c9\u05ca\7k\2"
			+ "\2\u05ca\u05cb\58\35\2\u05cb\u05cc\7=\2\2\u05cc\u05cd\5\u00f0y\2\u05cd"
			+ "\u05ce\7>\2\2\u05ce\u00f9\3\2\2\2\u05cf\u05d1\7?\2\2\u05d0\u05d2\5\u00fc"
			+ "\177\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d4\3\2\2\2\u05d3"
			+ "\u05d5\7D\2\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\3\2"
			+ "\2\2\u05d6\u05d7\7@\2\2\u05d7\u00fb\3\2\2\2\u05d8\u05dd\5t;\2\u05d9\u05da"
			+ "\7D\2\2\u05da\u05dc\5t;\2\u05db\u05d9\3\2\2\2\u05dc\u05df\3\2\2\2\u05dd"
			+ "\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u00fd\3\2\2\2\u05df\u05dd\3\2"
			+ "\2\2\u05e0\u05e2\7?\2\2\u05e1\u05e3\5\u0100\u0081\2\u05e2\u05e1\3\2\2"
			+ "\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\7@\2\2\u05e5\u00ff"
			+ "\3\2\2\2\u05e6\u05ea\5\u0102\u0082\2\u05e7\u05e9\5\u0102\u0082\2\u05e8"
			+ "\u05e7\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea\u05e8\3\2\2\2\u05ea\u05eb\3\2"
			+ "\2\2\u05eb\u0101\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ed\u05f2\5\u0104\u0083"
			+ "\2\u05ee\u05f2\5T+\2\u05ef\u05f2\5\u0108\u0085\2\u05f0\u05f2\5\u01dc\u00ef"
			+ "\2\u05f1\u05ed\3\2\2\2\u05f1\u05ee\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1\u05f0"
			+ "\3\2\2\2\u05f2\u0103\3\2\2\2\u05f3\u05f4\5\u0106\u0084\2\u05f4\u05f5\7"
			+ "C\2\2\u05f5\u0105\3\2\2\2\u05f6\u05f8\5\u009eP\2\u05f7\u05f6\3\2\2\2\u05f8"
			+ "\u05fb\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fc\3\2"
			+ "\2\2\u05fb\u05f9\3\2\2\2\u05fc\u05fd\5v<\2\u05fd\u05fe\5n8\2\u05fe\u0107"
			+ "\3\2\2\2\u05ff\u0606\5\u010c\u0087\2\u0600\u0606\5\u0110\u0089\2\u0601"
			+ "\u0606\5\u0118\u008d\2\u0602\u0606\5\u011a\u008e\2\u0603\u0606\5\u012c"
			+ "\u0097\2\u0604\u0606\5\u0132\u009a\2\u0605\u05ff\3\2\2\2\u0605\u0600\3"
			+ "\2\2\2\u0605\u0601\3\2\2\2\u0605\u0602\3\2\2\2\u0605\u0603\3\2\2\2\u0605"
			+ "\u0604\3\2\2\2\u0606\u0109\3\2\2\2\u0607\u060d\5\u010c\u0087\2\u0608\u060d"
			+ "\5\u0112\u008a\2\u0609\u060d\5\u011c\u008f\2\u060a\u060d\5\u012e\u0098"
			+ "\2\u060b\u060d\5\u0134\u009b\2\u060c\u0607\3\2\2\2\u060c\u0608\3\2\2\2"
			+ "\u060c\u0609\3\2\2\2\u060c\u060a\3\2\2\2\u060c\u060b\3\2\2\2\u060d\u010b"
			+ "\3\2\2\2\u060e\u061b\5\u00fe\u0080\2\u060f\u061b\5\u010e\u0088\2\u0610"
			+ "\u061b\5\u0114\u008b\2\u0611\u061b\5\u011e\u0090\2\u0612\u061b\5\u0120"
			+ "\u0091\2\u0613\u061b\5\u0130\u0099\2\u0614\u061b\5\u0144\u00a3\2\u0615"
			+ "\u061b\5\u0146\u00a4\2\u0616\u061b\5\u0148\u00a5\2\u0617\u061b\5\u014c"
			+ "\u00a7\2\u0618\u061b\5\u014a\u00a6\2\u0619\u061b\5\u014e\u00a8\2\u061a"
			+ "\u060e\3\2\2\2\u061a\u060f\3\2\2\2\u061a\u0610\3\2\2\2\u061a\u0611\3\2"
			+ "\2\2\u061a\u0612\3\2\2\2\u061a\u0613\3\2\2\2\u061a\u0614\3\2\2\2\u061a"
			+ "\u0615\3\2\2\2\u061a\u0616\3\2\2\2\u061a\u0617\3\2\2\2\u061a\u0618\3\2"
			+ "\2\2\u061a\u0619\3\2\2\2\u061b\u010d\3\2\2\2\u061c\u061d\7C\2\2\u061d"
			+ "\u010f\3\2\2\2\u061e\u061f\7j\2\2\u061f\u0620\7L\2\2\u0620\u0621\5\u0108"
			+ "\u0085\2\u0621\u0111\3\2\2\2\u0622\u0623\7j\2\2\u0623\u0624\7L\2\2\u0624"
			+ "\u0625\5\u010a\u0086\2\u0625\u0113\3\2\2\2\u0626\u0627\5\u0116\u008c\2"
			+ "\u0627\u0628\7C\2\2\u0628\u0115\3\2\2\2\u0629\u0631\5\u01ac\u00d7\2\u062a"
			+ "\u0631\5\u01ca\u00e6\2\u062b\u0631\5\u01cc\u00e7\2\u062c\u0631\5\u01d2"
			+ "\u00ea\2\u062d\u0631\5\u01d6\u00ec\2\u062e\u0631\5\u018a\u00c6\2\u062f"
			+ "\u0631\5\u0176\u00bc\2\u0630\u0629\3\2\2\2\u0630\u062a\3\2\2\2\u0630\u062b"
			+ "\3\2\2\2\u0630\u062c\3\2\2\2\u0630\u062d\3\2\2\2\u0630\u062e\3\2\2\2\u0630"
			+ "\u062f\3\2\2\2\u0631\u0117\3\2\2\2\u0632\u0633\7\32\2\2\u0633\u0634\7"
			+ "=\2\2\u0634\u0635\5\u01a0\u00d1\2\u0635\u0636\7>\2\2\u0636\u0637\5\u0108"
			+ "\u0085\2\u0637\u0119\3\2\2\2\u0638\u0639\7\32\2\2\u0639\u063a\7=\2\2\u063a"
			+ "\u063b\5\u01a0\u00d1\2\u063b\u063c\7>\2\2\u063c\u063d\5\u010a\u0086\2"
			+ "\u063d\u063e\7\23\2\2\u063e\u063f\5\u0108\u0085\2\u063f\u011b\3\2\2\2"
			+ "\u0640\u0641\7\32\2\2\u0641\u0642\7=\2\2\u0642\u0643\5\u01a0\u00d1\2\u0643"
			+ "\u0644\7>\2\2\u0644\u0645\5\u010a\u0086\2\u0645\u0646\7\23\2\2\u0646\u0647"
			+ "\5\u010a\u0086\2\u0647\u011d\3\2\2\2\u0648\u0649\7\6\2\2\u0649\u064a\5"
			+ "\u01a0\u00d1\2\u064a\u064b\7C\2\2\u064b\u0653\3\2\2\2\u064c\u064d\7\6"
			+ "\2\2\u064d\u064e\5\u01a0\u00d1\2\u064e\u064f\7L\2\2\u064f\u0650\5\u01a0"
			+ "\u00d1\2\u0650\u0651\7C\2\2\u0651\u0653\3\2\2\2\u0652\u0648\3\2\2\2\u0652"
			+ "\u064c\3\2\2\2\u0653\u011f\3\2\2\2\u0654\u0655\7-\2\2\u0655\u0656\7=\2"
			+ "\2\u0656\u0657\5\u01a0\u00d1\2\u0657\u0658\7>\2\2\u0658\u0659\5\u0122"
			+ "\u0092\2\u0659\u0121\3\2\2\2\u065a\u065e\7?\2\2\u065b\u065d\5\u0124\u0093"
			+ "\2\u065c\u065b\3\2\2\2\u065d\u0660\3\2\2\2\u065e\u065c\3\2\2\2\u065e\u065f"
			+ "\3\2\2\2\u065f\u0664\3\2\2\2\u0660\u065e\3\2\2\2\u0661\u0663\5\u0128\u0095"
			+ "\2\u0662\u0661\3\2\2\2\u0663\u0666\3\2\2\2\u0664\u0662\3\2\2\2\u0664\u0665"
			+ "\3\2\2\2\u0665\u0667\3\2\2\2\u0666\u0664\3\2\2\2\u0667\u0668\7@\2\2\u0668"
			+ "\u0123\3\2\2\2\u0669\u066a\5\u0126\u0094\2\u066a\u066b\5\u0100\u0081\2"
			+ "\u066b\u0125\3\2\2\2\u066c\u0670\5\u0128\u0095\2\u066d\u066f\5\u0128\u0095"
			+ "\2\u066e\u066d\3\2\2\2\u066f\u0672\3\2\2\2\u0670\u066e\3\2\2\2\u0670\u0671"
			+ "\3\2\2\2\u0671\u0127\3\2\2\2\u0672\u0670\3\2\2\2\u0673\u0674\7\n\2\2\u0674"
			+ "\u0675\5\u019e\u00d0\2\u0675\u0676\7L\2\2\u0676\u067e\3\2\2\2\u0677\u0678"
			+ "\7\n\2\2\u0678\u0679\5\u012a\u0096\2\u0679\u067a\7L\2\2\u067a\u067e\3"
			+ "\2\2\2\u067b\u067c\7\20\2\2\u067c\u067e\7L\2\2\u067d\u0673\3\2\2\2\u067d"
			+ "\u0677\3\2\2\2\u067d\u067b\3\2\2\2\u067e\u0129\3\2\2\2\u067f\u0680\7j"
			+ "\2\2\u0680\u012b\3\2\2\2\u0681\u0682\7\66\2\2\u0682\u0683\7=\2\2\u0683"
			+ "\u0684\5\u01a0\u00d1\2\u0684\u0685\7>\2\2\u0685\u0686\5\u0108\u0085\2"
			+ "\u0686\u012d\3\2\2\2\u0687\u0688\7\66\2\2\u0688\u0689\7=\2\2\u0689\u068a"
			+ "\5\u01a0\u00d1\2\u068a\u068b\7>\2\2\u068b\u068c\5\u010a\u0086\2\u068c"
			+ "\u012f\3\2\2\2\u068d\u068e\7\21\2\2\u068e\u068f\5\u0108\u0085\2\u068f"
			+ "\u0690\7\66\2\2\u0690\u0691\7=\2\2\u0691\u0692\5\u01a0\u00d1\2\u0692\u0693"
			+ "\7>\2\2\u0693\u0694\7C\2\2\u0694\u0131\3\2\2\2\u0695\u0698\5\u0136\u009c"
			+ "\2\u0696\u0698\5\u0140\u00a1\2\u0697\u0695\3\2\2\2\u0697\u0696\3\2\2\2"
			+ "\u0698\u0133\3\2\2\2\u0699\u069c\5\u0138\u009d\2\u069a\u069c\5\u0142\u00a2"
			+ "\2\u069b\u0699\3\2\2\2\u069b\u069a\3\2\2\2\u069c\u0135\3\2\2\2\u069d\u069e"
			+ "\7\31\2\2\u069e\u06a0\7=\2\2\u069f\u06a1\5\u013a\u009e\2\u06a0\u069f\3"
			+ "\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a4\7C\2\2\u06a3"
			+ "\u06a5\5\u01a0\u00d1\2\u06a4\u06a3\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a6"
			+ "\3\2\2\2\u06a6\u06a8\7C\2\2\u06a7\u06a9\5\u013c\u009f\2\u06a8\u06a7\3"
			+ "\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ab\7>\2\2\u06ab"
			+ "\u06ac\5\u0108\u0085\2\u06ac\u0137\3\2\2\2\u06ad\u06ae\7\31\2\2\u06ae"
			+ "\u06b0\7=\2\2\u06af\u06b1\5\u013a\u009e\2\u06b0\u06af\3\2\2\2\u06b0\u06b1"
			+ "\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b4\7C\2\2\u06b3\u06b5\5\u01a0\u00d1"
			+ "\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b8"
			+ "\7C\2\2\u06b7\u06b9\5\u013c\u009f\2\u06b8\u06b7\3\2\2\2\u06b8\u06b9\3"
			+ "\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bb\7>\2\2\u06bb\u06bc\5\u010a\u0086"
			+ "\2\u06bc\u0139\3\2\2\2\u06bd\u06c0\5\u013e\u00a0\2\u06be\u06c0\5\u0106"
			+ "\u0084\2\u06bf\u06bd\3\2\2\2\u06bf\u06be\3\2\2\2\u06c0\u013b\3\2\2\2\u06c1"
			+ "\u06c2\5\u013e\u00a0\2\u06c2\u013d\3\2\2\2\u06c3\u06c8\5\u0116\u008c\2"
			+ "\u06c4\u06c5\7D\2\2\u06c5\u06c7\5\u0116\u008c\2\u06c6\u06c4\3\2\2\2\u06c7"
			+ "\u06ca\3\2\2\2\u06c8\u06c6\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u013f\3\2"
			+ "\2\2\u06ca\u06c8\3\2\2\2\u06cb\u06cc\7\31\2\2\u06cc\u06d0\7=\2\2\u06cd"
			+ "\u06cf\5\u009eP\2\u06ce\u06cd\3\2\2\2\u06cf\u06d2\3\2\2\2\u06d0\u06ce"
			+ "\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d3\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d3"
			+ "\u06d4\5v<\2\u06d4\u06d5\5r:\2\u06d5\u06d6\7L\2\2\u06d6\u06d7\5\u01a0"
			+ "\u00d1\2\u06d7\u06d8\7>\2\2\u06d8\u06d9\5\u0108\u0085\2\u06d9\u0141\3"
			+ "\2\2\2\u06da\u06db\7\31\2\2\u06db\u06df\7=\2\2\u06dc\u06de\5\u009eP\2"
			+ "\u06dd\u06dc\3\2\2\2\u06de\u06e1\3\2\2\2\u06df\u06dd\3\2\2\2\u06df\u06e0"
			+ "\3\2\2\2\u06e0\u06e2\3\2\2\2\u06e1\u06df\3\2\2\2\u06e2\u06e3\5v<\2\u06e3"
			+ "\u06e4\5r:\2\u06e4\u06e5\7L\2\2\u06e5\u06e6\5\u01a0\u00d1\2\u06e6\u06e7"
			+ "\7>\2\2\u06e7\u06e8\5\u010a\u0086\2\u06e8\u0143\3\2\2\2\u06e9\u06eb\7"
			+ "\b\2\2\u06ea\u06ec\7j\2\2\u06eb\u06ea\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec"
			+ "\u06ed\3\2\2\2\u06ed\u06ee\7C\2\2\u06ee\u0145\3\2\2\2\u06ef\u06f1\7\17"
			+ "\2\2\u06f0\u06f2\7j\2\2\u06f1\u06f0\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2"
			+ "\u06f3\3\2\2\2\u06f3\u06f4\7C\2\2\u06f4\u0147\3\2\2\2\u06f5\u06f7\7(\2"
			+ "\2\u06f6\u06f8\5\u01a0\u00d1\2\u06f7\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2"
			+ "\u06f8\u06f9\3\2\2\2\u06f9\u06fa\7C\2\2\u06fa\u0149\3\2\2\2\u06fb\u06fc"
			+ "\7\60\2\2\u06fc\u06fd\5\u01a0\u00d1\2\u06fd\u06fe\7C\2\2\u06fe\u014b\3"
			+ "\2\2\2\u06ff\u0700\7.\2\2\u0700\u0701\7=\2\2\u0701\u0702\5\u01a0\u00d1"
			+ "\2\u0702\u0703\7>\2\2\u0703\u0704\5\u00fe\u0080\2\u0704\u014d\3\2\2\2"
			+ "\u0705\u0706\7\63\2\2\u0706\u0707\5\u00fe\u0080\2\u0707\u0708\5\u0150"
			+ "\u00a9\2\u0708\u0712\3\2\2\2\u0709\u070a\7\63\2\2\u070a\u070c\5\u00fe"
			+ "\u0080\2\u070b\u070d\5\u0150\u00a9\2\u070c\u070b\3\2\2\2\u070c\u070d\3"
			+ "\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f\5\u0158\u00ad\2\u070f\u0712\3\2"
			+ "\2\2\u0710\u0712\5\u015a\u00ae\2\u0711\u0705\3\2\2\2\u0711\u0709\3\2\2"
			+ "\2\u0711\u0710\3\2\2\2\u0712\u014f\3\2\2\2\u0713\u0717\5\u0152\u00aa\2"
			+ "\u0714\u0716\5\u0152\u00aa\2\u0715\u0714\3\2\2\2\u0716\u0719\3\2\2\2\u0717"
			+ "\u0715\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u0151\3\2\2\2\u0719\u0717\3\2"
			+ "\2\2\u071a\u071b\7\13\2\2\u071b\u071c\7=\2\2\u071c\u071d\5\u0154\u00ab"
			+ "\2\u071d\u071e\7>\2\2\u071e\u071f\5\u00fe\u0080\2\u071f\u0153\3\2\2\2"
			+ "\u0720\u0722\5\u009eP\2\u0721\u0720\3\2\2\2\u0722\u0725\3\2\2\2\u0723"
			+ "\u0721\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0726\3\2\2\2\u0725\u0723\3\2"
			+ "\2\2\u0726\u0727\5\u0156\u00ac\2\u0727\u0728\5r:\2\u0728\u0155\3\2\2\2"
			+ "\u0729\u072e\5~@\2\u072a\u072b\7Z\2\2\u072b\u072d\5\22\n\2\u072c\u072a"
			+ "\3\2\2\2\u072d\u0730\3\2\2\2\u072e\u072c\3\2\2\2\u072e\u072f\3\2\2\2\u072f"
			+ "\u0157\3\2\2\2\u0730\u072e\3\2\2\2\u0731\u0732\7\27\2\2\u0732\u0733\5"
			+ "\u00fe\u0080\2\u0733\u0159\3\2\2\2\u0734\u0735\7\63\2\2\u0735\u0736\5"
			+ "\u015c\u00af\2\u0736\u0738\5\u00fe\u0080\2\u0737\u0739\5\u0150\u00a9\2"
			+ "\u0738\u0737\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073b\3\2\2\2\u073a\u073c"
			+ "\5\u0158\u00ad\2\u073b\u073a\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u015b\3"
			+ "\2\2\2\u073d\u073e\7=\2\2\u073e\u0740\5\u015e\u00b0\2\u073f\u0741\7C\2"
			+ "\2\u0740\u073f\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0743"
			+ "\7>\2\2\u0743\u015d\3\2\2\2\u0744\u0749\5\u0160\u00b1\2\u0745\u0746\7"
			+ "C\2\2\u0746\u0748\5\u0160\u00b1\2\u0747\u0745\3\2\2\2\u0748\u074b\3\2"
			+ "\2\2\u0749\u0747\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u015f\3\2\2\2\u074b"
			+ "\u0749\3\2\2\2\u074c\u074e\5\u009eP\2\u074d\u074c\3\2\2\2\u074e\u0751"
			+ "\3\2\2\2\u074f\u074d\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0752\3\2\2\2\u0751"
			+ "\u074f\3\2\2\2\u0752\u0753\5v<\2\u0753\u0754\5r:\2\u0754\u0755\7F\2\2"
			+ "\u0755\u0756\5\u01a0\u00d1\2\u0756\u0161\3\2\2\2\u0757\u075a\5\u0170\u00b9"
			+ "\2\u0758\u075a\5\u0198\u00cd\2\u0759\u0757\3\2\2\2\u0759\u0758\3\2\2\2"
			+ "\u075a\u075e\3\2\2\2\u075b\u075d\5\u016a\u00b6\2\u075c\u075b\3\2\2\2\u075d"
			+ "\u0760\3\2\2\2\u075e\u075c\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0163\3\2"
			+ "\2\2\u0760\u075e\3\2\2\2\u0761\u077f\5\2\2\2\u0762\u0767\58\35\2\u0763"
			+ "\u0764\7A\2\2\u0764\u0766\7B\2\2\u0765\u0763\3\2\2\2\u0766\u0769\3\2\2"
			+ "\2\u0767\u0765\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u076a\3\2\2\2\u0769\u0767"
			+ "\3\2\2\2\u076a\u076b\7E\2\2\u076b\u076c\7\r\2\2\u076c\u077f\3\2\2\2\u076d"
			+ "\u076e\7\64\2\2\u076e\u076f\7E\2\2\u076f\u077f\7\r\2\2\u0770\u077f\7/"
			+ "\2\2\u0771\u0772\58\35\2\u0772\u0773\7E\2\2\u0773\u0774\7/\2\2\u0774\u077f"
			+ "\3\2\2\2\u0775\u0776\7=\2\2\u0776\u0777\5\u01a0\u00d1\2\u0777\u0778\7"
			+ ">\2\2\u0778\u077f\3\2\2\2\u0779\u077f\5\u0176\u00bc\2\u077a\u077f\5\u017e"
			+ "\u00c0\2\u077b\u077f\5\u0184\u00c3\2\u077c\u077f\5\u018a\u00c6\2\u077d"
			+ "\u077f\5\u0192\u00ca\2\u077e\u0761\3\2\2\2\u077e\u0762\3\2\2\2\u077e\u076d"
			+ "\3\2\2\2\u077e\u0770\3\2\2\2\u077e\u0771\3\2\2\2\u077e\u0775\3\2\2\2\u077e"
			+ "\u0779\3\2\2\2\u077e\u077a\3\2\2\2\u077e\u077b\3\2\2\2\u077e\u077c\3\2"
			+ "\2\2\u077e\u077d\3\2\2\2\u077f\u0165\3\2\2\2\u0780\u0781\3\2\2\2\u0781"
			+ "\u0167\3\2\2\2\u0782\u079f\5\2\2\2\u0783\u0788\58\35\2\u0784\u0785\7A"
			+ "\2\2\u0785\u0787\7B\2\2\u0786\u0784\3\2\2\2\u0787\u078a\3\2\2\2\u0788"
			+ "\u0786\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u078b\3\2\2\2\u078a\u0788\3\2"
			+ "\2\2\u078b\u078c\7E\2\2\u078c\u078d\7\r\2\2\u078d\u079f\3\2\2\2\u078e"
			+ "\u078f\7\64\2\2\u078f\u0790\7E\2\2\u0790\u079f\7\r\2\2\u0791\u079f\7/"
			+ "\2\2\u0792\u0793\58\35\2\u0793\u0794\7E\2\2\u0794\u0795\7/\2\2\u0795\u079f"
			+ "\3\2\2\2\u0796\u0797\7=\2\2\u0797\u0798\5\u01a0\u00d1\2\u0798\u0799\7"
			+ ">\2\2\u0799\u079f\3\2\2\2\u079a\u079f\5\u0176\u00bc\2\u079b\u079f\5\u017e"
			+ "\u00c0\2\u079c\u079f\5\u018a\u00c6\2\u079d\u079f\5\u0192\u00ca\2\u079e"
			+ "\u0782\3\2\2\2\u079e\u0783\3\2\2\2\u079e\u078e\3\2\2\2\u079e\u0791\3\2"
			+ "\2\2\u079e\u0792\3\2\2\2\u079e\u0796\3\2\2\2\u079e\u079a\3\2\2\2\u079e"
			+ "\u079b\3\2\2\2\u079e\u079c\3\2\2\2\u079e\u079d\3\2\2\2\u079f\u0169\3\2"
			+ "\2\2\u07a0\u07a6\5\u0178\u00bd\2\u07a1\u07a6\5\u0180\u00c1\2\u07a2\u07a6"
			+ "\5\u0186\u00c4\2\u07a3\u07a6\5\u018c\u00c7\2\u07a4\u07a6\5\u0194\u00cb"
			+ "\2\u07a5\u07a0\3\2\2\2\u07a5\u07a1\3\2\2\2\u07a5\u07a2\3\2\2\2\u07a5\u07a3"
			+ "\3\2\2\2\u07a5\u07a4\3\2\2\2\u07a6\u016b\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8"
			+ "\u016d\3\2\2\2\u07a9\u07ae\5\u0178\u00bd\2\u07aa\u07ae\5\u0180\u00c1\2"
			+ "\u07ab\u07ae\5\u018c\u00c7\2\u07ac\u07ae\5\u0194\u00cb\2\u07ad\u07a9\3"
			+ "\2\2\2\u07ad\u07aa\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ad\u07ac\3\2\2\2\u07ae"
			+ "\u016f\3\2\2\2\u07af\u07d8\5\2\2\2\u07b0\u07b5\58\35\2\u07b1\u07b2\7A"
			+ "\2\2\u07b2\u07b4\7B\2\2\u07b3\u07b1\3\2\2\2\u07b4\u07b7\3\2\2\2\u07b5"
			+ "\u07b3\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07b8\3\2\2\2\u07b7\u07b5\3\2"
			+ "\2\2\u07b8\u07b9\7E\2\2\u07b9\u07ba\7\r\2\2\u07ba\u07d8\3\2\2\2\u07bb"
			+ "\u07c0\5x=\2\u07bc\u07bd\7A\2\2\u07bd\u07bf\7B\2\2\u07be\u07bc\3\2\2\2"
			+ "\u07bf\u07c2\3\2\2\2\u07c0\u07be\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1\u07c3"
			+ "\3\2\2\2\u07c2\u07c0\3\2\2\2\u07c3\u07c4\7E\2\2\u07c4\u07c5\7\r\2\2\u07c5"
			+ "\u07d8\3\2\2\2\u07c6\u07c7\7\64\2\2\u07c7\u07c8\7E\2\2\u07c8\u07d8\7\r"
			+ "\2\2\u07c9\u07d8\7/\2\2\u07ca\u07cb\58\35\2\u07cb\u07cc\7E\2\2\u07cc\u07cd"
			+ "\7/\2\2\u07cd\u07d8\3\2\2\2\u07ce\u07cf\7=\2\2\u07cf\u07d0\5\u01a0\u00d1"
			+ "\2\u07d0\u07d1\7>\2\2\u07d1\u07d8\3\2\2\2\u07d2\u07d8\5\u017a\u00be\2"
			+ "\u07d3\u07d8\5\u0182\u00c2\2\u07d4\u07d8\5\u0188\u00c5\2\u07d5\u07d8\5"
			+ "\u018e\u00c8\2\u07d6\u07d8\5\u0196\u00cc\2\u07d7\u07af\3\2\2\2\u07d7\u07b0"
			+ "\3\2\2\2\u07d7\u07bb\3\2\2\2\u07d7\u07c6\3\2\2\2\u07d7\u07c9\3\2\2\2\u07d7"
			+ "\u07ca\3\2\2\2\u07d7\u07ce\3\2\2\2\u07d7\u07d2\3\2\2\2\u07d7\u07d3\3\2"
			+ "\2\2\u07d7\u07d4\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d7\u07d6\3\2\2\2\u07d8"
			+ "\u0171\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u0173\3\2\2\2\u07db\u0803\5\2"
			+ "\2\2\u07dc\u07e1\58\35\2\u07dd\u07de\7A\2\2\u07de\u07e0\7B\2\2\u07df\u07dd"
			+ "\3\2\2\2\u07e0\u07e3\3\2\2\2\u07e1\u07df\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2"
			+ "\u07e4\3\2\2\2\u07e3\u07e1\3\2\2\2\u07e4\u07e5\7E\2\2\u07e5\u07e6\7\r"
			+ "\2\2\u07e6\u0803\3\2\2\2\u07e7\u07ec\5x=\2\u07e8\u07e9\7A\2\2\u07e9\u07eb"
			+ "\7B\2\2\u07ea\u07e8\3\2\2\2\u07eb\u07ee\3\2\2\2\u07ec\u07ea\3\2\2\2\u07ec"
			+ "\u07ed\3\2\2\2\u07ed\u07ef\3\2\2\2\u07ee\u07ec\3\2\2\2\u07ef\u07f0\7E"
			+ "\2\2\u07f0\u07f1\7\r\2\2\u07f1\u0803\3\2\2\2\u07f2\u07f3\7\64\2\2\u07f3"
			+ "\u07f4\7E\2\2\u07f4\u0803\7\r\2\2\u07f5\u0803\7/\2\2\u07f6\u07f7\58\35"
			+ "\2\u07f7\u07f8\7E\2\2\u07f8\u07f9\7/\2\2\u07f9\u0803\3\2\2\2\u07fa\u07fb"
			+ "\7=\2\2\u07fb\u07fc\5\u01a0\u00d1\2\u07fc\u07fd\7>\2\2\u07fd\u0803\3\2"
			+ "\2\2\u07fe\u0803\5\u017a\u00be\2\u07ff\u0803\5\u0182\u00c2\2\u0800\u0803"
			+ "\5\u018e\u00c8\2\u0801\u0803\5\u0196\u00cc\2\u0802\u07db\3\2\2\2\u0802"
			+ "\u07dc\3\2\2\2\u0802\u07e7\3\2\2\2\u0802\u07f2\3\2\2\2\u0802\u07f5\3\2"
			+ "\2\2\u0802\u07f6\3\2\2\2\u0802\u07fa\3\2\2\2\u0802\u07fe\3\2\2\2\u0802"
			+ "\u07ff\3\2\2\2\u0802\u0800\3\2\2\2\u0802\u0801\3\2\2\2\u0803\u0175\3\2"
			+ "\2\2\u0804\u0806\7#\2\2\u0805\u0807\5,\27\2\u0806\u0805\3\2\2\2\u0806"
			+ "\u0807\3\2\2\2\u0807\u080b\3\2\2\2\u0808\u080a\5\u00e8u\2\u0809\u0808"
			+ "\3\2\2\2\u080a\u080d\3\2\2\2\u080b\u0809\3\2\2\2\u080b\u080c\3\2\2\2\u080c"
			+ "\u080e\3\2\2\2\u080d\u080b\3\2\2\2\u080e\u0819\7j\2\2\u080f\u0813\7E\2"
			+ "\2\u0810\u0812\5\u00e8u\2\u0811\u0810\3\2\2\2\u0812\u0815\3\2\2\2\u0813"
			+ "\u0811\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0816\3\2\2\2\u0815\u0813\3\2"
			+ "\2\2\u0816\u0818\7j\2\2\u0817\u080f\3\2\2\2\u0818\u081b\3\2\2\2\u0819"
			+ "\u0817\3\2\2\2\u0819\u081a\3\2\2\2\u081a\u081d\3\2\2\2\u081b\u0819\3\2"
			+ "\2\2\u081c\u081e\5\u017c\u00bf\2\u081d\u081c\3\2\2\2\u081d\u081e\3\2\2"
			+ "\2\u081e\u081f\3\2\2\2\u081f\u0821\7=\2\2\u0820\u0822\5\u0190\u00c9\2"
			+ "\u0821\u0820\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0825"
			+ "\7>\2\2\u0824\u0826\5d\63\2\u0825\u0824\3\2\2\2\u0825\u0826\3\2\2\2\u0826"
			+ "\u0858\3\2\2\2\u0827\u0828\5<\37\2\u0828\u0829\7E\2\2\u0829\u082b\7#\2"
			+ "\2\u082a\u082c\5,\27\2\u082b\u082a\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u0830"
			+ "\3\2\2\2\u082d\u082f\5\u00e8u\2\u082e\u082d\3\2\2\2\u082f\u0832\3\2\2"
			+ "\2\u0830\u082e\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0833\3\2\2\2\u0832\u0830"
			+ "\3\2\2\2\u0833\u0835\7j\2\2\u0834\u0836\5\u017c\u00bf\2\u0835\u0834\3"
			+ "\2\2\2\u0835\u0836\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u0839\7=\2\2\u0838"
			+ "\u083a\5\u0190\u00c9\2\u0839\u0838\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083b"
			+ "\3\2\2\2\u083b\u083d\7>\2\2\u083c\u083e\5d\63\2\u083d\u083c\3\2\2\2\u083d"
			+ "\u083e\3\2\2\2\u083e\u0858\3\2\2\2\u083f\u0840\5\u0162\u00b2\2\u0840\u0841"
			+ "\7E\2\2\u0841\u0843\7#\2\2\u0842\u0844\5,\27\2\u0843\u0842\3\2\2\2\u0843"
			+ "\u0844\3\2\2\2\u0844\u0848\3\2\2\2\u0845\u0847\5\u00e8u\2\u0846\u0845"
			+ "\3\2\2\2\u0847\u084a\3\2\2\2\u0848\u0846\3\2\2\2\u0848\u0849\3\2\2\2\u0849"
			+ "\u084b\3\2\2\2\u084a\u0848\3\2\2\2\u084b\u084d\7j\2\2\u084c\u084e\5\u017c"
			+ "\u00bf\2\u084d\u084c\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084f\3\2\2\2\u084f"
			+ "\u0851\7=\2\2\u0850\u0852\5\u0190\u00c9\2\u0851\u0850\3\2\2\2\u0851\u0852"
			+ "\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0855\7>\2\2\u0854\u0856\5d\63\2\u0855"
			+ "\u0854\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0858\3\2\2\2\u0857\u0804\3\2"
			+ "\2\2\u0857\u0827\3\2\2\2\u0857\u083f\3\2\2\2\u0858\u0177\3\2\2\2\u0859"
			+ "\u085a\7E\2\2\u085a\u085c\7#\2\2\u085b\u085d\5,\27\2\u085c\u085b\3\2\2"
			+ "\2\u085c\u085d\3\2\2\2\u085d\u0861\3\2\2\2\u085e\u0860\5\u00e8u\2\u085f"
			+ "\u085e\3\2\2\2\u0860\u0863\3\2\2\2\u0861\u085f\3\2\2\2\u0861\u0862\3\2"
			+ "\2\2\u0862\u0864\3\2\2\2\u0863\u0861\3\2\2\2\u0864\u0866\7j\2\2\u0865"
			+ "\u0867\5\u017c\u00bf\2\u0866\u0865\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0868"
			+ "\3\2\2\2\u0868\u086a\7=\2\2\u0869\u086b\5\u0190\u00c9\2\u086a\u0869\3"
			+ "\2\2\2\u086a\u086b\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u086e\7>\2\2\u086d"
			+ "\u086f\5d\63\2\u086e\u086d\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u0179\3\2"
			+ "\2\2\u0870\u0872\7#\2\2\u0871\u0873\5,\27\2\u0872\u0871\3\2\2\2\u0872"
			+ "\u0873\3\2\2\2\u0873\u0877\3\2\2\2\u0874\u0876\5\u00e8u\2\u0875\u0874"
			+ "\3\2\2\2\u0876\u0879\3\2\2\2\u0877\u0875\3\2\2\2\u0877\u0878\3\2\2\2\u0878"
			+ "\u087a\3\2\2\2\u0879\u0877\3\2\2\2\u087a\u0885\7j\2\2\u087b\u087f\7E\2"
			+ "\2\u087c\u087e\5\u00e8u\2\u087d\u087c\3\2\2\2\u087e\u0881\3\2\2\2\u087f"
			+ "\u087d\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0882\3\2\2\2\u0881\u087f\3\2"
			+ "\2\2\u0882\u0884\7j\2\2\u0883\u087b\3\2\2\2\u0884\u0887\3\2\2\2\u0885"
			+ "\u0883\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u0889\3\2\2\2\u0887\u0885\3\2"
			+ "\2\2\u0888\u088a\5\u017c\u00bf\2\u0889\u0888\3\2\2\2\u0889\u088a\3\2\2"
			+ "\2\u088a\u088b\3\2\2\2\u088b\u088d\7=\2\2\u088c\u088e\5\u0190\u00c9\2"
			+ "\u088d\u088c\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u0891"
			+ "\7>\2\2\u0890\u0892\5d\63\2\u0891\u0890\3\2\2\2\u0891\u0892\3\2\2\2\u0892"
			+ "\u08ac\3\2\2\2\u0893\u0894\5<\37\2\u0894\u0895\7E\2\2\u0895\u0897\7#\2"
			+ "\2\u0896\u0898\5,\27\2\u0897\u0896\3\2\2\2\u0897\u0898\3\2\2\2\u0898\u089c"
			+ "\3\2\2\2\u0899\u089b\5\u00e8u\2\u089a\u0899\3\2\2\2\u089b\u089e\3\2\2"
			+ "\2\u089c\u089a\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u089f\3\2\2\2\u089e\u089c"
			+ "\3\2\2\2\u089f\u08a1\7j\2\2\u08a0\u08a2\5\u017c\u00bf\2\u08a1\u08a0\3"
			+ "\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08a5\7=\2\2\u08a4"
			+ "\u08a6\5\u0190\u00c9\2\u08a5\u08a4\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a7"
			+ "\3\2\2\2\u08a7\u08a9\7>\2\2\u08a8\u08aa\5d\63\2\u08a9\u08a8\3\2\2\2\u08a9"
			+ "\u08aa\3\2\2\2\u08aa\u08ac\3\2\2\2\u08ab\u0870\3\2\2\2\u08ab\u0893\3\2"
			+ "\2\2\u08ac\u017b\3\2\2\2\u08ad\u08b1\5,\27\2\u08ae\u08af\7H\2\2\u08af"
			+ "\u08b1\7G\2\2\u08b0\u08ad\3\2\2\2\u08b0\u08ae\3\2\2\2\u08b1\u017d\3\2"
			+ "\2\2\u08b2\u08b3\5\u0162\u00b2\2\u08b3\u08b4\7E\2\2\u08b4\u08b5\7j\2\2"
			+ "\u08b5\u08c0\3\2\2\2\u08b6\u08b7\7,\2\2\u08b7\u08b8\7E\2\2\u08b8\u08c0"
			+ "\7j\2\2\u08b9\u08ba\58\35\2\u08ba\u08bb\7E\2\2\u08bb\u08bc\7,\2\2\u08bc"
			+ "\u08bd\7E\2\2\u08bd\u08be\7j\2\2\u08be\u08c0\3\2\2\2\u08bf\u08b2\3\2\2"
			+ "\2\u08bf\u08b6\3\2\2\2\u08bf\u08b9\3\2\2\2\u08c0\u017f\3\2\2\2\u08c1\u08c2"
			+ "\7E\2\2\u08c2\u08c3\7j\2\2\u08c3\u0181\3\2\2\2\u08c4\u08c5\7,\2\2\u08c5"
			+ "\u08c6\7E\2\2\u08c6\u08ce\7j\2\2\u08c7\u08c8\58\35\2\u08c8\u08c9\7E\2"
			+ "\2\u08c9\u08ca\7,\2\2\u08ca\u08cb\7E\2\2\u08cb\u08cc\7j\2\2\u08cc\u08ce"
			+ "\3\2\2\2\u08cd\u08c4\3\2\2\2\u08cd\u08c7\3\2\2\2\u08ce\u0183\3\2\2\2\u08cf"
			+ "\u08d0\5<\37\2\u08d0\u08d1\7A\2\2\u08d1\u08d2\5\u01a0\u00d1\2\u08d2\u08d3"
			+ "\7B\2\2\u08d3\u08da\3\2\2\2\u08d4\u08d5\5\u0168\u00b5\2\u08d5\u08d6\7"
			+ "A\2\2\u08d6\u08d7\5\u01a0\u00d1\2\u08d7\u08d8\7B\2\2\u08d8\u08da\3\2\2"
			+ "\2\u08d9\u08cf\3\2\2\2\u08d9\u08d4\3\2\2\2\u08da\u08e2\3\2\2\2\u08db\u08dc"
			+ "\5\u0166\u00b4\2\u08dc\u08dd\7A\2\2\u08dd\u08de\5\u01a0\u00d1\2\u08de"
			+ "\u08df\7B\2\2\u08df\u08e1\3\2\2\2\u08e0\u08db\3\2\2\2\u08e1\u08e4\3\2"
			+ "\2\2\u08e2\u08e0\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3\u0185\3\2\2\2\u08e4"
			+ "\u08e2\3\2\2\2\u08e5\u08e6\5\u016e\u00b8\2\u08e6\u08e7\7A\2\2\u08e7\u08e8"
			+ "\5\u01a0\u00d1\2\u08e8\u08e9\7B\2\2\u08e9\u08f1\3\2\2\2\u08ea\u08eb\5"
			+ "\u016c\u00b7\2\u08eb\u08ec\7A\2\2\u08ec\u08ed\5\u01a0\u00d1\2\u08ed\u08ee"
			+ "\7B\2\2\u08ee\u08f0\3\2\2\2\u08ef\u08ea\3\2\2\2\u08f0\u08f3\3\2\2\2\u08f1"
			+ "\u08ef\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2\u0187\3\2\2\2\u08f3\u08f1\3\2"
			+ "\2\2\u08f4\u08f5\5<\37\2\u08f5\u08f6\7A\2\2\u08f6\u08f7\5\u01a0\u00d1"
			+ "\2\u08f7\u08f8\7B\2\2\u08f8\u08ff\3\2\2\2\u08f9\u08fa\5\u0174\u00bb\2"
			+ "\u08fa\u08fb\7A\2\2\u08fb\u08fc\5\u01a0\u00d1\2\u08fc\u08fd\7B\2\2\u08fd"
			+ "\u08ff\3\2\2\2\u08fe\u08f4\3\2\2\2\u08fe\u08f9\3\2\2\2\u08ff\u0907\3\2"
			+ "\2\2\u0900\u0901\5\u0172\u00ba\2\u0901\u0902\7A\2\2\u0902\u0903\5\u01a0"
			+ "\u00d1\2\u0903\u0904\7B\2\2\u0904\u0906\3\2\2\2\u0905\u0900\3\2\2\2\u0906"
			+ "\u0909\3\2\2\2\u0907\u0905\3\2\2\2\u0907\u0908\3\2\2\2\u0908\u0189\3\2"
			+ "\2\2\u0909\u0907\3\2\2\2\u090a\u090b\5> \2\u090b\u090d\7=\2\2\u090c\u090e"
			+ "\5\u0190\u00c9\2\u090d\u090c\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u090f\3"
			+ "\2\2\2\u090f\u0910\7>\2\2\u0910\u094f\3\2\2\2\u0911\u0912\58\35\2\u0912"
			+ "\u0914\7E\2\2\u0913\u0915\5,\27\2\u0914\u0913\3\2\2\2\u0914\u0915\3\2"
			+ "\2\2\u0915\u0916\3\2\2\2\u0916\u0917\7j\2\2\u0917\u0919\7=\2\2\u0918\u091a"
			+ "\5\u0190\u00c9\2\u0919\u0918\3\2\2\2\u0919\u091a\3\2\2\2\u091a\u091b\3"
			+ "\2\2\2\u091b\u091c\7>\2\2\u091c\u094f\3\2\2\2\u091d\u091e\5<\37\2\u091e"
			+ "\u0920\7E\2\2\u091f\u0921\5,\27\2\u0920\u091f\3\2\2\2\u0920\u0921\3\2"
			+ "\2\2\u0921\u0922\3\2\2\2\u0922\u0923\7j\2\2\u0923\u0925\7=\2\2\u0924\u0926"
			+ "\5\u0190\u00c9\2\u0925\u0924\3\2\2\2\u0925\u0926\3\2\2\2\u0926\u0927\3"
			+ "\2\2\2\u0927\u0928\7>\2\2\u0928\u094f\3\2\2\2\u0929\u092a\5\u0162\u00b2"
			+ "\2\u092a\u092c\7E\2\2\u092b\u092d\5,\27\2\u092c\u092b\3\2\2\2\u092c\u092d"
			+ "\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u092f\7j\2\2\u092f\u0931\7=\2\2\u0930"
			+ "\u0932\5\u0190\u00c9\2\u0931\u0930\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0933"
			+ "\3\2\2\2\u0933\u0934\7>\2\2\u0934\u094f\3\2\2\2\u0935\u0936\7,\2\2\u0936"
			+ "\u0938\7E\2\2\u0937\u0939\5,\27\2\u0938\u0937\3\2\2\2\u0938\u0939\3\2"
			+ "\2\2\u0939\u093a\3\2\2\2\u093a\u093b\7j\2\2\u093b\u093d\7=\2\2\u093c\u093e"
			+ "\5\u0190\u00c9\2\u093d\u093c\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u093f\3"
			+ "\2\2\2\u093f\u094f\7>\2\2\u0940\u0941\58\35\2\u0941\u0942\7E\2\2\u0942"
			+ "\u0943\7,\2\2\u0943\u0945\7E\2\2\u0944\u0946\5,\27\2\u0945\u0944\3\2\2"
			+ "\2\u0945\u0946\3\2\2\2\u0946\u0947\3\2\2\2\u0947\u0948\7j\2\2\u0948\u094a"
			+ "\7=\2\2\u0949\u094b\5\u0190\u00c9\2\u094a\u0949\3\2\2\2\u094a\u094b\3"
			+ "\2\2\2\u094b\u094c\3\2\2\2\u094c\u094d\7>\2\2\u094d\u094f\3\2\2\2\u094e"
			+ "\u090a\3\2\2\2\u094e\u0911\3\2\2\2\u094e\u091d\3\2\2\2\u094e\u0929\3\2"
			+ "\2\2\u094e\u0935\3\2\2\2\u094e\u0940\3\2\2\2\u094f\u018b\3\2\2\2\u0950"
			+ "\u0952\7E\2\2\u0951\u0953\5,\27\2\u0952\u0951\3\2\2\2\u0952\u0953\3\2"
			+ "\2\2\u0953\u0954\3\2\2\2\u0954\u0955\7j\2\2\u0955\u0957\7=\2\2\u0956\u0958"
			+ "\5\u0190\u00c9\2\u0957\u0956\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u0959\3"
			+ "\2\2\2\u0959\u095a\7>\2\2\u095a\u018d\3\2\2\2\u095b\u095c\5> \2\u095c"
			+ "\u095e\7=\2\2\u095d\u095f\5\u0190\u00c9\2\u095e\u095d\3\2\2\2\u095e\u095f"
			+ "\3\2";
	private static final String _serializedATNSegment1 = "\2\2\u095f\u0960\3\2\2\2\u0960\u0961\7>\2\2\u0961\u0994\3\2\2\2\u0962"
			+ "\u0963\58\35\2\u0963\u0965\7E\2\2\u0964\u0966\5,\27\2\u0965\u0964\3\2"
			+ "\2\2\u0965\u0966\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0968\7j\2\2\u0968"
			+ "\u096a\7=\2\2\u0969\u096b\5\u0190\u00c9\2\u096a\u0969\3\2\2\2\u096a\u096b"
			+ "\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096d\7>\2\2\u096d\u0994\3\2\2\2\u096e"
			+ "\u096f\5<\37\2\u096f\u0971\7E\2\2\u0970\u0972\5,\27\2\u0971\u0970\3\2"
			+ "\2\2\u0971\u0972\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u0974\7j\2\2\u0974"
			+ "\u0976\7=\2\2\u0975\u0977\5\u0190\u00c9\2\u0976\u0975\3\2\2\2\u0976\u0977"
			+ "\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0979\7>\2\2\u0979\u0994\3\2\2\2\u097a"
			+ "\u097b\7,\2\2\u097b\u097d\7E\2\2\u097c\u097e\5,\27\2\u097d\u097c\3\2\2"
			+ "\2\u097d\u097e\3\2\2\2\u097e\u097f\3\2\2\2\u097f\u0980\7j\2\2\u0980\u0982"
			+ "\7=\2\2\u0981\u0983\5\u0190\u00c9\2\u0982\u0981\3\2\2\2\u0982\u0983\3"
			+ "\2\2\2\u0983\u0984\3\2\2\2\u0984\u0994\7>\2\2\u0985\u0986\58\35\2\u0986"
			+ "\u0987\7E\2\2\u0987\u0988\7,\2\2\u0988\u098a\7E\2\2\u0989\u098b\5,\27"
			+ "\2\u098a\u0989\3\2\2\2\u098a\u098b\3\2\2\2\u098b\u098c\3\2\2\2\u098c\u098d"
			+ "\7j\2\2\u098d\u098f\7=\2\2\u098e\u0990\5\u0190\u00c9\2\u098f\u098e\3\2"
			+ "\2\2\u098f\u0990\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0992\7>\2\2\u0992"
			+ "\u0994\3\2\2\2\u0993\u095b\3\2\2\2\u0993\u0962\3\2\2\2\u0993\u096e\3\2"
			+ "\2\2\u0993\u097a\3\2\2\2\u0993\u0985\3\2\2\2\u0994\u018f\3\2\2\2\u0995"
			+ "\u099a\5\u01a0\u00d1\2\u0996\u0997\7D\2\2\u0997\u0999\5\u01a0\u00d1\2"
			+ "\u0998\u0996\3\2\2\2\u0999\u099c\3\2\2\2\u099a\u0998\3\2\2\2\u099a\u099b"
			+ "\3\2\2\2\u099b\u0191\3\2\2\2\u099c\u099a\3\2\2\2\u099d\u099e\5<\37\2\u099e"
			+ "\u09a0\7^\2\2\u099f\u09a1\5,\27\2\u09a0\u099f\3\2\2\2\u09a0\u09a1\3\2"
			+ "\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a3\7j\2\2\u09a3\u09cd\3\2\2\2\u09a4"
			+ "\u09a5\5\16\b\2\u09a5\u09a7\7^\2\2\u09a6\u09a8\5,\27\2\u09a7\u09a6\3\2"
			+ "\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09aa\7j\2\2\u09aa"
			+ "\u09cd\3\2\2\2\u09ab\u09ac\5\u0162\u00b2\2\u09ac\u09ae\7^\2\2\u09ad\u09af"
			+ "\5,\27\2\u09ae\u09ad\3\2\2\2\u09ae\u09af\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0"
			+ "\u09b1\7j\2\2\u09b1\u09cd\3\2\2\2\u09b2\u09b3\7,\2\2\u09b3\u09b5\7^\2"
			+ "\2\u09b4\u09b6\5,\27\2\u09b5\u09b4\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b7"
			+ "\3\2\2\2\u09b7\u09cd\7j\2\2\u09b8\u09b9\58\35\2\u09b9\u09ba\7E\2\2\u09ba"
			+ "\u09bb\7,\2\2\u09bb\u09bd\7^\2\2\u09bc\u09be\5,\27\2\u09bd\u09bc\3\2\2"
			+ "\2\u09bd\u09be\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u09c0\7j\2\2\u09c0\u09cd"
			+ "\3\2\2\2\u09c1\u09c2\5\22\n\2\u09c2\u09c4\7^\2\2\u09c3\u09c5\5,\27\2\u09c4"
			+ "\u09c3\3\2\2\2\u09c4\u09c5\3\2\2\2\u09c5\u09c6\3\2\2\2\u09c6\u09c7\7#"
			+ "\2\2\u09c7\u09cd\3\2\2\2\u09c8\u09c9\5 \21\2\u09c9\u09ca\7^\2\2\u09ca"
			+ "\u09cb\7#\2\2\u09cb\u09cd\3\2\2\2\u09cc\u099d\3\2\2\2\u09cc\u09a4\3\2"
			+ "\2\2\u09cc\u09ab\3\2\2\2\u09cc\u09b2\3\2\2\2\u09cc\u09b8\3\2\2\2\u09cc"
			+ "\u09c1\3\2\2\2\u09cc\u09c8\3\2\2\2\u09cd\u0193\3\2\2\2\u09ce\u09d0\7^"
			+ "\2\2\u09cf\u09d1\5,\27\2\u09d0\u09cf\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1"
			+ "\u09d2\3\2\2\2\u09d2\u09d3\7j\2\2\u09d3\u0195\3\2\2\2\u09d4\u09d5\5<\37"
			+ "\2\u09d5\u09d7\7^\2\2\u09d6\u09d8\5,\27\2\u09d7\u09d6\3\2\2\2\u09d7\u09d8"
			+ "\3\2\2\2\u09d8\u09d9\3\2\2\2\u09d9\u09da\7j\2\2\u09da\u09fd\3\2\2\2\u09db"
			+ "\u09dc\5\16\b\2\u09dc\u09de\7^\2\2\u09dd\u09df\5,\27\2\u09de\u09dd\3\2"
			+ "\2\2\u09de\u09df\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e1\7j\2\2\u09e1"
			+ "\u09fd\3\2\2\2\u09e2\u09e3\7,\2\2\u09e3\u09e5\7^\2\2\u09e4\u09e6\5,\27"
			+ "\2\u09e5\u09e4\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09fd"
			+ "\7j\2\2\u09e8\u09e9\58\35\2\u09e9\u09ea\7E\2\2\u09ea\u09eb\7,\2\2\u09eb"
			+ "\u09ed\7^\2\2\u09ec\u09ee\5,\27\2\u09ed\u09ec\3\2\2\2\u09ed\u09ee\3\2"
			+ "\2\2\u09ee\u09ef\3\2\2\2\u09ef\u09f0\7j\2\2\u09f0\u09fd\3\2\2\2\u09f1"
			+ "\u09f2\5\22\n\2\u09f2\u09f4\7^\2\2\u09f3\u09f5\5,\27\2\u09f4\u09f3\3\2"
			+ "\2\2\u09f4\u09f5\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6\u09f7\7#\2\2\u09f7"
			+ "\u09fd\3\2\2\2\u09f8\u09f9\5 \21\2\u09f9\u09fa\7^\2\2\u09fa\u09fb\7#\2"
			+ "\2\u09fb\u09fd\3\2\2\2\u09fc\u09d4\3\2\2\2\u09fc\u09db\3\2\2\2\u09fc\u09e2"
			+ "\3\2\2\2\u09fc\u09e8\3\2\2\2\u09fc\u09f1\3\2\2\2\u09fc\u09f8\3\2\2\2\u09fd"
			+ "\u0197\3\2\2\2\u09fe\u09ff\7#\2\2\u09ff\u0a00\5\6\4\2\u0a00\u0a02\5\u019a"
			+ "\u00ce\2\u0a01\u0a03\5\"\22\2\u0a02\u0a01\3\2\2\2\u0a02\u0a03\3\2\2\2"
			+ "\u0a03\u0a15\3\2\2\2\u0a04\u0a05\7#\2\2\u0a05\u0a06\5\20\t\2\u0a06\u0a08"
			+ "\5\u019a\u00ce\2\u0a07\u0a09\5\"\22\2\u0a08\u0a07\3\2\2\2\u0a08\u0a09"
			+ "\3\2\2\2\u0a09\u0a15\3\2\2\2\u0a0a\u0a0b\7#\2\2\u0a0b\u0a0c\5\6\4\2\u0a0c"
			+ "\u0a0d\5\"\22\2\u0a0d\u0a0e\5\u00fa~\2\u0a0e\u0a15\3\2\2\2\u0a0f\u0a10"
			+ "\7#\2\2\u0a10\u0a11\5\20\t\2\u0a11\u0a12\5\"\22\2\u0a12\u0a13\5\u00fa"
			+ "~\2\u0a13\u0a15\3\2\2\2\u0a14\u09fe\3\2\2\2\u0a14\u0a04\3\2\2\2\u0a14"
			+ "\u0a0a\3\2\2\2\u0a14\u0a0f\3\2\2\2\u0a15\u0199\3\2\2\2\u0a16\u0a1a\5\u019c"
			+ "\u00cf\2\u0a17\u0a19\5\u019c\u00cf\2\u0a18\u0a17\3\2\2\2\u0a19\u0a1c\3"
			+ "\2\2\2\u0a1a\u0a18\3\2\2\2\u0a1a\u0a1b\3\2\2\2\u0a1b\u019b\3\2\2\2\u0a1c"
			+ "\u0a1a\3\2\2\2\u0a1d\u0a1f\5\u00e8u\2\u0a1e\u0a1d\3\2\2\2\u0a1f\u0a22"
			+ "\3\2\2\2\u0a20\u0a1e\3\2\2\2\u0a20\u0a21\3\2\2\2\u0a21\u0a23\3\2\2\2\u0a22"
			+ "\u0a20\3\2\2\2\u0a23\u0a24\7A\2\2\u0a24\u0a25\5\u01a0\u00d1\2\u0a25\u0a26"
			+ "\7B\2\2\u0a26\u019d\3\2\2\2\u0a27\u0a28\5\u01a0\u00d1\2\u0a28\u019f\3"
			+ "\2\2\2\u0a29\u0a2c\5\u01a2\u00d2\2\u0a2a\u0a2c\5\u01aa\u00d6\2\u0a2b\u0a29"
			+ "\3\2\2\2\u0a2b\u0a2a\3\2\2\2\u0a2c\u01a1\3\2\2\2\u0a2d\u0a2e\5\u01a4\u00d3"
			+ "\2\u0a2e\u0a2f\7]\2\2\u0a2f\u0a30\5\u01a8\u00d5\2\u0a30\u01a3\3\2\2\2"
			+ "\u0a31\u0a3c\7j\2\2\u0a32\u0a34\7=\2\2\u0a33\u0a35\5\u0098M\2\u0a34\u0a33"
			+ "\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u0a3c\7>\2\2\u0a37"
			+ "\u0a38\7=\2\2\u0a38\u0a39\5\u01a6\u00d4\2\u0a39\u0a3a\7>\2\2\u0a3a\u0a3c"
			+ "\3\2\2\2\u0a3b\u0a31\3\2\2\2\u0a3b\u0a32\3\2\2\2\u0a3b\u0a37\3\2\2\2\u0a3c"
			+ "\u01a5\3\2\2\2\u0a3d\u0a42\7j\2\2\u0a3e\u0a3f\7D\2\2\u0a3f\u0a41\7j\2"
			+ "\2\u0a40\u0a3e\3\2\2\2\u0a41\u0a44\3\2\2\2\u0a42\u0a40\3\2\2\2\u0a42\u0a43"
			+ "\3\2\2\2\u0a43\u01a7\3\2\2\2\u0a44\u0a42\3\2\2\2\u0a45\u0a48\5\u01a0\u00d1"
			+ "\2\u0a46\u0a48\5\u00fe\u0080\2\u0a47\u0a45\3\2\2\2\u0a47\u0a46\3\2\2\2"
			+ "\u0a48\u01a9\3\2\2\2\u0a49\u0a4c\5\u01b2\u00da\2\u0a4a\u0a4c\5\u01ac\u00d7"
			+ "\2\u0a4b\u0a49\3\2\2\2\u0a4b\u0a4a\3\2\2\2\u0a4c\u01ab\3\2\2\2\u0a4d\u0a4e"
			+ "\5\u01ae\u00d8\2\u0a4e\u0a4f\5\u01b0\u00d9\2\u0a4f\u0a50\5\u01a0\u00d1"
			+ "\2\u0a50\u01ad\3\2\2\2\u0a51\u0a55\5<\37\2\u0a52\u0a55\5\u017e\u00c0\2"
			+ "\u0a53\u0a55\5\u0184\u00c3\2\u0a54\u0a51\3\2\2\2\u0a54\u0a52\3\2\2\2\u0a54"
			+ "\u0a53\3\2\2\2\u0a55\u01af\3\2\2\2\u0a56\u0a57\t\5\2\2\u0a57\u01b1\3\2"
			+ "\2\2\u0a58\u0a60\5\u01b4\u00db\2\u0a59\u0a5a\5\u01b4\u00db\2\u0a5a\u0a5b"
			+ "\7K\2\2\u0a5b\u0a5c\5\u01a0\u00d1\2\u0a5c\u0a5d\7L\2\2\u0a5d\u0a5e\5\u01b2"
			+ "\u00da\2\u0a5e\u0a60\3\2\2\2\u0a5f\u0a58\3\2\2\2\u0a5f\u0a59\3\2\2\2\u0a60"
			+ "\u01b3\3\2\2\2\u0a61\u0a62\b\u00db\1\2\u0a62\u0a63\5\u01b6\u00dc\2\u0a63"
			+ "\u0a69\3\2\2\2\u0a64\u0a65\f\3\2\2\u0a65\u0a66\7R\2\2\u0a66\u0a68\5\u01b6"
			+ "\u00dc\2\u0a67\u0a64\3\2\2\2\u0a68\u0a6b\3\2\2\2\u0a69\u0a67\3\2\2\2\u0a69"
			+ "\u0a6a\3\2\2\2\u0a6a\u01b5\3\2\2\2\u0a6b\u0a69\3\2\2\2\u0a6c\u0a6d\b\u00dc"
			+ "\1\2\u0a6d\u0a6e\5\u01b8\u00dd\2\u0a6e\u0a74\3\2\2\2\u0a6f\u0a70\f\3\2"
			+ "\2\u0a70\u0a71\7Q\2\2\u0a71\u0a73\5\u01b8\u00dd\2\u0a72\u0a6f\3\2\2\2"
			+ "\u0a73\u0a76\3\2\2\2\u0a74\u0a72\3\2\2\2\u0a74\u0a75\3\2\2\2\u0a75\u01b7"
			+ "\3\2\2\2\u0a76\u0a74\3\2\2\2\u0a77\u0a78\b\u00dd\1\2\u0a78\u0a79\5\u01ba"
			+ "\u00de\2\u0a79\u0a7f\3\2\2\2\u0a7a\u0a7b\f\3\2\2\u0a7b\u0a7c\7Z\2\2\u0a7c"
			+ "\u0a7e\5\u01ba\u00de\2\u0a7d\u0a7a\3\2\2\2\u0a7e\u0a81\3\2\2\2\u0a7f\u0a7d"
			+ "\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80\u01b9\3\2\2\2\u0a81\u0a7f\3\2\2\2\u0a82"
			+ "\u0a83\b\u00de\1\2\u0a83\u0a84\5\u01bc\u00df\2\u0a84\u0a8a\3\2\2\2\u0a85"
			+ "\u0a86\f\3\2\2\u0a86\u0a87\7[\2\2\u0a87\u0a89\5\u01bc\u00df\2\u0a88\u0a85"
			+ "\3\2\2\2\u0a89\u0a8c\3\2\2\2\u0a8a\u0a88\3\2\2\2\u0a8a\u0a8b\3\2\2\2\u0a8b"
			+ "\u01bb\3\2\2\2\u0a8c\u0a8a\3\2\2\2\u0a8d\u0a8e\b\u00df\1\2\u0a8e\u0a8f"
			+ "\5\u01be\u00e0\2\u0a8f\u0a95\3\2\2\2\u0a90\u0a91\f\3\2\2\u0a91\u0a92\7"
			+ "Y\2\2\u0a92\u0a94\5\u01be\u00e0\2\u0a93\u0a90\3\2\2\2\u0a94\u0a97\3\2"
			+ "\2\2\u0a95\u0a93\3\2\2\2\u0a95\u0a96\3\2\2\2\u0a96\u01bd\3\2\2\2\u0a97"
			+ "\u0a95\3\2\2\2\u0a98\u0a99\b\u00e0\1\2\u0a99\u0a9a\5\u01c0\u00e1\2\u0a9a"
			+ "\u0aa3\3\2\2\2\u0a9b\u0a9c\f\4\2\2\u0a9c\u0a9d\7M\2\2\u0a9d\u0aa2\5\u01c0"
			+ "\u00e1\2\u0a9e\u0a9f\f\3\2\2\u0a9f\u0aa0\7P\2\2\u0aa0\u0aa2\5\u01c0\u00e1"
			+ "\2\u0aa1\u0a9b\3\2\2\2\u0aa1\u0a9e\3\2\2\2\u0aa2\u0aa5\3\2\2\2\u0aa3\u0aa1"
			+ "\3\2\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u01bf\3\2\2\2\u0aa5\u0aa3\3\2\2\2\u0aa6"
			+ "\u0aa7\b\u00e1\1\2\u0aa7\u0aa8\5\u01c2\u00e2\2\u0aa8\u0aba\3\2\2\2\u0aa9"
			+ "\u0aaa\f\7\2\2\u0aaa\u0aab\7H\2\2\u0aab\u0ab9\5\u01c2\u00e2\2\u0aac\u0aad"
			+ "\f\6\2\2\u0aad\u0aae\7G\2\2\u0aae\u0ab9\5\u01c2\u00e2\2\u0aaf\u0ab0\f"
			+ "\5\2\2\u0ab0\u0ab1\7N\2\2\u0ab1\u0ab9\5\u01c2\u00e2\2\u0ab2\u0ab3\f\4"
			+ "\2\2\u0ab3\u0ab4\7O\2\2\u0ab4\u0ab9\5\u01c2\u00e2\2\u0ab5\u0ab6\f\3\2"
			+ "\2\u0ab6\u0ab7\7\36\2\2\u0ab7\u0ab9\5\16\b\2\u0ab8\u0aa9\3\2\2\2\u0ab8"
			+ "\u0aac\3\2\2\2\u0ab8\u0aaf\3\2\2\2\u0ab8\u0ab2\3\2\2\2\u0ab8\u0ab5\3\2"
			+ "\2\2\u0ab9\u0abc\3\2\2\2\u0aba\u0ab8\3\2\2\2\u0aba\u0abb\3\2\2\2\u0abb"
			+ "\u01c1\3\2\2\2\u0abc\u0aba\3\2\2\2\u0abd\u0abe\b\u00e2\1\2\u0abe\u0abf"
			+ "\5\u01c4\u00e3\2\u0abf\u0acf\3\2\2\2\u0ac0\u0ac1\f\5\2\2\u0ac1\u0ac2\7"
			+ "H\2\2\u0ac2\u0ac3\7H\2\2\u0ac3\u0ace\5\u01c4\u00e3\2\u0ac4\u0ac5\f\4\2"
			+ "\2\u0ac5\u0ac6\7G\2\2\u0ac6\u0ac7\7G\2\2\u0ac7\u0ace\5\u01c4\u00e3\2\u0ac8"
			+ "\u0ac9\f\3\2\2\u0ac9\u0aca\7G\2\2\u0aca\u0acb\7G\2\2\u0acb\u0acc\7G\2"
			+ "\2\u0acc\u0ace\5\u01c4\u00e3\2\u0acd\u0ac0\3\2\2\2\u0acd\u0ac4\3\2\2\2"
			+ "\u0acd\u0ac8\3\2\2\2\u0ace\u0ad1\3\2\2\2\u0acf\u0acd\3\2\2\2\u0acf\u0ad0"
			+ "\3\2\2\2\u0ad0\u01c3\3\2\2\2\u0ad1\u0acf\3\2\2\2\u0ad2\u0ad3\b\u00e3\1"
			+ "\2\u0ad3\u0ad4\5\u01c6\u00e4\2\u0ad4\u0add\3\2\2\2\u0ad5\u0ad6\f\4\2\2"
			+ "\u0ad6\u0ad7\7U\2\2\u0ad7\u0adc\5\u01c6\u00e4\2\u0ad8\u0ad9\f\3\2\2\u0ad9"
			+ "\u0ada\7V\2\2\u0ada\u0adc\5\u01c6\u00e4\2\u0adb\u0ad5\3\2\2\2\u0adb\u0ad8"
			+ "\3\2\2\2\u0adc\u0adf\3\2\2\2\u0add\u0adb\3\2\2\2\u0add\u0ade\3\2\2\2\u0ade"
			+ "\u01c5\3\2\2\2\u0adf\u0add\3\2\2\2\u0ae0\u0ae1\b\u00e4\1\2\u0ae1\u0ae2"
			+ "\5\u01c8\u00e5\2\u0ae2\u0aee\3\2\2\2\u0ae3\u0ae4\f\5\2\2\u0ae4\u0ae5\7"
			+ "W\2\2\u0ae5\u0aed\5\u01c8\u00e5\2\u0ae6\u0ae7\f\4\2\2\u0ae7\u0ae8\7X\2"
			+ "\2\u0ae8\u0aed\5\u01c8\u00e5\2\u0ae9\u0aea\f\3\2\2\u0aea\u0aeb\7\\\2\2"
			+ "\u0aeb\u0aed\5\u01c8\u00e5\2\u0aec\u0ae3\3\2\2\2\u0aec\u0ae6\3\2\2\2\u0aec"
			+ "\u0ae9\3\2\2\2\u0aed\u0af0\3\2\2\2\u0aee\u0aec\3\2\2\2\u0aee\u0aef\3\2"
			+ "\2\2\u0aef\u01c7\3\2\2\2\u0af0\u0aee\3\2\2\2\u0af1\u0af9\5\u01ca\u00e6"
			+ "\2\u0af2\u0af9\5\u01cc\u00e7\2\u0af3\u0af4\7U\2\2\u0af4\u0af9\5\u01c8"
			+ "\u00e5\2\u0af5\u0af6\7V\2\2\u0af6\u0af9\5\u01c8\u00e5\2\u0af7\u0af9\5"
			+ "\u01ce\u00e8\2\u0af8\u0af1\3\2\2\2\u0af8\u0af2\3\2\2\2\u0af8\u0af3\3\2"
			+ "\2\2\u0af8\u0af5\3\2\2\2\u0af8\u0af7\3\2\2\2\u0af9\u01c9\3\2\2\2\u0afa"
			+ "\u0afb\7S\2\2\u0afb\u0afc\5\u01c8\u00e5\2\u0afc\u01cb\3\2\2\2\u0afd\u0afe"
			+ "\7T\2\2\u0afe\u0aff\5\u01c8\u00e5\2\u0aff\u01cd\3\2\2\2\u0b00\u0b07\5"
			+ "\u01d0\u00e9\2\u0b01\u0b02\7J\2\2\u0b02\u0b07\5\u01c8\u00e5\2\u0b03\u0b04"
			+ "\7I\2\2\u0b04\u0b07\5\u01c8\u00e5\2\u0b05\u0b07\5\u01da\u00ee\2\u0b06"
			+ "\u0b00\3\2\2\2\u0b06\u0b01\3\2\2\2\u0b06\u0b03\3\2\2\2\u0b06\u0b05\3\2"
			+ "\2\2\u0b07\u01cf\3\2\2\2\u0b08\u0b0b\5\u0162\u00b2\2\u0b09\u0b0b\5<\37"
			+ "\2\u0b0a\u0b08\3\2\2\2\u0b0a\u0b09\3\2\2\2\u0b0b\u0b10\3\2\2\2\u0b0c\u0b0f"
			+ "\5\u01d4\u00eb\2\u0b0d\u0b0f\5\u01d8\u00ed\2\u0b0e\u0b0c\3\2\2\2\u0b0e"
			+ "\u0b0d\3\2\2\2\u0b0f\u0b12\3\2\2\2\u0b10\u0b0e\3\2\2\2\u0b10\u0b11\3\2"
			+ "\2\2\u0b11\u01d1\3\2\2\2\u0b12\u0b10\3\2\2\2\u0b13\u0b14\5\u01d0\u00e9"
			+ "\2\u0b14\u0b15\7S\2\2\u0b15\u01d3\3\2\2\2\u0b16\u0b17\7S\2\2\u0b17\u01d5"
			+ "\3\2\2\2\u0b18\u0b19\5\u01d0\u00e9\2\u0b19\u0b1a\7T\2\2\u0b1a\u01d7\3"
			+ "\2\2\2\u0b1b\u0b1c\7T\2\2\u0b1c\u01d9\3\2\2\2\u0b1d\u0b1e\7=\2\2\u0b1e"
			+ "\u0b1f\5\6\4\2\u0b1f\u0b20\7>\2\2\u0b20\u0b21\5\u01c8\u00e5\2\u0b21\u0b39"
			+ "\3\2\2\2\u0b22\u0b23\7=\2\2\u0b23\u0b27\5\16\b\2\u0b24\u0b26\5*\26\2\u0b25"
			+ "\u0b24\3\2\2\2\u0b26\u0b29\3\2\2\2\u0b27\u0b25\3\2\2\2\u0b27\u0b28\3\2"
			+ "\2\2\u0b28\u0b2a\3\2\2\2\u0b29\u0b27\3\2\2\2\u0b2a\u0b2b\7>\2\2\u0b2b"
			+ "\u0b2c\5\u01ce\u00e8\2\u0b2c\u0b39\3\2\2\2\u0b2d\u0b2e\7=\2\2\u0b2e\u0b32"
			+ "\5\16\b\2\u0b2f\u0b31\5*\26\2\u0b30\u0b2f\3\2\2\2\u0b31\u0b34\3\2\2\2"
			+ "\u0b32\u0b30\3\2\2\2\u0b32\u0b33\3\2\2\2\u0b33\u0b35\3\2\2\2\u0b34\u0b32"
			+ "\3\2\2\2\u0b35\u0b36\7>\2\2\u0b36\u0b37\5\u01a2\u00d2\2\u0b37\u0b39\3"
			+ "\2\2\2\u0b38\u0b1d\3\2\2\2\u0b38\u0b22\3\2\2\2\u0b38\u0b2d\3\2\2\2\u0b39"
			+ "\u01db\3\2\2\2\u0b3a\u0b3e\7p\2\2\u0b3b\u0b3d\5\u01de\u00f0\2\u0b3c\u0b3b"
			+ "\3\2\2\2\u0b3d\u0b40\3\2\2\2\u0b3e\u0b3c\3\2\2\2\u0b3e\u0b3f\3\2\2\2\u0b3f"
			+ "\u0b41\3\2\2\2\u0b40\u0b3e\3\2\2\2\u0b41\u0b42\7q\2\2\u0b42\u01dd\3\2"
			+ "\2\2\u0b43\u0b44\7r\2\2\u0b44\u0b45\7w\2\2\u0b45\u0b46\7v\2\2\u0b46\u0b47"
			+ "\7x\2\2\u0b47\u0b48\7s\2\2\u0b48\u0b49\5\u01e0\u00f1\2\u0b49\u0b4a\7s"
			+ "\2\2\u0b4a\u0b4b\7y\2\2\u0b4b\u0b4c\7u\2\2\u0b4c\u01df\3\2\2\2\u0b4d\u0b52"
			+ "\5\u01e2\u00f2\2\u0b4e\u0b52\5\u01e4\u00f3\2\u0b4f\u0b52\5\u01e6\u00f4"
			+ "\2\u0b50\u0b52\5\u01e8\u00f5\2\u0b51\u0b4d\3\2\2\2\u0b51\u0b4e\3\2\2\2"
			+ "\u0b51\u0b4f\3\2\2\2\u0b51\u0b50\3\2\2\2\u0b52\u01e1\3\2\2\2\u0b53\u0b54"
			+ "\7|\2\2\u0b54\u01e3\3\2\2\2\u0b55\u0b56\7r\2\2\u0b56\u01e5\3\2\2\2\u0b57"
			+ "\u0b58\7r\2\2\u0b58\u0b59\7z\2\2\u0b59\u0b5a\7r\2\2\u0b5a\u0b5b\7w\2\2"
			+ "\u0b5b\u0b5c\7t\2\2\u0b5c\u0b5d\7r\2\2\u0b5d\u0b5e\7t\2\2\u0b5e\u0b5f"
			+ "\7{\2\2\u0b5f\u01e7\3\2\2\2\u0b60\u0b61\7r\2\2\u0b61\u0b62\7z\2\2\u0b62"
			+ "\u0b63\7r\2\2\u0b63\u0b64\7x\2\2\u0b64\u0b65\7y\2\2\u0b65\u0b66\7w\2\2"
			+ "\u0b66\u0b67\7t\2\2\u0b67\u0b68\7r\2\2\u0b68\u0b69\7t\2\2\u0b69\u0b6a"
			+ "\7{\2\2\u0b6a\u01e9\3\2\2\2\u0148\u01ee\u01f3\u01fa\u01fe\u0202\u020b"
			+ "\u020f\u0213\u0215\u021b\u0220\u0227\u022c\u022e\u0234\u0239\u023e\u0243"
			+ "\u024e\u025c\u0261\u0269\u0270\u0276\u027b\u0286\u0289\u0297\u029c\u02a1"
			+ "\u02a6\u02ac\u02b6\u02be\u02c8\u02d0\u02dc\u02e0\u02e5\u02eb\u02f3\u02fc"
			+ "\u0307\u0324\u0328\u032d\u0333\u0336\u0339\u0345\u0350\u035e\u0365\u036e"
			+ "\u0375\u037a\u0389\u0390\u0396\u039a\u039e\u03a2\u03a6\u03ab\u03af\u03b3"
			+ "\u03b5\u03ba\u03c1\u03c6\u03c8\u03ce\u03d3\u03d7\u03ea\u03ef\u03ff\u0404"
			+ "\u040a\u0410\u0412\u0416\u041b\u041f\u0426\u042d\u0435\u0438\u043d\u0445"
			+ "\u044a\u0451\u0458\u045d\u0463\u046f\u0474\u0478\u0482\u0487\u048f\u0492"
			+ "\u0497\u049f\u04a2\u04a7\u04ac\u04b1\u04b6\u04bd\u04c2\u04ca\u04cf\u04d4"
			+ "\u04d9\u04df\u04e5\u04e8\u04eb\u04f4\u04fa\u0500\u0503\u0506\u050e\u0513"
			+ "\u0518\u051e\u0521\u052c\u0535\u053f\u0544\u054f\u0554\u0560\u0565\u0571"
			+ "\u057b\u0580\u0588\u058b\u0592\u059a\u05a0\u05a9\u05b3\u05b7\u05ba\u05c3"
			+ "\u05d1\u05d4\u05dd\u05e2\u05ea\u05f1\u05f9\u0605\u060c\u061a\u0630\u0652"
			+ "\u065e\u0664\u0670\u067d\u0697\u069b\u06a0\u06a4\u06a8\u06b0\u06b4\u06b8"
			+ "\u06bf\u06c8\u06d0\u06df\u06eb\u06f1\u06f7\u070c\u0711\u0717\u0723\u072e"
			+ "\u0738\u073b\u0740\u0749\u074f\u0759\u075e\u0767\u077e\u0788\u079e\u07a5"
			+ "\u07ad\u07b5\u07c0\u07d7\u07e1\u07ec\u0802\u0806\u080b\u0813\u0819\u081d"
			+ "\u0821\u0825\u082b\u0830\u0835\u0839\u083d\u0843\u0848\u084d\u0851\u0855"
			+ "\u0857\u085c\u0861\u0866\u086a\u086e\u0872\u0877\u087f\u0885\u0889\u088d"
			+ "\u0891\u0897\u089c\u08a1\u08a5\u08a9\u08ab\u08b0\u08bf\u08cd\u08d9\u08e2"
			+ "\u08f1\u08fe\u0907\u090d\u0914\u0919\u0920\u0925\u092c\u0931\u0938\u093d"
			+ "\u0945\u094a\u094e\u0952\u0957\u095e\u0965\u096a\u0971\u0976\u097d\u0982"
			+ "\u098a\u098f\u0993\u099a\u09a0\u09a7\u09ae\u09b5\u09bd\u09c4\u09cc\u09d0"
			+ "\u09d7\u09de\u09e5\u09ed\u09f4\u09fc\u0a02\u0a08\u0a14\u0a1a\u0a20\u0a2b"
			+ "\u0a34\u0a3b\u0a42\u0a47\u0a4b\u0a54\u0a5f\u0a69\u0a74\u0a7f\u0a8a\u0a95"
			+ "\u0aa1\u0aa3\u0ab8\u0aba\u0acd\u0acf\u0adb\u0add\u0aec\u0aee\u0af8\u0b06"
			+ "\u0b0a\u0b0e\u0b10\u0b27\u0b32\u0b38\u0b3e\u0b51";
	public static final String _serializedATN = Utils.join(new String[] {
			_serializedATNSegment0, _serializedATNSegment1 }, "");
	public static final ATN _ATN = new ATNDeserializer()
			.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}