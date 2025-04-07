package com.spektrsoyuz.voidGen;

import com.spektrsoyuz.voidGen.chunk.VoidBiomeProvider;
import com.spektrsoyuz.voidGen.chunk.VoidChunkGenerator;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.jetbrains.annotations.NotNull;

public final class VoidGen extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public @NotNull ChunkGenerator getDefaultWorldGenerator(@NotNull String worldName, @Nullable String id) {
        return new VoidChunkGenerator();
    }

    @Override
    public @NotNull BiomeProvider getDefaultBiomeProvider(@NotNull String worldName, @Nullable String id) {
        return new VoidBiomeProvider();
    }
}
