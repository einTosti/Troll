package de.eintosti.troll.listeners;

import de.eintosti.troll.misc.Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * @author einTosti
 */
public class PlayerChat implements Listener {
    private final String mPrefix = Utils.getInstance().mPrefix;

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if (!Utils.getInstance().mChat) {
            event.setCancelled(true);
            player.sendMessage(mPrefix + "§7Der Chat ist zurzeit §cdeaktiviert§7.");
        }
    }
}
