package org.intellicoq;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * @author Ethan
 */
public class CoqSyntaxHighlighter extends SyntaxHighlighterBase {
    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return null;
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return new TextAttributesKey[0];
    }
}
