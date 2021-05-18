import com.newpi.data.structionalPatterns.proxy.IGamePlayer;
import com.newpi.data.structionalPatterns.proxy.dynamicproxy.InvokeHandler;

import java.lang.reflect.Method;

public class Proxy1 implements IGamePlayer {
    private InvokeHandler handler;

    public Proxy1(InvokeHandler handler) {
        this.handler = handler;
    }

    @Override
    public void login() {
        try {
            Method md = com.newpi.data.structionalPatterns.proxy.IGamePlayer.class.getMethod("login");
            handler.invoke(this, md);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void killBoss() {
        try {
            Method md = com.newpi.data.structionalPatterns.proxy.IGamePlayer.class.getMethod("killBoss");
            handler.invoke(this, md);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void upgrade() {
        try {
            Method md = com.newpi.data.structionalPatterns.proxy.IGamePlayer.class.getMethod("upgrade");
            handler.invoke(this, md);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}