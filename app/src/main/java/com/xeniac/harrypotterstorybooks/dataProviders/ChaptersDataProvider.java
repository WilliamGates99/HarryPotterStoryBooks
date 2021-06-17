package com.xeniac.harrypotterstorybooks.dataProviders;

import com.xeniac.harrypotterstorybooks.R;
import com.xeniac.harrypotterstorybooks.models.DataItemChapters;

import java.util.ArrayList;
import java.util.List;

public class ChaptersDataProvider {

    public static List<DataItemChapters> dataItemChaptersList;

    static {
        dataItemChaptersList = new ArrayList<>();

        //Book 1
        addItem(new DataItemChapters(11, 1, R.string.string_book_1_chapters_title_1, 17, 0, 0, 1, "ic_cover_chapters_1_1.jpg", false, true));
        addItem(new DataItemChapters(12, 2, R.string.string_book_1_chapters_title_2, 13, 0, 0, 1, "ic_cover_chapters_1_2.jpg", false, true));
        addItem(new DataItemChapters(13, 3, R.string.string_book_1_chapters_title_3, 15, 0, 0, 1, "ic_cover_chapters_1_3.jpg", false, true));

        //Book 2
        addItem(new DataItemChapters(21, 1, R.string.string_book_2_chapters_title_1, 11, 0, 0, 2, "ic_cover_chapters_2_1.jpg", false, true));
        addItem(new DataItemChapters(22, 2, R.string.string_book_2_chapters_title_2, 12, 0, 0, 2, "ic_cover_chapters_2_2.jpg", false, true));
        addItem(new DataItemChapters(23, 3, R.string.string_book_2_chapters_title_3, 18, 0, 0, 2, "ic_cover_chapters_2_3.jpg", false, true));

        addItem(new DataItemChapters(31, 1, R.string.string_book_3_chapters_title_1, 15, 0, 0, 3, "ic_cover_chapters_3_1.jpg", false, true));
        addItem(new DataItemChapters(32, 2, R.string.string_book_3_chapters_title_2, 15, 0, 0, 3, "ic_cover_chapters_3_2.jpg", false, true));
        addItem(new DataItemChapters(33, 3, R.string.string_book_3_chapters_title_3, 18, 0, 0, 3, "ic_cover_chapters_3_3.jpg", false, true));

        //Book 4
        addItem(new DataItemChapters(41, 1, R.string.string_book_4_chapters_title_1, 15, 0, 0, 4, "ic_cover_chapters_4_1.jpg", false, true));
        addItem(new DataItemChapters(42, 2, R.string.string_book_4_chapters_title_2, 10, 0, 0, 4, "ic_cover_chapters_4_2.jpg", false, true));
        addItem(new DataItemChapters(43, 3, R.string.string_book_4_chapters_title_3, 13, 0, 0, 4, "ic_cover_chapters_4_3.jpg", false, true));
        addItem(new DataItemChapters(44, 4, R.string.string_book_4_chapters_title_4, 12, 0, 0, 4, "ic_cover_chapters_4_4.jpg", false, true));
        addItem(new DataItemChapters(45, 5, R.string.string_book_4_chapters_title_5, 14, 0, 0, 4, "ic_cover_chapters_4_5.jpg", false, true));
        addItem(new DataItemChapters(46, 6, R.string.string_book_4_chapters_title_6, 10, 0, 0, 4, "ic_cover_chapters_4_6.jpg", false, true));

        //Book 5
        addItem(new DataItemChapters(51, 1, R.string.string_book_5_chapters_title_1, 19, 0, 0, 5, "ic_cover_chapters_5_1.jpg", false, true));
        addItem(new DataItemChapters(52, 2, R.string.string_book_5_chapters_title_2, 22, 0, 0, 5, "ic_cover_chapters_5_2.jpg", false, true));
        addItem(new DataItemChapters(53, 3, R.string.string_book_5_chapters_title_3, 17, 0, 0, 5, "ic_cover_chapters_5_3.jpg", false, true));
        addItem(new DataItemChapters(54, 4, R.string.string_book_5_chapters_title_4, 20, 0, 0, 5, "ic_cover_chapters_5_4.jpg", false, true));
        addItem(new DataItemChapters(55, 5, R.string.string_book_5_chapters_title_5, 19, 0, 0, 5, "ic_cover_chapters_5_5.jpg", false, true));

        //Book 6
        addItem(new DataItemChapters(61, 1, R.string.string_book_6_chapters_title_1, 18, 0, 0, 6, "ic_cover_chapters_6_1.jpg", false, true));
        addItem(new DataItemChapters(62, 2, R.string.string_book_6_chapters_title_2, 19, 0, 0, 6, "ic_cover_chapters_6_2.jpg", false, true));
        addItem(new DataItemChapters(63, 3, R.string.string_book_6_chapters_title_3, 19, 0, 0, 6, "ic_cover_chapters_6_3.jpg", false, true));
        addItem(new DataItemChapters(64, 4, R.string.string_book_6_chapters_title_4, 24, 0, 0, 6, "ic_cover_chapters_6_4.jpg", false, true));

        //Book 7
        addItem(new DataItemChapters(71, 1, R.string.string_book_7_chapters_title_1, 12, 0, 0, 7, "ic_cover_chapters_7_1.jpg", false, true));
        addItem(new DataItemChapters(72, 2, R.string.string_book_7_chapters_title_2, 17, 0, 0, 7, "ic_cover_chapters_7_2.jpg", false, true));
        addItem(new DataItemChapters(73, 3, R.string.string_book_7_chapters_title_3, 13, 0, 0, 7, "ic_cover_chapters_7_3.jpg", false, true));
        addItem(new DataItemChapters(74, 4, R.string.string_book_7_chapters_title_4, 20, 0, 0, 7, "ic_cover_chapters_7_4.jpg", false, true));
        addItem(new DataItemChapters(75, 5, R.string.string_book_7_chapters_title_5, 23, 0, 0, 7, "ic_cover_chapters_7_5.jpg", false, true));
    }

    private static void addItem(DataItemChapters item) {
        dataItemChaptersList.add(item);
    }
}