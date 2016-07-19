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
package net.infstudio.inflauncher.game.downloading;

import java.net.URL;

/**
 * A mirror to the maven/minecraft repository.
 */
public abstract class Mirror {
    private String name;
    private String description;
    private String provider;
    private MirrorType mirrorType;
    private URL url;
    private boolean isSSL;

    public Mirror(String description, boolean isSSL, MirrorType mirrorType, String name, String provider, URL url) {
        this.description = description;
        this.isSSL = isSSL;
        this.mirrorType = mirrorType;
        this.name = name;
        this.provider = provider;
        this.url = url;
    }

    public Mirror(String description, boolean isSSL, MirrorType mirrorType, String name, URL url) {
        this.description = description;
        this.isSSL = isSSL;
        this.mirrorType = mirrorType;
        this.name = name;
        this.url = url;
    }

    public MirrorType getMirrorType() {
        return mirrorType;
    }

    public URL getUrl() {
        return url;
    }

    public boolean isSSL() {
        return isSSL;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getProvider() {
        return provider;
    }
}
