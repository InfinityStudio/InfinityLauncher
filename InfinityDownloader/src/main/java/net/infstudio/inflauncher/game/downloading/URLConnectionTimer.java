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

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

/**
 * A timer to calculate the time internal(in ms) to the server.
 */
public class URLConnectionTimer {
    public static long testTime(String url) {
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpUriRequest request = RequestBuilder.get(url).build();
            long start = System.currentTimeMillis();
            client.execute(request);
            long end = System.currentTimeMillis();
            return end-start;
        } catch (IOException e) {
            InfinityDownloader.logger.error(e);
            return Long.MAX_VALUE;
        }
    }
}
