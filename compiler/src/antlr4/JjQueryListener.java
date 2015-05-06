package antlr4;

// Generated from JjQuery.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JjQueryParser}.
 */
public interface JjQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JjQueryParser#selector}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSelector(@NotNull JjQueryParser.SelectorContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#selector}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSelector(@NotNull JjQueryParser.SelectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#assign}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAssign(@NotNull JjQueryParser.AssignContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#assign}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAssign(@NotNull JjQueryParser.AssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#jQueryBlock}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterJQueryBlock(@NotNull JjQueryParser.JQueryBlockContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#jQueryBlock}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitJQueryBlock(@NotNull JjQueryParser.JQueryBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#jQuery}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterJQuery(@NotNull JjQueryParser.JQueryContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#jQuery}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitJQuery(@NotNull JjQueryParser.JQueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#java}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterJava(@NotNull JjQueryParser.JavaContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#java}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitJava(@NotNull JjQueryParser.JavaContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#in}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterIn(@NotNull JjQueryParser.InContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#in}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitIn(@NotNull JjQueryParser.InContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#out}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterOut(@NotNull JjQueryParser.OutContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#out}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitOut(@NotNull JjQueryParser.OutContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#main}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMain(@NotNull JjQueryParser.MainContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#main}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMain(@NotNull JjQueryParser.MainContext ctx);
}