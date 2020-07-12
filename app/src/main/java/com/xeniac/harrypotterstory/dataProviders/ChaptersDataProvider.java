package com.xeniac.harrypotterstory.dataProviders;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.ArrayList;
import java.util.List;

public class ChaptersDataProvider {

    public static List<DataItemChapters> dataItemChaptersList;

    static {
        dataItemChaptersList = new ArrayList<>();

        //TODO Edit released parameter
        //Book 1
        addItem(new DataItemChapters(11, 1, R.string.string_book_1_chapters_title_1, 17, 0, 0, 1, "ic_cover_chapters_1_1.jpg", false, true));
        addItem(new DataItemChapters(12, 2, R.string.string_book_1_chapters_title_2, 13, 0, 0, 1, "ic_cover_chapters_1_2.jpg", false, true));
        addItem(new DataItemChapters(13, 3, R.string.string_book_1_chapters_title_3, 15, 0, 0, 1, "ic_cover_chapters_1_3.jpg", false, true));
        addItem(new DataItemChapters(14, 4, R.string.string_book_1_chapters_title_4, 15, 0, 0, 1, "ic_cover_chapters_1_4.jpg", false, true));
        addItem(new DataItemChapters(15, 5, R.string.string_book_1_chapters_title_5, 27, 0, 0, 1, "ic_cover_chapters_1_5.jpg", false, true));
        addItem(new DataItemChapters(16, 6, R.string.string_book_1_chapters_title_6, 25, 0, 0, 1, "ic_cover_chapters_1_6.jpg", false, true));
        addItem(new DataItemChapters(17, 7, R.string.string_book_1_chapters_title_7, 18, 0, 0, 1, "ic_cover_chapters_1_7.jpg", false, true));
        addItem(new DataItemChapters(18, 8, R.string.string_book_1_chapters_title_8, 12, 0, 0, 1, "ic_cover_chapters_1_8.jpg", false, true));
    }

    private static void addItem(DataItemChapters item) {
        dataItemChaptersList.add(item);
    }
}