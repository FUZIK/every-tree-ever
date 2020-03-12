package every.tree.ever;

import org.bukkit.Material;

public class EveryBlockUtil {
    public static boolean isLog(final Material material) {
        switch (material) {
            case ACACIA_LOG:
            case BIRCH_LOG:
            case DARK_OAK_LOG:
            case JUNGLE_LOG:
            case OAK_LOG:
            case SPRUCE_LOG:
            case STRIPPED_ACACIA_LOG:
            case STRIPPED_BIRCH_LOG:
            case STRIPPED_DARK_OAK_LOG:
            case STRIPPED_JUNGLE_LOG:
            case STRIPPED_OAK_LOG:
            case STRIPPED_SPRUCE_LOG:
            case LEGACY_LOG:
            case LEGACY_LOG_2:
                return true;
            default:
                return false;
        }
    }

    public static Material getLogSapling(final Material material) {
        switch (material) {
            case ACACIA_LOG:
            case STRIPPED_ACACIA_LOG:
                return Material.ACACIA_SAPLING;
            case BIRCH_LOG:
            case STRIPPED_BIRCH_LOG:
                return Material.BIRCH_SAPLING;
            case DARK_OAK_LOG:
            case STRIPPED_DARK_OAK_LOG:
                return Material.DARK_OAK_SAPLING;
            case JUNGLE_LOG:
            case STRIPPED_JUNGLE_LOG:
                return Material.JUNGLE_SAPLING;
            case SPRUCE_LOG:
            case STRIPPED_SPRUCE_LOG:
                return Material.SPRUCE_SAPLING;
            case OAK_LOG:
            case STRIPPED_OAK_LOG:
            case LEGACY_LOG:
            case LEGACY_LOG_2:
                return Material.OAK_SAPLING;
        }
        return null;
    }
}
