package com.bill.shapeimageview;

import android.support.annotation.IntDef;

/**
 * Created by Bill on 18/5/21.
 */
@IntDef({ImageType.MODE_NONE, ImageType.MODE_ROUND_RECT, ImageType.MODE_CIRCLE})
public @interface ImageType {
    int MODE_NONE = 0;
    int MODE_ROUND_RECT = 1;
    int MODE_CIRCLE = 2;
}