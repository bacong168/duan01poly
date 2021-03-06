package vn.poly.mxmusic.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import vn.poly.mxmusic.database.Database;

public class FavouriteSongDao {
    private static final String TABLE_NAME = "Song";
    public static final String CREATE_SONG_TABLE = "CREATE TABLE [" + TABLE_NAME + "] (\n" +
            "[id] TEXT  NULL PRIMARY KEY,\n" +
            "[title] TEXT  NULL,\n" +
            "[albumID] TEXT  NULL,\n" +
            "[singer] TEXT  NULL,\n" +
            "[duration] TEXT  NULL,\n" +
            "[songUri] TEXT  NULL,\n" +
            ")";
    public static final String DROP_SONG_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public FavouriteSongDao(Context context) {
        Database dbHelper = new Database(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
    }

//    public void insertSong(SongModel songModel) {
//        ContentValues values = new ContentValues();
//        values.put("id", songModel.getId());
//        values.put("title", songModel.getTitle());
//        values.put("albumID", songModel.getAlbumID());
//        values.put("singerID", songModel.getSingerID());
//        values.put("singer", songModel.getSinger());
//        values.put("duration", songModel.getDuration());
//        values.put("songUri", songModel.getSongUri());
//        values.put("favourite", songModel.getFavourite());
//        db.insert(TABLE_NAME, null, values);
//    }
}
