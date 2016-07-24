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
package net.infstudio.inflauncher;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InfinityLauncher {

    public static final Logger LOGGER = LogManager.getLogger("InfinityLauncher");
    public static final Gson GSON = new GsonBuilder().create();
    public static final Gson GSON_PRETTY;

    static {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        GSON_PRETTY = builder.create();
    }

    public static void main(String[] args) {

    }
}
