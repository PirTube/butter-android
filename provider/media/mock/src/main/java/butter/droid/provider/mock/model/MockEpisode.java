/*
 * This file is part of Butter.
 *
 * Butter is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Butter is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Butter. If not, see <http://www.gnu.org/licenses/>.
 */

package butter.droid.provider.mock.model;

public class MockEpisode {

    private long id;
    private String title;
    private int year;
    private String torrent;
    private String poster;
    private String backdrop;
    private String synopsis;
    private int quality;
    private int episdoe;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getTorrent() {
        return torrent;
    }

    public String getPoster() {
        return poster;
    }

    public String getBackdrop() {
        return backdrop;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public int getQuality() {
        return quality;
    }

    public int getEpisdoe() {
        return episdoe;
    }

}
