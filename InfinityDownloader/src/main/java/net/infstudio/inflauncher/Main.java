/**
 * This file is part of Infinity Launcher.
 * <p>
 * Infinity Launcher is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * Infinity Launcher is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with Infinity Launcher.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.infstudio.inflauncher;

import net.infstudio.inflauncher.game.downloading.InfinityDownloader;
import net.infstudio.inflauncher.game.downloading.URLConnectionTimer;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author gonglinyuan
 *         created on 15:38, 2016/7/18.
 */
public class Main {
    public static DownloadLogFrame logFrame = new DownloadLogFrame();
    public static void main(String[] args) {
        //TODO Test
        InfinityDownloader.logger.info("Hello world!");
        try {
            URL mcURL = new URL("http://s3.amazonaws.com/Minecraft.Download/versions/1.10.2/1.10.2.json");
            FileUtils.copyInputStreamToFile(mcURL.openStream(), new File("1.10.2.json"));
            InfinityDownloader.logger.info("Ping to http://stackoverflow.com: time=" + URLConnectionTimer.testTime("http://stackoverflow.com"));
        } catch (IOException e) {
            LogManager.getLogger("InfinityLauncher").error(e);
        }

    }
}
