package com.fisk.twig.parsing

import com.fisk.twig.TwigBundle
import com.fisk.twig.TwigLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls

/**
 * @param parseExpectedMessageKey Key to the [TwigBundle] message to show the user when the parsing
 * *                                expected this token, but found something else.
 */
data class TwigElementType(
        @NonNls private val debugName: String,
        @NonNls private val parseExpectedMessageKey: String
) : IElementType(debugName, TwigLanguage.INSTANCE) {
    fun parseExpectedMessage() = TwigBundle.message(parseExpectedMessageKey)

    override fun toString() = "Twig:" + super.toString()
}