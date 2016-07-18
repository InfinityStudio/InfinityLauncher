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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MirrorManager {
    private List<Mirror> s3MirrorList = new ArrayList<>();
    private List<Mirror> metaMirrorList = new ArrayList<>();
    private List<Mirror> mavenMirrorList = new ArrayList<>();
    private HashMap<Mirror, Integer> tpsMap = new HashMap<>();

    public void addMirror(Mirror mirror) {
        switch(mirror.getMirrorType()) {
            case S3:
                s3MirrorList.add(mirror);
                break;
            case META:
                metaMirrorList.add(mirror);
                break;
            case MAVEN:
                mavenMirrorList.add(mirror);
                break;
        }
    }

}
