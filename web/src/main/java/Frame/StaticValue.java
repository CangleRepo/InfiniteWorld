package Frame;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author raorui
 * @date 2022/6/10 16:48
 */
public class StaticValue {
    public static BufferedImage BG_INIT = null;

    public static final String PATH = System.getProperty("user.dir")+("/web/src/main/resources/images/");

    public static void init() throws IOException {
        // 加载背景图片
        BG_INIT = ImageIO.read(new File(PATH+"bg_init.png"));
    }
}
