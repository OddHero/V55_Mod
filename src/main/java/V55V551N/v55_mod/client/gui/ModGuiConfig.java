package V55V551N.v55_mod.client.gui;

import V55V551N.v55_mod.handler.ConfigurationHandler;
import V55V551N.v55_mod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig {

    public ModGuiConfig(GuiScreen guiScreen){
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MODID,
                false,//world restart
                false,//minecraft restart
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
