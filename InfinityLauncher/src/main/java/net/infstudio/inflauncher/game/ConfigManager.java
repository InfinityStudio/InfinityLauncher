/*
 * Infinity Launcher for Minecraft.
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.infstudio.inflauncher.game;

import net.infstudio.inflauncher.InfinityLauncher;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author gonglinyuan
 *         created on 21:43, 2016/7/23.
 */
public class ConfigManager {

    private static String CONFIG_FILE = "run/infinityLauncher.json";
    private static Config CONFIG;

    public static void load() {
        Path path = Paths.get(CONFIG_FILE);
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            CONFIG = InfinityLauncher.GSON.fromJson(reader, Config.class);
        } catch (IOException e) {
            InfinityLauncher.LOGGER.warn("Unable to read " + CONFIG_FILE + ", using the default config.");
            CONFIG = new Config();
        }
    }

    public static void save() {

    }

    public static Config getCONFIG() {
        return CONFIG;
    }
}
