package kr.edcan.sunrinton.views;

import android.graphics.Color;

/**
 * Created by fluor on 2017-05-07.
 */

public class CartaTagConfiguration {
    private boolean textColorEnabled = false, isFullMode = false, isGradient = false;
    private int themeColor = Color.BLACK, gradientStartColor = Color.BLACK, gradientEndColor = Color.WHITE, textColor = Color.BLACK;

    public CartaTagConfiguration() {
    }

    public CartaTagConfiguration setTextColorEnabled(boolean textColorEnabled) {
        this.textColorEnabled = textColorEnabled;
        return this;
    }

    public CartaTagConfiguration setFullMode(boolean isFullMode) {
        this.isFullMode = isFullMode;
        return this;
    }

    public CartaTagConfiguration setGradientMode(boolean isGradient) {
        this.isGradient = isGradient;
        return this;
    }

    public CartaTagConfiguration setThemeColor(int themeColor) {
        this.themeColor = themeColor;
        return this;
    }

    public CartaTagConfiguration setGradientStartColor(int startColor) {
        this.gradientStartColor = startColor;
        return this;
    }

    public CartaTagConfiguration setGradientEndColor(int endColor) {
        this.gradientEndColor = endColor;
        return this;
    }

    public CartaTagConfiguration setGradientColor(int startColor, int endColor) {
        this.gradientStartColor = startColor;
        this.gradientEndColor = endColor;
        return this;
    }

    public CartaTagConfiguration setTextColor(int textColor) {
        this.textColor = textColor;
        return this;
    }



    public boolean isTextColorEnabled() {
        return textColorEnabled;
    }

    public boolean isFullMode() {
        return isFullMode;
    }

    public boolean isGradient() {
        return isGradient;
    }

    public int getThemeColor() {
        return themeColor;
    }

    public int getGradientStartColor() {
        return gradientStartColor;
    }

    public int getGradientEndColor() {
        return gradientEndColor;
    }

    public int getTextColor() {
        return textColor;
    }

}
