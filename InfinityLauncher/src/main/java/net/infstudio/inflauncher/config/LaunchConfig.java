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
package net.infstudio.inflauncher.config;

import org.to2mbn.jmccc.option.WindowSize;

/**
 * @author gonglinyuan
 *         created on 21:55, 2016/7/21.
 */
public class LaunchConfig {

    private static final String VERSION_DEFAULT = "1.10.2";
    private static final int MEMORY_DEFAULT = 1024;

    private final String minecraftDirectory;
    private final String version;
    private final int authenticator; // 0 : offline
    private final String name;
    private final int memory;
    private final int[] windowSize;

    public LaunchConfig(String minecraftDirectory, String version, int authenticator, String name, int memory,
                        int[] windowSize) {
        this.minecraftDirectory = minecraftDirectory;
        this.version = version;
        this.authenticator = authenticator;
        this.name = name;
        this.memory = memory;
        this.windowSize = windowSize;
    }

    public LaunchConfig() {
        this(".minecraft", VERSION_DEFAULT, 0, "", MEMORY_DEFAULT, null);
    }

    public LaunchConfig getRevised() {
        return new LaunchConfig(minecraftDirectory == null ? ".minecraft" : minecraftDirectory,
            version == null ? VERSION_DEFAULT : version,
            authenticator,
            name == null ? "" : name,
            memory < 0 ? MEMORY_DEFAULT : memory,
            getRevisedWindowSize());
    }

    public String getMinecraftDirectory() {
        return minecraftDirectory;
    }

    public String getVersion() {
        return version;
    }

    public int getAuthenticator() {
        return authenticator;
    }

    public String getName() {
        return name;
    }

    public int getMemory() {
        return memory;
    }

    private int[] getRevisedWindowSize() {
        if (windowSize == null) return null;
        if (windowSize.length >= 1 && windowSize[0] != 0) {
            return new int[]{1};
        } else if (windowSize.length >= 3 && windowSize[0] == 0) {
            return new int[]{0, windowSize[1], windowSize[2]};
        } else {
            return null;
        }
    }

    public WindowSize getWindowSize() {
        if (windowSize == null) return null;
        if (windowSize[0] == 1) {
            return WindowSize.fullscreen();
        } else {
            return WindowSize.window(windowSize[1], windowSize[2]);
        }
    }
}
