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

import java.net.URL;

/**
 * A mirror which mirrors <a>https://s3.amazonaws.com</a>
 */
public class S3Mirror extends Mirror {
    public S3Mirror(String description, boolean isSSL, String name, URL url) {
        super(description, isSSL, MirrorType.S3, name, url);
    }

    public S3Mirror(String description, boolean isSSL, String name, String provider, URL url) {
        super(description, isSSL, MirrorType.S3, name, provider, url);
    }
}
