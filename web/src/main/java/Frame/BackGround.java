package Frame;

import java.awt.image.BufferedImage;

/**
 * @author raorui
 * @date 2022/6/10 16:58
 */
public class BackGround {
    /**
     *  当前场景要显示的图片
     */
    private BufferedImage bgImage = null;
    /**
     *  记录当前是第几个场景
     */
    private int sort;
    /**
     *  判断是否为最后一个场景
     */
    private boolean flag;

    public BackGround() {
    }

    public BackGround(int sort, boolean flag) {
        this.sort = sort;
        this.flag = flag;

        bgImage = StaticValue.BG_INIT;
    }

    public BufferedImage getBgImage() {
        return bgImage;
    }

    public void setBgImage(BufferedImage bgImage) {
        this.bgImage = bgImage;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
