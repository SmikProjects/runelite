package net.runelite.client.plugins.xptracker;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(
        keyName = "xptracker",
        name = "XP Tracker",
        description = "Configuration for the XP Tracker plugin"
)

public interface XpTrackerConfig extends Config
{
    @ConfigItem(
            keyName = "enableTimeToLevel",
            name = "Enable TimeToLevel",
            description = "Configures whether to show xp to level or time to level",
            position = 0
    )
    default boolean enableTimeToLevel()
    {
        return true;
    }

}
