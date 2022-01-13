package net.yukkuritaku.discordbot.utils;

import java.awt.*;

/**
 * カラーゆーてぃる、基本的にはEmbedBuilderのカラーセットに使う
 */
public enum ColorUtils {

    //ばちゃしん

    /**
     *初音ミクのイメージカラー
     */
    MIKU(0x33CCBB),

    /**
     * 鏡音リンのイメージカラー
     */
    RIN(0xFFCC11),

    /**
     * 鏡音レンのイメージカラー
     */
    REN(0xFFEE11),

    /**
     * 巡音ルカのイメージカラー
     */
    LUKA(0xFFBBCC),

    /**
     * Meikoのイメージカラー
     */
    MEIKO(0xDD4444),

    /**
     * Kaitoのイメージカラー
     */
    KAITO(0x3366CC),

    //れおに

    /**
     * 星乃一歌のイメージカラー
     */
    ICHIKA(0x33AAEE),

    /**
     * 望月穂波のイメージカラー
     */
    HONAMI(0xEE6666),

    /**
     * 天馬咲希のイメージカラー
     */
    SAKI(0xFFDD44),

    /**
     * 日野森志歩のイメージカラー
     */
    SHIHO(0xBBDD22),

    //ももじゃん

    /**
     * 花里みのりのイメージカラー
     */
    MINORI(0xFFCCAA),

    /**
     * 桐谷遥のイメージカラー
     */
    HARUKA(0x99CCFF),

    /**
     * 桃井愛莉のイメージカラー
     */
    AIRI(0xFFAACC),

    /**
     * 日野森雫のイメージカラー
     */
    SHIZUKU(0x99EEDD),

    //びびばす

    /**
     * 白石杏のイメージカラー
     */
    AN(0x00BBDD),

    /**
     * 小豆沢こはねのイメージカラー
     */
    KOHANE(0xFF6699),

    /**
     * 東雲彰人のイメージカラー
     */
    AKITO(0xFF7722),

    /**
     * 青柳冬弥のイメージカラー
     */
    TOYA(0x0077DD),

    //わんだしょ

    /**
     * 天馬司のイメージカラー
     */
    TSUKASA(0xFFBB00),

    /**
     * 鳳えむのイメージカラー
     */
    EMU(0xFF66BB),

    /**
     * 草薙寧々のイメージカラー
     */
    NENE(0x33DD99),

    /**
     * 神代類のイメージカラー
     */
    RUI(0xBB88EE),

    //にーご

    /**
     * 東雲絵名のイメージカラー
     */
    ENA(0xCCAA88),

    //奏ちゃんんんんｎ
    /**
     * 宵崎奏のイメージカラー
     */
    KANADE(0xBB6688),

    //まふゆちゃんんんんんｎ
    /**
     * 朝比奈まふゆのイメージカラー
     */
    MAFUYU(0x8888CC),

    /**
     * 暁山瑞希のイメージカラー
     */
    MIZUKI(0xDDAACC),


    //ユニットカラー
    /**
     * Virtual Singerのイメージカラー
     */
    VIRTUAL_SINGER(0xffffff),

    /**
     * Leo/needのイメージカラー
     * Javaの仕様で/は使えなかったぜ☆
     */
    LEONEED(0x4455dd),

    /**
     * MORE MORE JUMP!のイメージカラー
     */
    MORE_MORE_JUMP(0x88dd44),

    /**
     * Vivid Bad SQUADのイメージカラー
     */
    VIVID_BAD_SQUAD(0xee1166),

    /**
     * ワンダーランズ×ショウタイムのイメージカラー
     */
    WONDER_LANDS_SHOWTIME(0xff9900),

    /**
     * 25時、ナイトコードで。のイメージカラー
     * 英語版省略わからんのでNiigoになった
     */
    NIIGO(0x884499),
    ;

    /**
     * finalで変更不可にしたカラー
     */
    private final int color;

    /**
     * 各キャラのカラーやユニットのイメージカラー
     * @param color 各キャラやユニットのカラーイメージ
     */
    ColorUtils(int color){
        this.color = color;
    }

    public int getColor() {
        return color;
    }


    //TODO ここからStatic Method

    /*public static Color goodColor(final int index, final int speed, final float saturation, final float brightness, final float opacity) {
        int angle = (int) ((System.currentTimeMillis() / speed + index) % 360);
        angle = (angle > 180 ? 360 - angle : angle) + 180;
        final float hue = angle / 360f;
        final int color = Color.HSBtoRGB(hue, saturation, brightness);
        final Color obj = new Color(color);
        return new Color(obj.getRed(), obj.getGreen(), obj.getBlue(), Math.max(0, Math.min(255, (int) (opacity * 255))));
    }*/

    /**
     * レインボーカラーの作成メソッド
     * @param rotation どれくらいカラーが変わるか、基本的には360で大丈夫だと思う
     * @return {@link Color#getHSBColor(float, float, float)}
     */
    public static int createRainbow(final int rotation) {
        final float hue = (float)((System.currentTimeMillis() % rotation));
        return Color.getHSBColor(hue / rotation, 0.6f, 1.0f).getRGB();
    }
}
