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
package net.infstudio.inflauncher.game.version;

import java.util.List;
import java.util.Map;

/**
 * @author gonglinyuan
 *         created on 15:11, 2016/7/18.
 */
public class MinecraftVersion {
    public String minecraftArguments;
    public String mainClass;
    public String time;
    public String id;
    public String type;
    public String releaseTime;
    protected String assets;
    public int minimumLauncherVersion;
    public boolean hidden;
    public AssetIndex assetIndex;
    private Map<String, DownloadInfo> downloads;
    public List<Library> libraries;
}
