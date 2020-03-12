package every.tree.ever;

import org.bukkit.Bukkit;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class EveryListener implements Listener {
    private static int counter = 0;

    @EventHandler(priority = EventPriority.MONITOR)
    public void onBreak(final BlockBreakEvent event) {
        final var player = event.getPlayer();
        if (player.isSneaking()) {
            var block = event.getBlock();
            if (EveryBlockUtil.isLog(block.getType())) {
                event.setCancelled(true);
                final var sapling = EveryBlockUtil.getLogSapling(block.getType());
                final var playerTool = player.getItemOnCursor();
                do {
                    block.breakNaturally(playerTool);
                    block = block.getRelative(BlockFace.UP);
                } while (EveryBlockUtil.isLog(block.getType()));
                if (counter % 3 == 0) {
                    final var saplingBlock = event.getBlock();
                    if (!saplingBlock.getRelative(BlockFace.DOWN).isEmpty()) {
                        Bukkit.getScheduler().runTaskLater(EveryTreeEver.getInstance(), () -> { saplingBlock.setType(sapling); }, 20*13);
                    }
                }
                counter++;
            }
        }
    }
}
