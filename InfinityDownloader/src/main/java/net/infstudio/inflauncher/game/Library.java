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
package net.infstudio.inflauncher.game;

public class Library implements IResource {
    private String groupId;
    private String artifactId;
    private String version;
    private String classifier;
    private String url;
    private boolean clientreq;
    private boolean serverreq;
    private String[] checksums;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getClassifier() {
        return classifier;
    }

    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isClientreq() {
        return clientreq;
    }

    public void setClientreq(boolean clientreq) {
        this.clientreq = clientreq;
    }

    public boolean isServerreq() {
        return serverreq;
    }

    public void setServerreq(boolean serverreq) {
        this.serverreq = serverreq;
    }

    public String[] getChecksums() {
        return checksums;
    }

    public void setChecksums(String[] checksums) {
        this.checksums = checksums;
    }

    @Override
    public String getURL() {
        return "";
    }
}
