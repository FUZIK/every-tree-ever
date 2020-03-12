package every.tree.ever;

import com.sk89q.worldguard.WorldGuard;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.dependency.LoadBefore;
import org.bukkit.plugin.java.annotation.dependency.SoftDependency;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.Plugin;

@Plugin(name = "EveryTreeEver", version = "0.0.0-indev")
@ApiVersion(ApiVersion.Target.v1_13)
public class EveryTreeEver extends JavaPlugin {
    @Getter
    private static EveryTreeEver instance = null;

    @Override
    public void onLoad() {
        super.onLoad();
        instance = this;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        getServer().getPluginManager().registerEvents(new EveryListener(), this);
    }
}
