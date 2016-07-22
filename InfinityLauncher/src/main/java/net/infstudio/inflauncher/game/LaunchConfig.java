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

/**
 * @author gonglinyuan
 *         created on 21:55, 2016/7/21.
 */
public class LaunchConfig {
    private final String minecraftDirectory;
    private final String version;
    private final int authenticator; // 0 : offline
    private final String name;

    public LaunchConfig(String minecraftDirectory, String version, int authenticator, String name) {
        this.minecraftDirectory = minecraftDirectory;
        this.version = version;
        this.authenticator = authenticator;
        this.name = name;
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
}
