package application.model;

import java.sql.Array;

public class Sitemap {

    private static Sitemap sitemapRef = new Sitemap();

    // TODO: Needs to load from a file
    private Tile[][] tiles = new Tile[10][5];

    public static Sitemap getRef() {
        return sitemapRef;
    }


    private Sitemap() {
        tiles[0][0] = new Tile("o");
        tiles[1][0] = new Tile("o");
        tiles[2][0] = new Tile("t");
        tiles[3][0] = new Tile("o");
        tiles[4][0] = new Tile("o");
        tiles[5][0] = new Tile("o");
        tiles[6][0] = new Tile("o");
        tiles[7][0] = new Tile("o");
        tiles[8][0] = new Tile("o");
        tiles[9][0] = new Tile("o");

        tiles[0][1] = new Tile("o");
        tiles[1][1] = new Tile("o");
        tiles[2][1] = new Tile("o");
        tiles[3][1] = new Tile("o");
        tiles[4][1] = new Tile("o");
        tiles[5][1] = new Tile("o");
        tiles[6][1] = new Tile("o");
        tiles[7][1] = new Tile("T");
        tiles[8][1] = new Tile("o");
        tiles[9][1] = new Tile("o");

        tiles[0][2] = new Tile("r");
        tiles[1][2] = new Tile("r");
        tiles[2][2] = new Tile("r");
        tiles[3][2] = new Tile("o");
        tiles[4][2] = new Tile("o");
        tiles[5][2] = new Tile("o");
        tiles[6][2] = new Tile("o");
        tiles[7][2] = new Tile("T");
        tiles[8][2] = new Tile("o");
        tiles[9][2] = new Tile("o");

        tiles[0][3] = new Tile("r");
        tiles[1][3] = new Tile("r");
        tiles[2][3] = new Tile("r");
        tiles[3][3] = new Tile("r");
        tiles[4][3] = new Tile("o");
        tiles[5][3] = new Tile("o");
        tiles[6][3] = new Tile("o");
        tiles[7][3] = new Tile("o");
        tiles[8][3] = new Tile("o");
        tiles[9][3] = new Tile("o");

        tiles[0][4] = new Tile("r");
        tiles[1][4] = new Tile("r");
        tiles[2][4] = new Tile("r");
        tiles[3][4] = new Tile("r");
        tiles[4][4] = new Tile("r");
        tiles[5][4] = new Tile("t");
        tiles[6][4] = new Tile("o");
        tiles[7][4] = new Tile("o");
        tiles[8][4] = new Tile("o");
        tiles[9][4] = new Tile("o");
    }

    public Tile getTile(Integer x, Integer y) {
        return tiles[x][y];
    }

    public void clearTile(Integer x, Integer y) {
        tiles[x][y] = new Tile("o");
    }
}
