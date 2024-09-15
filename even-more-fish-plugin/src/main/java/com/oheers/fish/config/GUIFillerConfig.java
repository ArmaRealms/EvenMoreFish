package com.oheers.fish.config;

import com.oheers.fish.EvenMoreFish;
import com.oheers.fish.gui.GUIUtils;
import de.themoep.inventorygui.GuiElement;

import java.util.List;

public class GUIFillerConfig extends ConfigBase {

    private static GUIFillerConfig instance;

    public GUIFillerConfig() {
        super("gui-fillers.yml", "gui-fillers.yml", EvenMoreFish.getInstance(), true);
        instance = this;
    }

    public static GUIFillerConfig getInstance() { return instance; }

    public List<GuiElement> getDefaultFillerElements() {
        return GUIUtils.getElements(getConfig(), null, null);
    }

}
