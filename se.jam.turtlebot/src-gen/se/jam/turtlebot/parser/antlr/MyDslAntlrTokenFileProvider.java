/*
 * generated by Xtext 2.10.0
 */
package se.jam.turtlebot.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("se/jam/turtlebot/parser/antlr/internal/InternalMyDsl.tokens");
	}
}
