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

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author gonglinyuan
 *         created on 15:38, 2016/7/18.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Path versionPath = Paths.get(".minecraft/versions/1.10.2/1.10.2.json");
        try (BufferedReader reader = Files.newBufferedReader(versionPath, StandardCharsets.UTF_8)) {
            // blabla
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
