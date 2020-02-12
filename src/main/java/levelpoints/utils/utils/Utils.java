package levelpoints.utils.utils;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

public interface Utils {


    void ActionBar(Player player, String Message);

    void PlayerAdd(UUID uuid, String Name);
    void PlayerDataLoad(Player player) throws IOException;


    void RunSQLUpdate(Player player);
    void RunSQLDownload(Player player);
    void LevelUpEventTrigger(Player player, int level, boolean EXPOverlap, int EXPOverlapAmount);

    void FarmEventTrigger(Player player, String FarmedItem, int expAmount, String Task);

    void RunModuels();
    void SaveLoadFiles(File file, FileConfiguration config, String Location, String secLoc, String Name);
    void MySQL();
    void versionChecker();

    void Rewards(Player player, int Level);
    void getRewards(String cmd, Player player);
    void Title(Player player, String Title, String Subtitle);
    void GainEXP(Player player, int amount);
    int getRequiredEXP(Player player);
    int getMaxLevel();
    int getCurrentLevel(Player player);
    int getCurrentEXP(Player player);
    int getCurrentBoosters(Player player, int Multipler);
    void boosteruseclick(Player player, int multiplier) throws IOException;
    void RunFiles();
    void TimedEXP();
    int getMaxLevelEXP(Player player);






}
