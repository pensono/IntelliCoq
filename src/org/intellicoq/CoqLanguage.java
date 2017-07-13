package org.intellicoq;

import com.intellij.lang.Language;

/**
 * @author Ethan
 */
public class CoqLanguage extends Language {
    public final static Language INSTANCE = new CoqLanguage();

    public CoqLanguage() {
        // Is this MIME type correct?
        super("Coq", "text/coq");

//        SyntaxHighlighterFactory.LANGUAGE_FACTORY.addExplicitExtension(this, new SingleLazyInstanceSyntaxHighlighterFactory() {
//            @NotNull
//            protected SyntaxHighlighter createHighlighter() {
//                return new PropertiesHighlighter();
//            }
//        });
    }
}
