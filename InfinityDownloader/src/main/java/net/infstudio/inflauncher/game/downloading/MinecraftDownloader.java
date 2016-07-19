/**
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
package net.infstudio.inflauncher.game.downloading;

import net.infstudio.inflauncher.game.Minecraft;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MinecraftDownloader extends BaseDownloader {
    private Minecraft minecraft;

    public MinecraftDownloader(Minecraft minecraft) {
        this.minecraft = minecraft;
    }

    @Override
    public boolean download() {
        String url = InfinityDownloader.mirrorManager.getFastestS3MirrorURL();
        String metaUrl = InfinityDownloader.mirrorManager.getFastestMetaMirrorURL();
        String librariesUrl = InfinityDownloader.mirrorManager.getFastestMavenMirrorURL();
        try {
            FileUtils.copyURLToFile(new URL(url + "/Minecraft.Download/versions/" + minecraft.getJar() + ".json"),
                new File(minecraft.getJar() + ".json"));
        } catch (IOException e) {
            InfinityDownloader.logger.error(e.getLocalizedMessage(), e);
        }
        return false;
    }
}
