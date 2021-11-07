package ti.viewanimation;

import android.view.View;

import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.daimajia.androidanimations.library.YoYo;

import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.annotations.Kroll;

@Kroll.proxy(parentModule = TiViewanimationModule.class)
public class TiAnimationProxy extends KrollProxy {
    private YoYo.YoYoString animation;

    public TiAnimationProxy(YoYo.YoYoString animation) {
        this.animation = animation;
    }
    @Kroll.getProperty
    public boolean isStarted() {
        return animation.isStarted();
    }

    @Kroll.getProperty
    public boolean isRunning() {
        return animation.isRunning();
    }

    @Kroll.method
    public void stop() {
        stop(true);
    }

    @Kroll.method
    public void stop(boolean reset) {
        animation.stop(reset);
    }
}
