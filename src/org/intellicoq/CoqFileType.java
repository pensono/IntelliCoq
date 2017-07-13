package org.intellicoq;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author Ethan
 */
public class CoqFileType extends LanguageFileType {
    public static final LanguageFileType INSTANCE = new CoqFileType();

    public static final String DEFAULT_EXTENSION = "v";
    public static final Icon ICON = IconLoader.getIcon("/icons/coq_icon.png");

    /**
     * Creates a Coq file type.
     */
    protected CoqFileType() {
        super(CoqLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Coq";
    }

    @NotNull
    @Override
    public String getDescription() {
        // TODO localize
        // return PropertiesBundle.message("properties.files.file.type.description");
        return "A Coq source file.";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ICON;
    }
}
