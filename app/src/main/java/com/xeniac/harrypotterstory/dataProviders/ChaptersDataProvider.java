package com.xeniac.harrypotterstory.dataProviders;

import com.xeniac.harrypotterstory.R;
import com.xeniac.harrypotterstory.models.DataItemChapters;

import java.util.ArrayList;
import java.util.List;

public class ChaptersDataProvider {

    public static List<DataItemChapters> dataItemChaptersList;

    static {
        dataItemChaptersList = new ArrayList<>();

        //Book 1
        addItem(new DataItemChapters(11, 1, R.string.string_book_1_chapters_title_1, 17, 0, 0, 1, "ic_cover_chapters_1_1.jpg", false, false));
        addItem(new DataItemChapters(12, 2, R.string.string_book_1_chapters_title_2, 13, 0, 0, 1, "ic_cover_chapters_1_2.jpg", false, false));
        addItem(new DataItemChapters(13, 3, R.string.string_book_1_chapters_title_3, 15, 0, 0, 1, "ic_cover_chapters_1_3.jpg", false, false));
        addItem(new DataItemChapters(14, 4, R.string.string_book_1_chapters_title_4, 15, 0, 0, 1, "ic_cover_chapters_1_4.jpg", false, false));
        addItem(new DataItemChapters(15, 5, R.string.string_book_1_chapters_title_5, 27, 0, 0, 1, "ic_cover_chapters_1_5.jpg", false, false));
        addItem(new DataItemChapters(16, 6, R.string.string_book_1_chapters_title_6, 25, 0, 0, 1, "ic_cover_chapters_1_6.jpg", false, false));
        addItem(new DataItemChapters(17, 7, R.string.string_book_1_chapters_title_7, 18, 0, 0, 1, "ic_cover_chapters_1_7.jpg", false, false));
        addItem(new DataItemChapters(18, 8, R.string.string_book_1_chapters_title_8, 12, 0, 0, 1, "ic_cover_chapters_1_8.jpg", false, false));
        addItem(new DataItemChapters(19, 9, R.string.string_book_1_chapters_title_9, 20, 0, 0, 1, "ic_cover_chapters_1_9.jpg", false, false));
        addItem(new DataItemChapters(110, 10, R.string.string_book_1_chapters_title_10, 17, 0, 0, 1, "ic_cover_chapters_1_10.jpg", false, false));
        addItem(new DataItemChapters(111, 11, R.string.string_book_1_chapters_title_11, 14, 0, 0, 1, "ic_cover_chapters_1_11.jpg", false, false));
        addItem(new DataItemChapters(112, 12, R.string.string_book_1_chapters_title_12, 21, 0, 0, 1, "ic_cover_chapters_1_12.jpg", false, false));
        addItem(new DataItemChapters(113, 13, R.string.string_book_1_chapters_title_13, 13, 0, 0, 1, "ic_cover_chapters_1_13.jpg", false, false));
        addItem(new DataItemChapters(114, 14, R.string.string_book_1_chapters_title_14, 14, 0, 0, 1, "ic_cover_chapters_1_14.jpg", false, false));
        addItem(new DataItemChapters(115, 15, R.string.string_book_1_chapters_title_15, 20, 0, 0, 1, "ic_cover_chapters_1_15.jpg", false, false));
        addItem(new DataItemChapters(116, 16, R.string.string_book_1_chapters_title_16, 26, 0, 0, 1, "ic_cover_chapters_1_16.jpg", false, false));
        addItem(new DataItemChapters(117, 17, R.string.string_book_1_chapters_title_17, 22, 0, 0, 1, "ic_cover_chapters_1_17.jpg", false, false));

        //Book 2
        addItem(new DataItemChapters(21, 1, R.string.string_book_2_chapters_title_1, 11, 0, 0, 2, "ic_cover_chapters_2_1.jpg", false, false));
        addItem(new DataItemChapters(22, 2, R.string.string_book_2_chapters_title_2, 12, 0, 0, 2, "ic_cover_chapters_2_2.jpg", false, false));
        addItem(new DataItemChapters(23, 3, R.string.string_book_2_chapters_title_3, 18, 0, 0, 2, "ic_cover_chapters_2_3.jpg", false, false));
        addItem(new DataItemChapters(24, 4, R.string.string_book_2_chapters_title_4, 23, 0, 0, 2, "ic_cover_chapters_2_4.jpg", false, false));
        addItem(new DataItemChapters(25, 5, R.string.string_book_2_chapters_title_5, 21, 0, 0, 2, "ic_cover_chapters_2_5.jpg", false, false));
        addItem(new DataItemChapters(26, 6, R.string.string_book_2_chapters_title_6, 18, 0, 0, 2, "ic_cover_chapters_2_6.jpg", false, false));
        addItem(new DataItemChapters(27, 7, R.string.string_book_2_chapters_title_7, 18, 0, 0, 2, "ic_cover_chapters_2_7.jpg", false, false));
        addItem(new DataItemChapters(28, 8, R.string.string_book_2_chapters_title_8, 18, 0, 0, 2, "ic_cover_chapters_2_8.jpg", false, false));
        addItem(new DataItemChapters(29, 9, R.string.string_book_2_chapters_title_9, 21, 0, 0, 2, "ic_cover_chapters_2_9.jpg", false, false));
        addItem(new DataItemChapters(210, 10, R.string.string_book_2_chapters_title_10, 21, 0, 0, 2, "ic_cover_chapters_2_10.jpg", false, false));
        addItem(new DataItemChapters(211, 11, R.string.string_book_2_chapters_title_11, 23, 0, 0, 2, "ic_cover_chapters_2_11.jpg", false, false));
        addItem(new DataItemChapters(212, 12, R.string.string_book_2_chapters_title_12, 22, 0, 0, 2, "ic_cover_chapters_2_12.jpg", false, false));
        addItem(new DataItemChapters(213, 13, R.string.string_book_2_chapters_title_13, 33, 0, 0, 2, "ic_cover_chapters_2_13.jpg", false, false));
        addItem(new DataItemChapters(214, 14, R.string.string_book_2_chapters_title_14, 16, 0, 0, 2, "ic_cover_chapters_2_14.jpg", false, false));
        addItem(new DataItemChapters(215, 15, R.string.string_book_2_chapters_title_15, 18, 0, 0, 2, "ic_cover_chapters_2_15.jpg", false, false));
        addItem(new DataItemChapters(216, 16, R.string.string_book_2_chapters_title_16, 23, 0, 0, 2, "ic_cover_chapters_2_16.jpg", false, false));
        addItem(new DataItemChapters(217, 17, R.string.string_book_2_chapters_title_17, 21, 0, 0, 2, "ic_cover_chapters_2_17.jpg", false, false));
        addItem(new DataItemChapters(218, 18, R.string.string_book_2_chapters_title_18, 15, 0, 0, 2, "ic_cover_chapters_2_18.jpg", false, false));

        //Book 3
        addItem(new DataItemChapters(31, 1, R.string.string_book_3_chapters_title_1, 15, 0, 0, 3, "ic_cover_chapters_3_1.jpg", false, false));
        addItem(new DataItemChapters(32, 2, R.string.string_book_3_chapters_title_2, 15, 0, 0, 3, "ic_cover_chapters_3_2.jpg", false, false));
        addItem(new DataItemChapters(33, 3, R.string.string_book_3_chapters_title_3, 18, 0, 0, 3, "ic_cover_chapters_3_3.jpg", false, false));
        addItem(new DataItemChapters(34, 4, R.string.string_book_3_chapters_title_4, 20, 0, 0, 3, "ic_cover_chapters_3_4.jpg", false, false));
        addItem(new DataItemChapters(35, 5, R.string.string_book_3_chapters_title_5, 27, 0, 0, 3, "ic_cover_chapters_3_5.jpg", false, false));
        addItem(new DataItemChapters(36, 6, R.string.string_book_3_chapters_title_6, 27, 0, 0, 3, "ic_cover_chapters_3_6.jpg", false, false));
        addItem(new DataItemChapters(37, 7, R.string.string_book_3_chapters_title_7, 18, 0, 0, 3, "ic_cover_chapters_3_7.jpg", false, false));
        addItem(new DataItemChapters(38, 8, R.string.string_book_3_chapters_title_8, 21, 0, 0, 3, "ic_cover_chapters_3_8.jpg", false, false));
        addItem(new DataItemChapters(39, 9, R.string.string_book_3_chapters_title_9, 21, 0, 0, 3, "ic_cover_chapters_3_9.jpg", false, false));
        addItem(new DataItemChapters(310, 10, R.string.string_book_3_chapters_title_10, 28, 0, 0, 3, "ic_cover_chapters_3_10.jpg", false, false));
        addItem(new DataItemChapters(311, 11, R.string.string_book_3_chapters_title_11, 22, 0, 0, 3, "ic_cover_chapters_3_11.jpg", false, false));
        addItem(new DataItemChapters(312, 12, R.string.string_book_3_chapters_title_12, 19, 0, 0, 3, "ic_cover_chapters_3_12.jpg", false, false));
        addItem(new DataItemChapters(313, 13, R.string.string_book_3_chapters_title_13, 17, 0, 0, 3, "ic_cover_chapters_3_13.jpg", false, false));
        addItem(new DataItemChapters(314, 14, R.string.string_book_3_chapters_title_14, 22, 0, 0, 3, "ic_cover_chapters_3_14.jpg", false, false));
        addItem(new DataItemChapters(315, 15, R.string.string_book_3_chapters_title_15, 23, 0, 0, 3, "ic_cover_chapters_3_15.jpg", false, false));
        addItem(new DataItemChapters(316, 16, R.string.string_book_3_chapters_title_16, 18, 0, 0, 3, "ic_cover_chapters_3_16.jpg", false, false));
        addItem(new DataItemChapters(317, 17, R.string.string_book_3_chapters_title_17, 17, 0, 0, 3, "ic_cover_chapters_3_17.jpg", false, false));
        addItem(new DataItemChapters(318, 18, R.string.string_book_3_chapters_title_18, 9, 0, 0, 3, "ic_cover_chapters_3_18.jpg", false, false));
        addItem(new DataItemChapters(319, 19, R.string.string_book_3_chapters_title_19, 20, 0, 0, 3, "ic_cover_chapters_3_19.jpg", false, false));
        addItem(new DataItemChapters(320, 20, R.string.string_book_3_chapters_title_20, 8, 0, 0, 3, "ic_cover_chapters_3_20.jpg", false, false));
        addItem(new DataItemChapters(321, 21, R.string.string_book_3_chapters_title_21, 30, 0, 0, 3, "ic_cover_chapters_3_21.jpg", false, false));
        addItem(new DataItemChapters(322, 22, R.string.string_book_3_chapters_title_22, 20, 0, 0, 3, "ic_cover_chapters_3_22.jpg", false, false));

        //Book 4
        addItem(new DataItemChapters(41, 1, R.string.string_book_4_chapters_title_1, 15, 0, 0, 4, "ic_cover_chapters_4_1.jpg", false, false));
        addItem(new DataItemChapters(42, 2, R.string.string_book_4_chapters_title_2, 10, 0, 0, 4, "ic_cover_chapters_4_2.jpg", false, false));
        addItem(new DataItemChapters(43, 3, R.string.string_book_4_chapters_title_3, 13, 0, 0, 4, "ic_cover_chapters_4_3.jpg", false, false));
        addItem(new DataItemChapters(44, 4, R.string.string_book_4_chapters_title_4, 12, 0, 0, 4, "ic_cover_chapters_4_4.jpg", false, false));
        addItem(new DataItemChapters(45, 5, R.string.string_book_4_chapters_title_5, 14, 0, 0, 4, "ic_cover_chapters_4_5.jpg", false, false));
        addItem(new DataItemChapters(46, 6, R.string.string_book_4_chapters_title_6, 10, 0, 0, 4, "ic_cover_chapters_4_6.jpg", false, false));
        addItem(new DataItemChapters(47, 7, R.string.string_book_4_chapters_title_7, 20, 0, 0, 4, "ic_cover_chapters_4_7.jpg", false, false));
        addItem(new DataItemChapters(48, 8, R.string.string_book_4_chapters_title_8, 22, 0, 0, 4, "ic_cover_chapters_4_8.jpg", false, false));
        addItem(new DataItemChapters(49, 9, R.string.string_book_4_chapters_title_9, 28, 0, 0, 4, "ic_cover_chapters_4_9.jpg", false, false));
        addItem(new DataItemChapters(410, 10, R.string.string_book_4_chapters_title_10, 13, 0, 0, 4, "ic_cover_chapters_4_10.jpg", false, false));
        addItem(new DataItemChapters(411, 11, R.string.string_book_4_chapters_title_11, 13, 0, 0, 4, "ic_cover_chapters_4_11.jpg", false, false));
        addItem(new DataItemChapters(412, 12, R.string.string_book_4_chapters_title_12, 22, 0, 0, 4, "ic_cover_chapters_4_12.jpg", false, false));
        addItem(new DataItemChapters(413, 13, R.string.string_book_4_chapters_title_13, 16, 0, 0, 4, "ic_cover_chapters_4_13.jpg", false, false));
        addItem(new DataItemChapters(414, 14, R.string.string_book_4_chapters_title_14, 19, 0, 0, 4, "ic_cover_chapters_4_14.jpg", false, false));
        addItem(new DataItemChapters(415, 15, R.string.string_book_4_chapters_title_15, 20, 0, 0, 4, "ic_cover_chapters_4_15.jpg", false, false));
        addItem(new DataItemChapters(416, 16, R.string.string_book_4_chapters_title_16, 24, 0, 0, 4, "ic_cover_chapters_4_16.jpg", false, false));
        addItem(new DataItemChapters(417, 17, R.string.string_book_4_chapters_title_17, 16, 0, 0, 4, "ic_cover_chapters_4_17.jpg", false, false));
        addItem(new DataItemChapters(418, 18, R.string.string_book_4_chapters_title_18, 25, 0, 0, 4, "ic_cover_chapters_4_18.jpg", false, false));
        addItem(new DataItemChapters(419, 19, R.string.string_book_4_chapters_title_19, 24, 0, 0, 4, "ic_cover_chapters_4_19.jpg", false, false));
        addItem(new DataItemChapters(420, 20, R.string.string_book_4_chapters_title_20, 26, 0, 0, 4, "ic_cover_chapters_4_20.jpg", false, false));
        addItem(new DataItemChapters(421, 21, R.string.string_book_4_chapters_title_21, 22, 0, 0, 4, "ic_cover_chapters_4_21.jpg", false, false));
        addItem(new DataItemChapters(422, 22, R.string.string_book_4_chapters_title_22, 18, 0, 0, 4, "ic_cover_chapters_4_22.jpg", false, false));
        addItem(new DataItemChapters(423, 23, R.string.string_book_4_chapters_title_23, 30, 0, 0, 4, "ic_cover_chapters_4_23.jpg", false, false));
        addItem(new DataItemChapters(424, 24, R.string.string_book_4_chapters_title_24, 25, 0, 0, 4, "ic_cover_chapters_4_24.jpg", false, false));
        addItem(new DataItemChapters(425, 25, R.string.string_book_4_chapters_title_25, 21, 0, 0, 4, "ic_cover_chapters_4_25.jpg", false, false));
        addItem(new DataItemChapters(426, 26, R.string.string_book_4_chapters_title_26, 30, 0, 0, 4, "ic_cover_chapters_4_26.jpg", false, false));
        addItem(new DataItemChapters(427, 27, R.string.string_book_4_chapters_title_27, 26, 0, 0, 4, "ic_cover_chapters_4_27.jpg", false, false));
        addItem(new DataItemChapters(428, 28, R.string.string_book_4_chapters_title_28, 29, 0, 0, 4, "ic_cover_chapters_4_28.jpg", false, false));
        addItem(new DataItemChapters(429, 29, R.string.string_book_4_chapters_title_29, 17, 0, 0, 4, "ic_cover_chapters_4_29.jpg", false, false));
        addItem(new DataItemChapters(430, 30, R.string.string_book_4_chapters_title_30, 24, 0, 0, 4, "ic_cover_chapters_4_30.jpg", false, false));
        addItem(new DataItemChapters(431, 31, R.string.string_book_4_chapters_title_31, 31, 0, 0, 4, "ic_cover_chapters_4_31.jpg", false, false));
        addItem(new DataItemChapters(432, 32, R.string.string_book_4_chapters_title_32, 8, 0, 0, 4, "ic_cover_chapters_4_32.jpg", false, false));
        addItem(new DataItemChapters(433, 33, R.string.string_book_4_chapters_title_33, 15, 0, 0, 4, "ic_cover_chapters_4_37.jpg", false, false));

        //Book 5
        addItem(new DataItemChapters(51, 1, R.string.string_book_5_chapters_title_1, 19, 0, 0, 5, "ic_cover_chapters_5_1.jpg", false, false));
        addItem(new DataItemChapters(52, 2, R.string.string_book_5_chapters_title_2, 22, 0, 0, 5, "ic_cover_chapters_5_2.jpg", false, false));
        addItem(new DataItemChapters(53, 3, R.string.string_book_5_chapters_title_3, 17, 0, 0, 5, "ic_cover_chapters_5_3.jpg", false, false));
        addItem(new DataItemChapters(54, 4, R.string.string_book_5_chapters_title_4, 20, 0, 0, 5, "ic_cover_chapters_5_4.jpg", false, false));
        addItem(new DataItemChapters(55, 5, R.string.string_book_5_chapters_title_5, 19, 0, 0, 5, "ic_cover_chapters_5_5.jpg", false, false));
        addItem(new DataItemChapters(56, 6, R.string.string_book_5_chapters_title_6, 23, 0, 0, 5, "ic_cover_chapters_5_6.jpg", false, false));
        addItem(new DataItemChapters(57, 7, R.string.string_book_5_chapters_title_7, 16, 0, 0, 5, "ic_cover_chapters_5_7.jpg", false, false));
        addItem(new DataItemChapters(58, 8, R.string.string_book_5_chapters_title_8, 15, 0, 0, 5, "ic_cover_chapters_5_8.jpg", false, false));
        addItem(new DataItemChapters(59, 9, R.string.string_book_5_chapters_title_9, 27, 0, 0, 5, "ic_cover_chapters_5_9.jpg", false, false));
        addItem(new DataItemChapters(510, 10, R.string.string_book_5_chapters_title_10, 21, 0, 0, 5, "ic_cover_chapters_5_10.jpg", false, false));
        addItem(new DataItemChapters(511, 11, R.string.string_book_5_chapters_title_11, 21, 0, 0, 5, "ic_cover_chapters_5_11.jpg", false, false));
        addItem(new DataItemChapters(512, 12, R.string.string_book_5_chapters_title_12, 29, 0, 0, 5, "ic_cover_chapters_5_12.jpg", false, false));
        addItem(new DataItemChapters(513, 13, R.string.string_book_5_chapters_title_13, 29, 0, 0, 5, "ic_cover_chapters_5_13.jpg", false, false));
        addItem(new DataItemChapters(514, 14, R.string.string_book_5_chapters_title_14, 27, 0, 0, 5, "ic_cover_chapters_5_14.jpg", false, false));
        addItem(new DataItemChapters(515, 15, R.string.string_book_5_chapters_title_15, 24, 0, 0, 5, "ic_cover_chapters_5_15.jpg", false, false));
        addItem(new DataItemChapters(516, 16, R.string.string_book_5_chapters_title_16, 20, 0, 0, 5, "ic_cover_chapters_5_16.jpg", false, false));
        addItem(new DataItemChapters(517, 17, R.string.string_book_5_chapters_title_17, 24, 0, 0, 5, "ic_cover_chapters_5_17.jpg", false, false));
        addItem(new DataItemChapters(518, 18, R.string.string_book_5_chapters_title_18, 23, 0, 0, 5, "ic_cover_chapters_5_18.jpg", false, false));
        addItem(new DataItemChapters(519, 19, R.string.string_book_5_chapters_title_19, 23, 0, 0, 5, "ic_cover_chapters_5_19.jpg", false, false));
        addItem(new DataItemChapters(520, 20, R.string.string_book_5_chapters_title_20, 21, 0, 0, 5, "ic_cover_chapters_5_20.jpg", false, false));
        addItem(new DataItemChapters(521, 21, R.string.string_book_5_chapters_title_21, 25, 0, 0, 5, "ic_cover_chapters_5_21.jpg", false, false));
        addItem(new DataItemChapters(522, 22, R.string.string_book_5_chapters_title_22, 26, 0, 0, 5, "ic_cover_chapters_5_22.jpg", false, false));
        addItem(new DataItemChapters(523, 23, R.string.string_book_5_chapters_title_23, 24, 0, 0, 5, "ic_cover_chapters_5_23.jpg", false, false));
        addItem(new DataItemChapters(524, 24, R.string.string_book_5_chapters_title_24, 27, 0, 0, 5, "ic_cover_chapters_5_24.jpg", false, false));
        addItem(new DataItemChapters(525, 25, R.string.string_book_5_chapters_title_25, 27, 0, 0, 5, "ic_cover_chapters_5_25.jpg", false, false));
        addItem(new DataItemChapters(526, 26, R.string.string_book_5_chapters_title_26, 29, 0, 0, 5, "ic_cover_chapters_5_26.jpg", false, false));
        addItem(new DataItemChapters(527, 27, R.string.string_book_5_chapters_title_27, 25, 0, 0, 5, "ic_cover_chapters_5_27.jpg", false, false));
        addItem(new DataItemChapters(528, 28, R.string.string_book_5_chapters_title_28, 27, 0, 0, 5, "ic_cover_chapters_5_28.jpg", false, false));
        addItem(new DataItemChapters(529, 29, R.string.string_book_5_chapters_title_29, 25, 0, 0, 5, "ic_cover_chapters_5_29.jpg", false, false));
        addItem(new DataItemChapters(530, 30, R.string.string_book_5_chapters_title_30, 27, 0, 0, 5, "ic_cover_chapters_5_30.jpg", false, false));
        addItem(new DataItemChapters(531, 31, R.string.string_book_5_chapters_title_31, 26, 0, 0, 5, "ic_cover_chapters_5_31.jpg", false, false));
        addItem(new DataItemChapters(532, 32, R.string.string_book_5_chapters_title_33, 22, 0, 0, 5, "ic_cover_chapters_5_32.jpg", false, false));
        addItem(new DataItemChapters(534, 34, R.string.string_book_5_chapters_title_32, 13, 0, 0, 5, "ic_cover_chapters_5_33.jpg", false, false));
        addItem(new DataItemChapters(533, 33, R.string.string_book_5_chapters_title_34, 17, 0, 0, 5, "ic_cover_chapters_5_34.jpg", false, false));
        addItem(new DataItemChapters(535, 35, R.string.string_book_5_chapters_title_35, 26, 0, 0, 5, "ic_cover_chapters_5_35.jpg", false, false));
        addItem(new DataItemChapters(536, 36, R.string.string_book_5_chapters_title_36, 13, 0, 0, 5, "ic_cover_chapters_5_36.jpg", false, false));
        addItem(new DataItemChapters(537, 37, R.string.string_book_5_chapters_title_37, 25, 0, 0, 5, "ic_cover_chapters_5_37.jpg", false, false));
        addItem(new DataItemChapters(538, 38, R.string.string_book_5_chapters_title_38, 26, 0, 0, 5, "ic_cover_chapters_5_38.jpg", false, false));

        //Book 6
        addItem(new DataItemChapters(61, 1, R.string.string_book_6_chapters_title_1, 18, 0, 0, 6, "ic_cover_chapters_6_1.jpg", false, false));
        addItem(new DataItemChapters(62, 2, R.string.string_book_6_chapters_title_2, 19, 0, 0, 6, "ic_cover_chapters_6_2.jpg", false, false));
        addItem(new DataItemChapters(63, 3, R.string.string_book_6_chapters_title_3, 19, 0, 0, 6, "ic_cover_chapters_6_3.jpg", false, false));
        addItem(new DataItemChapters(64, 4, R.string.string_book_6_chapters_title_4, 24, 0, 0, 6, "ic_cover_chapters_6_4.jpg", false, false));
        addItem(new DataItemChapters(65, 5, R.string.string_book_6_chapters_title_5, 24, 0, 0, 6, "ic_cover_chapters_6_5.jpg", false, false));
        addItem(new DataItemChapters(66, 6, R.string.string_book_6_chapters_title_6, 24, 0, 0, 6, "ic_cover_chapters_6_6.jpg", false, false));
        addItem(new DataItemChapters(67, 7, R.string.string_book_6_chapters_title_7, 26, 0, 0, 6, "ic_cover_chapters_6_7.jpg", false, false));
        addItem(new DataItemChapters(68, 8, R.string.string_book_6_chapters_title_8, 16, 0, 0, 6, "ic_cover_chapters_6_8.jpg", false, false));
        addItem(new DataItemChapters(69, 9, R.string.string_book_6_chapters_title_9, 23, 0, 0, 6, "ic_cover_chapters_6_9.jpg", false, false));
        addItem(new DataItemChapters(610, 10, R.string.string_book_6_chapters_title_10, 23, 0, 0, 6, "ic_cover_chapters_6_10.jpg", false, false));
        addItem(new DataItemChapters(611, 11, R.string.string_book_6_chapters_title_11, 20, 0, 0, 6, "ic_cover_chapters_6_11.jpg", false, false));
        addItem(new DataItemChapters(612, 12, R.string.string_book_6_chapters_title_12, 21, 0, 0, 6, "ic_cover_chapters_6_12.jpg", false, false));
        addItem(new DataItemChapters(613, 13, R.string.string_book_6_chapters_title_13, 21, 0, 0, 6, "ic_cover_chapters_6_13.jpg", false, false));
        addItem(new DataItemChapters(614, 14, R.string.string_book_6_chapters_title_14, 24, 0, 0, 6, "ic_cover_chapters_6_14.jpg", false, false));
        addItem(new DataItemChapters(615, 15, R.string.string_book_6_chapters_title_15, 22, 0, 0, 6, "ic_cover_chapters_6_15.jpg", false, false));
        addItem(new DataItemChapters(616, 16, R.string.string_book_6_chapters_title_16, 24, 0, 0, 6, "ic_cover_chapters_6_16.jpg", false, false));
        addItem(new DataItemChapters(617, 17, R.string.string_book_6_chapters_title_17, 24, 0, 0, 6, "ic_cover_chapters_6_17.jpg", false, false));
        addItem(new DataItemChapters(618, 18, R.string.string_book_6_chapters_title_18, 26, 0, 0, 6, "ic_cover_chapters_6_18.jpg", false, false));
        addItem(new DataItemChapters(619, 19, R.string.string_book_6_chapters_title_19, 24, 0, 0, 6, "ic_cover_chapters_6_19.jpg", false, false));
        addItem(new DataItemChapters(620, 20, R.string.string_book_6_chapters_title_20, 24, 0, 0, 6, "ic_cover_chapters_6_20.jpg", false, false));
        addItem(new DataItemChapters(621, 21, R.string.string_book_6_chapters_title_21, 22, 0, 0, 6, "ic_cover_chapters_6_21.jpg", false, false));
        addItem(new DataItemChapters(622, 22, R.string.string_book_6_chapters_title_22, 22, 0, 0, 6, "ic_cover_chapters_6_22.jpg", false, false));
        addItem(new DataItemChapters(623, 23, R.string.string_book_6_chapters_title_23, 23, 0, 0, 6, "ic_cover_chapters_6_23.jpg", false, false));
        addItem(new DataItemChapters(624, 24, R.string.string_book_6_chapters_title_24, 21, 0, 0, 6, "ic_cover_chapters_6_24.jpg", false, false));
        addItem(new DataItemChapters(625, 25, R.string.string_book_6_chapters_title_25, 22, 0, 0, 6, "ic_cover_chapters_6_25.jpg", false, false));
        addItem(new DataItemChapters(626, 26, R.string.string_book_6_chapters_title_26, 20, 0, 0, 6, "ic_cover_chapters_6_26.jpg", false, false));
        addItem(new DataItemChapters(627, 27, R.string.string_book_6_chapters_title_27, 42, 0, 0, 6, "ic_cover_chapters_6_27.jpg", false, false));
        addItem(new DataItemChapters(628, 28, R.string.string_book_6_chapters_title_28, 14, 0, 0, 6, "ic_cover_chapters_6_28.jpg", false, false));
        addItem(new DataItemChapters(629, 29, R.string.string_book_6_chapters_title_29, 22, 0, 0, 6, "ic_cover_chapters_6_29.jpg", false, false));
        addItem(new DataItemChapters(630, 30, R.string.string_book_6_chapters_title_30, 20, 0, 0, 6, "ic_cover_chapters_6_30.jpg", false, false));

        //Book 7
        addItem(new DataItemChapters(71, 1, R.string.string_book_7_chapters_title_1, 12, 0, 0, 7, "ic_cover_chapters_7_1.jpg", false, false));
        addItem(new DataItemChapters(72, 2, R.string.string_book_7_chapters_title_2, 17, 0, 0, 7, "ic_cover_chapters_7_2.jpg", false, false));
        addItem(new DataItemChapters(73, 3, R.string.string_book_7_chapters_title_3, 13, 0, 0, 7, "ic_cover_chapters_7_3.jpg", false, false));
        addItem(new DataItemChapters(74, 4, R.string.string_book_7_chapters_title_4, 20, 0, 0, 7, "ic_cover_chapters_7_4.jpg", false, false));
        addItem(new DataItemChapters(75, 5, R.string.string_book_7_chapters_title_5, 23, 0, 0, 7, "ic_cover_chapters_7_5.jpg", false, false));
        addItem(new DataItemChapters(76, 6, R.string.string_book_7_chapters_title_6, 25, 0, 0, 7, "ic_cover_chapters_7_6.jpg", false, false));
        addItem(new DataItemChapters(77, 7, R.string.string_book_7_chapters_title_7, 26, 0, 0, 7, "ic_cover_chapters_7_7.jpg", false, false));
        addItem(new DataItemChapters(78, 8, R.string.string_book_7_chapters_title_8, 23, 0, 0, 7, "ic_cover_chapters_7_8.jpg", false, false));
        addItem(new DataItemChapters(79, 9, R.string.string_book_7_chapters_title_9, 19, 0, 0, 7, "ic_cover_chapters_7_9.jpg", false, false));
        addItem(new DataItemChapters(710, 10, R.string.string_book_7_chapters_title_10, 25, 0, 0, 7, "ic_cover_chapters_7_10.jpg", false, false));
        addItem(new DataItemChapters(711, 11, R.string.string_book_7_chapters_title_11, 22, 0, 0, 7, "ic_cover_chapters_7_11.jpg", false, false));
        addItem(new DataItemChapters(712, 12, R.string.string_book_7_chapters_title_12, 23, 0, 0, 7, "ic_cover_chapters_7_12.jpg", false, false));
        addItem(new DataItemChapters(713, 13, R.string.string_book_7_chapters_title_13, 22, 0, 0, 7, "ic_cover_chapters_7_13.jpg", false, false));
        addItem(new DataItemChapters(714, 14, R.string.string_book_7_chapters_title_14, 16, 0, 0, 7, "ic_cover_chapters_7_14.jpg", false, false));
        addItem(new DataItemChapters(715, 15, R.string.string_book_7_chapters_title_15, 27, 0, 0, 7, "ic_cover_chapters_7_15.jpg", false, false));
        addItem(new DataItemChapters(716, 16, R.string.string_book_7_chapters_title_16, 19, 0, 0, 7, "ic_cover_chapters_7_16.jpg", false, false));
        addItem(new DataItemChapters(717, 17, R.string.string_book_7_chapters_title_17, 20, 0, 0, 7, "ic_cover_chapters_7_17.jpg", false, false));
        addItem(new DataItemChapters(718, 18, R.string.string_book_7_chapters_title_18, 13, 0, 0, 7, "ic_cover_chapters_7_18.jpg", false, false));
        addItem(new DataItemChapters(719, 19, R.string.string_book_7_chapters_title_19, 25, 0, 0, 7, "ic_cover_chapters_7_19.jpg", false, false));
        addItem(new DataItemChapters(720, 20, R.string.string_book_7_chapters_title_20, 17, 0, 0, 7, "ic_cover_chapters_7_20.jpg", false, false));
        addItem(new DataItemChapters(721, 21, R.string.string_book_7_chapters_title_21, 19, 0, 0, 7, "ic_cover_chapters_7_21.jpg", false, false));
        addItem(new DataItemChapters(722, 22, R.string.string_book_7_chapters_title_22, 22, 0, 0, 7, "ic_cover_chapters_7_22.jpg", false, false));
        addItem(new DataItemChapters(723, 23, R.string.string_book_7_chapters_title_23, 31, 0, 0, 7, "ic_cover_chapters_7_23.jpg", false, false));
        addItem(new DataItemChapters(724, 24, R.string.string_book_7_chapters_title_24, 25, 0, 0, 7, "ic_cover_chapters_7_24.jpg", false, false));
        addItem(new DataItemChapters(725, 25, R.string.string_book_7_chapters_title_25, 17, 0, 0, 7, "ic_cover_chapters_7_25.jpg", false, false));
        addItem(new DataItemChapters(726, 26, R.string.string_book_7_chapters_title_26, 25, 0, 0, 7, "ic_cover_chapters_7_26.jpg", false, false));
        addItem(new DataItemChapters(727, 27, R.string.string_book_7_chapters_title_27, 10, 0, 0, 7, "ic_cover_chapters_7_27.jpg", false, false));
        addItem(new DataItemChapters(728, 28, R.string.string_book_7_chapters_title_28, 17, 0, 0, 7, "ic_cover_chapters_7_28.jpg", false, false));
        addItem(new DataItemChapters(729, 29, R.string.string_book_7_chapters_title_29, 18, 0, 0, 7, "ic_cover_chapters_7_29.jpg", false, false));
        addItem(new DataItemChapters(730, 30, R.string.string_book_7_chapters_title_30, 19, 0, 0, 7, "ic_cover_chapters_7_30.jpg", false, false));
        addItem(new DataItemChapters(731, 31, R.string.string_book_7_chapters_title_31, 30, 0, 0, 7, "ic_cover_chapters_7_31.jpg", false, false));
        addItem(new DataItemChapters(732, 32, R.string.string_book_7_chapters_title_32, 29, 0, 0, 7, "ic_cover_chapters_7_32.jpg", false, false));
        addItem(new DataItemChapters(733, 33, R.string.string_book_7_chapters_title_33, 32, 0, 0, 7, "ic_cover_chapters_7_33.jpg", false, false));
        addItem(new DataItemChapters(734, 34, R.string.string_book_7_chapters_title_34, 14, 0, 0, 7, "ic_cover_chapters_7_34.jpg", false, false));
        addItem(new DataItemChapters(735, 35, R.string.string_book_7_chapters_title_35, 19, 0, 0, 7, "ic_cover_chapters_7_35.jpg", false, false));
        addItem(new DataItemChapters(736, 36, R.string.string_book_7_chapters_title_36, 29, 0, 0, 7, "ic_cover_chapters_7_36.jpg", false, false));
        addItem(new DataItemChapters(737, 37, R.string.string_book_7_chapters_title_37, 7, 0, 0, 7, "ic_cover_chapters_7_37.jpg", false, false));
    }

    private static void addItem(DataItemChapters item) {
        dataItemChaptersList.add(item);
    }
}