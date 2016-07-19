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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MirrorManager {
    private List<Mirror> s3MirrorList = new ArrayList<>();
    private List<Mirror> metaMirrorList = new ArrayList<>();
    private List<Mirror> mavenMirrorList = new ArrayList<>();
    private HashMap<Mirror, Long> s3TpsMap = new HashMap<>();
    private HashMap<Mirror, Long> metaTpsMap = new HashMap<>();
    private HashMap<Mirror, Long> mavenTpsMap = new HashMap<>();

    public MirrorManager() {
        try {
            s3MirrorList.add(new S3Mirror("Official S3 repo", true, "Official", new URL("https://s3.amazonaws.com")));
            metaMirrorList.add(new MetaMirror("Official Meta repo", true, "Official", new URL("https://launchermeta.mojang.com/mc")));
            mavenMirrorList.add(new Mirror("Official Libraries Maven repo", true, MirrorType.MAVEN, "Official", new URL("https://libraries.minecraft.net")) {});
        } catch (MalformedURLException e) {
            InfinityDownloader.logger.error(e);
        }
    }

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

    public void refreshSpeed() {
        for(Mirror mirror : s3MirrorList) {
            long first = URLConnectionTimer.testTime(mirror.getUrl().toString());
            long second = URLConnectionTimer.testTime(mirror.getUrl().toString());
            long third = URLConnectionTimer.testTime(mirror.getUrl().toString());
            s3TpsMap.put(mirror, (first+second+third)/3);
        }
        for(Mirror mirror : metaMirrorList) {
            long first = URLConnectionTimer.testTime(mirror.getUrl().toString());
            long second = URLConnectionTimer.testTime(mirror.getUrl().toString());
            long third = URLConnectionTimer.testTime(mirror.getUrl().toString());
            metaTpsMap.put(mirror, (first+second+third)/3);
        }
        for(Mirror mirror : mavenMirrorList) {
            long first = URLConnectionTimer.testTime(mirror.getUrl().toString());
            long second = URLConnectionTimer.testTime(mirror.getUrl().toString());
            long third = URLConnectionTimer.testTime(mirror.getUrl().toString());
            mavenTpsMap.put(mirror, (first+second+third)/3);
        }
    }

    public String getFastestS3MirrorURL() {
        int tag = 0;
        long l = -1;
        for(int i=0; i<s3TpsMap.size(); i++) {
            if(((Long[])s3TpsMap.values().toArray())[i]>l) {
                l = ((Long[]) s3TpsMap.values().toArray())[i];
                tag = i;
            }
        }
        return ((Mirror[])s3TpsMap.keySet().toArray())[tag].getUrl().toString();
    }

    public String getFastestMetaMirrorURL() {
        int tag = 0;
        long l = -1;
        for(int i=0; i<metaTpsMap.size(); i++) {
            if(((Long[])metaTpsMap.values().toArray())[i]>l) {
                l = ((Long[]) s3TpsMap.values().toArray())[i];
                tag = i;
            }
        }

        return ((Mirror[])s3TpsMap.keySet().toArray())[tag].getUrl().toString();
    }
    public String getFastestMavenMirrorURL() {
        int tag = 0;
        long l = -1;
        for(int i=0; i<mavenTpsMap.size(); i++) {
            if(((Long[])mavenTpsMap.values().toArray())[i]>l) {
                l = ((Long[]) s3TpsMap.values().toArray())[i];
                tag = i;
            }
        }
        return ((Mirror[])mavenTpsMap.keySet().toArray())[tag].getUrl().toString();
    }

}
