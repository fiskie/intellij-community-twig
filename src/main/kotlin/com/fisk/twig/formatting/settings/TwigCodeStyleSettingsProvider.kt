package com.fisk.twig.formatting.settings

import com.fisk.twig.TwigBundle
import com.fisk.twig.TwigLanguage
import com.intellij.application.options.CodeStyleAbstractConfigurable
import com.intellij.openapi.options.Configurable
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CodeStyleSettingsProvider

class TwigCodeStyleSettingsProvider : CodeStyleSettingsProvider() {
    override fun createSettingsPage(settings: CodeStyleSettings, originalSettings: CodeStyleSettings?): Configurable {
        return object : CodeStyleAbstractConfigurable(settings, originalSettings, "Twig") {
            override fun createPanel(settings: CodeStyleSettings?) = TwigCodeStylePanel(currentSettings, settings)

            override fun getHelpTopic() = TwigBundle.message("twig.page.code_style.help")
        }
    }

    override fun createCustomSettings(settings: CodeStyleSettings) = TwigCodeStyleSettings(settings)

    override fun getLanguage() = TwigLanguage.INSTANCE

    override fun getConfigurableDisplayName() = "Twig"
}