package com.github.chulift.managementsystem.exceptions;

import android.util.Log;

/**
 * Created by Chulift on 2/7/2018.
 */

public class MvpViewNotAttachedException extends NullPointerException {
    public MvpViewNotAttachedException() {
        Log.e("MvpViewNotAttached", getMessage());
    }
}
