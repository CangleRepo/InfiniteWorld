package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author raorui
 * @date 2022/6/10 14:22
 */
public class MainFrame extends JFrame implements KeyListener{
    /**
     * 用于存储所有背景
     */
    private final List<BackGround> allBackGrounds = new ArrayList<BackGround>();

    /**
     * 用于存储当前场景
     */
    private BackGround nowBackGround = new BackGround();

    /**
     *  用于双缓存
     */
    private Image offScreenImage = null;

    public MainFrame() throws HeadlessException, IOException {
        // 设置窗口大小为 800*600
        this.setSize(540,960);
        // 设置窗口居中显示
        this.setLocationRelativeTo(null);
        // 设置窗口的可见性
        this.setVisible(true);
        // 设置点击窗口上的关闭键，结束程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口大小不可变
        this.setResizable(false);
        // 向窗口对象添加键盘监听器
        this.addKeyListener(this);
        // 设置窗口名称
        this.setTitle("InfiniteWorld");
        // 初始化图片
        StaticValue.init();
        // 创建全部场景
        allBackGrounds.add(new BackGround(1,false));
        // 将第一个场景设置为当前场景
        nowBackGround = allBackGrounds.get(0);
        // 绘制图像
        repaint();
    }

    public static void main(String[] args) throws IOException {
        MainFrame main = new MainFrame();
    }

    @Override
    public void paint(Graphics g){
        if (offScreenImage == null){
            offScreenImage = createImage(540,960);
        }

        Graphics graphics = offScreenImage.getGraphics();
        graphics.fillRect(0,0,540,960);

        // 绘制背景
        graphics.drawImage(nowBackGround.getBgImage(),0,0,this);

        // 将图像绘制到窗口中
        g.drawImage(offScreenImage,0,0,this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
