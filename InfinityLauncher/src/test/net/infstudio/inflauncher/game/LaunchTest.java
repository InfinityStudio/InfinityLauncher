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

import net.infstudio.inflauncher.config.LaunchConfig;
import org.junit.Test;
import org.to2mbn.jmccc.auth.OfflineAuthenticator;
import org.to2mbn.jmccc.option.LaunchOption;
import org.to2mbn.jmccc.option.MinecraftDirectory;

/**
 * @author gonglinyuan
 *         created on 21:34, 2016/7/21.
 */
public class LaunchTest {

    @Test
    public void launchVanilla1() throws Exception {
        MinecraftDirectory dir = new MinecraftDirectory("run/.minecraft");
        LaunchOption option = new LaunchOption("1.10.2", new OfflineAuthenticator("gonglinyuan"), dir);
        Launch.launchVanilla(option);
    }

    @Test
    public void launchVanilla2() throws Exception {
        LaunchConfig config = new LaunchConfig("run/.minecraft", "1.10.2", 0, "gonglinyuan", 1024, null);
        Launch.launchVanilla(config);
    }
}
