package levelpoints.utils.utils;

import org.bukkit.boss.BossBar;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public interface Utils {


    void createBossbar(Player player);
    void bossbarAddPlayer(BossBar bossBar, Player player);
    void bossbarRemovePlayer(BossBar bossBar, Player player);
    void BossBarShowTime(Player player);
    BossBar getBossbar(Player player);
    void updateBossbar(BossBar bossBar, Player player);
    void ActionBar(Player player, String Message);

    String getProgressBar(Player player);
    void PlayerAdd(UUID uuid, String Name);
    void PlayerDataLoad(Player player) throws IOException;
    void wait(int seconds, Player player);

    void RunSQLUpdate(Player player);
    void RunSQLDownload(Player player);
    void SQLReconnect();
    void SQLDisconnect(int seconds);
    void LevelUpEventTrigger(Player player, int level, boolean EXPOverlap, int EXPOverlapAmount);

    void FarmEventTrigger(Player player, String FarmedItem, int expAmount, String Task);

    void RunModuels();
    void RandomConfigurator(Player player, Entity ent);
    void SaveLoadFiles(File file, FileConfiguration config, String Location, String secLoc, String Name);
    void MySQL();
    void versionChecker();

    void Rewards(Player player, int Level, int Prestige);
    void getRewards(String cmd, Player player);
    void Title(Player player, String Title, String Subtitle);
    void GainEXP(Player player, int amount);
    int getRequiredEXP(Player player);
    int getMaxLevel();
    int getCurrentLevel(Player player);
    int getRankMultiplier(Player player);
    int getCurrentPrestige(Player player);
    int getCurrentEXP(Player player);
    int getCurrentBoosters(Player player, int Multipler);
    void boosteruseclick(Player player, int multiplier) throws IOException;
    void RunFiles();
    void TimedEXP();
    double getMaxLevelEXP(Player player);
    FileConfiguration getLevelsConfig();
    FileConfiguration getMMobsConfig();
    FileConfiguration getMultipliersConfig();
    FileConfiguration getEXPConfig();
    FileConfiguration getRewardsConfig();
    FileConfiguration getFormatsConfig();
    FileConfiguration getLangConfig();
    FileConfiguration getTopListConfig();






}
