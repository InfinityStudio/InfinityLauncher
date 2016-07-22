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
package net.infstudio.inflauncher.game;

import org.to2mbn.jmccc.auth.AuthenticationException;

/**
 * @author gonglinyuan
 *         created on 11:52, 2016/7/22.
 */
public class NoSuchAuthenticatorException extends AuthenticationException {

    public NoSuchAuthenticatorException(int number) {
        super("No such authenticator numbered " + number + " . The config file might be corrupted.");
    }
}
